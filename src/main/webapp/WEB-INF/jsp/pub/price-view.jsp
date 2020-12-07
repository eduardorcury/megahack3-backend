<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/pub/price-view.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/back.png" alt="logo-alaoba">

        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>
</header>

<main>
    <div>
        <img src="${pageContext.request.contextPath}/resources/static/assets/drink.png" alt="drink">
        <div class="info">
            <h6>Promoção 01 - Recompensa</h6>
            <p>Quem manda na minha sou euzis! Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.</p>
            <p class="tempo">
                Período vigente: 00/00/00 - 00/00/00
            </p>
        </div>
    </div>

    <div>
        <img src="${pageContext.request.contextPath}/resources/static/assets/drink.png" alt="drink">
        <div class="info">
            <h6>Promoção 01 - Recompensa</h6>
            <p>Quem manda na minha sou euzis! Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.</p>
            <p class="tempo">
                Período vigente: 00/00/00 - 00/00/00
            </p>
        </div>
    </div>

    <div>
        <img src="${pageContext.request.contextPath}/resources/static/assets/drink.png" alt="drink">
        <div class="info">
            <h6>Promoção 01 - Recompensa</h6>
            <p>Quem manda na minha sou euzis! Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.</p>
            <p class="tempo">
                Período vigente: 00/00/00 - 00/00/00
            </p>
        </div>
    </div>

    <form action="new-price.jsp">
        <input class="buttom" type="submit" value="nova promoção" id="buttom">
    </form>

    <form action="delete-price.jsp">
        <input class="buttom" type="submit" value="editar promoção" id="buttom">
    </form>

</main>

</body>
</html>
