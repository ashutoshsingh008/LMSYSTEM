<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lms[Sharanam & Vaishali Shah] - Search Results</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/frontend.css" type="text/css">
    </head>
    <body>
        <%@ include file="/WEB-INF/jsp/header.jsp" %>
        <div id="bodyDiv">
            <table align="center" cellpadding="0" cellspacing="0" width="90%">
                <tr>
                    <td>            
                        <c:forEach items="${searchResultsList}" var="result">
                            <br /><br /><br />
                            <a class="searchName" href="<%=request.getContextPath()%>/showBookDetails/${result[0]}">${result[1]}</a><br>
                            <span class="searchYear">${result[2]}</span><br>
                            <span class="searchSynopsis">${result[3]}</span><br>
                            Downloads:&nbsp;<a href="${pageContext.request.contextPath}/admin/downloadBookSampleChapter/${result[0]}">Sample</a> &nbsp;|&nbsp; <a href="${pageContext.request.contextPath}/admin/downloadBookTOC/${result[0]}">TOC</a>
                        </c:forEach>
                    </td>
                </tr>
            </table>
            <%@ include file="/WEB-INF/jsp/footer.jsp" %>
        </div>
    </body>
</html>
