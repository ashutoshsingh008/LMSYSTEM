<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">

    <table>        
        <tr>
            <td colspan="5" ><a href="${pageContext.request.contextPath}/admin/addSection"><img title="Click to Add Class" src="${pageContext.request.contextPath}/images/imagesAdmin/plus.png"/>ADD Section</a></td>
        </tr>
   </table>
    
             
            
    <c:if test="${!empty classSectionList}">
    
        <div class="table">
	 <table
            <thead>
	  <tr>
            <th>Sr. No.</th> 
            <th>Class Name</th>
            <th>Section Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${classSectionList}" var="classSection" varStatus="srn">
            
            <tr>
                <td>${srn.index+1}.</td>           
                <td>${classSection.manageClass.className}</td>
                <td>
                 <c:if test="${empty classSection.manageSection.secName}">  
                      <span style="color: red;"> Warning: </span>No Value
                  </c:if> 
                    
                    ${classSection.manageSection.secName}</td>
                <td>--</td>
            </tr>
        </c:forEach>
    </tbody>
    
    </table>
</div>
</c:if>

              
    </tiles:putAttribute>
</tiles:insertDefinition>
        