<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type = "text/javascript">



function submitForms()
{
  document.getElementById("form1").submit();
  document.getElementById("form2").submit();
 }
</script>


</head>
<body>

<Form name = "form1" id = "form1" action = Executer.jsp>

<input type = "text" name = "xyz">


</Form>

<Form name = "form2" id = "form2" action = Executer.jsp>

<input type = "text" name = "abc">


</Form>

<input type="button" value="Click Me!" onclick="submitForms()" />

</body>
</html>