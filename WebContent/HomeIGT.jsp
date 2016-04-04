<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="UTF-8">
<title>Example of Bootstrap 3 Page Header</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style type = "text/css">
/* CSS Document */

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


.tableheader {

    color: #0066CC;
    border-color: background;
    border-style: solid;
    background-color: #EFF4FB;
    font-size: 20px;
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
<body>
<div id="main">
	<div id="header">
		<div class="logo"><center>IGT Automation Executer</center></div>
		
	</div>
	
	<div id="body">
	
	<form action = "portal.jsp">
    
    <table class="table">
        <thead>
            <tr>
                <th><b><font size = 3>Project</font></b></th>
                <th><b><font size = 3>Environment</font></b></th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td ><label class="radio-inline"><input type="radio" value = "IBN" name="IGT"><font size = 3><b>IBN</b></font></label></td>
                <td >
                
               <select  name="sel1" class="input-small">
               <option>SIT</option>
                <option>LIVE</option>
                   
                </select>
                          
                
                
                
           
                
                
                
                
                 </td>
                
            </tr>
            <tr>
                <td ><label class="radio-inline"><input type="radio" value = "OLG" name="IGT"><font size = 3><b>OLG</b></font-size></td>
                <td >
                
               <select  name="sel2" class= "input-small">
               <option>cd52</option>
                <option>cd32</option>
                   
                </select>
                          
                
                
                </td>
                
            </tr>
            <tr>
            <td> </td>
            
            <td><button type="submit" class="btn btn-primary">Submit</button></td>
    
    </tr>
    </tbody>
    </table>
    
    
    </form>
    
	
	
	</div>
	
	<div id="footer">
	
			
		<p>&copy; Copyright 2015. <a href="ravikishore.anantatmula@IGT.com">Feedback Contact Ravi</a> </p>
	</div>
	
</div>
</body>
</html>

