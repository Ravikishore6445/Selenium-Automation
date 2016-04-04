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



#content {

margin-left:100px;
border-style:solid; 
background: #f3f3f3;
}


</style>


<script type = "text/javascript">

function getdata(id)
{
	
	  if(document.getElementById(id).checked == true)
	    {
	    var chid =  document.getElementById(id).id;
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
	    if(document.getElementById(chkid).checked == false)
	    {

	         var txt1 = document.getElementById('run');
	       
	        str = txt1.value;
	        str = str.replace(chkid,'');
	      str = str.substring(0,str.length-1);
	      txt1.value = str;
	      alert(str);
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

<table>

<tr>

<td class = "tableheader">ID</td> 

<td class = "tableheader">TESTCASE</td>

<td class = "tableheader">SELECT</td>  

</tr>

<%
Connection connection = null;
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation","root", "vijay");
System.out.println("Connection to DD successfull");

Statement st = connection.createStatement();
ResultSet rs = st.executeQuery("select * from tcase");
while(rs.next())
{
	
int tid = rs.getInt("ID");
String testcase = rs.getString("testcase");
out.println("<tr>");
out.println("<td class = \"tableheader\">"+tid+"</td>");
out.println("<td class = \"tableheader\">"+testcase+"</td>");
out.println("<td class = \"tableheader\"> <input type = \"checkbox\" name = \"check\" id = "+tid+" onclick = \"getdata("+tid+")\" ");
out.println("<td/>");
out.println("<tr>");
}

%>
</table>
<form name = "getcases" method = "get" action = "Executer.jsp">
<input type = "text" name = "run" id = "run"></input> <br/><br/>
<input type = "submit" name = "submit" id = "submit" Value = "runselectedcases"></input>
</form>

</div>
<%
//out.println("<b>"+"Execution in Progress.Please wait for results"+"</b>");

%>

<div id = "footer">

<b>This is for CHAt Application</b>

</div>

 
</div>
</body>
</html>
