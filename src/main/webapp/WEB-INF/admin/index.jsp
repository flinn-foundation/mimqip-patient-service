<%@ page import="org.flinnfoundation.old.dao.dao.DaoAppManager" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.beans.AppUserRoleBean" %>
<%@ page import="org.flinnfoundation.old.dao.util.CookieHandler" %><%
String admin_section = "home";
String admin_subsection = "";
String sub_section = "";
String userlogin = "u";
String role = "r";
String serverName = request.getServerName();
String admin_protocol = "http";
int roleid = -1;

String authcode = CookieHandler.getCookie("authcode", request);
if (authcode == null || authcode.equals("")){
	response.sendRedirect(admin_protocol+"://"+serverName+"/index");
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

		if (roleid < 1 || roleid > 2){
			response.sendRedirect(admin_protocol+"://"+serverName+"/index");
			return;
		}
	}
	else{
		response.sendRedirect(admin_protocol+"://"+serverName+"/index");
		return;
	}
}
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
<jsp:include page="include/index.jsp" />
</div>
	</td>
<jsp:include page="include/footer.jsp">
	<jsp:param name="userlogin" value="<%=userlogin%>" />
	<jsp:param name="role" value="<%=role%>" />
</jsp:include>
