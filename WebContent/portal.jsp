<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%




String siteselected = request.getParameter("IGT");

out.println("Site selected is" + " "+siteselected);




String Environment = request.getParameter("sel1");

System.out.println("Environment is"+ " "+Environment);

if(siteselected.equals("IBN"))
{
	
	if(Environment.equals("LIVE"))
	{
	
	response.sendRedirect("IGTStarter.jsp"); 

	}
	
	
	else
	{
		response.sendRedirect("SITStarter.jsp"); 

		
	}
	
}


else
{
	
	response.sendRedirect("IGOLG.jsp"); 

	
}

//out.println("Environment selected is" + " "+Environment);



%>

</body>
</html>