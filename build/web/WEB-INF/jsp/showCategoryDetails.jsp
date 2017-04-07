        <%@ include file="/WEB-INF/jsp/header.jsp" %>
               <table width="100%" border="0" cellspacing="4" cellpadding="1">
                <tr>
                    <td align="left" class="topAlign">
                        <br />
                        <span class="spanShowDetails">${categoryList.category}</span>
                    </td>
                </tr>
                <tr><td>&nbsp;</td></tr>
                <tr>
                    <td align="left" valign="top" class="content">
                        ${categoryList.description}
                    </td>
                </tr>
                <tr>
                    <td>
                        <br><br>
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

