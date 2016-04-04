<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type = "text/css">

#main {
    width: 980px;
    background: #FFFFFF;
    margin: auto;
}

#header {
    background: #000000;
}

#logo {
    font-weight: bold;
    font-size: 28px;
    color: #CCCC00;
   text-align:center;

}

#floatwrapper
{
    
    height:100px;
    
}

#content {
    height: 200px;
    width:auto;
    border: 1px solid #5970B2
}

#dropdown
{
height: 100px;
width:100px;
border: 1px solid #5970B2;
display:none;
    
}

</style>



<script type  = "text/javascript">



function person(tid)
{
	//alert(tid);	

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

document.getElementById("content").innerHTML = xmlhttp.responseText;     

}     
   }




xmlhttp.open("GET","Edu.jsp?q="+tid,true);

xmlhttp.send(null);


	
}





</script>

</head>

<body>

<div id = "main">
<div id = "header">
<div id = "logo">
<b>AJAX DEMO</b>

</div>
</div>

<div id = "floatwrapper">

</div>

<input type = "radio" name = "r1" id = "person" onclick = "person(this.id);"></input> <b>Get personal details </b>
<input type = "radio" name = "r1" id = "education" onclick = "javascript:person(id)"></input> <b>Get Education details </b>
<input type = "radio" name = "r1" id = "Exp" onclick = "javascript:person(id)"></input> <b>Get  Work Expeirence details </b> 


 


</div>

<div id = "content">






</div>







</body>
</html>