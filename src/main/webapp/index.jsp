<!DOCTYPE html>

<html>

<head>
	<title>Line numbering using &lt;textarea&gt;</title>
	<style>
		.rownr {overflow-y: hidden; background-color: rgb(105,105,105); color: white; text-align: right; vertical-align:top; z-index: 0}
		.txt {width: 95%; overflow-x: scroll; background: transparent; z-index: 0}
	</style>
</head>

<body onload="initialize()" onresize="onresize_sub()">
	<h1>Line numbering using &lt;textarea&gt;</h1>
	<div>
		<textarea class="rownr" rows="20" cols="3" value="1" readonly></textarea>
		<span>
			<textarea id="area"  name="area" class="txt" rows="20" cols="150" nowrap="nowrap" wrap="off"
			autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false"
			onclick="selectionchanged(this)" onkeyup="keyup(this,event)" oninput="input_changed(this)" onscroll="scroll_changed(this)"></textarea><br/><br/>
			<label>Posicion del Cursor: </label><input id="sel_in" style="border-style:none" readonly>
		</span>
	</div>
</body>

<SCRIPT Language="javascript">

	var cntline;
	
	function keyup(obj, e)
	{
		if(e.keyCode >= 33 && e.keyCode <= 40) // arrows ; home ; end ; page up/down
			selectionchanged(obj, e.keyCode);
	}
	
	function selectionchanged(obj)
	{
		var substr = obj.value.substring(0,obj.selectionStart).split('\n');
		var row = substr.length;
		var col = substr[substr.length-1].length;
		var tmpstr = '(' + row.toString() + ',' + col.toString() + ')';
		// if selection spans over 
		if(obj.selectionStart != obj.selectionEnd)
		{
			substr = obj.value.substring(obj.selectionStart, obj.selectionEnd).split('\n');
			row += substr.length - 1;
			col = substr[substr.length-1].length;
			tmpstr += ' - (' + row.toString() + ',' + col.toString() + ')';
		}
		obj.parentElement.getElementsByTagName('input')[0].value = tmpstr;
	}
	
	function input_changed(obj_txt)
	{
		obj_rownr = obj_txt.parentElement.parentElement.getElementsByTagName('textarea')[0];
		cntline = count_lines(obj_txt.value);
		if(cntline == 0) cntline = 1;
		tmp_arr = obj_rownr.value.split('\n');
		cntline_old = parseInt(tmp_arr[tmp_arr.length - 1], 10);
		// if there was a change in line count
		if(cntline != cntline_old)
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
		scrollsync(obj_txt,obj_rownr);
	}
	
	function scrollsync(obj1, obj2)
	{
		// scroll text in object id1 the same as object id2
		obj2.scrollTop = obj1.scrollTop;
	}
	
	function populate_rownr(obj, cntline)
	{
		tmpstr = '';
		for(i = 1; i <= cntline; i++)
		{
			tmpstr = tmpstr + i.toString() + '\n';
		}
		obj.value = tmpstr;
	}
	
	function count_lines(txt)
	{
		if(txt == '')
		{
			return 1;
		}
		return txt.split('\n').length + 1;
	}
	
</SCRIPT>

</html>