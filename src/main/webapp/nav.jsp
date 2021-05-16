<%-- 
    Document   : nav
    Created on : May 16, 2021, 1:50:52 AM
    Author     : James Gramajo 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="Resources/nav/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="Resources/nav/css/dh-navbar-inverse.css">
    <link rel="stylesheet" href="Resources/nav/css/styles.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean navbar-inverse navbar-fixed-top">
        <div class="container">
            <div><a class="navbar-brand" style="padding:0px;margin-left:0px;height:78px;" href="#"> <img class="img-fluid" src="Resources/nav/img/expansion.png"></a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button></div>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav ml-auto" style="margin-top:13px;">
                    <li class="nav-item"><a class="nav-link" uk-scroll="offset:50" href="Inicio.jsp">Home </a></li>
                    <li class="nav-item"><a class="nav-link" uk-scroll="offset:100" href="#empresa">Mis Captchas</a></li>
                    <li class="nav-item"><a class="nav-link" uk-scroll="offset:100" href="#areas">Reportes</a></li>
                    <li class="nav-item"><a class="nav-link" uk-scroll="offset:50" href="#diferencial">Compi1 2021 </a></li>
                </ul>
            </div>
        </div>
    </nav>
    <script src="Resources/nav/js/jquery.min.js"></script>
    <script src="Resources/nav/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>
