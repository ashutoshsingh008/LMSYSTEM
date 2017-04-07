<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<div id="left">
<div id="menu">
    
<h6 id="h-menu-products" class="selected"><a href="#products"><span>LMS SETTINGS</span></a></h6>
<ul id="menu-products" class="opened">

<c:set var="msg" value="${requestScope['javax.servlet.forward.request_uri']}"/>
<c:set var="arrayofmsg" value="${fn:split(msg,'/')}"/>

 <c:if test="${arrayofmsg[2]== 'manageBooks'}">  
    <li><a href="<%=request.getContextPath()%>/admin/manageBooks">Manage Books</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/managePublishers">Manage Publishers</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageAuthors">Manage Authors</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageTransactions">Manage Transactions</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageCategories">Manage Categories</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageCountries">Manage Countries</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageStates">Manage States</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageClass">Manage Class</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/manageSection">Manage Section</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/classSectionMap">Class-Section Mapping</a></li>  
 </c:if>  

<c:if test="${!empty arrayofmsg[2]}">  
 <c:if test="${arrayofmsg[2]== 'Inventory'}">  
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Inventory/manageItemCategory">Manage Item Category</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Inventory/manageItemSubCategory">Manage Item Sub Category</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Inventory/itemCatSubCatMap">Item Cat-SubCat Mapping</a></li>   
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Inventory/restServiceConsume">Rest Service Consume</a></li>

 </c:if>       
</c:if>
    
<c:if test="${!empty arrayofmsg[2]}">  
 <c:if test="${arrayofmsg[2]== 'Booking'}">  
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Booking/manageHostel">Manage Hostels</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Booking/manageRoom">Manage Rooms</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Booking/hostelRoomMap">Hostel-Room Mapping</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Booking/jsonProducer">Rest Json Producer</a></li>
    <li class="selected"><a href="<%=request.getContextPath()%>/admin/Booking/jsonClint">Rest Json Clint</a></li>
 </c:if>       
</c:if> 
</ul>


<div style="text-align: center; border:#3366CC 1px solid; margin-top: 10px; padding: 10px;">
 
<sec:authorize access="isAuthenticated()">                                
    <span style="font-weight: bold; color: #3366CC ">-:${wmsg}:- </span></br>${userDetails.firstName} ${userDetails.lastName} (<span style="font-weight: bold;">
    <sec:authentication property="principal.username" />
    </span>)
</sec:authorize>    
</div>
</div>
</div>



