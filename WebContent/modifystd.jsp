<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf.8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href=css/view.css>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 " style="background: linear-gradient(57deg, #AAAAAA, #1E4D92)">
				<form action="StudentServlet" method="get" style="margin-top:8%;margin-bottom:7.5%">
					<center><h1 style="color:white">MODIFY STUDENT </h1><center><br><br>
			<div class="input-group col-xs-4">
					<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
					<center><input id="id" type="text" class="form-control" name="id" placeholder="deptid" required ></div></center><br>
			<table><tr><td>
						<label for="Name"><b>Name</b></label></td><td>
   			 			<input type="text" placeholder="Name" name="name"></td><td>
   			 			<input type="button"><button name="action" action="na" value ="nat" >
									UPDATE NAME</button>
			
			</table>
			 <label for="Name"><b>Name</b></label>
   			 <input type="text" placeholder="Enter Aadhar Card No" name="aadhar card no" required><br>

					<br><br>			
					<button action style="font-size: 40px;
								   button:hover;
								   font-weight:200;
								   color:white;
								   background: linear-gradient(57deg, #00C6A7, #1E4D92);
								   border-radius: 4px 4px 4px 4px;
								   padding:5px,15px;"
									name="action" action="modifyDept" value ="modifyDept" >
									Modify Department</button>
				</form><center><a href="Student.jsp"><h1 style="color:white">Back</h1></a></center>
				
			</div>
		</div></div>
	</body>
</html>
<jsp:include page="Footer.jsp"/>