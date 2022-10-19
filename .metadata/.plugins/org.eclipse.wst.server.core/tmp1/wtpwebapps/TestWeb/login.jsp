<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String u=request.getParameter("un");
String p=request.getParameter("pwd");

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
	Statement statement=connection.createStatement();
	ResultSet set=statement.executeQuery("SELECT * FROM pig.student; ");
	int flag=0;
	while(set.next()){
	if(u.equals(set.getString(2))&&p.equals(set.getString(3))){
		flag=1;
		break;	
	}
	}
	if(flag==1){
		response.sendRedirect("welcome.jsp");
	}
	else{
		response.sendRedirect("login.html");	
	}
}catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>