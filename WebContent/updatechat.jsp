
<%@ page import="Execution.DBconnection"%>

<%@ page import="java.sql.*"%>
<%


Connection con = null;
DBconnection db = new DBconnection();
con = db.connecttoDB1();

Statement st = con.createStatement();

String query1 = "select * from chat where sender = 'sent' and receiver = 'notreceived'";

ResultSet rs = st.executeQuery(query1);


while(rs.next())
{

String chatmessage = rs.getString("message");
	
    out.println("User:" + " "+chatmessage)  ;
    out.println( "<br/>");
	
	
}

String query2 = "Update chat set receiver = 'received' where sender = 'sent'";
st.executeUpdate(query2);






%>


