<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <meta charset="utf-8">
        <style>
            /* chrome scrollbars */
            textarea::-webkit-scrollbar 
            {
                width: 16px;
                background-color: #444;
                cursor: pointer;
            }
            textarea::-webkit-scrollbar-track 
            {
                background-color: #333;    
                cursor: pointer;
            }
            textarea::-webkit-scrollbar-corner
            {
                background-color: #484;
                -webkit-box-shadow: inset 0 0 6px rgba(255,255,255,0.3);
            }
            textarea::-webkit-scrollbar-thumb 
            {
                background-color: #444;
                /*outline: 1px solid #666;*/
                -webkit-box-shadow: inset 0 0 6px rgba(255,255,255,0.3);
                cursor: pointer;
            }
        </style>
    </head>
    <script src="Resources/JSS/file.js"></script>
    <body bgcolor="#BAF4F6"  onload="myFunction()" enctype="multipart/form-data" >
        <%            
            String AREA = " ";
            try{
            //AREA = (String) request.getAttribute("AREA");
            } catch(Exception e){
                AREA=" ";
            }
        %>
        

        <div ALIGN="CENTER" ><h2 ALIGN="CENTER" > Generador de Captcha </h2></div>
        <script>

            var TextAreaLineNumbersWithCanvas = function ()
            {
                var div = document.createElement('div');
                var cssTable = 'padding:0px 0px 0px 0px!important; margin:0px 0px 0px 0px!important; font-size:1px;line-height:0px; width:auto;';
                var cssTd1 = 'border:1px #345 solid; border-right:0px; vertical-align:top; width:1px;';
                var cssTd2 = 'border:1px #345 solid; border-left:0px; vertical-align:top;';
                var cssButton = 'width:120px; height:40px; border:1px solid #333 !important; border-bottom-color: #484!important; color:#ffe; background-color:#222;';
                var cssCanvas = 'border:0px; background-color:#1c1c20; margin-top:0px; padding-top:0px;';
                var cssTextArea = ' width:1200px;'
                        + 'height:390px;'
                        + 'font-size:14px;'
                        + 'font-family:monospace;'
                        + 'line-height:15px;'
                        + 'font-weight:500;'
                        + 'margin: 0px 0px 0px 0px;'
                        + 'padding: 0px 0px 0px 0px;'
                        + 'resize: both;'
                        + 'color:#000000;'
                        + 'border:0px;'
                        + 'background-color:#FFFF;'
                        + 'white-space:nowrap; overflow:auto;'
                        + 'scrollbar-arrow-color: #ee8;'
                        + 'scrollbar-base-color: #444;'
                        + 'scrollbar-track-color: #666;'
                        + 'scrollbar-face-color: #444;'
                        + 'scrollbar-3dlight-color: #444;' /* outer light */
                        + 'scrollbar-highlight-color: #666;' /* inner light */
                        + 'scrollbar-darkshadow-color: #444;' /* outer dark */
                        + 'scrollbar-shadow-color: #222;' /* inner dark */
                        ;
                // LAYOUT (table 2 panels)
                var table = document.createElement('table');
                table.setAttribute('cellspacing', '0');
                table.setAttribute('cellpadding', '0');
                table.setAttribute('style', cssTable);
                var tr = document.createElement('tr');
                var td1 = document.createElement('td');
                td1.setAttribute('style', cssTd1);
                var td2 = document.createElement('td');
                td2.setAttribute('style', cssTd2);

                tr.appendChild(td1);
                tr.appendChild(td2);
                table.appendChild(tr);

                // TEXTAREA
                var ta = this.evalnode = document.createElement('textarea');
                ta.setAttribute('cols', '215');
                ta.setAttribute('id', 'area');
                ta.setAttribute('name', 'area');
                //ta.setAttribute('value', '');
                ta.setAttribute('style', cssTextArea);
                //ta.value = this.S.get('eval') || '';  // get previous executed value ;)

                // TEXTAREA NUMBERS (Canvas)
                var canvas = document.createElement('canvas');
                canvas.width = 80;    // must not set width & height in css !!!
                canvas.height = 500;  // must not set width & height in css !!!
                canvas.setAttribute('style', cssCanvas);
                ta.canvasLines = canvas;
                td1.appendChild(canvas);
                td2.appendChild(ta);
                div.appendChild(table);

                // PAINT LINE NUMBERS
                ta.paintLineNumbers = function ()
                {
                    try
                    {
                        var canvas = this.canvasLines;
                        if (canvas.height != this.clientHeight)
                            canvas.height = this.clientHeight; // on resize
                        var ctx = canvas.getContext("2d");
                        ctx.fillStyle = "#303030";
                        ctx.fillRect(0, 0, 42, this.scrollHeight + 1);
                        ctx.fillStyle = "#808080";
                        ctx.font = "14px monospace"; // NOTICE: must match TextArea font-size(12px) and lineheight(15) !!!
                        var startIndex = Math.floor(this.scrollTop / 15, 0);
                        var endIndex = startIndex + Math.ceil(this.clientHeight / 15, 0);
                        for (var i = startIndex; i < endIndex; i++)
                        {
                            var ph = 10 - this.scrollTop + (i * 15);
                            var text = '' + (1 + i);  // line number
                            ctx.fillText(text, 40 - (text.length * 6), ph);
                        }
                    } catch (e) {
                        alert(e);
                    }
                };
                ta.onscroll = function (ev) {
                    this.paintLineNumbers();
                };
                ta.onmousedown = function (ev) {
                    this.mouseisdown = true;
                };
                ta.onmouseup = function (ev) {
                    this.mouseisdown = false;
                    this.paintLineNumbers();
                };
                ta.onmousemove = function (ev) {
                    if (this.mouseisdown)
                        this.paintLineNumbers();
                };
                document.body.appendChild(div);
                // make sure it's painted
                ta.paintLineNumbers();
                return ta;
            };
            var ta = TextAreaLineNumbersWithCanvas();

            function Compilar() {

                const editor = document.getElementById('area');
                const code = document.getElementById('code');

                code.value = editor.value;

            };
            
            
            function myFunction(){
            const text=document.getElementById('area');
            const infoo=document.getElementById('info');
            text.value="<%=AREA%>";

            };
            
            

        </script>

        <div class="row" >
            <div class="col" ></div>       
            <div class="col" >

                <input type="file"  id="file" name="file">
                <label class="custom-file-label" for="file">Busca un archivo</label>

                <script>
                    function handleFileSelect(evt) {
                        const input = document.getElementById('file');
                        const editor = document.getElementById('area');
                        const code = document.getElementById('code');
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
            <div class="col" align="center" >
                <button align="center" type="button" onclick="limpiar()" class="btn btn-info">Limpiar</button>
            </div>
            <div align="left" class="col" >
                <form action="Gestor" method="POST" >
                    <input type="text"  id="code" name="code"  hidden="">
                    
                    <button align="left"  onclick="Compilar()"  class="btn btn-info">Compilar</button>
                </form>
            </div>

        </div>
//aqui empieza
        <br>
        <div class="row" align="center" >
            <textarea align="center" height="10" weight="10" class="form-control" id="info" name="info" cols="10" value="<%=AREA%>"  rows="3"></textarea>
        </div>
        <input type="text"  id="PP" name="PP" value=""  hidden="">


    </body>
</html>
