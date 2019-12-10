<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<!DOCTYPE html>
<html lang="en">
<head>
<bean:message key="boot.inicio" />
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Inicio
</title>
</head>
<html:form action="/torneo">
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="#">Grand Slam</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Torneos
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <html:submit property="opcionNavBar" value="Ver Torneos" styleClass="dropdown-item"/>
            <html:submit property="opcionNavBar" value="Nuevo Torneo" styleClass="dropdown-item"/>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Árbitros
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <html:submit property="opcionNavBar" value="Ver Árbitros" styleClass="dropdown-item"/>
            <html:submit property="opcionNavBar" value="Nuevo Árbitro" styleClass="dropdown-item"/>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Equipos
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <html:submit property="opcionNavBar" value="Ver Equipos" styleClass="dropdown-item"/>
            <html:submit property="opcionNavBar" value="Nuevo Equipo" styleClass="dropdown-item"/>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Partidos
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <html:submit property="opcionNavBar" value="Ver Partidos" styleClass="dropdown-item"/>
          </div>
        </li>
      </ul>
      <div class="form-inline my-2 my-lg-0">
        <ul class="navbar-nav">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Bienvenido Admin
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <html:submit property="opcionNavBar" value="Salir" styleClass="dropdown-item" />
            </div>
          </li>
        </ul>
      </div>
    </div>
  </nav>

</html:form>
<body>
<br>
<div class="container">
  <div class="row">
    <div class="col-3"></div>
    <div class="col-6">
      <table class="table table-striped">
        <thead class="thead-dark">
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Lugar</th>
            <th scope="col">Gestión</th>
            <th scope="col">Opciones</th>
          </tr>
        </thead>
        <tbody>
          <logic:iterate id="tablaTorneos" indexId="index" name="torneos" property="tablaTorneos">
            <tr>
              <td><bean:write name="tablaTorneos" property="torneo" /></td>
              <td><bean:write name="tablaTorneos" property="lugar" /></td>
              <td><bean:write name="tablaTorneos" property="gestion" /></td>
              <td>
                <html:submit property="torneo" styleClass="btn btn-info">Ver Partidos</html:submit>
              </td>
            </tr>
          </logic:iterate>
        </tbody>
      </table>
    </div>
  </div>
</div>
<bean:message key="boot.script" />
</body>
</html>
