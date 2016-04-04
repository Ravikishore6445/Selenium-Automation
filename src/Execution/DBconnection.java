package Execution;
import java.sql.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DBconnection {
	
	
	Connection connection = null;
	
	Statement st = null;
	
	ResultSet rs = null;
		
		
	
	public void connecttoDB()
	{
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation", "root",
					"vijay");
	} catch (SQLException e) {
		
		System.out.println("Error in connecting to DATABASE.Please check");
		
	}
	//return connection;			
			
	}
	
	
	public Connection connecttoDB1()
	{
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selautomation", "root",
					"vijay");
	} catch (SQLException e) {
		
		System.out.println("Error in connecting to DATABASE.Please check");
		
	}
	//return connection;			
	return connection;
			
	}
	
		
	
	public void insert(String tcname1,String result1,String site,String url,String Env)
	{
		
		System.out.println("Environmane is"+ " "+Env);
		
		//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
	     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	       //get current date time with Date()
	       Date date = new Date();
	       
	       String currentdate = dateFormat.format(date);
	       
	       System.out.println("Current date is"+ " "+currentdate);
	       
	       Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	       //  System.out.println( sdf.format(cal.getTime()) );
	        
	        String currentTime = sdf.format(cal.getTime());
	      	
		
		
		connecttoDB();
		
	try {
		st = connection.createStatement();
				
		//String query1 = "Insert into results Values("+"'"+tcname1+"'"+" , "+"'"+result1+"'"+" )";
		
		
		//String query2 = "Insert into results Values("+"'"+tcname1+"'"+" , "+"'"+result1+"'"+" )";
		
		
		String query3 = "Insert into results Values("+"'"+tcname1+"'"+" , "+"'"+result1+"'"+" ,"+"'"+currentdate+"'"+")";
		
	//String query3 = "Insert into results Values("+"'"+tcname1+"'"+" , "+"'"+result1+"'"+" ,"+"'"+currentdate+"'"+" ","+"'"+site+",")";

		String query4 = "Insert into results Values("+"'"+tcname1+"'"+","+"'"+result1+"'"+","+"'"+currentdate+"'"+","+"'"+site+"'"+")";
			
		
		String query5 = "Insert into results Values("+"'"+tcname1+"'"+","+"'"+result1+"'"+","+"'"+currentdate+"'"+","+"'"+site+"'"+","+"'"+url+"'"+")";
		
		//Insert into results Values('Login','pass','2015/11/04','Bid','https://www.bidbingo.co.uk/content/bidbingo/en.html'null)
		
		String query6 = "Insert into results Values("+"'"+tcname1+"'"+","+"'"+result1+"'"+","+"'"+currentdate+"'"+","+"'"+site+"'"+","+"'"+url+"'"+","+null+")";
		
		
		String status = "Ongoing";
	String query7 = "Insert into results Values("+"'"+tcname1+"'"+","+"'"+result1+"'"+","+"'"+currentdate+"'"+","+"'"+site+"'"+","+"'"+url+"'"+","+null+","+"'"+status+"'"+")";


String query8 = "Insert into results Values("+"'"+tcname1+"'"+","+"'"+result1+"'"+","+"'"+currentdate+"'"+","+"'"+site+"'"+","+"'"+url+"'"+","+null+","+"'"+status+"'"+"," +"'"+Env+"'"+","+"'"+currentTime+"'"+ ")";
String Endquery = "Insert into Execution  (EndTIme)  VALUES (CURTIME())";


System.out.println(query8);

//Insert into results Values('EditAccount','pass','2015/11/17','spelHallen','http://www-sit.spelhallen.com/content/spelhallen/sv.html',null,'Ongoing,''SIT','23:11:13')



//System.out.println(Endquery);
		//System.out.println("Query is"+ " "+query5);
		
		//System.out.println("Query is"+ " "+query6);
System.out.println("Query is"+ " "+query8);

		int rs1= st.executeUpdate(Endquery);
		
		//int rs = st.executeUpdate(query5);
		
		//int rs = st.executeUpdate(query7);
		int rs = st.executeUpdate(query8);


		
		System.out.println("Query insertion done");
		
		//String query7 = Update table 
		
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("Query Insertion failed");
		
	}	
		
		
	}
	
}
