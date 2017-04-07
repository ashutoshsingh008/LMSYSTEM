<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
        
<c:if test="${!empty roomList}">   
    

        <div class="table">
	<table
       <thead>
	    <tr>
            <th>Sr. No.</th>            
            <th>Room Name</th>
            <th>Room Description</th>
          </tr>
        </thead>
        <tbody>
       <c:forEach items="${roomList}" var="room" varStatus="srn">
            
            <tr>
                <td>${srn.index+1}.</td>                
                <td>${room.room_name}</td>                
                <td>${room.description}</td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>

    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                                 