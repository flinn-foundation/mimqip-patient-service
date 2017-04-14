<%@page contentType="text/html" %>


<%--<% if (closeUpdateFlag) {%>--%>
<%--<script type="text/javascript" language="JavaScript">--%>
    <%--updateParent();--%>
<%--</script>--%>
<%--<% }%>--%>

<%
    String[] types = {"Numeric", "NumericValue", "Text", "TextValue"};
    String[] operators = {"<", "<=", "=", ">=", ">", "!="};
%>


<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#CAD8DF">

    <script type="text/javascript" language="JavaScript" src="common/js/form_validate.js"></script>
    <FORM method="POST" action="/criteria/details" name="adminform">
        <input type="hidden" name="ruleid" value="<% if ( > 0) {
                 out.print(ruleid);
             } else {
                 out.print(0);
             }%>">
        <input type="hidden" name="id" value="<% if (criteriaid > 0) {
                 out.print(criteriaid);
             } else {
                 out.print(0);
             }%>">


        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td width="12" align="left"><img src="/recommend/images/s.gif" width=12 height=1 alt="" border="0"></td>
            <td nowrap><p class="formText">Priority</p></td>
            <td align="right">
                <p class="formText" style="text-align:left;">
                    <% if (editable) {
                                    out.print("<input type='text' name='Priority' maxlength='30' value='");
                                }%><% if (criteriaid > 0) {
                                                out.print(priority);
                                            }%><% if (editable) {
                                                            out.print("'>");
                                                        }%></p></td>
            <td>&nbsp;</td>
        </tr>

        <!-- Type -->


        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td width="12" align="left"><img src="/recommend/images/s.gif" width=12 height=1 alt="" border="0"></td>
            <td nowrap><p class="formText">Type</p></td>
            <td align="right">
                <p class="formText" style="text-align:left;">
                    <%
                                if (editable) {
                                    out.print("<SELECT name='Type'>");

                                    for (int i = 0; i < types.length; i++) { //Loop thru all types
                                        out.print("<option value='");
                                        out.print(types[i]);
                                        out.print("'");
                                        if (type.equals(types[i])) {
                                            out.print(" SELECTED");
                                        }
                                        out.print(">");
                                        out.print(types[i]);
                                        out.print("</option>");

                                    }
                                    out.print("</SELECT>");
                                } else {
                                    out.print(type);
                                }
                    %></p></td>
            <td>&nbsp;</td>
        </tr>

        <!-- FieldName -->

        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td width="12" align="left"><img src="/recommend/images/s.gif" width=12 height=1 alt="" border="0"></td>
            <td nowrap><p class="formText">Field Name</p></td>
            <td align="right">
                <p class="formText" style="text-align:left;">
                    <% if (editable) {
                                    out.print("<input type='text' name='FieldName' maxlength='50' size='50' value='");
                                }%><% if (criteriaid > 0) {
                                                out.print(fieldname.replace("&","&amp;").replace("'", "&#039;"));
                                            }%><% if (editable) {
                                                            out.print("'>");
                                                        }%></p></td>
            <td>&nbsp;</td>
        </tr>


        <!-- Operator -->


        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td width="12" align="left"><img src="/recommend/images/s.gif" width=12 height=1 alt="" border="0"></td>
            <td nowrap><p class="formText">Operator</p></td>
            <td align="right">
                <p class="formText" style="text-align:left;">
                    <%
                                if (editable) {
                                    out.print("<SELECT name='Operator'>");

                                    for (int i = 0; i < operators.length; i++) {
                                        out.print("<option value='");
                                        out.print(operators[i]);
                                        out.print("'");
                                        if (operator.equals(operators[i])) {
                                            out.print(" SELECTED");
                                        }
                                        out.print(">");
                                        out.print(operators[i]);
                                        out.print("</option>");

                                    }
                                    out.print("</SELECT>");
                                } else {
                                    out.print(operator);
                                }
                    %></p></td>
            <td>&nbsp;</td>
        </tr>







        <!-- Value -->

        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td width="12" align="left"><img src="/recommend/images/s.gif" width=12 height=1 alt="" border="0"></td>
            <td nowrap><p class="formText">Value</p></td>
            <td align="right">
                <p class="formText" style="text-align:left;">
                    <% if (editable) {
                                    out.print("<input type='text' name='Value' maxlength='50' value='");
                                }%><% if (criteriaid > 0) {
                                                out.print(value.replace("&","&amp;").replace("'", "&#039;"));
                                            }%><% if (editable) {
                                                            out.print("'>");
                                                        }%></p></td>
            <td>&nbsp;</td>
        </tr>








        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=37 alt="" border="0"></td>
            <td>&nbsp;</td>
            <td>
                <table border="0" cellspacing="0" cellpadding="4">
                    <tr>
                        <td>
                            <div class="updateText"><a href="/recommend/rule_detail.jsp?id=<% out.print(ruleid);%>&edit=y" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Edit</a></div>
                        </td>
                    </tr>
                </table>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
            <td colspan="2" background="/admin/images/row_separator.gif" style="background-repeat: repeat-x;"></td>
            <td><img src="/recommend/images/s.gif" width=1 height=1 alt="" border="0"></td>
        </tr>
        <tr>
            <td><img src="/recommend/images/s.gif" width=1 height=37 alt="" border="0"></td>
            <td>&nbsp;</td>
            <td>
                <table border="0" cellspacing="0" cellpadding="4">
                    <tr>
                        <td>
                            <div class="updateText"><a href="javascript:formsubmit('adminform')" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Save Updates</a></div>
                        </td>
                        <td>
                            <div class="updateText"><a href="javascript:window.close()" class="updateText"><img src="/admin/images/update_arrow.gif" width=5 height=10 alt="" border="0">&nbsp;&nbsp;Cancel Updates</a></div></td>
                    </tr>
                </table>
            </td>
            <td>&nbsp;</td>
        </tr>
    </FORM>
    <script language="JavaScript" type="text/javascript">
        function formsubmit(frmname) {
            if(document.forms[frmname]) {
                if (document.forms[frmname].onsubmit()) {
                    document.forms[frmname].submit();
                }
            }
        }


        var frmvalidator  = new Validator("adminform");
        <% if (editable) {%>
        frmvalidator.addValidation("FieldName","req","Please enter a value for the field name");
        frmvalidator.addValidation("FieldName","maxlen=50","Max length for field name  is 50");
        frmvalidator.addValidation("Priority","req","Please enter a value for the field priority");
        frmvalidator.addValidation("Priority","maxlen=50","Max length for field priority  is 50");
        frmvalidator.addValidation("Priority","numeric","The entered value must be numeric");
        frmvalidator.addValidation("Value","req","Please enter a value");
        frmvalidator.addValidation("Value","maxlen=50","Max length for value  is 50");
        <% }%>

    </script>
    <% }%>
</table>

