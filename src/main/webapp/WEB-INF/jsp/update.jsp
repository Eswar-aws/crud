<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<title>Udate country</title>
</head>
<body>
<form:form action="/Spring-MVC-CRUD3/editsave" method="post" modelAttribute="count">

<table border="0">

<form:hidden path="sno" />
<tr><td>CountryCode</td><td><form:input path="code"></form:input></td></tr>
<tr><td>Country Name</td><td><form:input path="name"></form:input></td></tr>
<tr><td>Population</td><td><form:input path="population"></form:input></td></tr>
<tr><td></td><td align="center" cellpadding="2"><input type="submit" value="Update">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="clear"></td></tr>


</table>

</form:form>
</body>
</html>
