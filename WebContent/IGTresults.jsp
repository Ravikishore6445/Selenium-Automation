<html>
<head>


<meta charset="UTF-8">
<title>Example of Bootstrap 3 Page Header</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  
<script>
 $(function() {
    $( "#datepicker" ).datepicker();
  });
 
 </script>

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



#content{
	height:100px;
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

#nav {

width: 550px; 
	
	float: left;
	padding: 5px;
}

#section {
	width: 550px;
	float: left;
	padding: 10px;
}

</style>
<script type = "text/javascript">


function selectdate(did)
{
	  
	 
	  
	  if (window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	  }
	  else
	  {// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  }

	  xmlhttp.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
	  {

	  document.getElementById("body1").innerHTML = xmlhttp.responseText;     

	  }     
	     }




	  xmlhttp.open("GET","Myresults.jsp?q="+did,true);

	  xmlhttp.send();

	  
	  
	  
}


function getdata(id)
{
	  
	  
	  
	  if (window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	  }
	  else
	  {// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  }

	  xmlhttp.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
	  {

	  document.getElementById("content1").innerHTML = xmlhttp.responseText;     

	  }     
	     }




	  xmlhttp.open("GET","snapshot.jsp?q="+id,true);

	  xmlhttp.send();

	  
	  
}

function opensnap(id)
{
	  
	 
	  //alert("wait");
	  //window.open("C:\Users\ranantatmula\Desktop\08-01-2014\register.png",'mywindow','width=400,height=200');

	  // window.open('C:\Users\ranantatmula\Desktop\08-04-2014\register.png');
	  // window.open('C:/Users/ranantatmula/Desktop/08-04-2014/register.png');
	   
	   //window.open('images/ajax_loader_blue_256.gif','mywindow','width=400,height=200');
	    
	  window.open("file:///C:/Users/ranantatmula/Desktop/08-04-2014/register.png",'mywindow','width=400,height=200');
	  
	 //window.open('http://www.pageresource.com/jscript/jex5.htm','mywindow','width=400,height=200');
	  
	  /*var res = id.split(",");
	  
	   	  
	  url = "C:\Users\ranantatmula\Desktop";

	  Acturl = url+res[0]+res[1]+".png";
	  
	  alert(Acturl);
	  window.open(Acturl,'height=200,width=150');*/
	  
	//  window.open("file:///C:/Users/ranantatmula/Desktop/08-01-2014/register.png");
	  
	
}




</script>



</head>

<body>




<body>
<div id="main">
	<div id="header">
		<div class="logo"><b><center>Automation Results</center></b></div>
		
	</div>
	
	<div id="content">
	
	<div id = "nav">
	
	<p><b><h1>Date:</h1></b>  <input type="text" id="datepicker" ></p>
	

	
<button type="button" onclick = "selectdate(datepicker.value)">GetResults</button>




</div>

<div id = "section">

<b>This is for dropdown</b>

</div>
	
	</div>
	
	<div id = "body1">
	
	</div>
	
	<div id="footer">
		<p>&copy; Copyright 2015. <a href="http://www.dhrusya.com">Feedback</a> </p>
	</div>
	
</div>
</body>














</body>

</html>