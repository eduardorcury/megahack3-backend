<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../../static/styles/user/register-user.css">
</head>
<body>
<header>
    <div>
        <img src="../../static/assets/icons/logo-alaoba.svg" alt="logo-alaoba">
    </div>

</header>
<div class="content-cadastro">
    <form:form action="${pageContext.request.contextPath}/registrar-usuario" method="POST">
        <div class="form-id">
            <label for="nome">Nome completo</label>
            <input type="text" name="username" id="nome" placeholder="Jessé Gomes da Silva FIlho" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="email">Qual seu e-mail</label>
            <input type="text" name="email" id="email" placeholder="exemplo@exemplo.com" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="password">Qual seu e-mail</label>
            <input type="password" name="password" id="password" autocomplete="off">
        </div>

        <div class="form-img">
            <label for="foto">Precisamos de uma foto sua :)</label>

            <label id= "botao" for="foto">CARREGAR FOTO</label>

            <input type="file" name="foto" id="foto" accept="image/png, image/jpeg" >
        </div>

        <button id="buttom" type="submit" value="register">CADASTRAR</button>

    </form:form>

    <div id="redes-sociais">
        <p>Se achar mais fácil, que tal se cadastrar com sua conta do Google ou do Facebook?</p>
        <div class="icons">
            <img src="../../static/assets/icons/google.svg" alt="google">
            <img src="../../static/assets/icons/facebook.svg" alt="facebook">
        </div>
    </div>
</div>

</body>
</html>