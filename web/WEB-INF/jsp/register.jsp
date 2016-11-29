<%-- 
    Document   : register
    Created on : Nov 25, 2016, 9:02:25 AM
    Author     : Víctor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <a href="index.html" class="pull-left">
           <img src="img/logo2.png" class="media-object" alt="imagen">
        </a>
      </div>
       <div class="col-md-4">
         <h1>MyLearn</h1>
       </div>
    </div>

    <div class="row center-block" id="tipoCuenta">
      <div class="col-md-4" id="estudiante">
        <img src="img/man.png" id="man" onclick="activarEstudiante()" class="img-responsive center-block" alt="Responsive Image"><br/>
        <button type="submit" onclick="activarEstudiante()" class = "btn btn-danger" role = "button">Estudiante</button><br /><br />
      </div>

      <div class="col-md-4" id="profesor">
        <img src="img/teacher.png" id="teacher" onclick="activarProfesor()"class="img-responsive center-block" alt="Responsive Image"><br/>
        <button type="submit" onclick="activarProfesor()" class = "btn btn-danger" role = "button">Profesor</button><br /><br />
      </div>

      <div class="col-md-" id="empresa">
        <img src="img/team.png" id="team" onclick="activarEmpresa()" class="img-responsive center-block" alt="Responsive Image"><br/>
        <button type="submit" onclick="activarEmpresa()" class = "btn btn-danger" role = "button">Empresa</button><br /><br />
      </div>
    </div>

    <div class="row center-block" id="datos" name="datos">
      <div class="col-md-3 col-md-offset-3 datosP" id="columna1" name="columna1">
        Nombre:</br><input type="text" name="nombre" id="nombre" disabled required></input></br></br>
        Apellido:</br><input type="text" name="apellido" id="apellido" disabled required></input></br></br>
        Nombre de Empresa:</br><input type="text" name="nombreEmpresa" id="nombreEmpresa" disabled required></input></br></br>
        Nombre de Usuario:</br><input type="text" name="nombreUsuario" id="nombreUsuario" disabled required></input></br></br>
        Contraseña:</br><input type="password" name="contrasenia" id="contrasenia" disabled required></input></br></br>
        Reintroducir Contraseña:<input type="password" name="contrasenia2" id="contrasenia2"disabled required></input></br></br>
        Carne:</br><input type="text" name="carne" id="carne"disabled required></input></br></br>
        Teléfono:</br><input type="text" name="telefono" id="telefono"disabled required></input></br></br>
        Correo Electrónio:<input type="email" name="correo" id="correo"disabled required></input></br></br>
        Horas de Atención:<input type="text" name="horasAtencion" id="horasAtencion"disabled required></input></br></br>

        <div class="form-group">
          <label for="listaPais">País de Recidencia</label>
          <select class="form-control" name="listaPais" id="listaPais" disabled required>
            <option>Selecciones una país...</option>
            <option>Costa Rica</option>
            <option>Estados Unidos</option>
            <option>México</option>
            <option>Honduras</option>
            <option>Guatemala</option>
          </select>
        </div>

        <div class="form-group">
          <label for="listaU">Universidad</label>
          <select class="form-control" name="listaU" id="listaU" disabled required>
            <option>Selecciones una universidad...</option>
            <option>TEC</option>
            <option>UNA</option>
            <option>UCR</option>
            <option>UNED</option>
            <option>UTN</option>

          </select>
        </div>

        <div class="form-group">
          <label for="listaU">Repositorio</label>
          <select class="form-control" name="listaRepo" id="listaRepo" disabled required>
            <option>Selecciones un repositorio...</option>
            <option>Google Drive</option>
            <option>Dropbox</option>
          </select>
        </div>
      </div>

      <div class="col-md-3" id="columna2">
        Link a hoja de vida: <input type="text" name="hoja" id="hoja" disabled></input></br></br>
        Sitio Web de la Empresa: <input type="text" name="webEmpresa" id="webEmpresa" disabled required></input></br></br>
        Selecciones imagen de perfil: <input id="foto" name="foto" name="foto" type="file" role="button" class="filestyle" multiple class="file-loading" disabled required></br></br>
        <img src="img/avatar.png" id="fotoPerfil" class="img-responsive img-thumbnail center-block" alt="Responsive Image"><br/>
        <div class="well" style="max-height: 300px;overflow: auto;">
        	Lista de Tecnologías:<ul class="list-group checked-list-box">
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

    <div class="finalPagina" disabled>
      <ul class="list-group checked-list-box" disabled>
        <li class="list-group-item" name="condiciones" onclick="check()" disabled>Acepto términos y condiciones</li>
      </ul>
      <button type="submit" onclick="cancelar()" class = "btn btn-danger" role = "button">Cancelar</button>
      <button type="submit" onclick="registrar()"id="botonContinuar"class = "btn btn-danger" name="botonContinuar" role = "button" disabled>Continuar</button><br /><br />
      <br /><br /><br /><br /><br /><br /><br /><br />

    </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="js/register.js"></s  cript>
  <script src="js/bootstrap-filestyle.min.js"> </script>

</body>
</html>
