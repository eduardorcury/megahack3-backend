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
<div class="content-cadastro"
     style="display: flex; flex-direction: column;justify-content: center; align-items: center;">
    <form method="POST" action="https://megahack3-time43-backend.herokuapp.com/login">

        <div class="form-id">
            <label for="nome">Nome/Razão Social</label>
            <input type="text" name="nome" id="nome" placeholder="Habeas Copus" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="cnpj">CNPJ</label>
            <input type="text" name="cnpj" id="cnpj" placeholder="000.000.000-00" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="cep">CEP</label>
            <input type="text" name="cep" id="cep" placeholder="0000-00" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="endereco">Endereço</label>
            <input type="text" name="endereco" id="endereco" placeholder="Alameda dos Anjos" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="numero">Número</label>
            <input type="text" name="numero" id="numero" placeholder="51" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="cidade">Cidade</label>
            <input type="text" name="cidade" id="cidade" placeholder="Luís Alves" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="uf">UF</label>
            <input type="text" name="uf" id="uf" placeholder="Santa Catarina" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="telefone">Telefone celular</label>
            <input type="text" name="telefone" id="telefone" placeholder="[XX] 99999 9999" autocomplete="off">
        </div>

        <div class="form-id">
            <label for="descricao">Descreva o seu bar para a gente :)</label>
            <textarea name="comentário" rows="8" cols="40"
                      placeholder="Eiiitaaa Mainhaaa! Esse Lorem ipsum é só na sacanageeem! E que abundância meu irmão viu! Assim você vai matar o papai. Só digo uma coisa, domingo ela não vai! Danadaa! Vem minha odalisca, agora faz essa cobra coral subir! Pau que nasce torto, Nunca se endireita. Tchannn! Tchannn! Tu du du pááá! Eu gostchu "></textarea>
        </div>

        <div class="form-img">
            <label for="foto">Precisamos de uma foto sua :)</label>

            <label id="botao" for="foto">CARREGAR FOTO</label>

            <input type="file" name="foto" id="foto" accept="image/png, image/jpeg">
        </div>

        <img src="../../static/assets/img-bar.png" alt="" style="width: 277px; margin: 0 0 15px;">


    </form>

    <form action="pub.jsp">
        <input type="submit" value="CADASTRAR" id="buttom">
    </form>

</div>

</body>
</html>