

<%@ page import="Execution.DBconnection"%>


<%@ page import="java.sql.*"%>

<%

String sitename = request.getParameter("q");

DBconnection db = new DBconnection();

Connection con = db.connecttoDB1();

Statement st = con.createStatement();


String query1 = "select * from sites where sitename ="+"'"+sitename+"'" ;

System.out.println("Query is"+" "+query1);

ResultSet rs1 = st.executeQuery(query1);

while(rs1.next())
{
	
	String URL = rs1.getString("URL");
	
    out.println(URL);
    
    System.out.println("URL is"+" "+URL);

	
}

%>

