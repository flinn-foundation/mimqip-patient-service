<%@ page import="org.flinnfoundation.old.dao.dao.DaoAppManager" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseTreatmentGroupContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.request.RequestContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.request.RequestTreatmentBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.TreatmentGroupBean" %>
<%@ page import="org.flinnfoundation.old.dao.util.CookieHandler" %>
<%@page contentType="text/html" %>

<%
  int mid = -1;
  int adminid = -1;
  String serverName = request.getServerName();
  int medid = -1;
  Boolean isAdmin = false, isSuperAdmin = false;
  Boolean editable = false;
  Boolean postType = false;
  Boolean hasEdit = false;
  String date_include_date = "";
  String jspSelf = request.getRequestURI().toString();
  String mName = "", mAbbrev = "";
  int mGroupID = -1;
  int lastactivity = -1;

  String authcode = CookieHandler.getCookie("authcode", request);
  DaoAppManager dm = new DaoAppManager();
  ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
	try{
		//function call to update user's last activity
		lastactivity = dm.updateLastActivity(userSession);
		dm.commitConnection("updateLastActivity");
	}
	catch(Exception e) {
		dm.rollbackConnection("updateLastActivity");
		dm.LOG.debug("Unable to commit changes to updateLastActivity");
	}

	adminid = userSession.getUser().getAppuserid();

  if (request.getParameter("id") != null) medid = Integer.parseInt(request.getParameter("id"));

  if (request.getParameter("Name") != null) mName = request.getParameter("Name");

  if (request.getParameter("Abbreviation") != null) mAbbrev = request.getParameter("Abbreviation");

  if(org.flinnfoundation.old.dao.util.AdminRole.isFacilityAdmin(userSession))isAdmin = true;
  if (org.flinnfoundation.old.dao.util.AdminRole.isAdmin(userSession))isSuperAdmin = true;

  if (request.getMethod() != null){
	  	if(request.getMethod().equals("POST")) postType = true;
  }

  if (request.getParameter("edit") != null){
	  	if(request.getParameter("edit").equals("y")) hasEdit = true;
  }


  if (isAdmin && postType) {
		RequestContainerBean rqcont = new RequestContainerBean();
		RequestTreatmentBean rqTreatmentBean = new RequestTreatmentBean();

		TreatmentGroupBean tgBean = new TreatmentGroupBean();
		tgBean.setTreatmentgroupid(medid);
		tgBean.setTreatmentgroupname(mName);
		tgBean.setTreatmentgroupabbreviation(mAbbrev);
		Boolean isValid = false;

		if (request.getParameter("Valid") != null){
			if (request.getParameter("Valid").equals("1")){isValid = true;}
		}
		tgBean.setValid(isValid);
		rqTreatmentBean.setGroup(tgBean);

    	if (medid > 0){//Update treatment
    		rqcont.setTreatment(rqTreatmentBean);
    		ResponseTreatmentGroupContainerBean rspBean= new ResponseTreatmentGroupContainerBean();

    		try{
        		rspBean = (ResponseTreatmentGroupContainerBean)dm.updateTreatmentGroup(rqcont, userSession);
        		TreatmentGroupBean[] tgb = rspBean.getGroups();
        		mid = tgb[0].getTreatmentgroupid();
    		}
    		catch(Exception e) {
    			dm.rollbackConnection("updateTreatmentGroup");
    			dm.LOG.debug("Unable to commit changes to updateTreatmentGroup");
    		}
    	}
    	else{ //Create treatment
    		try{
    			rqcont.setTreatment(rqTreatmentBean);
        		mid = dm.createTreatmentGroup(rqcont, userSession);

    		}
    		catch(Exception e) {
    			dm.rollbackConnection("createTreatmentGroup");
    			dm.LOG.debug("Unable to commit changes to createTreatmentGroup");
    		}
    	}
    	medid = mid;

      if (mid > 0) {
	      if (medid > 0) {  		response.sendRedirect("/admin/treatment_group_detail.jsp?id="+mid+"&reason=treatmentgroup+changes+saved");
	      } else {  		response.sendRedirect("/admin/treatment_group_detail.jsp?id="+mid+"&reason=treatmentgroup+created");
	      }
	    } else {
			response.sendRedirect("/admin/error.jsp?reason="+mid);
	    }
  }


TreatmentGroupBean adminTreatment = new TreatmentGroupBean();
if (medid > 0){

try{
	adminTreatment = dm.getTreatmentGroup(medid);
}
catch(Exception e) {
	dm.LOG.debug("Unable to open connection getTreatmentGroup");
}

String title = adminTreatment.getTreatmentgroupname();
mName = title;
medid = adminTreatment.getTreatmentgroupid();
mAbbrev = adminTreatment.getTreatmentgroupabbreviation();

editable = false;   // Whether or not this is to edit the information
}
if (isAdmin && hasEdit) editable = true;
%>

	<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#CAD8DF">
