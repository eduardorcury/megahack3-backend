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
    <form:form action="registerUser" modelAttribute="user" method="POST">

        <form:hidden path="id"/>

        <table class="form-id">
            <tbody>
                <tr>
                    <td><label for="nome">Nome completo</label></td>
                    <td><form:input type="text" path="username" id="nome" placeholder="Jessé Gomes da Silva Filho" autocomplete="off" /></td>
                </tr>
                <tr>
                    <td><label for="email">Qual seu e-mail</label>
                    <td><form:input type="text" path="email" id="email" placeholder="exemplo@exemplo.com" autocomplete="off" /></td>
                </tr>
                <tr>
                    <td><label for="password">Digite uma senha</label></td>
                    <td><form:input type="password" path="password" id="password" autocomplete="off" /></td>
                </tr>
            </tbody>
        </table>

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