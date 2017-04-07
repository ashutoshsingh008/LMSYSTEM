<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">  


    <table>        
        <tr>
            <td colspan="5" ><a href="${pageContext.request.contextPath}/admin/addSection"><img title="Click to Add Class" src="${pageContext.request.contextPath}/images/imagesAdmin/plus.png"/>ADD Section</a></td>
        </tr>
   </table>
    
             
            
<c:if test="${!empty sectionList}">   
    

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
       
        <c:forEach items="${sectionList}" var="section" varStatus="srn">
            
            <tr>
                <td>${srn.index+1}.</td>                
                <td>${section.secName}</td>                
                <td><a href="${pageContext.request.contextPath}/admin/deleteSection/${section.secId}"><img title="Click to delete" src="${pageContext.request.contextPath}/images/delete.jpg"/></a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/editSection/${section.secId}"><img title="Click to edit" src="${pageContext.request.contextPath}/images/edit.jpg"/></a></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>


        </tiles:putAttribute>
</tiles:insertDefinition>     