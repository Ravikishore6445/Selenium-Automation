<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
#main { 980px;
	
}

#header {
	margin-left: 100px;
	font: 13px/20px 'Lucida Grande', Tahoma, Verdana, sans-serif;
	font-weight: bold;
	font-size: large;
	color: #404040;
	border-style: solid;
	background: #0ca3d2;
}

#floatwrapper {
	height: 40px;
	width: 300px;
	float: left;
}

#content {
	margin-left: 100px;
	border-style: solid;
	background: #f3f3f3;
	border: 1px solid;
	border-color: #b4ccce #b3c0c8 #9eb9c2;
	border-radius: 16px;
}

#results {
	margin-left: 100px;
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

input[type=checkbox] {
	border: 1px solid #c0c0c0;
	margin: 0 0.1em 0 0;
	padding: 0;
	font-size: 16px;
	line-height: 1em;
	width: 1.25em;
	height: 1.25em;
	background: #fff;
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ededed),
		to(#fbfbfb));
	-webkit-appearance: none;
	-webkit-box-shadow: 1px 1px 1px #fff;
	-webkit-border-radius: 0.25em;
	vertical-align: text-top;
	display: inline-block;
}

input[type=checkbox]:checked::after {
	content: "âœ”";
	display: block;
	text-align: center;
	font-size: 16px;
	height: 16px;
	line-height: 18px;
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
			<div id="floatwrapper"></div>

			<b>Selenium Automation Executer</b>

		</div>

		<div id="content">
			<%
			
               		
				String tids = request.getParameter("run");
			String URL = request.getParameter("site");
			String tcaseselected ;
			
			out.println("Site is"+ " "+URL);
			
			System.out.println("Site is"+ " "+URL);


				Connection connection = null;
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/selautomation", "root",
						"vijay");
				System.out.println("Connection to DB successfull");

				Statement st = connection.createStatement();
				
				String query = "select testcase from tcase where ID in("+tids+") and URL ="+ "'"+URL+"'"; 
				
				//System.out.println("Till here in Executution.jsp its ok");
				System.out.println(query);

		          
				//out.println(query);
				//ResultSet rs = st.executeQuery("select testcase from tcase where ID in("+tids+")");
					ResultSet rs = st.executeQuery(query);
				out.println("<b>"+"Testcase for Execution are"+"</b>");
						
				  testexecute t1 = new testexecute();
		         // t1.setup(URL);
				
				while (rs.next()) {
						

					out.println(rs.getString("testcase")+",");
					tcaseselected = rs.getString("testcase");
					t1.runtcase(URL,tcaseselected);
					Thread.sleep(2000);
					

				}
				
				
				
		         // t1.register();
		          
		          
		          t1.teardown();
		                 
				
				
			%>




		</div>
          <%
           
           //String url = request.getParameter("site");
           
          //testexecute t1 = new testexecute();
          // t1.setup(url);
          //t1.register();
          //t1.teardown();
                 
           
           %>
                
           <div id = "results">
     
           <table>
           
           <tr>
           <td class = "tableheader">TESTCASE</td>
          <td class = "tableheader">RESULT</td>  
          <td class = "tableheader">CURRENTDATE</td>  
          </tr>
          
          <%
          
          DBconnection db = new DBconnection();
          
          db.connecttoDB();

Statement st1 = connection.createStatement();

String query1 = "select * from results where resultsdate = CURDATE()";
          
 //ResultSet rs1 = st1.executeQuery("select * from results");
 
 ResultSet rs1 = st1.executeQuery(query1);
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
           
           
           
           
           
           
           </table>
           
           
           
          <a href="results.jsp"> <b>IF U WANT TO VIEW THE RESULTS BY DATE CLICK HERE</b> </a> 
           
           
          <a href="Starter.jsp"> <b>Go To Home Page</b> </a> 
           
           
           
           </div>
           
           
          
           
           

	</div>


</body>
</html>