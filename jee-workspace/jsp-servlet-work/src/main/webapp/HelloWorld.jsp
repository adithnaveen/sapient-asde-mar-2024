<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to JSP</h2>

<%
	Date d = new Date(); 
	out.println("Today's Date is "  + d.toLocaleString());
	List<String> list; 
	
%>
</body>
</html>