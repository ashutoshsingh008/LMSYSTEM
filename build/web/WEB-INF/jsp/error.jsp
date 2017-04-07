<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">  
        
	                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr>
                                <td class="manageForms">Manage Books</td>
                                <td align="center" class="error">
                                    <c:forEach var="country" items="${capitalList}">
                                            Country: ${country.key}  - Capital: ${country.value}
                                    </c:forEach>

                                    
                                </td>
                             
                            </tr>
                        </table>					
	
    </tiles:putAttribute>
</tiles:insertDefinition>      
