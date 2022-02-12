<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Amount Made After 10 Years</h1>
<form action="calcNewRate" method="post">
The new Amount in your account is: $
<input type="text" name="amtAccount" size="10" value="${userGains.getTenYearAmt()}" readonly>
<br><br>
Enter the rate rate for the account:
<input type="text" name="accountRate" size="10">
%
<br><br>
<input type="submit" value="Calulate Amount in another 10 years" />
</form>
<a href="index.jsp">Try another rate/Amount?</a>
</body>
</html>