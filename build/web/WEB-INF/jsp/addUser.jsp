<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">

<form:form method="post" action="${pageContext.request.contextPath}/admin/saveUser" commandName="user">
<form:hidden path="userNo" />
            
       <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr>
                                <td class="manageForms">Manage Users</td>
                                <td align="center" class="error">${dbError}</td>
                                <td class="information">
                                    <span class="mandatory">*</span> mandatory fields </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr><td class="hrLine">&nbsp;</td></tr>
                <tr>
                    <td>
                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                            <tr>
                                <td>
                                    <table width="100%" border="0" cellpadding="4" cellspacing="4">
                                     
                                        <tr>
                                            <td width="10%">First Name<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="firstName" title="Enter the first name" maxlength="25" size="55"/><br>
                                                <form:errors path="firstName" cssClass="error" />
                                            </td>
                                            <td width="10%">Last Name<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="lastName" title="Enter the last name" maxlength="25" size="55"/><br>
                                                <form:errors path="lastName" cssClass="error" />
                                            </td>
                                        </tr>
                         
                                        <tr>
                                            <td width="10%">Address Line 1:</td>
                                            <td width="45%">
                                                <form:input path="address1" title="Enter the street address" maxlength="50" size="55"/>
                                            </td>
                                            <td width="10%">&nbsp;</td>
                                            <td width="45%">
                                                <form:select path="stateNo">
                                                    <form:option value="" label="--- Select ---"/>
                                                    <form:options title="Select the state" items="${stateList}" itemValue="stateNo" itemLabel="state" />
                                                </form:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">Address Line 2:</td>
                                            <td width="45%">
                                                <form:input path="address2" title="Enter the street address" maxlength="50" size="55"/>
                                            </td>
                                            <td width="10%">&nbsp;</td>
                                            <td width="45%">
                                                <form:select path="countryNo">
                                                    <form:option value="" label="--- Select ---"/>
                                                    <form:options title="Select the country" items="${countryList}" itemValue="countryNo" itemLabel="country" />
                                                </form:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">City:</td>
                                            <td width="45%">
                                                <form:input path="city" title="Enter the city" maxlength="50" size="55"/>
                                            </td>
                                            <td width="10%">Pincode:</td>
                                            <td width="45%">
                                                <form:input path="pincode" title="Enter the pincode" maxlength="15" size="20"/>
                                            </td>
                                        </tr>
 
                                        <tr>
                                            <td width="10%">Email Address<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="emailAddress" title="Enter the email address" maxlength="50" size="55"/><br>
                                                <form:errors path="emailAddress" cssClass="error" />
                                            </td>
                                            <td width="10%">Birthdate:</td>
                                            <td width="45%">
                                                <form:input path="dob" title="Enter the birthdate" maxlength="25" size="55"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="sectionName" colspan="4">
                                                <br />Login Details<br /><br />
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">Username<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="userName" title="Enter the username" maxlength="25" size="55"/><br>
                                                <form:errors path="userName" cssClass="error" />
                                            </td>
                                            <td width="10%">Password<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:password path="password" title="Enter the password" maxlength="8" size="55"/><br>
                                                <form:errors path="password" cssClass="error" />
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="sectionName" colspan="2">
                                                <br />Subscribe To<br /><br />
                                            </td>
                                            <td class="sectionName" colspan="2">
                                                <br />Privileges<br /><br />
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">
                                                <table width="100%" border="0" cellpadding="4" cellspacing="4">
                                                    <tr>
                                                        <td>New Releases<form:checkbox path="newRelease" title="Select to new releases"/></td>
                                                        <td>Book Updates<form:checkbox path="bookUpdates" title="Select to book updates"/></td>
                                                    </tr>
                                                </table>
                                            </td>
                                            <td colspan="2">
                                                <table width="100%" border="0" cellpadding="4" cellspacing="4">
                                                    <tr>
                                                        <td>Account Status (Active):<form:checkbox path="enabled" title="Select the status"/></td>
                                                        <td>Role<span class="mandatory">*</span>:</td>
                                                        <td>
                                                            <form:select path="authority" title="Select the role of the user">
                                                                <form:option value="ROLE_USER" label="User"/>
                                                                <form:option value="ROLE_ADMIN" label="Admin" />
                                                                <form:option value="CUSTOMER" label="Customer" />
                                                            </form:select>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td colspan="2" class="centerAlign">
                                    <input type="submit" class="groovybutton" value="Save" />
                                    <input type="reset" value="Clear" class="groovybutton" onclick="javascript:document.location.href='${pageContext.request.contextPath}/admin/addUser'" />
                                    <input type="reset" value="Back" class="groovybutton" onclick="javascript:document.location.href='${pageContext.request.contextPath}/admin/manageUsers'" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

            </table>
        
        </form:form>             
        
    </tiles:putAttribute>
</tiles:insertDefinition>