<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row" style="background: linear-gradient(57deg, #AAAAAA , #1E4D92 )">
				<div class="col-lg-12" style="margin-top:2%;margin-bottom:7%">
					<center><h1>If you have any complain regarding anything, Please feel free to submit your complaints</h1></center><br>
					<form>
						<div class="input-group col-xs-4">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<input id="adminName" type="text" class="form-control" name="name" placeholder="Enter your Name" required ></div><h5></h5><br>
						<div class="form-group">
                        <label for="comment">Complaint:</label>
                        <textarea class="form-control" rows="5" id="comment" style="width:50%" required></textarea>
                        </div><br>
						<div class="form-group">
                        <input type="submit" value="SUBMIT" name="report" style ="background-color:tomato"> 
						</div>
					</form><center><a href="index.jsp"><h1 style="color:white">Back</h1></a></center>
				</div>
			</div>
		</div>
		</body>
</html>
<jsp:include page="Footer.jsp"/>