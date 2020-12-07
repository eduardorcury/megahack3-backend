<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/user/friends.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/user/navbar.css">
</head>
<body>
<header>
    <nav>
        <a href="user.jsp"><img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/back.png" alt="logo-alaoba"></a>
        <div class="saldo">
            <p>Saldo disponível</p>
            <h1>3333 MOEDAS</h1>
        </div>
        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>
</header>

<main>
    <div class='main-content'>
        <div class="busca">
            <img src="${pageContext.request.contextPath}/resources/static/assets/icons/lupa.png" alt="lupa">
            <p>busque aqui seu parça</p>
        </div>
        <div class="embaixador">
            <img src="${pageContext.request.contextPath}/resources/static/assets/icons/man.svg" alt="foto-embaixador">
            <div class="info-embaixador">
                <p>Jõao das Neves</p>
                <p>Coins: <span>254</span></p>
            </div>
        </div>

        <input type="submit" value="tamo junto!" id="buttom">
    </div>

    <nav class="navbar">
        <div>
            <img class="fechar" src="${pageContext.request.contextPath}/resources/static/assets/icons/x.svg" alt="fechar" style="top: 0;left: 0;margin: 5px;position: absolute; cursor: pointer;">
            <img src="${pageContext.request.contextPath}/resources/static/assets/zeca.png" alt="">
            <p>Jessé Gomes da Silva Filho</p>
        </div>
        <ul>
            <li>
                <img src="${pageContext.request.contextPath}/resources/static/assets/icons/editar.svg" alt="editar">
                <a href="user-profile.jsp"><p>Ver/Editar perfil</p></a>

            </li>
            <li>
                <img src="${pageContext.request.contextPath}/resources/static/assets/icons/recomendar.svg" alt="">
                <a href="recommend.jsp"><p>Recomendar</p></a>

            </li>
            <li>
                <img src="${pageContext.request.contextPath}/resources/static/assets/icons/partner.svg" alt="">
                <a href="friends.jsp"><p>Quem tá cmg!</p></a>

            </li>
            <li>
                <img src="${pageContext.request.contextPath}/resources/static/assets/icons/notification.svg" alt="">
                <a href="notifications.jsp"><p>Notificações</p></a>

            </li>
            <li>
                <img src="${pageContext.request.contextPath}/resources/static/assets/icons/avaliar.svg" alt="">
                <p>Avaliar bares</p>
            </li>
        </ul>
    </nav>
</main>
</body>
</html>