
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>jQuery UI Datepicker - Default functionality</title>
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
  
  #main {
    width: 980px;
    background: #C0C0C0 ;
    margin: auto;
}

#header {
    background: #A80000 ;
}

#logo {
    font-weight: bold;
    font-size: 28px;
    color: #CCCC00;
   text-align:center;

}

#floatwrapper
{
    
    height:100px;
    
}

#content {
background:#C0C0C0 
    height: 200px;
    width:auto;
    border: 1px solid #5970B2
}


#content1 {
background:#C0C0C0 
    height: 200px;
    width:auto;
    border: 1px solid #5970B2
}

#footer
{
background:#C0C0C0 
    height: 100px;
    width:auto;
    border: 1px solid #5970B2

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

	  document.getElementById("content1").innerHTML = xmlhttp.responseText;     

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

<div id = "main">


<div id = "header">

<div id = "Logo">
<b>RESULTS</b>

</div>


</div>

<div id = "content">

<p><b><h1>Date:</h1></b>  <input type="text" id="datepicker" ></p>
<button type="button" onclick = "selectdate(datepicker.value)">GetResults</button>

<p>

<select name = "Live">
  <option value="Bid">Volvo</option>
  <option value="Caliber">Saab</option>
  <option value="Carlton">Opel</option>
  <option value="Butlins">Audi</option>
</select>

</p>

</div>

<div id = "content1">


</div>
 

<div id = "footer">
 
 <a href="mailto:ravikishore.anantatmula@gtech.com,yesuratnam.nallagatla@gtech.com,?Subject=Test Results&Body=Body"><b>Send Mail</b></a>

</div>




</div>
 
 
</body>
</html>