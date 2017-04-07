<%@ page import="java.util.*" %>
<%@ page import="java.security.*" %>

<%!
public boolean empty(String s)
	{
		if(s== null || s.trim().equals(""))
			return true;
		else
			return false;
	}
%>
<%!
	public String hashCal(String type,String str){
		byte[] hashseq=str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try{
		MessageDigest algorithm = MessageDigest.getInstance(type);
		algorithm.reset();
		algorithm.update(hashseq);
		byte messageDigest[] = algorithm.digest();
            
		

		for (int i=0;i<messageDigest.length;i++) {
			String hex=Integer.toHexString(0xFF & messageDigest[i]);
			if(hex.length()==1) hexString.append("0");
			hexString.append(hex);
		}
			
		}catch(NoSuchAlgorithmException nsae){ }
		
		return hexString.toString();


	}
%>
<% 	
	String merchant_key="1TakGkPD";
	String salt="RMqqFC5fRz";
	String action1 ="";
	String base_url="https://test.payu.in";
	int error=0;
	String hashString="";
	
 

	
	Enumeration paramNames = request.getParameterNames();
	Map<String,String> params= new HashMap<String,String>();
    	while(paramNames.hasMoreElements()) 
	{
      		String paramName = (String)paramNames.nextElement();
      
      		String paramValue = request.getParameter(paramName);

		params.put(paramName,paramValue);
	}
	String txnid ="";
	if(empty(params.get("txnid"))){
		Random rand = new Random();
		String rndm = Integer.toString(rand.nextInt())+(System.currentTimeMillis() / 1000L);
		txnid=hashCal("SHA-256",rndm).substring(0,20);
	}
	else
		txnid=params.get("txnid");
                
	String txn="abcd";
	String hash="";
	String hashSequence = "key|txnid|amount|productinfo|firstname|email|udf1|udf2|udf3|udf4|udf5|udf6|udf7|udf8|udf9|udf10";
	if(empty(params.get("hash")) && params.size()>0)
	{
		if( empty(params.get("key"))
			|| empty(params.get("txnid"))
			|| empty(params.get("amount"))
			|| empty(params.get("firstname"))
			|| empty(params.get("email"))
			|| empty(params.get("phone"))
			|| empty(params.get("productinfo"))
			|| empty(params.get("surl"))
			|| empty(params.get("furl"))
			|| empty(params.get("service_provider"))
	)
			
			error=1;
		else{
			String[] hashVarSeq=hashSequence.split("\\|");
			
			for(String part : hashVarSeq)
			{
				hashString= (empty(params.get(part)))?hashString.concat(""):hashString.concat(params.get(part));
				hashString=hashString.concat("|");
			}
			hashString=hashString.concat(salt);
			

			 hash=hashCal("SHA-512",hashString);
			action1=base_url.concat("/_payment");
		}
	}
	else if(!empty(params.get("hash")))
	{
		hash=params.get("hash");
		action1=base_url.concat("/_payment");
	}
		

%>

<script>
var hash='<%= hash %>';
function submitPayuForm() {
	
	if (hash == '')
		return;

      var payuForm = document.forms.payuForm;
      payuForm.submit();
    }
</script>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lms[Sharanam & Vaishali Shah] - <sec:authorize access='isAuthenticated()'><sec:authentication property='principal.username' /></sec:authorize>'s Cart</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/frontend.css" type="text/css">
    </head>
