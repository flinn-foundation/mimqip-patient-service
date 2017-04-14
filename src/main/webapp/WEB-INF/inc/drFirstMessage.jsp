<%@ page import="org.flinnfoundation.old.dao.util.DrFirstUtils"%>
<%@ page import="org.flinnfoundation.old.dao.dao.DaoAppManager" %>
<%@ page import="org.flinnfoundation.old.dao.beans.response.ResponseSessionContainerBean" %>
<%@ page import="org.flinnfoundation.old.dao.util.CookieHandler" %><%
String serverName = request.getServerName();
String admin_protocol = "https";

String authcode = CookieHandler.getCookie("authcode", request);
String userID = null;
String drfUrl = "";
String logout = "https://"+serverName+"/inc/drFirstClose.jsp";

if (authcode == null || authcode.equals("")){
        return;
}
else {
        DaoAppManager dm = new DaoAppManager();
        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);

        if (userSession != null){
        	userID = userSession.getUser().getSettings().get("UserExternalID");
        }else{
            return;
        }
	drfUrl = DrFirstUtils.buildDrFirstMessageURL(userID, logout);
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

