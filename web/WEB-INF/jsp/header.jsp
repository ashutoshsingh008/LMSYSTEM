<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/frontend.css" type="text/css">

<div id="headerDiv">
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr>
            <td width="45%" class="topAlign" align="left">
                <table id="welcome" border="0" width="100%">
                    <tr>
                        <td>
                            <h2>Online Bookshop</h2>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <sec:authorize access="isAuthenticated()">
                                <br/>
                                <h3 class="welcomeMessage">Welcome ${userDetails.firstName} ${userDetails.lastName} (<sec:authentication property="principal.username" />)</h3>
                            </sec:authorize>
                        </td>
                    </tr>
                </table>
            </td>
            <td width="55%">
                <table border="0" width="100%">
                    <tr>
                        <td>
                            <table border="0" class="topAlign" align="right" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td>
                                        <a href="<%=request.getContextPath()%>/home"><img src="<%=request.getContextPath()%>/images/home.png" title="Home (End User)"/></a>
                                    </td>
                                    <sec:authorize access="isAnonymous()">
                                        <td>
                                            &nbsp;&nbsp;
                                            <a href="<%=request.getContextPath()%>/signUp"><img src="<%=request.getContextPath()%>/images/signup.png" title="Sign Up"/></a>
                                        </td>
                                    </sec:authorize>
                                    <sec:authorize access="isAuthenticated()">
                                        <td>
                                            &nbsp;&nbsp;
                                            <a href="<%=request.getContextPath()%>/showCart/<sec:authorize access='isAuthenticated()'><sec:authentication property='principal.username' /></sec:authorize>"><img src="<%=request.getContextPath()%>/images/showCart.png" title="Show Cart"/></a>
                                        </td>
                                    </sec:authorize>
                                    <sec:authorize access="isAuthenticated()">
                                        <td>
                                            &nbsp;&nbsp;
                                            <a href="<%=request.getContextPath()%>/j_spring_security_logout"><img src="<%=request.getContextPath()%>/images/logout.png" title="Logout"/></a>
                                        </td>
                                    </sec:authorize>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br/>
                            <table class="rightAlign" border="0" cellspacing="0" cellpadding="0" width="100%">
                                <tr>
                                    <td>
                                        <form:form commandName="search" method="post">
                                            <form:input path="searchCriteria" cssClass="search-text" title="Enter the search criteria" /><input id="button-search" class="search-button" type="button" onclick="document.location.href='${pageContext.request.contextPath}/searchResults/' + document.forms[0].searchCriteria.value" title="Search" name="fulltext" value="" />
                                        </form:form>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</div>
