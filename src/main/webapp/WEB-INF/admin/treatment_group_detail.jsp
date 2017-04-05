<%@ page import="org.flinnfoundation.old.dao.dao.DaoAppManager" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.AppUserRoleBean" %>
<%@ page import="org.flinnfoundation.old.dao.util.CookieHandler" %><%
String admin_section = "Manage Treatment Groups";
String admin_subsection = "Treatment Groups";
String sub_section = "";
String userlogin = "u";
String role = "r";
int roleid = -1;


String authcode = CookieHandler.getCookie("authcode", request);
if (authcode == null || authcode.equals("")){
	response.sendRedirect("/sample");
	return;
}
else {
	DaoAppManager dm = new DaoAppManager();
	ResponseSessionContainerBean userSession = dm.getSession(authcode, request);

	if (userSession != null){
		userlogin = userSession.getUser().getLogin();

		AppUserRoleBean[] ar = userSession.getUser().getRoles();
		AppUserRoleBean userRole = (AppUserRoleBean)ar[0];
		role = userRole.getApprole();
		roleid = userRole.getApproleid();

		if (roleid != 1){ //Not a super admin
			if (roleid == 2) { //Force Facility Admins to index page
				response.sendRedirect("index.jsp");
				return;
			}
			else { //Kick all non admins out
				response.sendRedirect("/sample");
				return;
			}
		}
	}
	else{
		response.sendRedirect("/sample");
		return;
	}
}

Boolean invalid = false;    // Whether or not to show invalid users
%>
<jsp:include page="include/header.jsp">
	<jsp:param name="admin_section" value="<%=admin_section%>" />
	<jsp:param name="admin_subsection" value="<%=admin_subsection%>" />
	<jsp:param name="sub_section" value="<%=sub_section%>" />
</jsp:include>
	<td bgcolor="#E6E5E3" width="200" colspan="2" valign="top">
<jsp:include page="include/nav.jsp">
	<jsp:param name="admin_section" value="<%=admin_section%>" />
	<jsp:param name="admin_subsection" value="<%=admin_subsection%>" />
	<jsp:param name="sub_section" value="<%=sub_section%>" />
	<jsp:param name="role" value="<%=role%>" />
</jsp:include>
	</td>
	<td valign="top">
<div class="pageHolder">
<jsp:include page="include/treatment_group_detail.jsp" />
</div>
	</td>
<jsp:include page="include/footer.jsp">
	<jsp:param name="userlogin" value="<%=userlogin%>" />
	<jsp:param name="role" value="<%=role%>" />
</jsp:include>
