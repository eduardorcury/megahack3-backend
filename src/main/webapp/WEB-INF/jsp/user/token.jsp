<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/user/token.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/back.png" alt="logo-alaoba">
        <div class="saldo">
            <p>Saldo disponível</p>
            <h1>3333 MOEDAS</h1>
        </div>
        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>

</header>

<main>
    <form action="">
        <div>
            <label for="valor">Valor</label>
            <input type="text" name="valor" id="valor" placeholder="tYk34c" autocomplete="off">
        </div>

        <input class="buttom" type="submit" value="inserir token" id="buttom">
    </form>

    <p>
        Aêêê! Parabéns, você ganhou 15 moedas nessa ida ao bar! Saúde!
    </p>

    <img src="${pageContext.request.contextPath}/resources/static/assets/icons/beer.png" alt="beer">
</main>

</body>
</html>