<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<link rel="stylesheet" type="text/css" href="css/View.css">
		<title>Teacher</title>
	</head>
	
	<body>

		<header class="site-header clearfix">
 			<nav>
 			 	<div class="logo">
   					<h1>
					   <% 
					   out.println("WELCOME TO COLLEGE FACULTIES ");
					   %>
					</h1>	<br><br><br>
				</div>
				<div class="menu" style="margin-left:500px; "> 
					<ul>
					   <form action="TeacherServlet" method="get">
					    <button type="submit" name="action" value="viewAll"   >View All Teachers</button>   </form>
					    
					    <form action="viewByIdTeacher.jsp" method="get">
					    <button type="submit" name="action" value="viewById"   >View Teacher by ID</button>   </form><br>
					    
					    <form action="AddnewTeacher.jsp" method="get">
					    <button type="submit" name="action" value="AddNew"   >Add Teacher</button>   </form><br>
					    
					    
					    
					    <form action="assignSubject.jsp" method="get">
					    <button type="submit" name="action" value="assignSubject"   >Assign Subject</button>   </form><br>
					    
					    
					    
					    <form action="Student.jsp" method="get">
					    <button type="submit" name="action" value="Student"  >Student</button> </form><br>
					    
					    
					    
					    
				   </div>
				 </nav>
 <section>
  <div class="leftside"> 
   <img src="Images/teacher.jpg" style="height:300px;width:400px;margin-top:50px;margn-left:100px">
  </div>
  
  </section>
</header>
</body>
</html>
			
</body>
</html>
<jsp:include page="Footer.jsp"/>