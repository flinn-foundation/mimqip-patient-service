<%@page import="java.util.List"%>

<%@page import="flinn.beans.response.ResponseSessionContainerBean"%>

<%
String jspSelf = request.getRequestURL().toString();
Boolean qsOrder = false, qsOrder1 = false;

if (request.getParameter("order") != null) 
{
    if (request.getParameter("order").equals("0"))
    	qsOrder = true;

    if (request.getParameter("order").equals("1"))
        qsOrder1 = true;
} else {
    	qsOrder = true;
}


%>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td colspan="3" width="30%" bgcolor="#CAD8DF"><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
		<td width="1" bgcolor="#FFFFFF"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td colspan="2" width="30%"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td colspan="2" width="40%"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
	</tr>
	<tr>
		<td width="1" nowrap bgcolor="#CAD8DF"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td width="13" nowrap bgcolor="#CAD8DF"><img src="/recommend/images/s.gif" width="13" height="1" alt="" border="0"></td>
		<td width="168" nowrap bgcolor="#CAD8DF"><a href="/recommend/setting_detail.jsp?id=0&edit=y" class="subLink"><img src="/admin/images/blue_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Add Setting</a></td>
	</tr>
        </table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr bgcolor="#CAD8DF">
		<td><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td>&nbsp;</td>
		<% out.print(WriteTableHeader("Name", qsOrder, jspSelf, "0")); %>
		<% out.print(WriteTableHeader("Value", qsOrder1, jspSelf, "1")); %>
		<td nowrap><p class="tableHeader">&nbsp;</p></td>
		<td>&nbsp;</td>
		<td nowrap><p class="tableHeader">&nbsp;</p></td>
		<td colspan="2">&nbsp;&nbsp;</td>
	</tr>
	<tr bgcolor="#CAD8DF">
		<td colspan="13"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
	</tr>
	
<%
boolean first = true;
String orderby = "SettingName";
String criteria = "false";
String authcode = flinn.util.CookieHandler.getCookie("authcode", request);

if (qsOrder1) 
    orderby = "SettingValue DESC";


List<flinn.recommend.beans.response.ResponseSettingBean> settingList = null;
flinn.recommend.dao.DaoRecommendManager dm = new flinn.recommend.dao.DaoRecommendManager();
flinn.beans.request.RequestContainerBean input = new flinn.beans.request.RequestContainerBean();
ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
int lastactivity = -1;
Boolean isSuperAdmin = false;
if (flinn.util.AdminRole.isAdmin(userSession))isSuperAdmin = true;

try{
	settingList = dm.findAllSettings(input, userSession, orderby); //function call to get settings

	try{
			//function call to update user's last activity
			lastactivity = dm.updateLastActivity(userSession);
			dm.commitConnection("updateLastActivity");
		}
		catch(Exception e) {
			dm.rollbackConnection("updateLastActivity");
			dm.LOG.debug("Unable to commit changes to updateLastActivity");
		}
}
catch(Exception e) {
	dm.LOG.debug("Unable to open connection for findAllSettings");
}
finally{dm.disposeConnection("findAllSettings");}

if (settingList != null){
for (int i=0; i<settingList.size(); i++) {
  if (!first) {
    %>
	<tr>
		<td bgcolor="#CAD8DF"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td colspan="10" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
		<td><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
	</tr>
    <%
  }
  first = false;
  %>
	<tr>
		<td bgcolor="#CAD8DF"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
		<td>&nbsp;&nbsp;</td>
		<td width="20%"><p class="tableText"><%= settingList.get(i).getSettingname()%></p></td>
		<td>&nbsp;&nbsp;</td>
		<td width="70%"><p class="tableText"><%= settingList.get(i).getSettingvalue()%></p></td>
		<td>&nbsp;&nbsp;</td>
		<td width="10%"><a href="/recommend/setting_detail.jsp?id=<% out.print(settingList.get(i).getSettingid());%>" class="subLink"><img src="/admin/images/blue_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;detail</a></td>
	</tr>

  <%
}
}
%>
	<tr bgcolor="#CAD8DF">
		<td colspan="13"><img src="/recommend/images/s.gif" width="1" height="1" alt="" border="0"></td>
	</tr>
	</table>
	
<%!
public String WriteTableHeader (String name, Boolean selected, String page, String order) {
    StringBuilder outString = new StringBuilder();
    outString.append("<td nowrap><p class='tableHeader'>");
    if (!selected){
        outString.append("<a href='"+page+"?order="+order+"' class='tableHeader'>");
    }
    outString.append(name);
    if (!selected){
        outString.append("</a>");
    }
    outString.append("</p></td>");
    outString.append("<td>&nbsp;</td>");
    return outString.toString();
}

%>
