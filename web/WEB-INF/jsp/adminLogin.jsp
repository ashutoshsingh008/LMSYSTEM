<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>



<link href="<c:url value='/css/style.css' />" rel="stylesheet">

<tiles:insertDefinition name="landingPage">
<tiles:putAttribute name="body">
                    

   	<div id="login">
			<!-- login -->
			<div class="title">
				<h5>Sign In to Smooth Admin</h5>
				<div class="corner tl"></div>
				<div class="corner tr"></div>
			</div>
                        
                        
                        <c:if test="${not empty error}">
                            <div class="messages" style="height: 70px;">
				<div id="message-error" class="message message-error">
					<div class="image">
						
                    <div class="error">
                        Your login attempt was not successful, try again.<br />
                        Invalid username or password
                    </div>
					</div>

					<div class="dismiss">
						<a href="${pageContext.request.contextPath}/admin/adminLogin"></a>
					</div>
				</div>
			</div>
                    
                       </c:if>
                
			<div class="inner">
				<form name='loginForm' action="<c:url value='j_spring_security_check'/>" method='POST'>
				<div class="form">
					<!-- fields -->
					<div class="fields">
						<div class="field" >
							<div class="label">
								<label for="username">Username:</label>
							</div>
							<div class="input">
								<input type='text' name='j_username' id='j_username' maxlength="8" size="40" value="admin" class="focus" />
							</div>
						</div>
						<div class="field">
							<div class="label">
								<label for="password">Password:</label>
							</div>
							<div class="input">
								<input type='password' name='j_password' id='j_password' maxlength="8" size="40" value="password" class="focus" />
							</div>
						</div>
						<div class="field">
							<div class="checkbox">
								<input type="checkbox" id="remember" name="remember" />
								<label for="remember">Remember me</label>
							</div>
						</div>
                                            <div class="buttons">
							<input type="submit" name="submit" value="Sign In" />
					   </div>
					</div>
					<!-- end fields -->
					<!-- links -->
					<div class="links">
						<a href="${pageContext.request.contextPath}/admin/forgotPassword">Forgot your password?</a>
					</div>
					<!-- end links -->
				</div>
				</form>
			</div>
                  
                                

		</div>    
        
                                   
                                        
                                        
                                        
                                        
                                        
</tiles:putAttribute>
</tiles:insertDefinition>                         
                                        
	
 




    