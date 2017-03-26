<%@ page import="flinn.old.dao.dao.DaoAppManager" %><%
String admin_section = "Manage Facilities";
String admin_subsection = "Facilities";
String sub_section = "";
String userlogin = "u";
String role = "r";
String serverName = request.getServerName();
String admin_protocol = "http";
int roleid = -1;
Boolean invalid = true;    // Whether or not to show invalid users

String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
if (authcode == null || authcode.equals("")){
	response.sendRedirect(admin_protocol+"://"+serverName+"/sample");
	return;
}
else {
	DaoAppManager dm = new DaoAppManager();
	flinn.old.dao.beans.response.ResponseSessionContainerBean userSession = dm.getSession(authcode, request);


	if (userSession != null){
		userlogin = userSession.getUser().getLogin();

		flinn.old.dao.beans.AppUserRoleBean[] ar = userSession.getUser().getRoles();
		flinn.old.dao.beans.AppUserRoleBean userRole = (flinn.old.dao.beans.AppUserRoleBean)ar[0];
		role = userRole.getApprole();
		roleid = userRole.getApproleid();

		if (roleid != 1){ //Not a super admin
			if (roleid == 2) { //Force Facility Admins to detail page
				response.sendRedirect(admin_protocol+"://"+serverName+"/admin/facility_detail.jsp?id="+userSession.getUser().getFacilityid());
				return;
			}
			else { //Kick all non admins out
				response.sendRedirect(admin_protocol+"://"+serverName+"/sample");
				return;
			}
		}
	}
	else{
		response.sendRedirect(admin_protocol+"://"+serverName+"/sample");
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
<jsp:include page="include/facility.jsp" />
</div>
	</td>
<jsp:include page="include/footer.jsp">
	<jsp:param name="userlogin" value="<%=userlogin%>" />
	<jsp:param name="role" value="<%=role%>" />
</jsp:include>
