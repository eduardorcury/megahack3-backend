<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alaobá</title>

    <script defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDIEiEkJ6nWmUggvHvFecFDE4Dch15yuXM&callback=initMap">
    </script>

    <script src="../../scripts/map.js"></script>

    <link rel="stylesheet" href="../../static/styles/user/scanner.css">
</head>
<body>
<header>
    <nav>
        <img class="logo" src="../../static/assets/icons/back.png" alt="logo-alaoba">
        <div class="saldo">
            <p>Saldo disponível</p>
            <h1>3333 MOEDAS</h1>
        </div>
        <img class="button" src="../../static/assets/icons/menu.png" alt="menu">
    </nav>
    <script type="text/javascript" src="https://rawgit.com/schmich/instascan-builds/master/instascan.min.js"></script>

</header>
<div>
    <video id="preview">
        <img src="../../static/assets/mira.svg" alt="">
    </video>
</div>

<script>
    let scanner = new Instascan.Scanner(
        {
            video: document.getElementById('preview')
        }
    );
    scanner.addListener('scan', function (content) {
        // alert('Escaneou o conteudo: ' + content);
        window.open('https://www.google.com', "_blank");
    });
    Instascan.Camera.getCameras().then(cameras => {
        if (cameras.length > 0) {
            scanner.start(cameras[0]);
        } else {
            console.error("Não existe câmera no dispositivo!");
        }
    });
</script>

</body>
</html>