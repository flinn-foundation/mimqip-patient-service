<%@ page import="org.flinnfoundation.old.dao.util.DrFirstUtils"%>
<%@ page import="org.flinnfoundation.old.dao.dao.DaoAppManager" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.util.CookieHandler" %><%
String serverName = request.getServerName();
String admin_protocol = "https";

String authcode = CookieHandler.getCookie("authcode", request);
String userID = null;
String practiceUserName = null;
String patientId = request.getParameter("patientid");
String logout = "https://"+serverName+"/inc/drFirst-logout.jsp?" + patientId;
String drfUrl = "";
if (authcode == null || authcode.equals("")){
        return;
}
else {
        DaoAppManager dm = new DaoAppManager();
        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);

        if (userSession != null){
        	userID = userSession.getUser().getSettings().get("UserExternalID");
        	practiceUserName = userSession.getUser().getSettings().get("PracticeUserName");
        }else{
            return;
        }
}
if (patientId != null) {
	drfUrl = DrFirstUtils.buildDrFirstUrl(practiceUserName, patientId, userID, logout);
	response.sendRedirect(drfUrl);

}
%>

<html>

<head>
</head>

<body>
<p>
<script type="text/javascript">
	alert("DrFirst did not load\nIncorrect or missing patient ID");
        parent.utils.closeLightbox();
        //app.getMedicationData();
        //utils.getMedsData = true;
</script>
</p>
	<!-- p>
		<a href="./process_drfirst_medications.jsp" target="_blank">Process Medication Updated in DrFirst</a>
	</p -->

</body>

</html>

