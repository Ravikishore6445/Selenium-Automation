<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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

margin-left : 900px;
border-style: solid;
	background: #f3f3f3;
	border: 1px solid;
	border-color: #b4ccce #b3c0c8 #9eb9c2;
	


</style>


<script type = "text/javascript">

function setdata()
{
	
alert("Wait")	;
	
}



</script>

</head>
<body>


<form name = "getcases" method = "get" action = "Executer.jsp">

<b>URL for Selected Site is</b> <input type = "text" name = "site" id = "site" ></input> <br/><br/>

<input type = "text" name = "run" id = "run"></input> <br/><br/>
<input type = "submit" name = "submit" id = "submit" Value = "runselectedcases"></input>

</form>



<div id = "chat1">

<input type = "text" id = "chattext" >

<input type = "button" value = "submit" onclick = "setdata()">

</div>



</body>
</html>