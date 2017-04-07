<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
   

<c:if test="${!empty userList}">
    
    
    <table>        
        <tr>
            <td colspan="5" ><a href="${pageContext.request.contextPath}/admin/addUser"><img title="Click to Add User" src="${pageContext.request.contextPath}/images/imagesAdmin/plus.png"/>ADD USER</a></td>
        </tr>
   </table>
        <div class="table">
	<table
       <thead>
	    <tr>
            <th>Name</th>
            <th>Username</th>
            <th>Email Address</th>
            <th>Authority</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.emailAddress}</td>
                <td>${user.authority}</td>
                <td><a href="${pageContext.request.contextPath}/admin/deleteUser/${user.userNo}"><img title="Click to delete" src="${pageContext.request.contextPath}/images/delete.jpg"/></a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/editUser/${user.userNo}"><img title="Click to edit" src="${pageContext.request.contextPath}/images/edit.jpg"/></a></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>

    </tiles:putAttribute>
</tiles:insertDefinition>
        