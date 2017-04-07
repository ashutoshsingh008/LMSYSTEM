<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">  
        
<div class="table" id="csList" >
       <c:if test="${!empty itemCatList}">   
	<table
       <thead>
	  <tr>
            <th>Sr. No.</th>
            <th>Item Category Name</th>
            <th>Item Sub Category Name</th>
            
          </tr>
        </thead>
        <tbody>
        
            <c:forEach items="${itemCatList}" var="itemCat" varStatus="srn">
            
            <tr>
                <td>${srn.index}.</td>
                <td>
                  
                  <c:if test="${empty itemCat.itemCatName}">  
                      <span style="color: red;"> Warning: </span>No Value
                  </c:if>
                    ${itemCat.itemCatName}
                </td>                
                <td>
                    
                 <c:if test="${empty itemCat.itemSubCatMaster}">  
                      <span style="color: red;"> Warning: </span>No Value
                  </c:if>   
                 <c:forEach items="${itemCat.itemSubCatMaster}" var="itemSubCat">
                  ${itemSubCat.itemSubCatName}
                 </c:forEach>   
                 
                 
                 </td>
                
            </tr>
        </c:forEach>
    </tbody>
    </table>
</c:if>
</div>

    
    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                           



