<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> View Country List</title>
<style>
td{
	text-align:center;
	background-color:yellow;
}
th
{
	background-color:#339FFF;
	text-color:white;
}

</style>
</head>
<body>
<h3 align="center" style=color:blue><u>Country List</u></h3>
<table align="center" border="2" width="50%" cellpadding="2">
<tr><th>S.No</th><th>Code</th><th>Name</th><th>Population</th><th>Action</th></tr>
<c:forEach items="${list}" var="c">
<tr><td>${c.sno}</td><td>${c.code}</td><td>${c.name}</td><td>${c.population}</td><td><a href="edit/${c.sno}">Edit</a><a href="delete/${c.sno}">Delete</a></td></tr>

</c:forEach>
</table>
</body>
</html>