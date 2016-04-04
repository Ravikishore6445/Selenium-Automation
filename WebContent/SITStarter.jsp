
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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
/* CSS Document */
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
	height: 500px;
}

#bodyAjax {
	height: 200px;
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

#nav {
	line-height: 30px;
	height: 300px;
	width: 500px;
	float: left;
	padding: 5px;
}

#section {
	width: 350px;
	float: left;
	padding: 10px;
}

.tableheader {
	color: #0066CC;
	border-color: background;
	border-style: solid;
	background-color: #EFF4FB;
	font-size: 20px;
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
	color: #CCCC00;
	font-weight: bold;
	text-decoration: none;
}
</style>


<script type="text/javascript">
	function bingo(id) {

		//alert(id);

		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

				document.getElementById("bodyajax").innerHTML = xmlhttp.responseText;

			}
		}

		xmlhttp.open("GET", "LoadSITbingo.jsp?q=" + id, true);

		//xmlhttp.open("GET","IGTLoadbingo.jsp?q="+id,true);

		xmlhttp.send(null);

	}

	function loadurl(id) {

		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

				//alert(xmlhttp.responseText);

				var txt1 = document.getElementById("site");

				txt1.value = xmlhttp.responseText;

			}
		}

		xmlhttp.open("GET", "GetSitutl.jsp?q=" + id, true);

		xmlhttp.send(null);

	}

	function submitforms() {

		alert("Wait wrting code for submitting two forms");

	}

	function setchat() {
		var str = document.getElementById("chattext").value;
		//document.getElementById("chat").innerHTML = "User"+":"+str; 

		//document.getElementById("chattext").value = " ";

		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

				document.getElementById("chat").innerHTML = xmlhttp.responseText;
				document.getElementById("chattext").value = " ";

			}
		}

		xmlhttp.open("GET", "setchat.jsp?q=" + str, true);

		xmlhttp.send(null);

	}

	function getdata(id) {

		if (document.getElementById(id).checked == true) {
			var chid = document.getElementById(id).id;
			var txt = document.getElementById("run");
			if (txt.value == "") {
				txt.value = chid;
			} else {
				txt.value = txt.value + ',' + chid;
			}

		}

			 
			if(document.getElementById(id).checked == false)
		    {

				
				 
				 chid =  document.getElementById(id).id;

		         var txt1 = document.getElementById('run');
		      
		        str = txt1.value;
		      
		        
		        str = str.replace(chid,'');
		            
		       
		        
		      
		        
		      var mylength = str.length;
		      
		     
	    	  str = str.replace(',','');

		      txt1.value = str;
		}
		}

	
</script>




</head>






<body>

	<%@ page import="java.sql.*"%>

	<div id="main">
		<div id="header">
			<div class="logo">
				<center>Select Site to Execute</center>
			</div>
			<div id="menu"></div>
		</div>

		<div id="body">

			<div id="nav">

				<p>
					<b> <font size=5>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
							&nbsp &nbsp &nbsp SEK Sites</font></b>
				</p>

				<table class="table table-bordered">

					<tbody>
						<tr>
							<td><input type="radio" name="bingo" id="CaliberBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Caliberbingo</b> </font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="BalletBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Balletbingo</b></font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="HappyBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Happybingo</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="LyckoCasino"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Lychobingo</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="SpelHallen"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Spelhallen</b></font size></td>

						</tr>


					</tbody>
				</table>



				<p>
			</div>


			<p>
				<b> <font size=5>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
						&nbsp &nbsp &nbsp GBP Sites</font></b>
			</p>


			<div id="section">


				<table class="table table-bordered">

					<tbody>
						<tr>
							<td><input type="radio" name="bingo" id="BidBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Bidbingo</b> </font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="ButlinsBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Butlinsbingo</b></font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="CarltonBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Carltonbingo</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="CastleBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Castlebingo</b></font size></td>

						</tr>

						
						<tr>
							<td><input type="radio" name="bingo" id="Club3000"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>Club3000</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="DailyExpressBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>DailyExpressbingo</b></font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="DailyStar"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>DailyStar</b></font size></td>

						</tr>
						<tr>
							<td><input type="radio" name="bingo" id="RoyalGames"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>RoyalGames</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="OkBingo"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>OkBingo</b></font size></td>

						</tr>

						<tr>
							<td><input type="radio" name="bingo" id="SlotNGames"
								onclick="bingo(this.id)" /></td>
							<td><font size=2><b>SlotNGames</b></font size></td>

						</tr>


						
					</tbody>
				</table>




			</div>



		</div>

		<div id="bodyajax">
			

		</div>



		<div id="footer">

			<p>
				&copy; Copyright 2015. <a
					href="mailto:ravikishore.anantatmula@IGT.com,yesuratnam.nallagatla@IGT.com?Subject=Test Results&Body=Body"><b>For feedback 
						Mail</b></a>
			</p>

		</div>

	</div>
</body>
</html>



