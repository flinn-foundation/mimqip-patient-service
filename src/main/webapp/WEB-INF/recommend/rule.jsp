<%
    String admin_section = "Manage Rules";
    String admin_subsection = "Rules";
    String sub_section = "";
    String userlogin = "u";
    String role = "r";
    int roleid = -1;
%>

<jsp:include page="include/header.jsp">
    <jsp:param name="admin_section" value="<%=admin_section%>"/>
    <jsp:param name="admin_subsection" value="<%=admin_subsection%>"/>
    <jsp:param name="sub_section" value="<%=sub_section%>"/>
</jsp:include>
<td bgcolor="#E6E5E3" width="200" colspan="2" valign="top">
    <jsp:include page="include/nav.jsp">
        <jsp:param name="admin_section" value="<%=admin_section%>"/>
        <jsp:param name="admin_subsection" value="<%=admin_subsection%>"/>
        <jsp:param name="role" value="<%=role%>"/>
    </jsp:include>
</td>
<td valign="top">
    <div class="pageHolder">
        <%--<jsp:include page="include/rule.jsp" />--%>
    </div>
</td>
<jsp:include page="include/footer.jsp">
    <jsp:param name="userlogin" value="<%=userlogin%>"/>
    <jsp:param name="role" value="<%=role%>"/>
</jsp:include>
