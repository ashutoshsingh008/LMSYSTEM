<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
        


    <table
        <tr>
            <td style="text-align: center;"><strong class="error">${message}</strong></td>  
        </tr>
    </table>
    
    <c:if test="${!empty classSectionList}">
    
        <div class="table">
	 <table
            <thead>
	  <tr>
            <th>Sr. No.</th>            
            <th>Section Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
        <% int srn = 1; %>
        <c:forEach items="${classSectionList}" var="classSection">
            
            <tr>
                <td><%=srn++ %>.</td>                               
                <td>${classSection.className}</td>
                <td>${classSection.secName}</td>
                <td><form:checkbox path="sectionList" title="Select to new releases" items= "${section.secId}" value="${section.secId}"/></td>
            </tr>
        </c:forEach>
    </tbody>
   
    </table>
</div>

 </c:if>
    
    </tiles:putAttribute>
</tiles:insertDefinition>
        