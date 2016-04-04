
<html>
<head>

<meta charset="UTF-8">
<title>Example of Bootstrap 3 Page Header</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

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

#body{
	height:400px;
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


<%@ page import="java.sql.*"%>
	<%@ page import="Execution.testexecute"%>
	<%@ page import="Execution.test"%>
	<%@ page import="Execution.DBconnection"%>
		<%@ page import="org.apache.commons.lang3.RandomStringUtils;"%>
	

<div id="main">
	<div id="header">
		<div class="logo"><center>Execution Summary</center></div>
		
	</div>
	
	
	<%
	
	String tids = request.getParameter("run");
   String URL = request.getParameter("site");
     String tcaseselected ;

//out.println("Site is"+ " "+URL);

//System.out.println("Site is"+ " "+URL);


			int length = 3;
				
			boolean useNumbers = true;
            boolean useLetters = false;
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			   String ID = RandomStringUtils.random(length,useLetters,useNumbers);

		
			  
			  


	Connection connection = null;
	connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/selautomation", "root",
			"vijay");
	System.out.println("Connection to DB successfull");

	Statement st = connection.createStatement();
	
	
	Statement statement = connection.createStatement();
	
	  String querystmt =  "Insert into Execution (ExecutionID,StartTime,status) Values("+ID+",CURTIME(),'Ongoing')";
	  
	 // String querystmt1 = "Insert into Execution (StartTime) Values(CURTIME())";
	  

		System.out.println(querystmt);

	  
	  
	  statement.executeUpdate(querystmt);
	 // statement.executeUpdate(querystmt1);


	String query = "select testcase from tcase where ID in("+tids+") and URL ="+ "'"+URL+"'"; 
	
	//System.out.println("Till here in Executution.jsp its ok");
	System.out.println(query);

      
	//out.println(query);
	//ResultSet rs = st.executeQuery("select testcase from tcase where ID in("+tids+")");
		ResultSet rs = st.executeQuery(query);
	//out.println("<b>"+"Testcase for Execution are"+"</b>");
			
	  testexecute t1 = new testexecute();
     // t1.setup(URL);
	
	while (rs.next()) {
			

		tcaseselected = rs.getString("testcase");
		t1.runtcase(URL,tcaseselected);
		Thread.sleep(2000);
	      t1.teardown();

		

	}
	
	
	
     // t1.register();
      
      
             
	
	
	
	
	
	
	%>
	
	
	
	<table class = "table table-bordered">
           
           <tr>
           <td class = "tableheader"><b>TESTCASE</b></td>
          <td class = "tableheader"><b>RESULT</b></td>  
          <td class = "tableheader"><b>DATE</b></td>  
           <td class = "tableheader"><b>ENVIRONMENT</b></td>  
          <td class = "tableheader"><b>TIME OF EXECUTION</b></td>
          </tr>
          
          <%
          
          DBconnection db = new DBconnection();
          
          db.connecttoDB();

Statement st1 = connection.createStatement();

Statement st3 = connection.createStatement();


String query1 = "select * from results where resultsdate = CURDATE() and URL =" +"'"+URL+"'" ;

String query3 = "select * from results where resultsdate = CURDATE() and status = 'Ongoing' and URL =" +"'"+URL+"'" ;

          
 //ResultSet rs1 = st1.executeQuery("select * from results");
 
 
 
 String query2 = "select site from results where URL =" +"'"+URL+"'"; 
 
String site = null;
 
 //out.println(query2);
 
 ResultSet rs2 = st1.executeQuery(query2) ;
 
while(rs2.next())
{
 site  = rs2.getString("site");
		 
}	 
 
//out.println("<b>"+ "<font size =5>"+ "Test Execution Results for"+"</b>" +"</font>"+" "+site); 
		
out.println("<b>"+ "<font size =5>"+ "<center>"+"Test Execution Results for"+" "+  site+"</center>"+"</b>"+"</font>"+" "); 
		

 ResultSet rs1 = st1.executeQuery(query3);
		
 //ResultSet updaters = st1.executeQuery(query3);
 
 String testcase = null;
 String result = null;
 String currdate=null;
 String Environment = null;
 String currtime = null;

while(rs1.next())
{

 testcase = rs1.getString("tcname");
//String result = rs1.getString("result");
 result = rs1.getString("result");
//String currdate = rs1.getString("resultsdate");
currdate = rs1.getString("resultsdate");
Environment = rs1.getString("Env");
currtime = rs1.getString("currenttime");
out.println("<tr>");

out.println("<td>"+"<b>"+testcase+"</b>"+"</td>");
System.out.println(result);

System.out.println("result is"+ " "+result)
;if(result.equalsIgnoreCase("fail"))
{
	//System.out.println("Its not comimg here even the result is pass");
	
	out.println("<td style = \"background-color:red\">"+"<b>"+result+"</b>"+"</td>");



}
else
{

out.println("<td style = \"background-color:green\">"+"<b>"+result+"</b>"+"</td>");	
}	


out.println("<td>"+"<b>"+currdate+"</b>"+"</td>");
out.println("<td>"+"<b>"+Environment+"</b>"+"</td>");

out.println("<td>"+"<b>"+currtime+"</b>"+"</td>");


out.println("</tr>");

     // rs1.updateString(columnIndex, x)

}

String updatequery = "Update  results set status = 'completed' where tcname="+"'"+testcase+"'";

String updatequery1 = "Update  results set status = 'completed' where tcname="+"'"+testcase+"'"+"and URL="+"'"+URL+"'";

String updatequery2 = "Update  results set status = 'completed' where URL="+"'"+URL+"'";



System.out.println(updatequery2);

st1.executeUpdate(updatequery2);
//rs1.updateString("status", "completed");



          
          
	
	%>
	</table>
	
	
	<div id="footer">
	
	    <a href="results1.jsp"> <b> <font size = 5>Click here to view results by Date</font></b> </a> &nbsp &nbsp &nbsp &nbsp &nbsp 
           
           
          <a href="HomeIGT.jsp"> <b><font size = 5> Home</b></font> </a> 
	
	
		<p>&copy; Copyright 2015. <a href="mailto:ravikishore.anantatmula@gtech.com,yesuratnam.nallagatla@gtech.com,?Subject=Test Results&Body=Body"><b>Send Mail</b></a> </p>
	</div>
	

	</div>



</body>



</html>