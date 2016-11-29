<%-- 
    Document   : areaCompartidaEstudiante
    Created on : Nov 29, 2016, 2:15:42 PM
    Author     : Víctor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width = device-width, initial-scale = 1">

  <title>MyLearn</title>

  <link rel="icon" href="img/favicon.ico" type="image/x-icon"/>
  <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon"/>

  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/register.css">

</head>

<body>

  <div class="container">


    <div class="media page-header row">
      <div class="col-md-4" id="logo">
        <a href="perfilEstudiante.html" class="pull-left">
           <img src="img/logo2.png" class="media-object" alt="imagen">
        </a>
      </div>
       <div class="col-md-4">
         <h1>EspecificaciÃ³n y DiseÃ±o</h1>
       </div>
    </div>

    <div class="row center-block" id="tipoCuenta">
      <div class="col-md-4" id="info">
        <h2>InformaciÃ³n de Curso</h2>
        <h5>Numero de Grupo : 1</h5>
        <h5>Nota MÃ­nima : 70</h5>
      </br ><h5><b>DescripciÃ³n del Curso:</b></h5>
      <p align="justify">Lorem ipsum dolor sit amet, consectetur adipiscing elit.
         Duis risus metus, eleifend in lectus vitae, sagittis elementum tortor.
         Praesent suscipit feugiat lacus, vel vulputate magna. Nunc sit amet ullamcorper
         massa, imperdiet fringilla sapien. Nulla dapibus odio ac lacus tristique finibus.
         Suspendisse mattis turpis id felis dignissim, quis condimentum ex viverra.
         Suspendisse urna est, malesuada quis tortor eu, varius eleifend elit. Sed at tempus sem. </p>
        <h2>InformaciÃ³n de Proyecto</h2>
        <h5><b>DescripciÃ³n del Proyecto:</b></h5>
        <p align="justify">Vestibulum ut tortor dolor. Sed ac lobortis urna.
          Aenean iaculis scelerisque massa, laoreet egestas diam ullamcorper ac.
          Aliquam vulputate lacus augue, sit amet fringilla massa dignissim ut.</p>
        <h5><b>Problematica a resolver:</b></h5>
        <p align="justify">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
          sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
          Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
          aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
          velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat
          non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
        </br ><h5>Fecha de Inicio 10/10/16</h5>
        <h5>Fecha de Final: 20/10/16</h5>

        <h2>InformaciÃ³n de Profesor</h2>
        <h3>Erick Cordero Rojas</h3>
        <h5>Universidad: TEC</h5>
        <h5>PaÃ­s: Costa Rica</h5>
        <h5>Telefono: 87022315</h5>
        <h5>Correo: eguicoro2@hotmail.com</h5>
        <h5>Horas de AtenciÃ³n:</h5></br >
      </div>

      <div class="col-md-4" id="comentarios">
        <h2>SecciÃ³n de Comentarios</h2>
        <div class="well" style="max-height: 500px;overflow: auto;">
          <ul class="list-group ">
            <li class="list-group-item"><b>Andres Stephen:</b></br>Hola adjunto respuesta<img src="img/archivo.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Dapibus ac facilisis in</li>
            <li class="list-group-item">Morbi leo risus</li>
          </ul>
        </div>
      </div>

      <div class="col-md-" id="evaluaciÃ³n">
        <h2>Escala de evaluaciÃ³n</h2></br >
        <h3>Nota Actual : 80</h3></br >
        <div class="well" style="max-height: 500px;overflow: auto;">
          <ul class="list-group checked-list-box">
            <li class="list-group-item">Cras justo odio<img src="img/t.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Dapibus ac facilisis in<img src="img/t.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Morbi leo risus<img src="img/t.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Porta ac consectetur ac<img src="img/t.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Vestibulum at eros<img src="img/t.png" class="media-object" alt="imagen"></li>
            <li class="list-group-item">Cras justo odio<img src="img/t.png" class="media-object" alt="imagen"></li>
          </ul>
        </div>
      </div>
    </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="js/register.js"></s  cript>

</body>
</html>

