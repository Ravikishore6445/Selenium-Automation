
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type = "text/javascript">


function getdata(id)
{
	
	
	alert(id);
	
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



.tableheader {
    color: #0066CC;
    border-color: background;
    border-style: solid;
    background-color: #EFF4FB;
    font-size: 20px;
}


#chat1 {

margin-left: 900px;
	
	
}


</style>

</head>


<body>

<table>

<tr>

<td class = "tableheader">ID</td> 

<td class = "tableheader">TESTCASE</td>

<td class = "tableheader">SELECT</td>  

</tr>

<%@ page import="java.sql.*"%>

<%@ page import="Execution.testexecute"%>

<%

Connection connection = null;

connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation", "root","vijay");

//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation","root", "vijay");
System.out.println("Connection to DB successfull");

Statement st = connection.createStatement();

ResultSet rs = st.executeQuery("select * from OLGTC");
while(rs.next()) 
{
	
int tid = rs.getInt("ID");
String testcase = rs.getString("TESTCASE");
out.println("<tr>");
out.println("<td class = \"tableheader\">"+tid+"</td>");
out.println("<td class = \"tableheader\">"+testcase+"</td>");
out.println("<td class = \"tableheader\"> <input type = \"checkbox\" name = \"check\" id = "+tid+" onclick = \"getdata("+tid+")\" ");
out.println("<td/>");
out.println("<tr>");
}

%>


</table>


<form name = "getcases" method = "get" action = "OLExecuter.jsp">

<input type = "text" name = "run" id = "run"></input> <br/><br/>
<input type = "submit" name = "submit" id = "submit" Value = "runselectedcases"></input>

</form>

</body>
</html>