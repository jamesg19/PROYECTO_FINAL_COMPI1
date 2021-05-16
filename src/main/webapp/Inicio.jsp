<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8"/>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <style>
            .rownr {overflow-y: hidden; background-color: rgb(105,105,105); color: white; text-align: right; vertical-align:top; z-index: 0}
            .txt {width: 75%; overflow-x: scroll; background: transparent; z-index: 0}
        </style>
        <meta charset="UTF-8"/>
        <title>Generador Captcha</title>

    </head>
    <script src="Resources/JSS/file.js"></script>
    <body bgcolor="#BAF4F6"   enctype="multipart/form-data" onload="initialize()" onresize="onresize_sub()" >
        <%
            String areas = "Escribe tu codigo aqui... ";
            String info = "Informacion del Analizador...";
            try {
                areas = (String) request.getAttribute("AREA");
            } catch (Exception e) {
                areas = "Escribe tu codigo ";
            }
            try {
                info = (String) request.getAttribute("INFO");
            } catch (Exception e) {
                areas = "Escribe tu codigo ";
            }
            //<link rel="stylesheet" href="Resources/JSS/area.css">    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        %>
        <%@ include file = "/nav.jsp" %>
        <form action="Gestor" method="POST" >



            <div ALIGN="CENTER" ><h2 ALIGN="CENTER" > Generador de Captcha </h2></div>
            <script>

                function Compilar() {
                    var editor = document.getElementById('area');
                    var code = document.getElementById('code');
                    code.value = editor.value;
                }
                ;
            </script>


            <div align="center" >
                <textarea class="rownr" rows="20" cols="3" value="1" readonly></textarea>
                <span>
                    <textarea id="area"  name="area" class="txt" rows="20" cols="110" nowrap="nowrap" wrap="off"
                              autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false"
                        onclick="selectionchanged(this)" onkeyup="keyup(this, event)" oninput="input_changed(this)" onscroll="scroll_changed(this)"><%=areas%></textarea>
                        <br/><br/>
                    <label>Posicion del Cursor: </label>
                    <input id="sel_in" style="border-style:none" readonly>
                </span>
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
                <textarea align="center" id="info" height="10" weight="10"   id="info" name="info" cols="160"  rows="15" disabled ><%=info%></textarea>
            </div>

            <br>
            <br>
            <br>
            <br>
        </form>
    </body>
    <SCRIPT Language="javascript">

        var cntline;

        function keyup(obj, e)
        {
            if (e.keyCode >= 33 && e.keyCode <= 40) // arrows ; home ; end ; page up/down
                selectionchanged(obj, e.keyCode);
        }

        function selectionchanged(obj)
        {
            var substr = obj.value.substring(0, obj.selectionStart).split('\n');
            var row = substr.length;
            var col = substr[substr.length - 1].length;
            var tmpstr = '(' + row.toString() + ',' + col.toString() + ')';
            // if selection spans over 
            if (obj.selectionStart != obj.selectionEnd)
            {
                substr = obj.value.substring(obj.selectionStart, obj.selectionEnd).split('\n');
                row += substr.length - 1;
                col = substr[substr.length - 1].length;
                tmpstr += ' - (' + row.toString() + ',' + col.toString() + ')';
            }
            obj.parentElement.getElementsByTagName('input')[0].value = tmpstr;
        }

        function input_changed(obj_txt)
        {
            obj_rownr = obj_txt.parentElement.parentElement.getElementsByTagName('textarea')[0];
            cntline = count_lines(obj_txt.value);
            if (cntline == 0)
                cntline = 1;
            tmp_arr = obj_rownr.value.split('\n');
            cntline_old = parseInt(tmp_arr[tmp_arr.length - 1], 10);
            // if there was a change in line count
            if (cntline != cntline_old)
            {
                obj_rownr.cols = cntline.toString().length; // new width of txt_rownr
                populate_rownr(obj_rownr, cntline);
                scroll_changed(obj_txt);
            }
            selectionchanged(obj_txt);
        }

        function scroll_changed(obj_txt)
        {
            obj_rownr = obj_txt.parentElement.parentElement.getElementsByTagName('textarea')[0];
            scrollsync(obj_txt, obj_rownr);
        }

        function scrollsync(obj1, obj2)
        {
            // scroll text in object id1 the same as object id2
            obj2.scrollTop = obj1.scrollTop;
        }

        function populate_rownr(obj, cntline)
        {
            tmpstr = '';
            for (i = 1; i <= cntline; i++)
            {
                tmpstr = tmpstr + i.toString() + '\n';
            }
            obj.value = tmpstr;
        }

        function count_lines(txt)
        {
            if (txt == '')
            {
                return 1;
            }
            return txt.split('\n').length + 1;
        }

    </SCRIPT>
</html>
