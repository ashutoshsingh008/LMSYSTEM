<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">

<c:if test="${!empty itemCatList}">   
    

        <div class="table">
	<table
       <thead>
	    <tr>
            <th>Sr. No.</th>            
            <th>Item Category Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
        
            <c:forEach items="${itemCatList}" var="itemcats" varStatus="srn">
            
            <tr>
                <td>${srn.index+1}.</td>                
                <td>${itemcats.itemCatName}</td>                
                <td><a href="${pageContext.request.contextPath}/admin/Inventory/deleteItemCategory/${itemcats.itemCatId}"><img title="Click to delete" src="${pageContext.request.contextPath}/images/delete.jpg"/></a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/Inventory/editItemcategory/${itemcats.itemCatId}"><img title="Click to edit" src="${pageContext.request.contextPath}/images/edit.jpg"/></a></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>
    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                           