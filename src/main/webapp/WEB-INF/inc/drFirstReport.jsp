<%@ page import="flinn.old.dao.util.DrFirstUtils"%>
<%@ page import="flinn.old.dao.dao.DaoAppManager" %><%
String serverName = request.getServerName();
String admin_protocol = "https";

String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
String userID = null;
String drfUrl = "";
String logout = "https://"+serverName+"/inc/drFirstClose.jsp";

if (authcode == null || authcode.equals("")){
        return;
}
else {
        DaoAppManager dm = new DaoAppManager();
        flinn.old.dao.beans.response.ResponseSessionContainerBean userSession = dm.getSession(authcode, request);

        if (userSession != null){
        	userID = userSession.getUser().getSettings().get("UserExternalID");
        }else{
            return;
        }
	drfUrl = DrFirstUtils.buildDrFirstReportURL(userID, logout);
	response.sendRedirect(drfUrl);

}

%>

<html>

<head>
</head>

<body>
<p>
Incorrect or missing userId.<br/>
Incorrect or missing userId.<br/>
Incorrect or missing userId.<br/>
Incorrect or missing userId.<br/>
Incorrect or missing userId.<br/>
Incorrect or missing userId.<br/>
</p>
</body>

</html>

