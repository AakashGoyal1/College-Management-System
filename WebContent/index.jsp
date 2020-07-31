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
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
		<script>
		 function ValidateForm()
		 {
		 var a=0;
		 var no=/^[0-9]+$/;
		 var x = document.forms["indexform"]["id"].value;
		 if(!(x.match(no)))
		 {
		 document.getElementById("iden").textContent=" *                       Your ID must be numeric";
		 a=1;
		 }
		 
		 
		 if(a==1)
		 	return false;
		 else
		 	return true;
		 }
        </script>
        <style>
        .mybutton{   
        font-size: 12px;
        font-weight: 300;
        height:35px;
        width:25%;
        color: white;
        text-transform: uppercase;
        background: linear-gradient(180deg, #AAAAAA , #1E4D92 ); 
        border-radius: 4px 4px 4px 4px;
        padding: 5px 5px ; 
        }
        .container-fluid{
        display:table;
        width:100%;
        }
        .col-lg-6{
        display:table-cell;
        }
        </style>
		<title>LoginPage</title>
</head>
 	<body>
	 <div class="container-fluid" style="background: linear-gradient(00deg, #AAAAAA , #1E4D92 ); 
    border-radius: 4px 4px 4px 4px;
    padding: 20px 35px ; ">
		<div class="row">
			<div class="col-lg-6"  style="height:480px">
				<form style="margin-top:10%;margin-bottom:20%%"  action="MainServlet" method="get" id="indexform" name="indexform" onsubmit="return ValidateForm()">
					<h2  style="margin-left:35%;color:cyan">LOGIN </h2> 
					<div class="input-group" style="margin-left:15%"  >
					
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<h3>ID
							<input id="id" type="text" class="form-control" name="id" placeholder="Your ID" style="width:30%;" required> </div><h5 id ="iden"></h5>
						</h3>
						
					<div class="input-group" style="margin-left:15%" >
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<h3>Password
							<input id="pass" type="pass" class="form-control" name="pass" placeholder="Your Password" style="width:40%" required></div><h5 id="iden1"></h5>
						</h3>
						
					<div class="input-group " style="margin-left:15%">
						<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
						<h3>You are
							<select name="you">
								<option value="Admin">Admin</option>
             			 		<option value="Student">Student</option>
               					<option value="Teacher">Teacher</option>
                			</select>
						</h3>
											
                        <input type="submit" value="SUBMIT" name="action" style ="background-color:red;margin-left:30%" class="mybutton">
                        
						</div></h3>
					</form>
			 
		
	</div>
	</div><br>
	</body>
</html>

<jsp:include page="Footer.jsp"/>