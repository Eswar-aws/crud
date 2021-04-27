<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<title>Udate country</title>
</head>
<body>
<form:form action="/Spring-MVC-CRUD3/editsave" method="post" modelAttribute="count">

<table border="2">

<tr><td><form:input path="sno"></form:input></td></tr>
<tr><td><form:input path="id"></form:input></td></tr>
<tr><td>Title</td><td><form:input path="title"></form:input></td></tr>
<tr><td>Author</td><td><form:input path="author"></form:input></td></tr>
<tr><td>PublishedDate</td><td><form:input path="publishdate"></form:input></td></tr>
<tr><td>Price</td><td><form:input path="price"></form:input></td></tr>

</table>

</form:form>
</body>
</html>