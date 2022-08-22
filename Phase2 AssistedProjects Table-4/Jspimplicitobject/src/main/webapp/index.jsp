<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:out value="${101}"></c:out>
<c:out value="${'hi how are u'}">
</c:out>



<c:set var="b" value="${101}"></c:set>
<p>before value is </p>
<c:out value="${b+10}"></c:out>

<p>after value is </p>
<c:remove var="b"/>
<c:out value="${b+10}"></c:out>




</body>
</html>