<% if (editable) { %>
<script type="text/javascript" language="JavaScript" src="common/js/form_validate.js"></script>
<FORM method="POST" action="<% out.print(jspSelf); %>" name="adminform">
<input type="hidden" name="id" value="<% if (medid > 0) out.print(medid); else out.print(0); %>">
<input type="hidden" name="staff" value="<% out.print(request.getParameter("staff")); %>">
<% } %>
	<tr>
		<td width="12" align="left"><img src="/s.gif" width=12 height=1 alt="" border="0"></td>
		<td nowrap><p class="formText">Treatment Group Name</p></td>
		<td align="right">
			<p class="formText" style="text-align:left;">
			<% if (editable) out.print("<input type='text' name='Name' value='"); %><% if (medid > 0)out.print(mName.replace("&","&amp;").replace("'","&#039;")); %><% if (editable) out.print("'>"); %></p></td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
		<td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
	</tr>
	<tr>
		<td width="12" align="left"><img src="/s.gif" width=12 height=1 alt="" border="0"></td>
		<td nowrap><p class="formText">Treatment Group Abbreviation</p></td>
		<td align="right">
			<p class="formText" style="text-align:left;">
			<% if (editable) out.print("<input type='text' name='Abbreviation' value='"); %><% if (medid > 0)out.print(mAbbrev.replace("&","&amp;").replace("'","&#039;")); %><% if (editable) out.print("'>"); %></p></td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
		<td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
	</tr>
	<tr>
		<td width="12" align="left"><img src="/s.gif" width=12 height=1 alt="" border="0"></td>
		<td nowrap><p class="formText">Valid?</p></td>
		<td align="left"><p><%
if (editable) {
	out.print("<input type='radio' name='Valid' value='1'");
  if(medid == 0)adminTreatment.setValid(true);
  if (adminTreatment.getValid()) out.print(" CHECKED");
  out.print("> valid<br>\n");
  out.print("<input type='radio' name='Valid' value='0'");
  if (!adminTreatment.getValid()) out.print(" CHECKED");
  out.print("> invalid<br>\n");
} else {
	out.print("<p class='formText' style='text-align:left;'>");
  if (adminTreatment.getValid()) { out.print("valid"); } else { out.print("<span class=\"formTextRed\">invalid</span>"); }
} if(medid == 0)adminTreatment.setValid(false);%></p></td>
		<td>&nbsp;</td>
	</tr>
<% if (!editable) { %>
	<tr>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
		<td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
	</tr>

<%
  }

if (isAdmin && !editable) {
  %>
	<tr>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
		<td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
	</tr>
	<tr>
		<td><img src="/s.gif" width=1 height=37 alt="" border="0"></td>
		<td>&nbsp;</td>
		<td>
			<table border="0" cellspacing="0" cellpadding="4">
			<tr>
				<td>
					<div class="updateText"><a href="/admin/treatment_group_detail.jsp?id=<% out.print(medid); %>&edit=y" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Edit</a></div>
				</td>
			</tr>
			</table>
		</td>
		<td>&nbsp;</td>
	</tr>
  <%
}
if (editable) {
  %>
	<tr>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
		<td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/s.gif" width=1 height=1 alt="" border="0"></td>
	</tr>
	<tr>
		<td><img src="/s.gif" width=1 height=37 alt="" border="0"></td>
		<td>&nbsp;</td>
		<td>
			<table border="0" cellspacing="0" cellpadding="4">
			<tr>
				<td>
                                        <div class="updateText"><a href="javascript:formsubmit('adminform')" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Save Updates</a></div>
                                </td>
                                <td>
                                        <div class="updateText"><a href="<%
if (medid > 0) {
  out.print(jspSelf);
  out.print("?id="+medid);
} else {
	out.print("/admin/treatment_group.jsp");
}

%>" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Cancel Updates</a></div></td>
			</tr>
			</table>
		</td>
		<td>&nbsp;</td>
	</tr>
  <%
}
%>
<%
dm.disposeConnection("treatment_group_detail");
if (editable) { %>
</FORM>
<script language="JavaScript" type="text/javascript">
  function formsubmit(frmname) {
    if(document.forms[frmname]) {
      if (document.forms[frmname].onsubmit()) {
        document.forms[frmname].submit();
      }
    }
  }


  var frmvalidator  = new Validator("adminform");
<% if (editable) { %>
  frmvalidator.addValidation("Name","req","Please enter a name for the treatment group");
  frmvalidator.addValidation("Name","maxlen=100","Max length for treatment group name is 100");
  frmvalidator.addValidation("Abbreviation","req","Please enter an abbreviation name for the treatment group");
  frmvalidator.addValidation("Abbreviation","maxlen=100","Max length for treatment group abbreviation");

<% } %>

</script>
<% } %>
	</table>

