<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Execution.DBconnection"%>

<%@ page import="java.sql.*"%>


<%


Connection con = null;
String msg = request.getParameter("q");
DBconnection db = new DBconnection();
con = db.connecttoDB1();

Statement st = con.createStatement();

//String query1 = "select * from sites where sitename ="+"'"+sitename+"'" ;


String query1 = "";

String query2 = "";

ResultSet rs = st.executeQuery(query1);

while(rs.next())
{

String chatmessage = rs.getString("message");
	
    out.println("Ravi:" + " "+chatmessage)  ;
    out.println( "<br/>");
	
	
}




%>

</body>
</html>