package Analizadoress;

import static Analizadoress.sym.*;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
//%cupsym "sym"
%unicode
%full
%line
%char
%column
%public
%state COMENTARIO 
%state TEXTON
%state COMENTARIO_BLOQUE
%state TODO
%state H1STATE, H1COMILLA, H1_TEXTO
%state SPAMSTATE, SPAMCOMILLA, SPAMTEXTO
%state CPSTATE, CPCOMILLA, CPTEXTO
%state INPUTSTATE,  INPUTCOMILLA, INPUTTEXTO
%state TEXT_AREA_STATE,  TEXT_AREA_COMILLA, TEXT_AREA_TEXTO


//OPERADORES ARITMETICOS
suma= [+]
resta= [-]
multiplicacion=[*]
division=[\/]

//letras

//https://es.stackoverflow.com/questions/117556/clase-de-caracteres-para-cualquier-letra-incluyendo-todo-tipo-de-acentos
todo=[ #-;?-}À-ÿ¿\u00f1\u00d1]+
todo2=[ #-;?-}À-ÿ¿\u00f1\u00d1]+
 

arroba=[@]
porcentaje=[%]
dosPuntos=[:]
puntoComa=[;]
eli=[&]
almuadilla=[#]
questionC=[?]
questionA=[¿]


//espacio=[ |\r|\t|\n]+
rr=[\r]
tt=[\t]
nn=[\n]
es=[ ]

espacio=({rr}|{tt}|{nn}|{es})+
dolar=[$]
guionBajo=[_]
iniID= ({dolar}|{resta}|{guionBajo})
//()-_=+?:;,.!#$%&

CGCIC= [Cc][{guionBajo}][Gg][Cc][Ii][Cc]
C_HEAD=[Cc]{guionBajo}[Hh][Ee][Aa][Dd]
C_TITLE=[Cc]{guionBajo}[Tt][Ii][Tt][Ll][Ee]
C_LINK=[Cc]{guionBajo}[Ll][Ii][Nn][Kk]
C_BODY= [Cc]{guionBajo}[Bb][Oo][Dd][Yy]
C_SPAM= [Cc]{guionBajo}[Ss][Pp][Aa][Mm]
C_INPUT= [Cc]{guionBajo}[Ii][Nn][Pp][Uu][Tt]
C_TEXTAREA= [Cc]{guionBajo}[Tt][Ee][Xx][Tt][Aa][Rr][Ee][Aa]
C_SELECT= [Cc]{guionBajo}[Ss][Ee][Ll][Ee][Cc][Tt]
C_OPTION= [Cc]{guionBajo}[Oo][Pp][Tt][Ii][Oo][Nn]
C_DIV= [Cc]{guionBajo}[Dd][Ii][Vv]
C_IMG= [Cc]{guionBajo}[Ii][Mm][Gg]
C_BR= [Cc]{guionBajo}[Bb][Rr]
C_BUTTON= [Cc]{guionBajo}[Bb][Uu][Tt][Tt][Oo][Nn]
C_H1= [Cc]{guionBajo}[Hh][11]
C_P= [Cc]{guionBajo}[Pp]
//PARAMETROS DE LOS COMPONENTES
href= [h][r][e][f]
//BACKGROUND
background= [b][a][c][k][g][r][o][u][n][d]
black= [b][l][a][c][k]
olive= [o][l][i][v][e]
teal= [t][e][a][l]
red= [r][e][d]
blue= [b][l][u][e]
maroon= [m][a][r][o][o][n]
navy= [n][a][v][y]
gray= [g][r][a][y]
lime= [l][i][m][e]
fuchsia= [f][u][c][h][s][i][a]
green= [g][r][e][e][n]
white= [w][h][i][t][e]
purple= [p][u][r][p][l][e]
silver= [s][i][l][v][e][r]
yellow = [y][e][l][l][o][w]
aqua= [a][q][u][a]

color= [c][o][l][o][r]
font_size= [f][o][n][t][-][s][i][z][e]
//FONT-FAMILY
font_family= [f][o][n][t][-][f][a][m][i][l][y]
Courier= [C][o][u][r][i][e][r]
Verdana= [V][e][r][d][a][n][a]
Arial= [A][r][i][a][l]
Geneva= [G][e][n][e][v][a]
sans_serif= [s][a][n][s][-][s][e][r][i][f]

//TEXT-ALIGN
text_align= [t][e][x][t][-][a][l][i][g][n]
left= [l][e][f][t]
righ= [r][i][g][h][t]
center= [c][e][n][t][e][r]
justify= [j][u][s][t][i][f][y]

//TYPE 
type= [t][y][p][e]
text= [t][e][x][t]
number= [n][u][m][b][e][r]
radio= [r][a][d][i][o]
checkbox= [c][h][e][c][k][b][o][x]
type_form=({text}|{number}|{radio}|{checkbox})

id= [i][d]
name= [n][a][m][e]
cols= [c][o][l][s]
rows= [r][o][w][s]

class= [c][l][a][s][s]
row= [r][o][w]
column= [c][o][l][u][m][n]
src= [s][r][c]
width= [w][i][d][t][h]
height= [h][e][i][g][h][t]
alt= [a][l][t]
onclick= [o][n][c][l][i][c][k]

C_SCRIPTING= [Cc]{guionBajo}[Ss][Cc][Rr][Ii][Pp][Tt][Ii][Nn][Gg]

//PROCESOS
PROCESS_= [P][R][O][C][E][S][S]{guionBajo}
ON_LOAD= [O][N]{guionBajo}[L][O][A][D]
HexaLiteral= [#][A-Fa-f0-9]{6}

//TIPOS DE DATOS
integer= [i][n][t][e][g][e][r]
decimal= [d][e][c][i][m][a][l]
boolean= [b][o][o][l][e][a][n]
true= [t][r][u][e]
false= [f][a][l][s][e]
char= [c][h][a][r]
string= [s][t][r][i][n][g]

//OPERADORES RELACIONALES
igualdad=[=]{2}
diferenciacion=[!][=]
menor_que=[<]
menor_igual=[<][=]
mayor_que=[>]
mayor_igual=[>][=]
igual=[=]

//OPERADORES LOGICOS
or=[|][|]
and={eli}{eli}
not= [!]
comentario= [!][!]
abre_comentario_bloque=[<][!][-][-]
cierra_comentario_bloque=[-][-][>]
// FUNCIONES ESPECIALES
ASC= [A][S][C]
DESC= [D][E][S][C]
LETPAR_NUM= [L][E][T][P][A][R]{guionBajo}[N][U][M]
LETIMPAR_NUM= [L][E][T][I][M][P][A][R]{guionBajo}[N][U][M]
REVERSE= [R][E][V][E][R][S][E]
CARACTER_ALEATORIO= [C][A][R][A][C][T][E][R]{guionBajo}[A][L][E][A][T][O][R][I][O]
NUM_ALEATORIO= [N][U][M]{guionBajo}[A][L][E][A][T][O][R][I][O]
ALERT_INFO= [A][L][E][R][T]{guionBajo}[I][N][F][O]
EXIT= [E][X][I][T]
MODO=[g][l][o][b][a][l]
getElemenById= [g][e][t][E][l][e][m][e][n][B][y][I][d]

//BLOQUES DE INSTRUCCIONES  
INIT= [I][N][I][T]
END= [E][N][D]
IF= [I][F]
ELSE= [E][L][S][E]
//pendiente el ELSE IF 
THEN= [T][H][E][N]
REPEAT= [R][E][P][E][A][T]
HUNTIL= [H][U][N][T][I][L]
INSERT= [I][N][S][E][R][T]
WHILE= [W][H][I][L][E]
THENWHILE= [T][H][E][N][W][H][I][L][E]

//simbolos
ABRE_INIT=[{]{dosPuntos}
CIERRA_INIT={dosPuntos}[}]
PARENTESIS_ABRE=[(]
PARENTESIS_CIERRA=[)]
CORCHETE_ABRE=[\[]
CORCHETE_CIERRE=[\]]
comilla=[\"]
cte_colores=({black}|{olive}|{teal}|{red}|{blue}|{maroon}|{navy}|{gray}|{lime}|{fuchsia}|{green}|{white}|{purple}|{silver}|{yellow}|{aqua})
justificacion_texto=({left}|{righ}|{center}|{justify})
tipos_letra=({Courier}|{Verdana}|{Arial}|{Geneva}|{sans_serif})
Comment= {comentario} [^\r\n]*
CommentA= {abre_comentario_bloque} [^\r\n]*
CommentC= {cierra_comentario_bloque} [^\r\n]*
textoConEspacio= {comilla} [^{CORCHETE_CIERRE}]*
//textoSinEspacio= {comilla}{iniID} [^{CORCHETE_CIERRE}|{es]*
//D=[0-9]|[0-9][.][0-9]
esp=[ ]*
saltoLinea=[\n\r\t]*
letras=[a-zA-ZÀ-ÿ]
numeros=[0-9]+
px=[Pp][Xx]
size=({numeros}{px})
simbolos2=({almuadilla}|{dosPuntos}|{puntoComa}|{porcentaje}|{eli}|{arroba}|{questionC}|{suma}|{resta}|{multiplicacion}|{questionA}|[_])

%{
//private ArrayList<ReporteError> reporteError = new ArrayList<>();



%}
//%eof{
 
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */

 
//%eof}
%%


<YYINITIAL>{

{CGCIC} {return new Symbol(sym.C_GCIC,yyline+1, yycolumn+1, yytext());}
{C_HEAD} {return new Symbol(sym.C_HEAD,yyline+1, yycolumn+1,yytext());}
		//{C_TITLE} {           return new Symbol(sym.C_TITLE,yyline+1, yycolumn+1,yytext());}
		//{C_SPAM} {return new Symbol(sym.C_SPAM,yyline+1, yycolumn+1,yytext());}
		//{C_P} {return new Symbol(sym.C_P,yyline+1, yycolumn+1,yytext());}
		//{C_INPUT} {return new Symbol(sym.C_INPUT,yyline+1, yycolumn+1,yytext());}
		//{C_TEXTAREA} {return new Symbol(sym.C_TEXTAREA,yyline+1, yycolumn+1,yytext());}
		{menor_que}{esp}{C_TITLE}{esp}{mayor_que} { yybegin(TODO); {return new Symbol(sym.TI,yyline+1, yycolumn+1,yytext());}  }
		{menor_que}{esp}{C_H1}{esp} { yybegin(H1STATE); {return new Symbol(sym.ABRE_C_H1,yyline+1, yycolumn+1,yytext());}  }
		{menor_que}{esp}{C_SPAM}{esp} { yybegin(SPAMSTATE); {return new Symbol(sym.ABRE_C_SPAM,yyline+1, yycolumn+1,yytext());}  }
		{menor_que}{esp}{C_P}{esp} { yybegin(CPSTATE); {return new Symbol(sym.ABRE_C_P,yyline+1, yycolumn+1,yytext());}  }
		{menor_que}{esp}{C_INPUT}{esp} { yybegin(INPUTSTATE); {return new Symbol(sym.ABRE_INPUT,yyline+1, yycolumn+1,yytext());}  }
		{menor_que}{esp}{C_TEXTAREA}{esp} { yybegin(TEXT_AREA_STATE); {return new Symbol(sym.ABRE_TEXT_AREA,yyline+1, yycolumn+1,yytext());}  }

		
{C_LINK} {return new Symbol(sym.C_LINK,yyline+1, yycolumn+1,yytext());}
{C_BODY} {return new Symbol(sym.C_BODY,yyline+1, yycolumn+1,yytext());}

{C_SELECT} {return new Symbol(sym.C_SELECT,yyline+1, yycolumn+1,yytext());}
{C_OPTION} {return new Symbol(sym.C_OPTION,yyline+1, yycolumn+1,yytext());}
{C_DIV} {return new Symbol(sym.C_DIV,yyline+1, yycolumn+1,yytext());}
{C_IMG} {return new Symbol(sym.C_IMG,yyline+1, yycolumn+1,yytext());}
{C_BR} {return new Symbol(sym.C_BR,yyline+1, yycolumn+1,yytext());}
{C_BUTTON} {return new Symbol(sym.C_BUTTON,yyline+1, yycolumn+1,yytext());}
{C_H1} {return new Symbol(sym.C_H1,yyline+1, yycolumn+1,yytext());}

{href} {return new Symbol(sym.HREF,yyline+1, yycolumn+1,yytext());}
{background} {return new Symbol(sym.BACKGROUND,yyline+1, yycolumn+1,yytext());}

{color} {return new Symbol(sym.COLOR,yyline+1, yycolumn+1,yytext());}
{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
/*TYPE
{type} {return new Symbol(sym.TYPE,yyline+1, yycolumn+1,yytext());}
{text} {return new Symbol(sym.TEXT,yyline+1, yycolumn+1,yytext());}
{number} {return new Symbol(sym.NUMBER,yyline+1, yycolumn+1,yytext());}
{radio} {return new Symbol(sym.RADIO,yyline+1, yycolumn+1,yytext());}
{checkbox} {return new Symbol(sym.CHECKBOX,yyline+1, yycolumn+1,yytext());}
*/
{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
{name} {return new Symbol(sym.NAME,yyline+1, yycolumn+1,yytext());}
{cols} {return new Symbol(sym.COLS,yyline+1, yycolumn+1,yytext());}
{rows} {return new Symbol(sym.ROWS,yyline+1, yycolumn+1,yytext());}
{class} {return new Symbol(sym.CLASS,yyline+1, yycolumn+1,yytext());}
{row} {return new Symbol(sym.ROW,yyline+1, yycolumn+1,yytext());}
{column} {return new Symbol(sym.COLUMN,yyline+1, yycolumn+1,yytext());}
{src} {return new Symbol(sym.SRC,yyline+1, yycolumn+1,yytext());}
{width} {return new Symbol(sym.WIDTH,yyline+1, yycolumn+1,yytext());}
{height} {return new Symbol(sym.HEIGHT,yyline+1, yycolumn+1,yytext());}
{alt} {return new Symbol(sym.ALT,yyline+1, yycolumn+1,yytext());}
{onclick} {return new Symbol(sym.ONCLICK,yyline+1, yycolumn+1,yytext());}
{C_SCRIPTING} {return new Symbol(sym.C_SCRIPTING,yyline+1, yycolumn+1,yytext());}
{PROCESS_} {return new Symbol(sym.PROCESS_,yyline+1, yycolumn+1,yytext());}
{ON_LOAD} {return new Symbol(sym.ON_LOAD,yyline+1, yycolumn+1,yytext());}

{integer} {return new Symbol(sym.INTEGER,yyline+1, yycolumn+1,yytext());}
{decimal} {return new Symbol(sym.DECIMAL,yyline+1, yycolumn+1,yytext());}
{boolean} {return new Symbol(sym.BOOLEAN,yyline+1, yycolumn+1,yytext());}
{true} {return new Symbol(sym.TRUE,yyline+1, yycolumn+1,yytext());}
{false} {return new Symbol(sym.FALSE,yyline+1, yycolumn+1,yytext());}
{char} {return new Symbol(sym.CHAR,yyline+1, yycolumn+1,yytext());}
{string} {return new Symbol(sym.STRING,yyline+1, yycolumn+1,yytext());}
{igualdad} {return new Symbol(sym.IGUALDAD,yyline+1, yycolumn+1,yytext());}
{diferenciacion} {return new Symbol(sym.DIFERENCIACION,yyline+1, yycolumn+1,yytext());}
{menor_que} {return new Symbol(sym.MENOR_QUE,yyline+1, yycolumn+1,yytext());}
{menor_igual} {return new Symbol(sym.MENOR_IGUAL,yyline+1, yycolumn+1,yytext());}
{mayor_que} {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());}
{mayor_igual} {return new Symbol(sym.MAYOR_IGUAL,yyline+1, yycolumn+1,yytext());}
{or} {return new Symbol(sym.OR,yyline+1, yycolumn+1,yytext());}
{and} {return new Symbol(sym.AND,yyline+1, yycolumn+1,yytext());}
{not} {return new Symbol(sym.NOT,yyline+1, yycolumn+1,yytext());}
{ASC} {return new Symbol(sym.ASC,yyline+1, yycolumn+1,yytext());}
{DESC} {return new Symbol(sym.DESC,yyline+1, yycolumn+1,yytext());}
{LETPAR_NUM} {return new Symbol(sym.LETPAR_NUM,yyline+1, yycolumn+1,yytext());}
{LETIMPAR_NUM} {return new Symbol(sym.LETIMPAR_NUM,yyline+1, yycolumn+1,yytext());}
{REVERSE} {return new Symbol(sym.REVERSE,yyline+1, yycolumn+1,yytext());}
{CARACTER_ALEATORIO} {return new Symbol(sym.CARACTER_ALEATORIO,yyline+1, yycolumn+1,yytext());}
{NUM_ALEATORIO} {return new Symbol(sym.NUM_ALEATORIO,yyline+1, yycolumn+1,yytext());}
{ALERT_INFO} {return new Symbol(sym.ALERT_INFO,yyline+1, yycolumn+1,yytext());}
{EXIT} {return new Symbol(sym.EXIT,yyline+1, yycolumn+1,yytext());}
{arroba}{MODO} {return new Symbol(sym.MODO,yyline+1, yycolumn+1,yytext());}
{getElemenById} {return new Symbol(sym.GETELEMENBYID,yyline+1, yycolumn+1,yytext());}
{INIT} {return new Symbol(sym.INIT,yyline+1, yycolumn+1,yytext());}
{END} {return new Symbol(sym.END,yyline+1, yycolumn+1,yytext());}
{IF} {return new Symbol(sym.IF,yyline+1, yycolumn+1,yytext());}
{ELSE} {return new Symbol(sym.ELSE,yyline+1, yycolumn+1,yytext());}
{THEN} {return new Symbol(sym.THEN,yyline+1, yycolumn+1,yytext());}
{REPEAT} {return new Symbol(sym.REPEAT,yyline+1, yycolumn+1,yytext());}
{HUNTIL} {return new Symbol(sym.HUNTIL,yyline+1, yycolumn+1,yytext());}
{INSERT} {return new Symbol(sym.INSERT,yyline+1, yycolumn+1,yytext());}
{WHILE} {return new Symbol(sym.WHILE,yyline+1, yycolumn+1,yytext());}
{THENWHILE} {return new Symbol(sym.THENWHILE,yyline+1, yycolumn+1,yytext());}

{ABRE_INIT} {return new Symbol(sym.ABRE_INIT,yyline+1, yycolumn+1,yytext());}
{CIERRA_INIT} {return new Symbol(sym.CIERRA_INIT,yyline+1, yycolumn+1,yytext());}
{PARENTESIS_ABRE} {return new Symbol(sym.PARENTESIS_ABRE,yyline+1, yycolumn+1,yytext());}
{PARENTESIS_CIERRA} {return new Symbol(sym.PARENTESIS_CIERRA,yyline+1, yycolumn+1,yytext());}
{CORCHETE_ABRE} {return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext());}
{CORCHETE_CIERRE} {return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext());}
{igual} {return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext());}
//{comilla} {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}


//operadores ARITMETICOS
{suma} {return new Symbol(sym.SUMA,yyline+1, yycolumn+1,yytext());}
{resta} {return new Symbol(sym.RESTA,yyline+1, yycolumn+1,yytext());}
{multiplicacion} {return new Symbol(sym.MULTIPLICACION,yyline+1, yycolumn+1,yytext());}
{division} {return new Symbol(sym.DIVISION,yyline+1, yycolumn+1,yytext());}

{espacio} { }


//manda al estado del comentario
{comentario} { yybegin(COMENTARIO);}


//ESTADO DE TEXTO CON ESPACIOS
["\""] { yybegin(TEXTON); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }

{abre_comentario_bloque} { yybegin(COMENTARIO_BLOQUE);}


//{textoConEspacio} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
//{textoSinEspacio} { return new Symbol(sym.TEXTO_SIN_ESPACIO,yyline+1, yycolumn+1,yytext()); }

}
//COMENTARIO DE LINEA !! COMENTARIO 
<COMENTARIO> {

	[^"\n"] {   }
	"\n" 	{ yybegin(YYINITIAL); /*SOLO IGNORA EL COMENTARIO*/}
}

<COMENTARIO_BLOQUE>{
	
	[^"-->"] {   }
	"-->" { yybegin(YYINITIAL); /*SOLO IGNORA EL COMENTARIO_BLOQUE*/}
	
}
/*TODAS LAS POSIBILIDADES DE TEXTO ENTE COMILLAS " " */
<TEXTON>{
	["\""] { yybegin(YYINITIAL); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }

	{esp}{HexaLiteral}{esp} {return new Symbol(sym.RGB_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{cte_colores}{esp} {return new Symbol(sym.CTE_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
	{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	//COMILLA
}
<TODO>{
	{menor_que}{esp}{division}{esp}{C_TITLE}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.TD,yyline+1, yycolumn+1,yytext()); }
	({todo}|{comilla}+) { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	
}
<H1STATE>{
	["\""] { yybegin(H1COMILLA); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }
	//{mayor_que} { return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext()); }
	{mayor_que} {yybegin(H1_TEXTO); {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());} }
	{CORCHETE_ABRE} { return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext()); }
	{CORCHETE_CIERRE} { return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext()); }
	{igual} { return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext()); }
	{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
	{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
	{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
	{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
	{color} {return new Symbol(sym.COLOR,yyline+1, yycolumn+1,yytext());}
	
	{espacio} { }
	//{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	

}
<H1COMILLA>{
	["\""] { yybegin(H1STATE); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }
	{esp}{HexaLiteral}{esp} {return new Symbol(sym.RGB_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{cte_colores}{esp} {return new Symbol(sym.CTE_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
}
<H1_TEXTO>{
	{menor_que}{esp}{division}{esp}{C_H1}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.CIERRA_C_H1,yyline+1, yycolumn+1,yytext()); }
	
	{todo} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
	{espacio} { }
}

<SPAMSTATE>{
	["\""] { yybegin(SPAMCOMILLA); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }

	//{mayor_que} { return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext()); }
	{mayor_que} {yybegin(SPAMTEXTO); {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());} }
	{CORCHETE_ABRE} { return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext()); }
	{CORCHETE_CIERRE} { return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext()); }
	{igual} { return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext()); }
	{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
	{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
	{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
	{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
	{color} {return new Symbol(sym.COLOR,yyline+1, yycolumn+1,yytext());}
	{espacio} { }
	//{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	

}
<SPAMCOMILLA>{
	["\""] { yybegin(SPAMSTATE); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }
	{esp}{HexaLiteral}{esp} {return new Symbol(sym.RGB_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{cte_colores}{esp} {return new Symbol(sym.CTE_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
}
<SPAMTEXTO>{
	{menor_que}{esp}{division}{esp}{C_SPAM}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.CIERRA_C_SPAM,yyline+1, yycolumn+1,yytext()); }
	
	{todo} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
	{espacio} { }
}


<CPSTATE>{
	["\""] { yybegin(CPCOMILLA); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }

	//{mayor_que} { return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext()); }
	{mayor_que} {yybegin(CPTEXTO); {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());} }
	{CORCHETE_ABRE} { return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext()); }
	{CORCHETE_CIERRE} { return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext()); }
	{igual} { return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext()); }
	{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
	{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
	{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
	{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
	{color} {return new Symbol(sym.COLOR,yyline+1, yycolumn+1,yytext());}
	{espacio} { }
	//{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	

}
<CPCOMILLA>{
	["\""] { yybegin(CPSTATE); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }
	{esp}{HexaLiteral}{esp} {return new Symbol(sym.RGB_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{cte_colores}{esp} {return new Symbol(sym.CTE_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
}
<CPTEXTO>{
	{menor_que}{esp}{division}{esp}{C_P}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.CIERRA_C_P,yyline+1, yycolumn+1,yytext()); }
	
	{todo} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
	{espacio} { }
}

<INPUTSTATE>{
	["\""] { yybegin(INPUTCOMILLA); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }

	//{mayor_que} { return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext()); }
	{mayor_que} {yybegin(INPUTTEXTO); {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());} }
	{CORCHETE_ABRE} { return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext()); }
	{CORCHETE_CIERRE} { return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext()); }
	{igual} { return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext()); }
	{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
	{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
	{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
	{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
	{color} {return new Symbol(sym.COLOR,yyline+1, yycolumn+1,yytext());}
	{type} {return new Symbol(sym.TYPE,yyline+1, yycolumn+1,yytext());}
	{espacio} { }
	//{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	
}
<INPUTCOMILLA>{
	["\""] { yybegin(INPUTSTATE); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }
	{esp}{HexaLiteral}{esp} {return new Symbol(sym.RGB_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{cte_colores}{esp} {return new Symbol(sym.CTE_COLOR,yyline+1, yycolumn+1,yytext());}
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{type_form}{esp} {return new Symbol(sym.TIPOS_DE_INPUT,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
}
<INPUTTEXTO>{
	{menor_que}{esp}{division}{esp}{C_INPUT}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.CIERRA_INPUT,yyline+1, yycolumn+1,yytext()); }
	
	{todo} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
	{espacio} { }
}
//ESTADOS DE TEXT AREA 
<TEXT_AREA_STATE>{
	["\""] { yybegin(TEXT_AREA_COMILLA); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());}  }

	{mayor_que} {yybegin(TEXT_AREA_TEXTO); {return new Symbol(sym.MAYOR_QUE,yyline+1, yycolumn+1,yytext());} }
	{CORCHETE_ABRE} { return new Symbol(sym.CORCHETE_ABRE,yyline+1, yycolumn+1,yytext()); }
	{CORCHETE_CIERRE} { return new Symbol(sym.CORCHETE_CIERRA,yyline+1, yycolumn+1,yytext()); }
	{igual} { return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,yytext()); }
	{font_size} {return new Symbol(sym.FONT_SIZE,yyline+1, yycolumn+1,yytext());}
	{font_family} {return new Symbol(sym.FONT_FAMILY,yyline+1, yycolumn+1,yytext());}
	{text_align} {return new Symbol(sym.TEXT_ALIGN,yyline+1, yycolumn+1,yytext());}
	{id} {return new Symbol(sym.ID,yyline+1, yycolumn+1,yytext());}
	{cols} {return new Symbol(sym.COLS,yyline+1, yycolumn+1,yytext());}
	{rows} {return new Symbol(sym.ROWS,yyline+1, yycolumn+1,yytext());}
	



	{espacio} { }
	//{todo} { { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); } }
	
}
<TEXT_AREA_COMILLA>{
	["\""] { yybegin(TEXT_AREA_STATE); {return new Symbol(sym.COMILLA,yyline+1, yycolumn+1,yytext());} }
	{iniID}({todo2})+ { return new Symbol(sym.TEXTO_ID,yyline+1, yycolumn+1,yytext());  }
	{esp}{tipos_letra}{esp} {return new Symbol(sym.TIPOS_LETRA,yyline+1, yycolumn+1,yytext());}
	{esp}{justificacion_texto}{esp} {return new Symbol(sym.ALINEACION,yyline+1, yycolumn+1,yytext());}
	{esp}{size}{esp} {return new Symbol(sym.SIZE,yyline+1, yycolumn+1,yytext());}
	{numeros} {return new Symbol(sym.NUMERO,yyline+1, yycolumn+1,yytext());}
}
<TEXT_AREA_TEXTO>{
	{menor_que}{esp}{division}{esp}{C_TEXTAREA}{esp}{mayor_que} { yybegin(YYINITIAL); return new Symbol(sym.CIERRA_TEXT_AREA,yyline+1, yycolumn+1,yytext()); }
	
	{todo} { return new Symbol(sym.TEXTO,yyline+1, yycolumn+1,yytext()); }
	{espacio} { }
}





/* Para cualquier otro simbolo no especificado u error lexico devuelve el error */

[^]
{	

	System.out.println("Error tipo lexico "+yytext());
	

}
