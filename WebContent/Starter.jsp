<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type = "text/css">
#main
{
980px;
}

#header
{

margin-left:100px;
font: 13px/20px 'Lucida Grande', Tahoma, Verdana, sans-serif;
font-weight: bold;
font-size: large;
color: #404040;
border-style:solid; 
background: #0ca3d2;
}

#floatwrapper
{
height:40px;
width:300px;       
float:left;
}

#content {

margin-left:100px;
border-style:solid; 
background: #f3f3f3;
}


#Tccontent {

margin-left:100px;
border-style:solid; 
background: #f3f3f3;
}






.tableheader {
    color: #0066CC;
    border-color: background;
    border-style: solid;
    background-color: #EFF4FB;
    font-size: 20px;
}


input[type=submit] {
  padding: 0 18px;
  height: 29px;
  font-size: 12px;
  font-weight: bold;
  color: #527881;
  text-shadow: 0 1px #e3f1f1;
  background: #cde5ef;
  border: 1px solid;
  border-color: #b4ccce #b3c0c8 #9eb9c2;
  border-radius: 16px;
  outline: 0;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  background-image: -webkit-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -moz-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -o-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: linear-gradient(to bottom, #edf5f8, #cde5ef);
  -webkit-box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
  box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
}


input[type=checkbox]
{

border: 1px solid #c0c0c0;
margin: 0 0.1em 0 0;
padding: 0;
font-size: 16px;
line-height: 1em;
width: 1.25em;
height: 1.25em;
background: #fff;
background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ededed), to(#fbfbfb));
 
-webkit-appearance: none;
-webkit-box-shadow: 1px 1px 1px #fff;
-webkit-border-radius: 0.25em;
vertical-align: text-top;
display: inline-block;
 
}
 
 
input[type=checkbox]:checked::after {
content:"âœ”";
display:block;
text-align: center;
font-size: 16px;
height: 16px;
line-height: 18px;
}


</style>


<script type = "text/javascript">


function bingo(id)
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

	document.getElementById("Tccontent").innerHTML = xmlhttp.responseText;     

	}     
	   }




	xmlhttp.open("GET","Loadbingo.jsp?q="+id,true);

	xmlhttp.send(null);

	
	
}

function loadurl(id)
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
		
		//alert(xmlhttp.responseText);
		
		var txt1 = document.getElementById("site");

	txt1.value = xmlhttp.responseText;     

	}     
	   }




	xmlhttp.open("GET","Geturl.jsp?q="+id,true);

	xmlhttp.send(null);

	
		
	
}

function submitforms()
{
	
	alert("Wait wrting code for submitting two forms");
	
	
}


function setchat()
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




	xmlhttp.open("GET","setchat.jsp?q="+str,true);

	xmlhttp.send(null);
	


  
	
}




function getdata(id)
{
	
	
	alert("Comimg here or not");
	  if(document.getElementById(id).checked == true)
	    {
		  
		  alert("Checked is true");
;	    var chid =  document.getElementById(id).id;
	    var txt = document.getElementById("run");
	    if(txt.value== "")
	    {
	    txt.value = chid;
	    }
	    else
	    {
	   txt.value = txt.value + ','+ chid;
	    }

	    }
	     if(document.getElementById(id).checked == false)
	    {

			  alert("UnChecked is true");

	         var txt1 = document.getElementById('run');
	      
	        str = txt1.value;
	        
	        alert("text is"+str)
	        str = str.replace(chid,'');
	      str = str.substring(0,str.length-2);
	      txt1.value = str;
	      alert("str is"+str);
}
	    
	    
	    
	    
	  
	    

}
</script>


</head>
<body>
<%@ page import="java.sql.*"%>


<div id = "main">

<div id = "header">

<div id = "floatwrapper"></div>
<b>SELENIUM AUTOMATION EXECUTER</b> 
</div>

<div id = "content">

<b>Select Site to Execute Tests</b> <br/> <br/>


<p>
<b> SEK Sites</b>
</p>
<input type = "radio" name = "bingo" id = "CaliberBingo" onclick = "bingo(this.id)" /> <b>CaliberBingo</b><br/>
<input type = "radio" name = "bingo" id = "BalletBingo" onclick = "bingo(this.id)"/> <b>BalletBingo</b><br/>
<input type = "radio" name = "bingo" id = "HappyBingo"  onclick = "bingo(this.id)"/> <b>HappyBingo</b><br/>
<input type = "radio" name = "bingo" id = "LychoCasinoSEK" onclick = "bingo(this.id)"/> <b>Lycho</b><br/>
<input type = "radio" name = "bingo" id = "SpelHallen"  onclick = "bingo(this.id)"/> <b>SpelHallen</b><br/>
<input type = "radio" name = "bingo" id = "RoyalGamesSEK" onclick = "bingo(this.id)"/> <b>RoyalGamesSEK</b><br/>

<p>
<b> GBP Sites</b>
</p>

<input type = "radio" name = "bingo" id = "BidBingo"  onclick = "bingo(this.id)" /> <b>BidBingo</b><br/>
<input type = "radio" name = "bingo" id = "ButlinsBingo"onclick = "bingo(this.id)"/> <b>ButlinsBingo</b><br/>
<input type = "radio" name = "bingo" id = "CarlonBingo" onclick = "bingo(this.id)" /> <b>CarlonBingo</b><br/>
<input type = "radio" name = "bingo" id = "CastleBingo"  onclick = "bingo(this.id)"/> <b>CastleBingo</b><br/>
<input type = "radio" name = "bingo" id = "ChitchatBingo"  onclick = "bingo(this.id)"/> <b>ChitChatBingo</b><br/>
<input type = "radio" name = "bingo" id = "Club3000" onclick = "bingo(this.id)" /> <b>Club3000</b><br/>
<input type = "radio" name = "bingo" id = "DailyExpressBingo" onclick = "bingo(this.id)"/> <b>DailyExpress</b><br/>
<input type = "radio" name = "bingo" id = "DailyStar" onclick = "bingo(this.id)" /> <b>DailyStar</b><br/>
<input type = "radio" name = "bingo" id = "RoyalGames" onclick = "bingo(this.id)"/> <b>RoyalGames</b><br/>
<input type = "radio" name = "bingo" id = "OkBingo" onclick = "bingo(this.id)"/> <b>OkBingo</b><br/>
<input type = "radio" name = "bingo" id = "SlotNGames" onclick = "bingo(this.id)"/> <b>SlotNGames</b><br/>
<input type = "radio" name = "bingo" id = "VipCasino" onclick = "bingo(this.id)"/> <b>VipCasino</b><br/>



</div>


<div id = "Tccontent">

<b></b>


</div>



 
</div>


</body>
</html>
