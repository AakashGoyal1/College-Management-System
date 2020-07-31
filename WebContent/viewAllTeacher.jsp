<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:include page="Header.jsp"></jsp:include>
 <%@page import ="com.entity.Teacher,java.util.ArrayList" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12"  style="background: linear-gradient(57deg, #AAAAAA , #1E4D92 )">
				<center><h1 style="color:white">TEACHERS</h1></center>
				</div>
				</div>
				</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12y"style="background: linear-gradient(57deg, #00C6A7 , #1E4D92 )">
					<div class=container-fluid>
					 	<div class="row">
							<table class="table" width="95%" style="color:black" border="2">
								
								<tbody>	
								<thead>
									<tr style="color:blue" >
									<th>ID</th><th>NAME</th><th>Father Name</th><th>Blood Group</th><th>Dept Name</th><th>Mobile</th>
									<th>E-Mail ID</th><th>Gender</th></tr>
								</thead>
									<c:forEach var="al" items="${requestScope.al}">
								 		<tr class="success">
											<td><c:out value="${al.getId()}"/></td>
											<td><c:out value="${al.getName()}"/></td>
											<td> <c:out value="${al.getFather_name()}"/></td>
											<td> <c:out value="${al.getB_g()}"/></td>
											<td> <c:out value="${al.getDept_id()}"/></td>
											<td> <c:out value="${al.getMob()}"/></td>
											<td> <c:out value="${al.getEmail_id()}"/></td>
											<td> <c:out value="${al.getGender()}"/></td>
											
								
											
										</tr>
									</c:forEach>
				     			</tbody>
					 		</table>
					 	</div> <center><a href="Teacher.jsp"><h1 style="color:white">Back</h1></a></center>
					 </div>
					 
				</div>
			</div>
		</div>
	</body>
</html>
<jsp:include page="Footer.jsp"></jsp:include>