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
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <ul class="navbar-nav">
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
  </nav>

</html:form>
<body>
hola Mundo
<bean:message key="boot.script" />
</body>
</html>
