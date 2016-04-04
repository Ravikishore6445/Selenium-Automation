<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="UTF-8">
<title>Example of Bootstrap 3 Page Header</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<script type = "text/javascript">




</script>

<style type = "text/css">

*{
	margin:0px;
	padding:0px;
}

body{
	background:#666666;
	font-family:Arial, Helvetica, sans-serif;
	font-size:11px;
	color:#333333;
}

a img{
	border:none;
}

.clear{
	clear:both;
}


#main{
	width:980px;
	background:#FFFFFF;
	margin:auto;
}

#header{
	background:#000000;
}

#header .logo{
	color:#CCCC00;
	font-size:28px;
	padding:20px;
	font-weight:bold;
}

#menu{
	padding:10px;
	background:url(images/bg1.png);
}

#menu ul{
	list-style:none;
}

#menu ul li{
	display:inline;
}

#menu ul li a{
	color:#FFFFFF;
	font-size:12px;
	font-weight:bold;
	background:url(images/bg1.png);
	padding:10px;
	text-decoration:none;

}

#menu ul li a:hover, #menu ul li a.selected{
	background:url(images/bg2.png);
	color:#FFF;
}




#vmenu{
	width:140px;
	margin:10px;
	background:#CC9900;
}

#vmenu ul{
	list-style:none;
}

#vmenu ul li{

}

#vmenu ul li a{
	display:block;
	color:#FFFFFF;
	font-size:12px;
	font-weight:bold;
	background:#CC9900;
	padding:5px 8px;
	text-decoration:none;
	-moz-border-radius: 10px;
     -webkit-border-radius: 10px;

}

#vmenu ul li a:hover, #vmenu ul li a.selected{
	background:#FFFFFF;
	color:#CC9900;
}

#footer{
	padding:10px;
	background:#333333;
	color:#FFFFFF;
}

#footer p{
	text-align:right;
}

#footer p a{
	color:#CCCC00;
	font-weight:bold;
	text-decoration:none;
}

</style>




</head>


<body>

<table class = "table table-bordered">

<tr>

 

<td><b> <font size =2>ID</font></b></td> 

<td><b> <font size =2>TESTCASE</font></b></td> 
<td><b> <font size =2>SELECT</font></b></td> 





</tr>

<%@ page import="java.sql.*"%>

<%@ page import="Execution.testexecute"%>



<%


String site = request.getParameter("q");

out.println("<br/><br/>");

out.println("<b>"+ "<font size = 2>" +"Site Selected is"+" "+ "</font>"+"</b>");

out.println("<input type = \"text\" name = \"gamesite\" id = \"gamesite\" value = "+site+">");

out.println("<br/><br/>");

//out.println("<b> Load URl for"+ " "+site);
		
		
out.println("<b>"+ "<font size = 2>"  + "Load URl for"+"</b>"+ " "+site+"</font>");


out.println("<input type = \"radio\" name = \"loadurl\" id = "+site+" onclick = \"loadurl(this.id)\">");
		




out.println("<br/><br/>");



//out.println("<b>"+ "Please Select Test cases for "+ " "+site+" "+"to Execute"+ "</b>");
		
out.println("<b>"+ "<font size = 2>" +"Please Select Test cases for "+ " "+site+" "+"to Execute"+ "<font size = 2>"+"</b>");

		
out.println("<br/><br/>");




Connection connection = null;
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation","root", "vijay");
System.out.println("Connection to DD successfull");

Statement st = connection.createStatement();
String query = "select * from tcase where site ="+"'"+site+"'";

System.out.println("Query is"+ " "+query);

ResultSet rs = st.executeQuery("select * from tcase where site ="+"'"+site+"'");
while(rs.next())
{
	
int tid = rs.getInt("ID");
String testcase = rs.getString("testcase");
out.println("<tr>");
//out.println("<td class = \"tableheader\">"+tid+"</td>");
out.println("<td>"+ "<b>"+ "<font size =2>" +tid+ "</b>" +"</font>"+"</td>");
out.println("<td>"+ "<b>"+ "<font size =2>" +testcase+ "</b>" +"</font>"+"</td>");


//out.println("<td class = \"tableheader\">"+testcase+"</td>");
//out.println("<td>"+"<font size =3>"+testcase+"</font>"+"</td>");


out.println("<td class = \"tableheader\"> <input type = \"checkbox\" name = \"check\" id = "+tid+" onclick = \"getdata("+tid+")\" ");
out.println("<td/>");
out.println("<tr>");
}

%>


</table>



<form name = "getcases" method = "get" action = "IGTExecuter.jsp">

<b><font size =2>URL for Selected Site is</font></b> <input type = "text" name = "site" id = "site" ></input> <br/><br/>

<input type = "text" name = "run" id = "run"></input> <br/><br/>

  <button type="submit" class="btn btn-primary">Run</button>


</form>





</body>
</html>