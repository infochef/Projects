<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Flight</title>
<link rel="stylesheet" type="text/css" href="./css/AddFlight.css">

<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<div class="flight">
		<form action="./addflight" method="post">
			<div style="color: red">${message}</div>
			<h1>Add Flight</h1>
			<p>Flight Number:</p>
			<input type="text" name="flightNo" placeholder="Enter Flight Number" required>
			<br>
			<p>Airline:</p>
			<input type="text" name="airline" placeholder="Enter Flight Number" required>
			<br>
			<p>DepCity:</p>
			<input type="text" name="depCity" placeholder="Enter Departure City" required>
			<br>
			<p>ArrCity:</p>
			<input type="text" name="arrCity" placeholder="Enter Arrival  City" required>
			<br>
			<p>DepDate:</p>
			<input type="date" name="depDate" required>
			<br>
			<p>ArrDate:</p>
			<input type="date" name="arrDate" required>
			<br>
			<p>DepTime:</p>
			<input type="time" name="depTime" required>
			<br>
			<p>ArrTime:</p>
			<input type="time" name="arrTime" required>
			<br>
			<p>Fare:</p>
			<input type="number" name="fare" placeholder="Enter fare" required><br>
			<br> 
			<input type="submit" value="ADD FLIGHT">
		</form>
		</div>
</body>
</html>