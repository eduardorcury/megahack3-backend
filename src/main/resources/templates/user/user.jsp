<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <script  defer
             src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDIEiEkJ6nWmUggvHvFecFDE4Dch15yuXM&callback=initMap">
    </script>

    <script src="../../scripts/map.js"></script>

    <link rel="stylesheet" href="../../static/styles/user/user.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="../../static/assets/icons/logo-alaoba.svg" alt="logo-alaoba">

        <div class="saldo">
            <p>Saldo disponível</p>
            <h1>3333 MOEDAS</h1>
        </div>
        <img class="menu" src="../../static/assets/icons/menu.png" alt="menu">
    </nav>

</header>

<div class="main">
    <div id="map"></div>

    <nav class="navbar">
        <div>
            <img class="fechar" src="../../static/assets/icons/x.svg" alt="fechar" style="top: 0;left: 0;margin: 5px;position: absolute; cursor: pointer;">
            <img src="../../static/assets/zeca.png" alt="">
            <p>Jessé Gomes da Silva Filho</p>
        </div>
        <ul>
            <li>
                <img src="../../static/assets/icons/editar.svg" alt="editar">
                <a href="user-profile.jsp"><p>Ver/Editar perfil</p></a>

            </li>
            <li>
                <img src="../../static/assets/icons/recomendar.svg" alt="">
                <a href="recommend.jsp"><p>Recomendar</p></a>

            </li>
            <li>
                <img src="../../static/assets/icons/partner.svg" alt="">
                <a href="friends.jsp"><p>Quem tá cmg!</p></a>

            </li>
            <li>
                <img src="../../static/assets/icons/notification.svg" alt="">
                <a href="notifications.jsp"><p>Notificações</p></a>

            </li>
            <li>
                <img src="../../static/assets/icons/avaliar.svg" alt="">

                <p>Avaliar bares</p>
            </li>
        </ul>
    </nav>
</div>

<footer>
    <div>
        <a href="scanner.jsp">
            <img src="../../static/assets/icons/dinheiro.svg" alt="dinheiro">
        </a>

        <p>usar moedas</p>
    </div>

    <div>
        <a href="token.jsp">
            <img src="../../static/assets/icons/saida.svg" alt="saida">
        </a>

        <p>tô vazando</p>
    </div>
</footer>
<script src="../../scripts/menu.js"></script>

</body>
</html>