<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>registration page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<body>
<div class="container">
  <h2>Employee Registration Form</h2>
  <form action="register" method="post">
    <div class="form-group">
      <input type="text" class="form-control" id="name" placeholder="Enter employee name" name="employeeName">
    </div>
    <div class="form-group">
      <input type="text" class="form-control" id="email" placeholder="Enter salary" name="salary">
    </div>
    <div class="form-group">
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="emailId">
    </div>
    <div class="form-group">
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Register</button>
  </form>
</div>
</body>
</html>