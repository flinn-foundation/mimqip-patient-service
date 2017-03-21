<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Flinn Foundation Recommend Administration Tool</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css" type="text/css">
    <link rel="icon" href="/favicon.ico">
    <link rel="shortcut icon" href="/favicon.ico">
    <script type="text/javascript" language="JavaScript"
            src="${pageContext.request.contextPath}/js/admin_util.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.cookie.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/globalUtils.js"></script>
</head>

<body leftmargin=0 topmargin=0 bgcolor="#ffffff">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td width="670" align="left"><img src="${pageContext.request.contextPath}/images/recommend/admin_header.gif"
                                          width=670 height=96 alt="" border="0"></td>
        <td width="90" align="right"><img src="${pageContext.request.contextPath}/images/recommend/logo.png" width=200
                                          height=96 alt="Flinn Foundation" border="0"></td>
    </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr valign="top" bgColor="#7F7F7F">
        <td width="199" valign="bottom" align="left">
            <p class="pageTitle">
                <%
                    String admin_section = "";
                    if (request.getParameter("admin_section") != null) {
                        admin_section = request.getParameter("admin_section");
                    }
                    if (!admin_section.equals("home")) {%>
                <a href="${pageContext.request.contextPath}/recommend" class="pageTitle">recommend home</a>
                <% }%>
                <br>
            </p>
        </td>
    </tr>
</table>

