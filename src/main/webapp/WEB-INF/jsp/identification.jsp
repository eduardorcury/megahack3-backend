<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/identification.css">
</head>
<body>
<header>
    <div>
        <img src="${pageContext.request.contextPath}/resources/static/assets/icons/logo-alaoba.svg" alt="logo-alaoba">
    </div>

</header>
<div class="buttons">
    <a href="${pageContext.request.contextPath}/novo-usuario">sou cliente</a>
    <a href="${pageContext.request.contextPath}/novo-bar">sou barista</a>
</div>
</body>
</html>