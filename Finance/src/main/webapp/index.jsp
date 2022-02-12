<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Financial Gain</title>
</head>
<body>
<h1>Financial Gain Calculator</h1>
<form action="calcGainFinance" method="post">
Enter the amount you have in the Account:
<input type="text" name="amtAccount" size="10">
<br><br>
Enter the rate of the Account:
<input type="text" name="accountRate" size="10">
%
<br><br>
<input type="submit" value="Calulate Amount in 10 years" />
</form>
</body>
</html>