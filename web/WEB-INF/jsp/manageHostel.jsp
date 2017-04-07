<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
            
<c:if test="${!empty hostelList}">   
    

        <div class="table">
	<table
       <thead>
	    <tr>
            <th>Sr. No.</th>            
            <th>Hostel Name</th>
            <th>Hostel Description</th>
            <th>Room</th>
          </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${hostelList}" var="hostel" varStatus="srn" >
            
            <tr>
                <td>${srn.index+1}.</td>                
                <td>${hostel.hostel_name}</td>                
                <td>${hostel.description}</td>
                <td>  
                 
                    <table>
                    <c:forEach items="${hostel.managerRoom}" var="room">
                    <tr>
                     <td>${room.room_name}</td>
                     <td>${room.description}</td>
                    </tr>
                    </c:forEach>
                    </table>
                </td>
               
          </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>

    </tiles:putAttribute>
</tiles:insertDefinition>                                   
                                 