<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
        
        <br/>
        <table border="0" cellspacing="0" cellpadding="2" align="center">
            <tr><td>&nbsp;</td></tr>
            <tr><td class="hrLine">&nbsp;</td></tr>
            <tr><td class="accessDenied">Access is denied</td></tr>
            <tr>
                <td class="errorAccessDenied">
                    You do not have permission to access this page!
                </td>
            </tr>
            <tr><td class="hrLine">&nbsp;</td></tr>
        </table>
        
    </tiles:putAttribute>
</tiles:insertDefinition>