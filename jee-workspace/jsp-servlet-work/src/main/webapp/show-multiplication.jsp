<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%!
	// this is declaration place you can have any method here and can be invoked 
	public String hi() {
		return "HIII"; 
	}
%>
<body>
	
	<%
		int val = Integer.parseInt(request.getParameter("val")); 
	
		
	%>
	You Called:  <%=hi() %>
	<table border="1">

		<%
		// 10 x 1 = 10 
			for(int i=1; i<=10; i++) {
				%>
				<tr><td><%=val %> X  <%=i %> = <%=i*val %></td></tr>
				
				<%	
			}
			
		%>


	</table>
</body>
</html>