<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type = "text/css">
#main
{
980px;
background: #f3f3f3;
 
}

#header
{

margin-left:100px;
font: 13px/20px 'Lucida Grande', Tahoma, Verdana, sans-serif;
font-weight: bold;
font-size: large;
color: #404040;
border-style:solid; 
background: #0ca3d2;
}

#floatwrapper
{
height:40px;
width:300px;       
float:left;
}

#content {

margin-left:100px;
border-style:solid; 
background: #f3f3f3;
}


#Tccontent {

margin-left:100px;
border-style:solid; 
background: #f3f3f3;
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


input[type=checkbox]
{

border: 1px solid #c0c0c0;
margin: 0 0.1em 0 0;
padding: 0;
font-size: 16px;
line-height: 1em;
width: 1.25em;
height: 1.25em;
background: #fff;
background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ededed), to(#fbfbfb));
 
-webkit-appearance: none;
-webkit-box-shadow: 1px 1px 1px #fff;
-webkit-border-radius: 0.25em;
vertical-align: text-top;
display: inline-block;
 
}
 
 
input[type=checkbox]:checked::after {
content:"âœ”";
display:block;
text-align: center;
font-size: 16px;
height: 16px;
line-height: 18px;
}


</style>


<body>

<%@ page import="java.sql.*"%>


<div id = "main">

<div id = "header">

<div id = "floatwrapper"></div>
<b>IGT AUTOMATION EXECUTER</b> 
</div>

<b>Select site and Environment to Execute</b>

<div id = "content">

<form name = "getproject" method = "get" action = "portal.jsp"> 

<table>
<tr>
<td class="tableheader"><b>Project</b></td>
<td  class= "tableheader"><b>Environment</b></td>
</tr>

<tr>
<td class= "tableheader"><input type = "radio" value = "IBN" name = "IGT" checked="checked" /> <b>IBN</b>
<td class= "table header">

 <select name = environment> <option value = "SIT">SIT</option>
 <option value = "LIVE">LIVE</option>
</select>
</tr> 

<tr>
<td class= "tableheader"><input type = "radio"  value = "OLG" name = "IGT" /> <b>OLG</b>
<td class = "tableheader">

 <select name = "environment"> <option value = "cd52">cd52</option>
 <option value = "cd32">cd32</option>
</select>
</tr>

</table>

<input type = "submit" value = "submit"/>
</form>


</div>

</div>

</body>
</html>
