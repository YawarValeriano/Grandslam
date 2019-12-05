<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html lang="en">
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
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
<title>
Hello World
</title>
</head>
<body class="text-center">
<html:errors />
  <html:form action="/login" styleClass="form-signin">
    <img class="mb-4" src="https://upload.wikimedia.org/wikipedia/commons/3/3d/UCBlogo.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Bienvenido al Grand Slam</h1>
    
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

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
