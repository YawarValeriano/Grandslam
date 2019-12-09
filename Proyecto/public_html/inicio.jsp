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
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Grand Slam</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="#">Categorias <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Paises</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Modalidades</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Equipos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">por vErse</a>
      </li>
    </ul>
  </div>
</nav>
<body>
hola Mundo
<bean:message key="boot.script" />
</body>
</html>
