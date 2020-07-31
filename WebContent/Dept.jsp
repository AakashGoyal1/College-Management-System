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
					   out.println("Welcome to college Department");
					   %>
					</h1>	<br>
				</div>
				<div class="menu" style="margin-left:500px; "> 
					<ul>
					   <form action="DeptServlet" method="get">
					    <button type="submit" name="action" value="viewAll"   >View All Departments</button>   </form><br>
					    
					    
					    
					    <form action="AddNewDept.jsp" method="get">
					    <button type="submit" name="action" value="AddNew"   >Add Department</button>   </form><br>
					    
					    <form action="ModifyDepartment.jsp" method="get">
					    <button type="submit" name="action" value="ModifyDepartment"  >Modify Department</button> </form><br>
					    
					    
					    
					    
				   </div>
				 </nav>
 <section>
  <div class="leftside"> 
   <img src="Images/dept.png" style="height:300px;width:400px;margin-top:50px;margn-left:100px">
  </div>
 
  </section>
</header>
</body>
</html>
			
</body>
</html>
<jsp:include page="Footer.jsp"/>