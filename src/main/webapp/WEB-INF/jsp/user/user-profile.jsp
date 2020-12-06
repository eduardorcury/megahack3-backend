<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../../static/styles/user/user-profile.css">
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

<main>
    <div>
        <img src="../../static/assets/zeca.png" alt="foto">
        <p>Jessé Gomes da Silva Filho</p>
        <p> 45 anos de idade</p>
        <p>CPF:<span> 123.456.789-10</span></p>
        <p>E-mail:<span>cliente@exemplo.com</span></p>
    </div>


    <form action="register-user.jsp">
        <input class="buttom" type="submit" value="editar perfil" id="buttom">
    </form>

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
</main>
<script src="../../scripts/menu.js"></script>
</body>
</html>
