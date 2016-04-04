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


<style type = "text/css">

.tableheader {
    color: #0066CC;
    border-color: background;
    border-style: solid;
    background-color: #EFF4FB;
    font-size: 20px;
}


</style>


</head>
<body>


<%@ page import="java.sql.*"%>
	<%@ page import="Execution.testexecute"%>
	<%@ page import="Execution.test"%>
	<%@ page import="Execution.DBconnection"%>
	<%@ page import="java.util.Date"%>
	<%@ page import="java.text.DateFormat"%>
	<%@ page import="java.text.SimpleDateFormat"%>
		


<%

String id = request.getParameter("q");

String sitsite = request.getParameter("SIT");
String livesite = request.getParameter("SIT");
String OLGsite = request.getParameter("OLG");
id = id.replace('/', '-');
System.out.println("date is " + " "+id);

String temp[];
temp = id.split(",");


System.out.println("Site value is");

System.out.println(temp[1]);
	
String sitename = temp[1];

DateFormat parser = new SimpleDateFormat("MM-dd-yyyy"); 
Date date = (Date) parser.parse(id);

DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
//System.out.println(formatter.format(date));

String d =	formatter.format(date);

System.out.println("Date is"+ " "+d);


String Query1 = "select * from results where resultsdate="+"'"+d+"'";


String Query2 = "select * from results where resultsdate="+"'"+d+"'"+"and site="+"'"+sitename+"'";

//out.println("Query is"+ " "+Query2);
System.out.println(Query2);

DBconnection db = new DBconnection();
Connection con = db.connecttoDB1();


Statement st1 = con.createStatement();
ResultSet rs1 = st1.executeQuery(Query2);

//out.println("<table class = \"table\">");

out.println("<table class = \"table table-bordered\">");


out.println("<tr>");

out.println("<td><b>TestCase</b></td>"); 



out.println("<td><b>Result</b></td>"); 


out.println("<td><b>Date</b></td>"); 


out.println("<td><b>Site</b></td>"); 
out.println("<td><b>Environment</b></td>"); 



//out.println("<td><b>Snapshot</b></td>"); 


out.println("</tr>");

while(rs1.next())
{

String testcase = rs1.getString("tcname");
String result = rs1.getString("result");
String currdate = rs1.getString("resultsdate");
String site = rs1.getString("site");
String Environment = rs1.getString("Env");

out.println("<tr>");
out.println("<td>"+"<b>"+testcase+"</b>"+"</td>");
//out.println("<td>"+"<b>"+result+"</b>"+"</td>");

if(result.equalsIgnoreCase("fail"))
{
	//System.out.println("Its not comimg here even the result is pass");
	
	out.println("<td style = \"background-color:red\">"+"<b>"+result+"</b>"+"</td>");



}
else
{

out.println("<td style = \"background-color:green\">"+"<b>"+result+"</b>"+"</td>");	
}	




out.println("<td>"+"<b>"+currdate+"</b>"+"</td>");

out.println("<td>"+"<b>"+site+"</b>"+"</td>");

out.println("<td>"+"<b>"+Environment+"</b>"+"</td>");


//out.println("<td> <input type = \"button\" name = \"snap\" id = "+currdate+","+testcase+" value = \"ViewSnapshot\"onclick = \"opensnap(this.id)\" ");
out.println("</tr>");
}

out.println("</table>");


%>

</body>
</html>