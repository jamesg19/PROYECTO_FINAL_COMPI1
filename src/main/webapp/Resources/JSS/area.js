/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function createTextAreaWithLines(id) {
        // Create a textarea with Line Numbers, ~80 chars red margin, etc.
        var ta = document.getElementById(id);
        if ( !!ta ) {
            var el = document.createElement('div');
            ta.style.height = (ta.innerHTML.split("\n").length + 1) * 31 + "px";
            var string = '';
            for (var no=1 ; no < ta.innerHTML.split("\n").length + 1 ; no++) {
                if (string.length > 0) {
                    string += "\n"
                };
                string += "<a href='#L" + no + "' title='Line " + no + "' onclick='this.scrollIntoView()'><b>" + no + "</b></a><br>";
            };
            el.className          = 'source_code_lines';
            el.disabled           = 'disabled';
            el.style.height       = (ta.offsetHeight - 3) + "px";
            el.style.width        = "50px";
            el.style.position     = "absolute";
            el.style.overflow     = 'hidden';
            el.style.textAlign    = 'right';
            el.style.paddingRight = '0.1em';
            el.innerHTML          = string;
            el.style.zIndex       = 0;
            ta.style.zIndex       = 1;
            ta.style.position     = "relative";
            ta.parentNode.insertBefore(el, ta.nextSibling);
            setLine();
            ta.focus();
            ta.onkeydown   = function() { setLine() };
            ta.onmousedown = function() { setLine() };
            ta.onscroll    = function() { setLine() };
            ta.onblur      = function() { setLine() };
            ta.onfocus     = function() { setLine() };
            ta.onmouseover = function() { setLine() };
            ta.onmouseup   = function() { setLine() };
            function setLine() {
                el.scrollTop  =  ta.scrollTop;
                el.style.top  = (ta.offsetTop) + "px";
                el.style.left = (ta.offsetLeft - 55) + "px";
            };
        };
    };
createTextAreaWithLines("source_code");