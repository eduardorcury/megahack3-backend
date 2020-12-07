<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/styles/pub/new-price.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="${pageContext.request.contextPath}/resources/static/assets/icons/back.png" alt="logo-alaoba">

        <img class="button" src="${pageContext.request.contextPath}/resources/static/assets/icons/menu.png" alt="menu">
    </nav>
</header>

<main>
    <div class="content-cadastro">
        <form method="POST" action="https://megahack3-time43-backend.herokuapp.com/login">
            <div class="form-id">
                <label for="promocao">Promoção</label>
                <input type="text" name="promocao" id="promocao" placeholder="Nome da promoção" autocomplete="off">
            </div>

            <div class="form-id">
                <label for="inicio">Período inicial</label>
                <input type="text" name="inicio" id="inicio" placeholder="00/00/0000" autocomplete="off">
            </div>

            <div class="form-id">
                <label for="final">Período final</label>
                <input type="text" name="final" id="final" placeholder="00/00/0000" autocomplete="off">
            </div>

            <div class="form-id">
                <label for="descricao">Descrição</label>
                <input type="text" name="descricao" id="descricao" placeholder="Lorem ipsum dolor sit ate amo. Blaaa"
                       autocomplete="off">
            </div>

            <div class="form-id">
                <label for="recompensa">Recompensa</label>
                <input type="text" name="recompensa" id="recompensa" placeholder="Lorem ipsum dolor sit ate amo. Blaaa"
                       autocomplete="off">
            </div>

            <div class="form-img">
                <label for="foto">Precisamos de uma foto para a promo :)</label>

                <label id="botao" for="foto">CARREGAR FOTO</label>

                <input type="file" name="foto" id="foto" accept="image/png, image/jpeg">
            </div>


        </form>

        <form action="new-price.jsp">
            <input type="submit" value="ADICIONAR" id="buttom">
        </form>

        <form action="pub-profile.jsp">
            <input type="submit" value="EXCLUIR" id="buttom-excluir">>
        </form>
    </div>
</main>

</body>
</html>