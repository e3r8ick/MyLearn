<%-- 
    Document   : vistaEstudiante
    Created on : Nov 29, 2016, 2:28:34 PM
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
  <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
  <link rel="stylesheet" href="css/perfil.css">

</head>

<body>

  <div class="container">

    <div class="media page-header">

      <div class="media page-header row">
        <div class="col-md-2" id="logo">
          <a href="perfilEmpresa.html" class="pull-left">
             <img src="img/logo2.png" class="media-object" alt="imagen">
          </a>
        </div>
        <div class="col-md-2">
          <h6>Cursos</h6>
          <div class="progress">
            <div class="progress-bar progress-bar-success" style="width: 50%">
             <span class="sr-only">50% completado (Ã©xito)</span>
            </div>
            <div class="progress-bar progress-bar-danger" style="width: 50%">
             <span class="sr-only">50% completado (peligro)</span>
            </div>
          </div>
          <h6>Aprobados / Reprobados</h6>
        </div>
        <div class="col-md-2">
          <h6>Proyectos</h6>
          <div class="progress">
            <div class="progress-bar progress-bar-success" style="width: 50%">
              <span class="sr-only">50% completado (Ã©xito)</span>
            </div>
            <div class="progress-bar progress-bar-danger" style="width: 50%">
              <span class="sr-only">50% completado (peligro)</span>
            </div>
          </div>
          <h6>Exitosos / Fracasados</h6>
        </div>
        <div class="col-md-2">
          </br >
          <h5>Nota Promedio </br > ##</h5>
        </div>
        <div class="col-md-2">
          </br >
          <div class="row lead">
            <h5>Calificacion de Empresas:</h5>
            <div id="stars" class="starrr"></div>
    	    </div>
        </div>
      </div>
     </div>

    <div class="row center-block" id="info">
      <div class="col-md-3" id="estudiante">
        <img src="img/man.png" class="media-object center-block" alt="imagen"></br >
        <div class="perfil">
          <h3>Erick Cordero Rojas</h3>
          <h5>Carne: 201228433</h5>
          <h5>Universidad: TEC</h5>
          <h5>PaÃ­s: Costa Rica</h5>
          <h5>Telefono: 87022315</h5>
          <h5>Correo: eguicoro2@hotmail.com</h5>
          <h5>Telefono: 87022315</h5></br >
          <h5><a href="#">Link a Hoja de Vida</a></h5></br >
          <div class="well" style="max-height: 200px;overflow: auto;">
            <ul class="list-group checked-list-box">
              <li class="list-group-item">Cras justo odio</li>
              <li class="list-group-item" data-checked="true">Dapibus ac facilisis in</li>
              <li class="list-group-item">Morbi leo risus</li>
              <li class="list-group-item">Porta ac consectetur ac</li>
              <li class="list-group-item">Vestibulum at eros</li>
              <li class="list-group-item">Cras justo odio</li>
              <li class="list-group-item">Dapibus ac facilisis in</li>
              <li class="list-group-item">Morbi leo risus</li>
              <li class="list-group-item">Porta ac consectetur ac</li>
              <li class="list-group-item">Vestibulum at eros</li>
            </ul>
          </div>
        </div>
      </div>

      <div class="col-md-3" id="cursos">
        <h3>Mis Cursos</h3></br >
        <div class="well" style="max-height: 500px;overflow: auto;">
          <ul class="list-group checked-list-box">
            <li class="list-group-item">Cras justo odio</li>
            <li class="list-group-item" data-checked="true">Dapibus ac facilisis in</li>
            <li class="list-group-item">Morbi leo risus</li>
            <li class="list-group-item">Porta ac consectetur ac</li>
            <li class="list-group-item">Vestibulum at eros</li>
            <li class="list-group-item">Cras justo odio</li>
            <li class="list-group-item">Dapibus ac facilisis in</li>
            <li class="list-group-item">Morbi leo risus</li>
            <li class="list-group-item">Porta ac consectetur ac</li>
            <li class="list-group-item">Vestibulum at eros</li>
          </ul>
        </div>
      </div>

      <div class="col-md-3" id="proyectos">
        <h3>Mis Proyectos Remunerados</h3>
        <div class="well" style="max-height: 500px;overflow: auto;">
          <ul class="list-group checked-list-box">
            <li class="list-group-item">Cras justo odio</li>
            <li class="list-group-item" data-checked="true">Dapibus ac facilisis in</li>
            <li class="list-group-item">Morbi leo risus</li>
            <li class="list-group-item">Porta ac consectetur ac</li>
            <li class="list-group-item">Vestibulum at eros</li>
            <li class="list-group-item">Cras justo odio</li>
            <li class="list-group-item">Dapibus ac facilisis in</li>
            <li class="list-group-item">Morbi leo risus</li>
            <li class="list-group-item">Porta ac consectetur ac</li>
            <li class="list-group-item">Vestibulum at eros</li>
          </ul>
        </div>
      </div>
    </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="js/perfil.js"></script>
  <script src="js/bootstrap-filestyle.min.js"> </script>

</body>
</html>
