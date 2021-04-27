<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>Add Country</title>
</head>
<body>
<h3>Add Country Details</h3>
<form action="save" method="post">
<table>
<tr><td>CountryCode</td><td><input type="number" name="code"></td></tr>
<tr><td>Country Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Population</td><td><input type="text" name="population"></td></tr>
<tr><td><input type="submit" value="save"></td><td><input type="reset" value="clear"></td></tr>
</table>
</form>
<a href="view">View List</a>
</body>
</html>
