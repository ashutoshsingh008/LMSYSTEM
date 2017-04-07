<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>   
    
    <%
    Date d = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DATE);
    String curDate = null;
    curDate = year + "-" + month + "-" + day;
    %>
    


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	
<head>
<title>Hostel Booking System</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<!-- stylesheets -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css" media="screen" />


</head>
	<body class="yui-skin-sam">
	<!-- dialogs -->
	<!-- end dialogs -->
    <!-- header -->
<div id="header">
			<!-- logo -->
			<div id="logo">
				<h1><a href="#" title="Learning Management System"><img src="<%=request.getContextPath()%>/images/imagesAdmin/logo.png" alt="Learning Management System" /></a></h1>
                        </div>
			<!-- end logo -->
			<!-- user -->
			<ul id="user">
				<li class="first"><a href="#">Account</a></li>
				<li><a href="#">Messages (0)</a></li>
				<li><a href='<c:url value="/admin/j_spring_security_logout" />' title="Logout">Logout</a></li>
				<li class="highlight last"><a href="#">View Site</a></li>
			</ul>
			<!-- end user -->
			<div id="header-inner">
                            <div id="home">
                                <a href="#" title="Home"></a>                                   
                              </div>
<!-- quick -->
<ul id="quick">
<li><a href="<%=request.getContextPath()%>/admin/Booking/manageHostel" title="Hostel Management"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/application_double.png" alt="Inventory" /></span><span class="normal">Hostel Room Booking</span></a></li>
<li><a href="<%=request.getContextPath()%>/admin/Inventory/manageItemCategory" title="Products"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/application_double.png" alt="Inventory" /></span><span class="normal">Inventory</span></a></li>
<li><a href="<%=request.getContextPath()%>/admin/manageBooks" title="Products"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/application_double.png" alt="Products" /></span><span>Library</span></a></li>
<li><a href="#" title="Events"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/calendar.png" alt="Events" /></span><span>Events</span></a></li>
<li>
<a href="#" title="Pages"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/page_white_copy.png" alt="Pages" /></span><span>Pages</span></a></li>
<li><a href="#" title="Links"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/world_link.png" alt="Links" /></span><span>Links</span></a>
<ul>
<li><a href="#">Manage Links</a></li>
<li class="last"><a href="#">Add Link</a></li>
</ul>
</li>
<li>
<a href="#" title="Settings"><span class="icon"><img src="<%=request.getContextPath()%>/images/imagesAdmin/icons/cog.png" alt="Settings" /></span><span>Settings</span></a>
<ul>
<li><a href="<%=request.getContextPath()%>/admin/manageUsers" title="Manage Users">Users Settings</a></li>
<li class="last"><a href="<%=request.getContextPath()%>/admin/manageCategories">Other Setting</a></li>
</ul>
</li>
</ul>
<!-- end quick -->
				<div class="corner tl"></div>
				<div class="corner tr"></div>
			</div>
	</div>
		<!-- end header -->
		<!-- content -->
		<div id="content">
			<!-- end content / left -->			
                <tiles:insertAttribute name="leftMenu" />
			<!-- end content / left -->
<div id="right">
<div class="box">
<!-- box / title -->
<div class="title">
<h5>Navigation Link would be here</h5>

</div>
<!-- end box / title -->

<tiles:insertAttribute name="body" />

           
</div>                
</div>  	
</div>
		<!-- end content -->
		<!-- footer -->
		<div id="footer">
			<p>Copyright &copy; 2000-2010 Your Company. All Rights Reserved.</p>
		</div>
		<!-- end footert -->
	</body>

</html>