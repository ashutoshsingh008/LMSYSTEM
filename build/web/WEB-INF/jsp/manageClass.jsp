<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">  

    <table>        
        <tr>
            <td colspan="5" ><a href="${pageContext.request.contextPath}/admin/addClass"><img title="Click to Add Class" src="${pageContext.request.contextPath}/images/imagesAdmin/plus.png"/>ADD Class</a></td>
        </tr>
   </table>
    
             
            
<c:if test="${!empty classList}">   
    

        <div class="table">
	<table
       <thead>
	    <tr>
            <th>Sr. No.</th>            
            <th>Class Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${classList}" var="classes" varStatus="srn">
            
            <tr>
                <td>${srn.index+1}.</td>                
                <td>${classes.className}</td>                
                <td><a href="${pageContext.request.contextPath}/admin/deleteClass/${classes.classId}"><img title="Click to delete" src="${pageContext.request.contextPath}/images/delete.jpg"/></a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/editClass/${classes.classId}"><img title="Click to edit" src="${pageContext.request.contextPath}/images/edit.jpg"/></a></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>

        </tiles:putAttribute>
</tiles:insertDefinition>     