<body onload="submitPayuForm();">        <%@ include file="/WEB-INF/jsp/header.jsp" %>
        <div id="bodyDiv">
        <c:choose>
            <c:when test="${!empty cartList}">
                <table width="100%" border="0" cellspacing="4" cellpadding="1" style="font-size:18px;">
                    <tr>
                        <td colspan="2" align="left" class="topAlign">
                            <span class="spanShowDetails">${userDetails.firstName} ${userDetails.lastName}'s Cart</span><br/><br/>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" class="topAlign" width="5%">&nbsp;</td>
                        <td align="left" class="showCartList">
                            <strong>Book</strong>
                        </td>
                        <td align="center" class="showCartList" width="10%">
                            <strong>Quantity</strong>
                        </td>
                        <td align="center" class="showCartList" width="10%">
                            <strong>Cost</strong>
                        </td>
                    </tr>
                    <c:forEach items="${cartList}" var="cart">
                        <c:set var="totalCost" value="${totalCost+(cart.qty*cart.cost)}"/>
                            <tr>
                                <td align="center" class="topAlign">
                                    <a href="<%=request.getContextPath()%>/removeFromCart/<sec:authorize access='isAuthenticated()'><sec:authentication property='principal.username' /></sec:authorize>/${cart.bookNo}">
                                        <img src="<%=request.getContextPath()%>/images/delete.jpg" alt="Click to remove the Book from the cart">
                                    </a>
                                </td>
                                <td align="left" class="topAlign" style="border:1px dashed #990033;">
                                    <a href="<%=request.getContextPath()%>/showBookDetails/${cart.bookNo}">
                                        <img src="<%=request.getContextPath()%>/admin/downloadBookPhotograph/${cart.bookNo}" height="80px" width="80px"/>
                                    </a>
                                    ${cart.bookName}
                                </td>
                                <td align="center" style="border:1px dashed #990033;">
                                    ${cart.qty}
                                </td>
                                <td align="center" style="border:1px dashed #990033;">
                                    ${cart.cost}
                                </td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td>&nbsp;</td>
                            <td colspan="2" align="right" style="border:1px solid #990033; background-color:#FFFF99;">
                                <b>Total Cost:</b>
                            </td>
                            <td align="center" style="border:1px solid #990033; background-color:#FFFF99;">
                                <b>${totalCost}</b>
                            </td>
                        </tr>
                    </table>
                    <br/>
					
					
					
		
                    
<form action="<%= action1 %>" method="post" name="payuForm">
<input type="hidden" name="key" value="<%= merchant_key %>" />
      <input type="hidden" name="hash" value="<%= hash %>"/>
      <input type="hidden" name="txnid" value="<%= txnid %>" />
      <input type="hidden" name="udf2" value="<%= txnid %>" />
      <input type="hidden" name="service_provider" value="payu_paisa" />
      <table>
        <tr>
          <td><b>Mandatory Parameters</b></td>
        </tr>
        <tr>
          <td>Amount: </td>
          <td><input name="amount" value="${totalCost}" /></td>
          <td>First Name: </td>
          <td><input name="firstname" id="firstname" value="<%= (empty(params.get("firstname"))) ? "" : params.get("firstname") %>" /></td>
        </tr>
        <tr>
          <td>Email: </td>
          <td><input name="email" id="email" value="<%= (empty(params.get("email"))) ? "" : params.get("email") %>" /></td>
          <td>Phone: </td>
          <td><input name="phone" value="<%= (empty(params.get("phone"))) ? "" : params.get("phone") %>" /></td>
        </tr>
        <tr>
          <td>Product Info: </td>
          <td colspan="3"><input name="productinfo" value="<%= (empty(params.get("productinfo"))) ? "" : params.get("productinfo") %>" size="64" /></td>
        </tr>
        <tr>
          <td>Success URI: </td>
          <td colspan="3"><input name="surl" value="<%= (empty(params.get("surl"))) ? "" : params.get("surl") %>" size="64" /></td>
        </tr>
        <tr>
          <td>Failure URI: </td>
          <td colspan="3"><input name="furl" value="<%= (empty(params.get("furl"))) ? "" : params.get("furl") %>" size="64" /></td>
        </tr>
   
        <tr>
          <% if(empty(hash)){ %>
            <td colspan="4"><input type="submit" value="Submit" /></td>
          <% } %>
        </tr>
      </table>
    </form>
       
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
					
		  	
                    <!-- 
                    <c:if test='${!googleMerchantID.equals("")}'>
                        <a href="<%=request.getContextPath()%>/saveCart/<sec:authorize access='isAuthenticated()'><sec:authentication property='principal.username' /></sec:authorize>">
                            <img align="right" src="<%=request.getContextPath()%>/images/checkOut.jpg" title="Check out using Google Wallet" />
                        </a>
                    </c:if>
		   -->			
					
					
					
					
					
					
                </c:when>
                <c:otherwise>
                    <span style="font:16px/18px Georgia, serif; width:300px; color:#990000; height:37px;"><br/>Your Shopping Cart is empty.<br>Your Shopping Cart lives to serve. Give it purpose by filling it with books.<br>To put something in your Shopping Cart, start by searching or browsing through any of our books.<br>When an item interests you, click the Add to Cart button.</span>
                </c:otherwise>
            </c:choose>
            <%@ include file="/WEB-INF/jsp/footer.jsp" %>
        </div>
    </body>
</html>
