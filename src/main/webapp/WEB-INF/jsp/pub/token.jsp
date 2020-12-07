<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/pub/token.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/back.png" alt="logo-alaoba">

        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>

</header>

<main>
    <form action="">
        <div>
            <label for="valor">Valor</label>
            <input type="text" name="valor" id="valor" placeholder="tYk34c" autocomplete="off">
        </div>

        <input class="buttom" type="submit" value="gerar token" id="buttom">
    </form>
</main>

</body>
</html>