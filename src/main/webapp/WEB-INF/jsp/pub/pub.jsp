<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/pub/pub.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/logo-alaoba.svg" alt="logo-alaoba">

        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>
</header>
<main>

    <form action="qrcode.jsp" style="margin-bottom: 30px;">
        <input class="buttom" type="submit" value="cobrar" id="buttom">
    </form>

    <form action="token.jsp" style="margin-bottom: 30px;">
        <input class="buttom" type="submit" value="gerar token" id="buttom">
    </form>

    <form action="pub-profile.jsp">
        <input class="buttom" type="submit" value="ver/editar perfil" id="buttom">
    </form>

</main>

</body>
</html>