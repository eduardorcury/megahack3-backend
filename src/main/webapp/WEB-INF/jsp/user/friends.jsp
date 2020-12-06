<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../../static/styles/user/friends.css">
    <link rel="stylesheet" href="../../static/styles/user/navbar.css">
</head>
<body>
<header>
    <nav>
        <a href="user.jsp"><img class="logo" src="../../static/assets/icons/back.png" alt="logo-alaoba"></a>
        <div class="saldo">
            <p>Saldo disponível</p>
            <h1>3333 MOEDAS</h1>
        </div>
        <img class="button" src="../../static/assets/icons/menu.png" alt="menu">
    </nav>
</header>

<main>
    <div class='main-content'>
        <div class="busca">
            <img src="../../static/assets/icons/lupa.png" alt="lupa">
            <p>busque aqui seu parça</p>
        </div>
        <div class="embaixador">
            <img src="../../static/assets/icons/man.svg" alt="foto-embaixador">
            <div class="info-embaixador">
                <p>Jõao das Neves</p>
                <p>Coins: <span>254</span></p>
            </div>
        </div>

        <input type="submit" value="tamo junto!" id="buttom">
    </div>

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
</main>
</body>
</html>