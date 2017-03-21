<%@page import="flinn.beans.response.ResponseSessionContainerBean" %>

<%@page import="java.util.List" %>


<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td width="168" nowrap bgcolor="#CAD8DF">
            <a href="/recommend/setting_detail.jsp?id=0&edit=y" class="subLink">
                <img src="/admin/images/blue_arrow.gif" width=5 height=10 alt="" border="0">
                &nbsp;&nbsp;Add Setting
            </a>
        </td>
    </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr bgcolor="#CAD8DF">
        <td nowrap>
            <p class='tableHeader'>
                <a href='"<%out.print(page);%>"?order="<%out.print(name);%>"' class='tableHeader'><%out.print(name);%></a>
            </p>
        </td>
        <td nowrap>
            <p class='tableHeader'>
                <a href='" <%out.print(page);%> "?order=" + <%out.print(name);%> + "' class='tableHeader'><%out.print(value);%></a>
            </p>
        </td>
    </tr>


    <tr>
        <td width="20%">
            <p class="tableText">
                <%= settingList.get(i).getSettingname()%>
            </p>
        </td>
        <td width="70%">
            <p class="tableText">
                <%= settingList.get(i).getSettingvalue()%>
            </p>
        </td>
        <td width="10%">
            <a href="/recommend/setting_detail.jsp?id=<% out.print(settingList.get(i).getSettingid());%>" class="subLink">
                <img src="/admin/images/blue_arrow.gif" width=5 height=10 alt="" border="0">
                detail
            </a>
        </td>
    </tr>
</table>

