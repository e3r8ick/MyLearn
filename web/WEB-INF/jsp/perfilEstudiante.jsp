<%-- 
    Document   : PerfilEstudiante
    Created on : Nov 25, 2016, 8:25:25 PM
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

  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/perfil.css">

</head>

<body>

  <div class="container">

    <div class="media page-header">

      <div class="media page-header row">
        <div class="col-md-2" id="logo">
          <a href="perfilEstudiante.html" class="pull-left">
             <img src="img/logo2.png" class="media-object" alt="imagen">
          </a>
        </div>
        <div class="col-md-2">
          <h6>Cursos</h6>
          <div class="progress">
            <div class="progress-bar progress-bar-success" style="width: 50%">
             <span class="sr-only">50% completado (éxito)</span>
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
              <span class="sr-only">50% completado (éxito)</span>
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

      <div class="botones">

        <a href="#buscarProyecto" class="btn btn-danger" data-toggle="modal">Buscar Proyecto</a>

        <div class="modal fade" tabindex="-1" role="dialog" id="buscarProyecto">
          <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Busqueda de Proyectos</h4>
              </div>
              <div class="modal-body">

                <div class="row busqueda">
                  <div class="col-md-4" id="busqueda">
                    <div id="custom-search-input">
                      <div class="input-group col-md-12">
                        <input type="text" class="form-control input-lg" placeholder="Buscar" />
                        <span class="input-group-btn">
                           <button class="btn btn-info btn-lg" type="button">
                               <i class="glyphicon glyphicon-search"></i>
                           </button>
                       </span>
                     </div>
                   </div></br >
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

                  <div class="col-md-8" id="resultados">
                    <div class="row resultados">
                      <h3>Resultados</h3>
                      <div class="well" style="max-height: 500px;overflow: auto;">
                        <ul class="list-group">
                          <div class="row">
                            <div class="col-md-6">
                              <li class="list-group-item">Cras justo odio</li>
                              <li class="list-group-item" data-checked="true">Dapibus ac facilisis in</li>
                              <li class="list-group-item">Morbi leo risus</li>
                              <li class="list-group-item">Porta ac consectetur ac</li>
                              <li class="list-group-item">Vestibulum at eros</li>
                              <li class="list-group-item">Cras justo odio</li>
                            </div>
                            <div class="col-md-6">
                              <li class="list-group-item">Dapibus ac facilisis in</li>
                              <li class="list-group-item">Morbi leo risus</li>
                              <li class="list-group-item">Porta ac consectetur ac</li>
                              <li class="list-group-item">Vestibulum at eros</li>
                            </div>
                          </div>
                        </ul>
                      </div>
                    </div>
                  </div>
                </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              </div>
              </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
          </div><!-- /.modal -->
        </div>

        <a href="#buscarCurso" class="btn btn-danger" data-toggle="modal">Ver Cursos Disponibles</a>

        <div class="modal fade" tabindex="-1" role="dialog" id="buscarCurso">
          <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Cursos Disponibles</h4>
              </div>
              <div class="modal-body">
                <div class="row">
                  <div class="well" style="max-height: 300px;overflow: auto;">

                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" id="busqueda">
                  	  <ul class="list-group">
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

                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" id="busqueda">
                  	  <ul class="list-group">
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

                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" id="busqueda">
                  	  <ul class="list-group">
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

                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12" id="busqueda">
                  	  <ul class="list-group">
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
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        <a href="#proponerProyecto" class="btn btn-danger" data-toggle="modal">Proponer Proyecto</a>

        <div class="modal fade" tabindex="-1" role="dialog" id="proponerProyecto">
          <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Formulario de Propuesta de Proyecto</h4>
              </div>
              <div class="modal-body">
                <p>One fine body&hellip;</p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

      </div>
    </div>

    <div class="row center-block" id="info">
      <div class="col-md-3" id="estudiante">
        <img src="img/man.png" class="media-object center-block" alt="imagen"></br >
        <div class="perfil">
          <h3>Erick Cordero Rojas</h3>
          <h5>Carne: 201228433</h5>
          <h5>Universidad: TEC</h5>
          <h5>País: Costa Rica</h5>
          <h5>Correo: eguicoro2@hotmail.com</h5>
          <h5>Telefono: 87022315</h5></br >
          <h5><a href="#">Link a Hoja de Vida</a></h5></br >
          <div class="well" style="max-height: 200px;overflow: auto;">
            	Lista de Tecnologías:<ul class="list-group">
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
          <ul class="list-group">
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
          <ul class="list-group">
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

      <div class="col-md-3" id="notificaciones">
        <h3>Notificaciones</h3></br >
        <div class="well" style="max-height: 500px;overflow: auto;">
          <ul class="list-group">
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
  <script type="text/javascript" src="js/register.js"></script>


</body>
</html>
