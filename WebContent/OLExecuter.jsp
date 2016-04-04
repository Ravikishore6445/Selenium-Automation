<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="UTF-8">
<title>Example of Bootstrap 3 Page Header</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

body {
	background: #666666;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 11px;
	color: #333333;
}

a img {
	border: none;
}

.clear {
	clear: both;
}

#main {
	width: 980px;
	background: #FFFFFF;
	margin: auto;
}

#header {
	background: #000000;
}

#header .logo {
	color: #CCCC00;
	font-size: 28px;
	padding: 20px;
	font-weight: bold;
}

#menu {
	padding: 10px;
	background: url(images/bg1.png);
}

#menu ul {
	list-style: none;
}

#menu ul li {
	display: inline;
}

#menu ul li a {
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	background: url(images/bg1.png);
	padding: 10px;
	text-decoration: none;
}

#menu ul li a:hover,#menu ul li a.selected {
	background: url(images/bg2.png);
	color: #FFF;
}

#body {
	height: 700px;
}

#vmenu {
	width: 140px;
	margin: 10px;
	background: #CC9900;
}

#vmenu ul {
	list-style: none;
}

#vmenu ul li {
	
}

#vmenu ul li a {
	display: block;
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	background: #CC9900;
	padding: 5px 8px;
	text-decoration: none;
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
}

#vmenu ul li a:hover,#vmenu ul li a.selected {
	background: #FFFFFF;
	color: #CC9900;
}

#footer {
	padding: 10px;
	background: #333333;
	color: #FFFFFF;
}

#footer p {
	text-align: right;
}

#footer p a {
	font-weight: bold;
	text-decoration: none;
}

#footerlinks a {
	text-align: center;

	font-size: 18px;
	font-weight: bold;
	color: #C00000 ;
}
</style>



</head>
<body>

	<%@ page import="java.sql.*"%>
	<%@ page import="Execution.testexecute"%>
	<%@ page import="Execution.test"%>
	<%@ page import="Execution.DBconnection"%>

	<div id="main">

		<div id="header">
			<div class="logo">
				<center>Execution Summary</center>
			</div>

		</div>




		<div id="body">
			<%
				String tids = request.getParameter("run");
				String URL = "https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html";
				String tcaseselected;

				Connection connection = null;
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/selautomation", "root",
						"vijay");
				System.out.println("Connection to DB successfull");

				Statement st = connection.createStatement();

				String query = "select TESTCASE from OLGTC where ID in(" + tids
						+ ")";

				//System.out.println("Till here in Executution.jsp its ok");
				//System.out.println(query);

				//out.println(query);
				//ResultSet rs = st.executeQuery("select testcase from tcase where ID in("+tids+")");
				ResultSet rs = st.executeQuery(query);
				//out.println("<b>"+"Testcase for Execution are"+"</b>");

				testexecute t1 = new testexecute();
				//t1.setup("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html");

				while (rs.next()) {

					//out.println(rs.getString("testcase")+",");
					tcaseselected = rs.getString("testcase");
					t1.runtcase(URL, tcaseselected);
					Thread.sleep(2000);
					t1.teardown();

				}

				// t1.register();

				// t1.teardown();
			%>




			<%
				//String url = request.getParameter("site");

				//testexecute t1 = new testexecute();
				// t1.setup(url);
				//t1.register();
				//t1.teardown();
			%>


			<table class="table table-bordered">

				<tr>
					<td><b><font size=3>TESTCASE</font></b></td>
					<td><b><font size=3>RESULT</font></b></td>
					<td><b><font size=3>DATE</font></b></td>
					<td><b><font size=3>PROJECT</font></b></td>
					<td><b><font size=3>TIME OF EXECUTION</font></b></td>
					
				</tr>

				<%
					DBconnection db = new DBconnection();

					db.connecttoDB();

					Statement st1 = connection.createStatement();

					//String query1 = "select * from results where resultsdate = CURDATE()";

			//String query1 = "select * from results where resultsdate = CURDATE() and URL ="
							//+ "'" + URL + "'";
					
					String query1 = "select * from results where resultsdate = CURDATE() and status = 'Ongoing' and URL =" +"'"+URL+"'" ;


					String site = null;

					//out.println(query2);

					String query2 = "select site from results where URL =" + "'" + URL
							+ "'";

					ResultSet rs2 = st1.executeQuery(query2);

					while (rs2.next()) {
						site = rs2.getString("site");

					}

					//out.println("<b>"+ "<font size =5>"+ "Test Execution Results for"+"</b>" +"</font>"+" "+site); 

					out.println("<b>" + "<center>" + "<font size =5>"
							+ "Test Execution Results for" + " " + site + "</b>"
							+ "<center>" + "</font>" + " ");

					ResultSet rs1 = st1.executeQuery(query1);
									
							String testcase = null;
							String result = null;
							String currdate = null;		
							String project = null;
							String currtime = null;
					while (rs1.next()) {

						 testcase = rs1.getString("tcname");
						 result = rs1.getString("result");
						 currdate = rs1.getString("resultsdate");
						 project = rs1.getString("Env");
						 currtime = rs1.getString("currenttime");

						out.println("<tr>");
						//out.println("<td class = \"tableheader\">"+testcase+"</td>");
						//out.println("<td class = \"tableheader\">"+result+"</td>"); 
						//out.println("<td class = \"tableheader\">"+currdate+"</td>");

						out.println("<td>" + "<b>" + testcase + "</b>" + "</td>");
						
						if(result.equalsIgnoreCase("fail"))
						{
							//System.out.println("Its not comimg here even the result is pass");
							
							out.println("<td style = \"background-color:red\">"+"<b>"+result+"</b>"+"</td>");



						}
						else
						{

						out.println("<td style = \"background-color:green\">"+"<b>"+result+"</b>"+"</td>");	
						}	

						
						
						//out.println("<td>" + "<b>" + result + "</b>" + "</td>");
						out.println("<td>" + "<b>" + currdate + "</b>" + "</td>");
						out.println("<td>" + "<b>" + project + "</b>" + "</td>");
						out.println("<td>" + "<b>" + currtime + "</b>" + "</td>");



						out.println("<tr>");
					}
					
					String updatequery = "Update  results set status = 'completed' where URL="+"'"+URL+"'";

					System.out.println(updatequery);

					st1.executeUpdate(updatequery);
					
				%>






			</table>






		</div>


		<div id="footerlinks">

 
			<a href="results1.jsp"> <b> View Results by date</b>
			</a> &nbsp &nbsp&nbsp&nbsp&nbsp <a href="HomeIGT.jsp"> <b>Home</b>
			</a>

		</div>



		<div id="footer">




			<p>
				&copy; Copyright 2015. <a
					href="mailto:ravikishore.anantatmula@gtech.com,yesuratnam.nallagatla@gtech.com,?Subject=Test Results&Body=Body"><b>Send
						Mail</b></a>
			</p>
		</div>


	</div>





</body>
</html>