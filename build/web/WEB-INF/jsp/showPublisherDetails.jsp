        <%@ include file="/WEB-INF/jsp/header.jsp" %>
               <table width="100%" border="0" cellspacing="4" cellpadding="1">
                <tr>
                    <td align="left" class="topAlign">
                        <span class="spanShowDetails">${publisherList.publisherName}</span>
                    </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <td align="left" class="topAlign">
                        <table cellspacing="0" border="0" cellpadding="4" width="100%" style="border:1px dashed #0099ff;">
                            <tr>
                                <td class="label" width="20%" align="left" style="border-right:1px dashed #0099ff;">
                                    Email Address:&nbsp;
                                </td>
                                <td class="content" valign="top" width="80%">
                                    <a href='mailto:${publisherList.emailAddress}'>
                                        ${publisherList.emailAddress}
                                    </a>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <br><center>
                        <span style="font:20px/22px Georgia, serif; text-align:center; width:300px; color:#990000; height:37px;">Books published by ${publisherList.publisherName}</span>
                        </center><br>
                        <table class="view" align="center" cellspacing="0" cellpadding="6" width="100%">
                            <tr>
                                <th width="20%" class="label" align="left">Book</th>
                                <th width="60%" class="label" align="left">Synopsis</th>
                                <th width="10%" class="label" align="left">Cover Page</th>
                                <th width="10%" class="label" align="left">&nbsp;</th>
                            </tr>
                            
                            
                            
                            <c:forEach items="${bookList}" var="book">
                                <tr title="Click to view">
                                    <td width="20%" class="showBookList" onclick="javascript:location.href='<%=request.getContextPath()%>/showBookDetails/${book.bookNo}'">
                                        ${book.bookName}
                                    </td>
                                    <td width="60%" class="showBookList" onclick="javascript:location.href='<%=request.getContextPath()%>/showBookDetails/${book.bookNo}'">
                                        ${book.synopsis}
                                    </td>
                                    <td width="10%" class="showBookList" onclick="javascript:location.href='<%=request.getContextPath()%>/showBookDetails/${book.bookNo}'">
                                        <img src="<%=request.getContextPath()%>/admin/downloadBookPhotograph/${book.bookNo}" height="80px" width="80px"/>
                                    </td>
                                    <td width="10%" class="showBookList">
                                        <sec:authorize access="isAuthenticated()">
                                            <a href="<%=request.getContextPath()%>/addToCart/<sec:authentication property='principal.username' />/${book.bookNo}">
                                                <img src="<%=request.getContextPath()%>/images/addToCart.jpg" width="74px" height="74px" style="cursor:pointer;" border="0"/>
                                            </a>&nbsp;
                                        </sec:authorize>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </td>
                </tr>
            </table>
            <%@ include file="/WEB-INF/jsp/footer.jsp" %>

