<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">        
    
        <div class="table" id ="markup">
            
         <a href="${pageContext.request.contextPath}/admin/Inventory/getExcelItemSubCategory">Download Excel Report</a> || <a href="${pageContext.request.contextPath}/admin/Inventory/getPdfItemSubCategory">Download PDF Report</a>
            
  	<table  border="1" id= "accounts">
            <c:if test="${!empty itemSubCatList}"> 
       <thead>
	    <tr>
            <th>Sr. No.</th>
            <th>Item Sub Category Name</th>
            <th>Action</th>
            </tr>
        </thead>
        <tbody>
        
            <c:forEach items="${itemSubCatList}" var="itemsubcat" varStatus="srn">
            <tr>
                <td>${srn.index+1}.</td>
                <td>${itemsubcat.itemSubCatName}</td>
                <td><a href="${pageContext.request.contextPath}/admin/Inventory/deleteItemSubCategory/${itemsubcat.itemSubCatId}"><img title="Click to delete" src="${pageContext.request.contextPath}/images/delete.jpg"/></a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/editItemSubCategory/${itemsubcat.itemSubCatId}"><img title="Click to edit" src="${pageContext.request.contextPath}/images/edit.jpg"/></a></td>                
            </tr>
        </c:forEach>
    </tbody>
    </c:if>
    </table>
        
</div>


    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                          