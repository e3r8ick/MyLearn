<%-- 
    Document   : perfilAdministrador
    Created on : Nov 29, 2016, 2:16:44 PM
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
     </div>

    <div class="row center-block" id="info">
      <div class="col-md-6" id="cursos">
        <h3>Lista de Universidades</h3>
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
        <button type="submit" class = "btn btn-danger" role = "button">Agregar Universidad</button>
        <button type="submit" class = "btn btn-danger" role = "button">Eliminar</button>
      </div>

      <div class="col-md-6" id="proyectos">
        <h3>Lista de TecnologÃ­as</h3>
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
        <button type="submit" class = "btn btn-danger" role = "button">Agregar TecnologÃ­a</button>
        <button type="submit" class = "btn btn-danger" role = "button">Eliminar</button>
      </div>
    </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="js/administrador.js"></script>
  <script src="js/bootstrap-filestyle.min.js"> </script>

</body>
</html>

