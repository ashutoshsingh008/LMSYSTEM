<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">
        
        
        <form method="POST" action="https://sandbox.google.com/checkout/cws/v2/Merchant/${googleMerchantID}/checkoutForm" accept-charset="utf-8">
            <c:if test="${!empty cartList}">
                <c:forEach items="${cartList}" var="cartItem" varStatus="loop">
                    <input type="hidden" name="item_name_${loop.index+1}" value="${cartItem.bookName}">
                    <input type="hidden" name="item_description_${loop.index+1}" value="${cartItem.synopsis}">
                    <input type="hidden" name="item_quantity_${loop.index+1}" value="${cartItem.qty}">
                    <input type="hidden" name="item_price_${loop.index+1}" value="${cartItem.cost}">
                </c:forEach>
            </c:if>
            <input type="hidden" name="checkout-flow-support.merchant-checkout-flow-support.continue-shopping-url" value="<%=request.getContextPath()%>/home"/>
            <input type="hidden" name="_charset_"/>
        </form>
        <script>
            <!--
                document.forms[0].submit();
            -->
        </script>
    
    
    </tiles:putAttribute>
</tiles:insertDefinition>
        
        
        