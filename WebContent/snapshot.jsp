<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.io.*"%>

<%

String id = request.getParameter("q");
String id1[] = id.split(",");

String path = "C:/Users/ranantatmula/Desktop";
//out.println(id1[0]);
//out.println(id1[1]);

String abspath = path+"/"+id1[0]+"/"+id1[1]+".png";
out.println("Image Path is"+ " "+abspath);

//File f = new File(path+id1[0]); 
File f = new File(abspath);

//out.println(f);


%>

<script type="text/javascript" >
        
        </script>
        

</body>
</html>