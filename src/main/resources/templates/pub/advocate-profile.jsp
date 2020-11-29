<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../../static/styles/pub/advocate-profile.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="../../static/assets/icons/back.png" alt="logo-alaoba">

        <img class="button" src="../../static/assets/icons/menu.png" alt="menu">
    </nav>

</header>

<main>
    <div class="embaixador">
        <img src="../../static/assets/icons/man.svg" alt="foto-embaixador">
        <div class="info-embaixador">
            <p>Jõao das Neves</p>
            <p>Coins: <span>254</span></p>
            <p>Data de nascimento: <span>00/00/0000</span></p>

        </div>
    </div>


    <form method="POST" action="https://megahack3-time43-backend.herokuapp.com/cliente">
        <div>
            <label for="login">Login</label>
            <input type="text" name="login" id="login" placeholder="R$         0.00" autocomplete="off">
        </div>

    </form>

    <form action="token.jsp">
        <input type="submit" value="bonificar" id="buttom">
    </form>

</main>

</body>
</html>