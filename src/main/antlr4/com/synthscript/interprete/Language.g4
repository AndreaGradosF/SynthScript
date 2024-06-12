grammar Language;

programa
    : declaracion*
    ;

declaracion
    : declaracion_de_nota
    | declaracion_de_pausa
    | declaracion_de_secuencia
    | declaracion_de_reproduccion
    ;

declaracion_de_nota
    : NOTA ID IGUAL NOTA PARENTESIS_IZQ tono COMA duracion COMA octava PARENTESIS_DER PUNTO_Y_COMA
    ;

declaracion_de_pausa
    : PAUSA ID IGUAL PAUSA PARENTESIS_IZQ duracion PARENTESIS_DER PUNTO_Y_COMA
    ;

declaracion_de_secuencia
    : SECUENCIA ID IGUAL CORCHETE_IZQ elemento_secuencia* CORCHETE_DER PUNTO_Y_COMA
    ;

elemento_secuencia
    : ID COMA?
    ;

declaracion_de_reproduccion
    : REPRODUCIR PARENTESIS_IZQ ID PARENTESIS_DER PUNTO_Y_COMA
    ;

tono
    : TONO
    ;

duracion
    : DURACION
    ;

octava
    : OCTAVA
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
