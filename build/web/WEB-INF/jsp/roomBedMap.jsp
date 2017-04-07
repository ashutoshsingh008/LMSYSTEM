<%@page language="java" contentType="text/html" import="java.util.*, java.text.SimpleDateFormat" session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<style type="text/css"> 
 
.bd {
    background: #00376e;
    color:white;
    border:#0066CC 2px solid;
}
 
.hd {
    background:#0066CC;
    color:white;
    border:#0066CC 1px solid;
}
 
</style> 

<tiles:insertDefinition name="defaultAdminTemplate">
    <tiles:putAttribute name="body">



    <table>
          <tr>
            <th><input type='text' name='searchByAdNo' id='searchByAdNo' placeholder='Search By Admission Number' value='' style='width:190px;'><input type='button' name='search' id='search' value='SEARCH' onclick="roomByAdNo(document.getElementById('searchByAdNo').value)" ></th>
          </tr>
        <tr>
            <td>
             <div id="shbr456"> </div>
            </td>
        </tr>
   </table>
            
<c:if test="${!empty hostelList}">   
    

        <div class="table">
       <table>
       <thead>
	  <tr>
            <th>Sr. No.</th>            
            <th>Hostel Name</th>
            <th>Hostel Description</th>
          </tr>
        </thead>

        <tbody>
        <% int srn = 1; %>
        <c:forEach items="${hostelList}" var="hostel">
           
         <tr>
                <td><%=srn++ %>.</td>                
                <td>
                                   
                 ${hostel.hostel_name}
                
                
                </td>                
                <td>  
                    <div id="room_bed" style="float: left;" >
                    <c:forEach items="${hostel.managerRoom}" var="room">

                    <div id="room" style="background-color:#6666ff; font-weight: bold; color: white; width: 100px; height: 25px; float: left; border: white 4px solid; text-align: center; ">${room.room_name} [${room.floor} Floor]</div>


                    <c:if test="${empty room.manageBed}">                      
                    <div id="bed" style="float: left;  width: 172px; height: 30px; border: green 1px solid; color: red;  text-align: center; "  >Bed Not Mapped With Room.</div>
                    </c:if>  

                    
                    
                    
                    


<c:forEach items="${room.manageBed}" var="bed">
<c:set var="bg" value="green"/> 
<c:forEach items="${sra}" var="bedData">

<c:if test="${bedData.hostel_id == hostel.hostel_id && bedData.room_id == room.room_id && bedData.bed_id == bed.bed_id}">      
<c:set var="bg" value="red"/>     
</c:if>

</c:forEach>

<div id="bed${hostel.hostel_id}${room.room_id}${bed.bed_id}" style="background-color:${bg}; float: left;  width: 30px; height: 30px; border: white 4px solid; color: white;  text-align: center; cursor: pointer; " onclick="allocateBed1(${hostel.hostel_id},${room.room_id},${bed.bed_id})" > ${bed.bed_name}</div>          
     

</c:forEach>                
</br>
</c:forEach> 
                
                   
                    
                    
                </td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
</div>
</c:if>

                    
     </tiles:putAttribute>
</tiles:insertDefinition>
                           
                    
<div id="panel2" style="visibility:hidden"></div>    
 <script type="text/javascript">
YAHOO.namespace("example.container");
 
function getDepDes(uid) {
//alert(uid)
// Build panel2 based on markup
var panel2 = document.getElementById("panel2");
        panel2.innerHTML = ""; 
YAHOO.example.container.panel2 = new YAHOO.widget.Panel("panel2", 
{               
                width: "180px",
                fixedcenter: true,
                close: true,
                draggable: false,
                zindex:8,
                modal: true,
                visible: false
            }
 );
     
        var parts = uid.split("@@");
       
        var hId = parts[0];
        var rId = parts[1];
        var bId = parts[2];
        //var subCatId = Integer.parseInt(parts[1]);
     
var form1 = "<div class='hd' style='width:100%; text-align:center;'>BED ALLOCATION</div><div class='bd' >"+
"<form commandName='srm' method='post' action='${pageContext.request.contextPath}/admin/allocateBed/"+uid+"'>"+

"<fieldset>"+
"<p> "+
"<input type='hidden' name='bedAlloc' id='bedAlloc' value='"+hId+rId+bId+"'>"+
"<label for='adNo'>Admission Number</label><br/>"+ 
"<input type='text' name='adNo' id='adNo' placeholder='Ad' value=''> "+
"</p> "+
"<p> "+
"<label for='name'>Name</label><br/> "+
"<input type='text' name='stu_name' id='stu_name' value=''>"+
"</p> "+
"<p> "+
"<label for='scamp'>Student Campus</label><br/> "+
"<select id='scamp' name='scamp'><option value='0'>SELECT CAMPUS</option><option value='1'>University</option><option value='2'>Institute</option><option value='3'>School</option></select> "+
"</p> "+
"<input type='button' name='submit' id='submit' value='Submit Form' onclick=allocateBed("+parts+",document.getElementById('stu_name').value)>"+
"</fieldset> "+

"</form></div></div>";

     
//YAHOO.example.container.panel2.render("cccccccccccccc");

//YAHOO.example.container.manager = new YAHOO.widget.OverlayManager();
//YAHOO.example.container.manager.register([YAHOO.example.container.panel2]);
//YAHOO.util.Event.addListener(id, "click", YAHOO.example.container.panel2.show, YAHOO.example.container.panel2, true);
//YAHOO.example.container.panel2.show();

//YAHOO.example.container.panel2.setHeader(uid);
YAHOO.example.container.panel2.setBody(form1);
YAHOO.example.container.panel2.render();
YAHOO.example.container.panel2.show();
//callYUI("45");
}
 
//YAHOO.util.Event.onDOMReady(getDepDes("45"));
</script> 

<script type="text/javascript">
    
//YAHOO.namespace("example.container");
//YAHOO.util.Event.onDOMReady(getDepDes("45"));

function allocateBed1(hid, rid, bid)
{
getDepDes(hid +"@@"+ rid +"@@"+ bid)
}
</script>


<script>

var ajaxObj = false;

if(window.XMLHttpRequest)

	{
	ajaxObj = new XMLHttpRequest();
	}

else if(window.ActiveXObject)

	{
	ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");
	}


function allocateBed(hid, rid, bid, stu_name)
{
if(ajaxObj)
	{	
	var URL="allocateBed/" + hid + "@@" + rid + "@@" + bid + "@@" + stu_name;
        //var URL="allocateBed/" + hid;
        //alert(URL)      
	ajaxObj.open("POST", URL , true);
	ajaxObj.onreadystatechange = function()
		{
		if(ajaxObj.readyState == 4 && ajaxObj.status == 200)
			{
			document.getElementById("bed"+hid + rid + bid).innerHTML=ajaxObj.responseText;
			}
		}
	ajaxObj.send(null);
	}
}


function roomByAdNo(adNo)
{
if(ajaxObj)
	{	
	var URL="searchByAdNo/" + adNo;
        //var URL="allocateBed/" + hid;
        alert(URL)      
	ajaxObj.open("POST", URL , true);
	ajaxObj.onreadystatechange = function()
		{
		if(ajaxObj.readyState == 4 && ajaxObj.status == 200)
			{
			document.getElementById("shbr"+adNo).innerHTML=ajaxObj.responseText;
			}
		}
	ajaxObj.send(null);
	}
}

</script>


