<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="../static/styles/style.css">
</head>

<body>
<header>
    <div>
        <img src="../static/assets/icons/logo-alaoba.svg" alt="logo-alaoba">
    </div>
</header>

<div class="login-container">

    <form:form action="${pageContext.request.contextPath}/login" method="POST">
        <div>
            <label for="login">Login</label>
            <input type="text" name="username" id="login" placeholder="Seu apelido aqui" autocomplete="off">
        </div>

        <div>
            <label for="senha">Senha</label>
            <input type="password" name="password" id="senha" placeholder="Sua senha aqui" >
        </div>

        <a href="#" id="forgot-pass"> Putz... esqueci minha senha :(</a>

        <button id="buttom" type="submit" value="login">ENTRAR</button>
    </form:form>

    <div id="redes-sociais">
        <p>Ou entrar com</p>
        <div class="icons">
            <img src="../static/assets/icons/google.svg" alt="google">
            <img src="../static/assets/icons/facebook.svg" alt="facebook">
        </div>
    </div>
    <div class="registrar">
        <p>Ainda não tá com a gente, chefia?</p>
        <a href="identification.jsp"><span>Faça seu cadastro aqui</span></a>
    </div>
</div>
</body>
</html>