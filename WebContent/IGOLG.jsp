
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


<script type = "text/javascript">


function getdata(id)
{
	
	

	//alert("Comimg here or not");
	
	var chid;
	  if(document.getElementById(id).checked == true)
	    {
		  
		 // alert("Checked is true");
;	     chid =  document.getElementById(id).id;
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
	     if(document.getElementById(id).checked == false)
	    {

			 // alert("UnChecked is true");
			 
			 chid =  document.getElementById(id).id;

	         var txt1 = document.getElementById('run');
	      
	        str = txt1.value;
	        
	       // alert("text is"+str)
	        //  alert("Chk id is " + chid);

	        
	        str = str.replace(chid,'');
	            
	       
	        
	       // alert(str);
	        
	      var mylength = str.length;
	      
	      //alert("Length is " + " "+mylength);
	      
    	  str = str.replace(',','');

	      txt1.value = str;

	      
	      /*var lastchar = mylength.charAt(mylength-1);
	      
	     
	      
	      if(lastchar==',')  
	    	  {
	    	  
	    	  
	    	  
	    	  str = str.replace(',','');
	    	  }
	      
	      else
	    	  {
	        str = str.replace(',,',','); 
	        
		     // alert("str is"+str1);
		      //txt1.value = str1;
	    	  }
	     // str = str.substring(0,str.length-2);
	      txt1.value = str;
	      //alert("str is"+str);*/
}
}
	    
	    
	    
	    
	  
	    


</script>

</head>

<body>
<div id="main">
	<div id="header">
		<div class="logo"><center>OLG Test Cases</center></div>
		 
	</div>
	
	<div id="body">
	
	
<table class = "table table-bordered">

<tr>

<td><b>ID</b></td> 

<td><b>TESTCASE</b></td>

<td><b>SELECT</b></td>  

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
out.println("<td>"+"<b>"+tid+"</b>"+"</td>");
out.println("<td>"+"<b>"+testcase+"</b>"+"</td>");
out.println("<td class = \"tableheader\"> <input type = \"checkbox\" name = \"check\" id = "+tid+" onclick = \"getdata("+tid+")\" ");
out.println("<td/>");
out.println("<tr>");
}

%>


</table>


<form name = "getcases" method = "get" action = "OLExecuter.jsp">

&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type = "text" name = "run" id = "run"></input> <br/><br/>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-primary"><b>runselectedcases</b></button>

</form>

</body>
	
	
	
	</div>
	
	<div id="footer">
		<p>&copy; Copyright 2015. <a href="mailto:ravikishore.anantatmula@gtech.com,yesuratnam.nallagatla@gtech.com,?Subject=Test Results&Body=Body"><b>Send Mail</b></a> </p>
	</div>
	
</div>
</body>

</html>