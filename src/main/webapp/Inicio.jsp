<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8"/>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="Resources/JSS/area.css">
        <meta charset="UTF-8"/>
        

    </head>
    <script src="Resources/JSS/file.js"></script>
    <body bgcolor="#BAF4F6"   enctype="multipart/form-data" >
                <%            
            String areas = "Escribe tu codigo aqui... ";
            String info="Informacion del Analizador...";
            try{
            areas = (String) request.getAttribute("AREA");
            } catch(Exception e){
                areas="Escribe tu codigo ";
            }
            try{
            info = (String) request.getAttribute("INFO");
            } catch(Exception e){
                areas="Escribe tu codigo ";
            }
            //<link rel="stylesheet" href="Resources/JSS/area.css">    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        %>
        <form action="Gestor" method="POST" >

        

        <div ALIGN="CENTER" ><h2 ALIGN="CENTER" > Generador de Captcha </h2></div>
        <script>

            function Compilar() {
                var editor = document.getElementById('area');
                var code = document.getElementById('code');
                code.value = editor.value;
            };
        </script>
        <div align="center" >
            <textarea  id="area"  name="area" rows="20" cols="220"><%=areas%></textarea>
        </div>
        <div class="row" align="center" >
            <div class="col" ></div>       
            <div class="col" >

                <input  type="file"  id="file" name="file">
                <label class="custom-file-label" for="file">Busca un archivo</label>

                <script>
                    function handleFileSelect(evt) {
                        //file es el id del boton fichero
                        const input = document.getElementById('file');
                        //area es el id del text area donde se va a escribir
                        const editor = document.getElementById('area');
                        //const code = document.getElementById('code');
                        if (input.files.length > 0) {
                            readFile(input.files[0]);
                        }
                        function readFile(file) {
                            const reader = new FileReader();
                            reader.onload = function () {
                                editor.value = reader.result;
                                //editor.value='aaaaaa';
                            },
                            reader.readAsText(file);
                        }
                    }
                    document.getElementById('file').addEventListener('change', handleFileSelect, false);
                    //code.value = document.getElementById('area');
                </script>

            </div>
            <div class="col" align="left" >
                <button align="left" type="button" onclick="limpiar()" class="btn btn-info">Limpiar</button>
                <button align="right"  type="submit"  class="btn btn-info">Compilar</button>
            </div>


        </div>

        <br>
        <div  align="center" >
            <textarea align="center" id="info" height="10" weight="10"   id="info" name="info" cols="160"  rows="20" disabled ><%=info%></textarea>
        </div>


</form>
    </body>
</html>
