grammar Language;

start
:
	'hello' 'world'
;

NOTA: 'nota';
PAUSA: 'pausa';
SECUENCIA: 'secuencia';
REPRODUCIR: 'reproducir';
IGUAL: '=';
PARENTESIS_IZQ: '(';
PARENTESIS_DER: ')';
CORCHETE_IZQ: '[';
CORCHETE_DER: ']';
COMA: ',';
PUNTO_Y_COMA: ';';
PUNTO: '.';

TONO: 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
OCTAVA: [0-9]+;
DURACION: [0-9]+('.'[0-9]+)?'s';
WS: [ \t\r\n]+ -> skip;
