<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/View.css">
		<title>Admin</title>
	</head>
	
	<body>

		<header class="site-header clearfix">
 			<nav>
 			 	<div class="logo">
   					<h1>
					   <% 
					   out.print("Welcome  to  College  Student Details");
					   %>
					</h1>	<br>
				</div>
				<div class="menu" style="margin-left:500px; "> 
					<ul>
					   <form action="StudentServlet" method="get">
					    <button type="submit" name="action" value="viewAll"   >View All Students</button>   </form><br>
					    
					    <form action="viewByStudent.jsp" method="get">
					    <button type="submit" name="action" value="viewById"   >View Student by ID</button>   </form><br>
					    
					    <form action="AddnewStudent.jsp" method="get">
					    <button type="submit" name="action" value="AddNew"   >Add Student</button>   </form>
					    
					
					    
					    <form action="DeleteStudent.jsp" method="get">
					    <button type="submit" name="action" value="DeleteStudent"  >Delete Student</button> </form>
					    
					    
					    
					    
				   </div>
				 </nav>
 <section>
  <div class="leftside"> 
   <img src="Images/std.jpg" style="height:300px;width:400px;margin-top:50px;margn-left:100px">
  
  </section>
</header>
</body>
</html>
			
</body>
</html>
<jsp:include page="Footer.jsp"/>