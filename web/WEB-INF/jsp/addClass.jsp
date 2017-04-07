<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
                
<form:form method="post" action="${pageContext.request.contextPath}/admin/saveClass" commandName="classes">
<form:hidden path="classId" />

<table width="100%" border="0" cellpadding="4" cellspacing="4">                                     
    <tr>                                
    <td align="center" class="error">${dbError}</td>                               
    </tr>

    <tr>
    <td width="10%">Class Name<span class="mandatory">*</span>:  
    <form:input path="className" title="Enter the class name" maxlength="25" size="40"/><br>
    <form:errors path="className" cssClass="error" />
    </td>
    </tr>

    <tr>
    <td class="centerAlign">
    <input type="submit" class="groovybutton" value="Save" />
    <input type="reset" value="Clear" class="groovybutton" onclick="javascript:document.location.href='${pageContext.request.contextPath}/admin/addClass'" />
    <input type="reset" value="Back" class="groovybutton" onclick="javascript:document.location.href='${pageContext.request.contextPath}/admin/manageClass'" />
    </td>
    </tr> 
</table>

</form:form>             
    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                                            
                                            
                           