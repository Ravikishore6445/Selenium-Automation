<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ page import="java.sql.*"%>
	<%@ page import="Execution.testexecute"%>
	<%@ page import="Execution.test"%>
	<%@ page import="Execution.DBconnection"%>

<%

String id = request.getParameter("q");
out.println("ID is"+ " "+id);

DBconnection db = new DBconnection();
db.connecttoDB();
Connection connection = null;

Statement st1 = connection.createStatement();
//"select testcase from tcase where ID in("+tids+")";

//("select testcase from tcase where ID in"+tids+"");

String Query = "select * from results where resultsdate="+id;

out.println("Query is"+ " "+Query);


ResultSet rs1 = st1.executeQuery("select * from results where resultsdate="+id);
while(rs1.next())
{

String testcase = rs1.getString("tcname");
String result = rs1.getString("result");
String currdate = rs1.getString("resultsdate");
out.println("<tr>");
out.println("<td class = \"tableheader\">"+testcase+"</td>");
out.println("<td class = \"tableheader\">"+result+"</td>");
out.println("<td class = \"tableheader\">"+currdate+"</td>");
out.println("<tr>");
}




%>

</body>
</html>