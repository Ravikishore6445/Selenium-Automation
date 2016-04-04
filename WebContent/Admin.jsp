<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type = "text/css">


#chat {
	margin-left: 900px;
	height:250px;
	border-style: solid;
	background: #f3f3f3;
	border: 1px solid;
	border-color: #b4ccce #b3c0c8 #9eb9c2;
	border-radius: 16px;
}



#chat1 {

margin-left: 900px;
	
	
}

</style>

<script type = "text/javascript">

function getchat()
{
var str = document.getElementById("chattext").value;
  //document.getElementById("chat").innerHTML = "User"+":"+str; 
  
	
  //document.getElementById("chattext").value = " ";
  
  if (window.XMLHttpRequest)
	{// code for IE7+, Firefox, Chrome, Opera, Safari
	xmlhttp=new XMLHttpRequest();
	}
	else
	{// code for IE6, IE5
	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}

	xmlhttp.onreadystatechange=function()
	{
	if (xmlhttp.readyState==4 && xmlhttp.status==200)
	{
		
		document.getElementById("chat").innerHTML = xmlhttp.responseText; 
		document.getElementById("chattext").value = " ";
		   

	}     
	   }




	xmlhttp.open("GET","getchat.jsp?q="+str,true);

	xmlhttp.send(null);

  
	
}


function getchatdata()
{
	

	  if (window.XMLHttpRequest)
		{// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp=new XMLHttpRequest();
		}
		else
		{// code for IE6, IE5
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange=function()
		{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			
			document.getElementById("chat").innerHTML = xmlhttp.responseText; 
			document.getElementById("chattext").value = " ";
			   

		}     
		   }




		xmlhttp.open("GET","getchatdata.jsp",true);

		xmlhttp.send(null);
	
	
	
}


</script>


<script type = "text/javascript" src = "chat.js">



</script>



</head>


<body >



<div id = "chat">

</div>

<div id = "chat1">

<input type = "text" name = "chattext" id = "chattext"/> 
 <input type = "button" value = "submit" onclick = "getchat()"/>
           
</div>

<script type = "text/javascript">

updatechat();

</script>





</body>
</html>