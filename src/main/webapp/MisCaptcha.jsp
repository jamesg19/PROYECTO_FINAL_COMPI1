<%-- 
    Document   : MisCaptcha
    Created on : May 3, 2021, 1:58:09 AM
    Author     : James Gramajo 
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Untitled</title>
        <link rel="stylesheet" href="Resources/lista/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="Resources/lista/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="Resources/lista/css/Ludens---1-Index-Table-with-Search--Sort-Filters-1.css">
        <link rel="stylesheet" href="Resources/lista/css/styles.css">
    </head>
    <body>

        <%
            ArrayList<String> listaJSP = new ArrayList<>();
            try {
                listaJSP = (ArrayList<String>) request.getAttribute("LISTA");
            } catch (Exception e) {
                listaJSP = null;
            }
        %>
        <%@ include file = "/nav.jsp" %>
        <h1 align="center" >Mis captcha</h1>

        <div class="container-fluid">
            <div class="card" id="TableSorterCard">
                <div class="card-header py-3">
                    <div class="row table-topper align-items-center">
                        <div class="col-12 col-sm-5 col-md-6 text-start" style="margin: 0px;padding: 5px 15px;">
                            <p class="text-primary m-0 fw-bold"  >Captchas Generados</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div class="table-responsive">
                            <table class="table table-striped table tablesorter" id="ipi-table">
                                <tr style="background-color:#9CA5A6;" >
                                        <td align="center" >Nombre</td>
                                        <td align="center" >Link</td>
                                        <td align="center" >Modificacadores</td>
                                    </tr>
                                <thead class="thead-dark">
                                </thead>
                                <tbody class="text-center">
                                    <%
                                        try {
                                            if (!listaJSP.isEmpty()) {
                                                for (int i = 0; i < listaJSP.size(); i++) { %>
                                    <tr>
                                        <td><%=listaJSP.get(i)%></td>
                                        <td>http://localhost/FInalCompi1/CaptchaPage/<%=listaJSP.get(i)%></td>
                                        <td class="text-center">
                                            <a class="btn btn-primary" role="button" href="http://localhost/FInalCompi1/CaptchaPage/<%=listaJSP.get(i)%>" style="margin: 2px;">
                                                <i class="far fa-eye"></i>
                                            </a>
                                            <a class="btn btn-success" role="button" style="background: rgb(11,171,56);margin: 2px;">
                                                <i class="fas fa-pencil-alt"></i></a>
                                                <form action="MisCaptchaDELETE" method="POST" > 
                                                    <input type="text" class="form-control" id="fichero" name="fichero" value="<%=listaJSP.get(i)%>" style="display: none;" >
                                            
                                                <button   type="submit" class="btn btn-danger">Eliminar</button>
                                                <i class="fas fa-trash"></i>
                                           
                                                    </form>
                                        </td>
                                    </tr>
                                    <% }
                                    } else { %>
                                    <td> -----</td>
                                <td> No tienes captchas</td>
                                <td> -----</td>

                                    <% }
                                        } catch (Exception e) {

                                        }%>

                                        
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="Resources/lista/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.2/js/jquery.tablesorter.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.2/js/widgets/widget-filter.min.js"></script>
        <script src="Resources/lista/js/Ludens---1-Index-Table-with-Search--Sort-Filters-1.js"></script>



    </body>
</html>
