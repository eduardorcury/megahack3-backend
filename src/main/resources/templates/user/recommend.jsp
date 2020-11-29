<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../../static/styles/user/notifications.css">
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
        <img class="menu" src="../../static/assets/icons/menu.png" alt="menu">
    </nav>

</header>

<div class="content-main">
    <main>

        <p class="title">Recomendar para um parça!</p>

        <div class="busca">
            <img src="../../static/assets/icons/lupa.png" alt="lupa">
            <label>
                <input type="text" placeholder="Digite o e-mail do parça">
            </label>
        </div>


        <input type="submit" value="tamo junto!" id="buttom">

        <h3>Aêêê!<br>
            Parabéns, você ganhou <br>
            15 moedas por recomendar<br>
            o Alaobá! Saúde!</h3>

        <img src="../../static/assets/icons/beer.png" alt="beer">


    </main>

    <nav class="navbar">
        <div>
            <img class="fechar" src="../../static/assets/icons/x.svg" alt="fechar"
                 style="width: 10px; height: 10px; margin:5px; padding: 0;">
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

<script src="../../scripts/menu.js"></script>
</body>
</html>