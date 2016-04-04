
function updatechat()
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
		
		//document.write("Value is" + " "+xmlhttp.responseText);
		document.getElementById("chat").innerHTML = xmlhttp.responseText; 
		
		//document.getElementById("chat").innerHTML = "what is this";
		
		   

	}     
	   };

	xmlhttp.open("GET","updatechat.jsp",true);

	xmlhttp.send(null);
	

	
  
	
}


setInterval(updatechat(),2000);


