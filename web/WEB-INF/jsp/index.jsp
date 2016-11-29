
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html >
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width = device-width, initial-scale = 1">

  <title>MyLearn</title>

  <link rel="stylesheet" type="text/css" href="css/bootstrap,css">
  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/favicon.ico" type="image/x-icon"/>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" >

</head>

<body>

  <div class="container">

    <div class="page-header">
      <h1>MyLearn</h1>
    </div>

      
      <form method="post" Class="login-form"  action="ControlValidarUsuario.htm"/>
        <img src="${pageContext.request.contextPath}/img/logo.png" id="logo" class="img-responsive center-block" alt="Responsive Image"><br/>
        <input name="user" id="user" type="text" placeholder="Nombre de Usuario" required/><br /><br />
        <input name="pass" id="pass" type="password" placeholder="Contraseña" required/><br /><br />
        <button type="submit" class = "btn btn-danger" role = "button" >Iniciar sesión</button><br /><br />
        <h1 class="tittle">¿Aún no tiene una cuenta? <a href="ControlMostrarRegistro.htm">Registrese ahora</a></h1><br />
       </form>
  </div>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script
  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>
</html>
