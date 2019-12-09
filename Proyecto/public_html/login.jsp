<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html lang="en">
<head>
<bean:message key="boot.inicio" />
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<style>
  .bd-placeholder-img {
    font-size: 1.125rem;
    text-anchor: middle;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
  }

  @media (min-width: 768px) {
    .bd-placeholder-img-lg {
      font-size: 3.5rem;
    }
  }
</style>
<link href="css/signin.css" rel="stylesheet" type="text/css">
<title>Bienvenido al GrandSlam
</title>
</head>
<body class="text-center">
  <html:form action="/login" styleClass="form-signin">
    <img class="mb-4" src="https://upload.wikimedia.org/wikipedia/commons/3/3d/UCBlogo.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Bienvenido al Grand Slam</h1>
    <html:errors />
    <div class="input-group">
      <div class="input-group-prepend">
        <span class="input-group-text"><bean:message key="usuario.prompt" /></span>      
      </div>
      <html:text property="usuario" styleClass="form-control"/>
      
    </div>
    <br>
    <div class="input-group">
      <div class="input-group-prepend">
        <span class="input-group-text"><bean:message key="contraseña.prompt" /></span>      
      </div>
      <html:password property="contraseña" styleClass="form-control"/>
    </div>
    <br>
    <html:submit value="Ingresar" styleClass="btn btn-lg btn-primary btn-block" />
  </html:form>
<bean:message key="boot.script" />
</body>
</html>
