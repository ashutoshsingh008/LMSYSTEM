<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">


<c:if test="${!empty hostelList}">   
    

        <div class="table">
            <table >
        <thead>
	    <tr>
            <th>Sr. No.</th>            
            <th>Hostel Name</th>
            <th>Room Id</th>
          </tr>
        </thead>
        <tbody>
            <c:forEach items="${hostelList}" var="hostel" varStatus="srn">
	    <tr>
            <td>${srn.index+1}.</td>    
            <td>${hostel.hostel_name}</td>            
            <td>------</td>
            </tr>
           </c:forEach>
    </tbody>
    </table>
</div>
</c:if>


    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                           