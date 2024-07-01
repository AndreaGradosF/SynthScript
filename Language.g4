grammar Language;

programa: 'programa' bloque 'finprog' ;

bloque: (declaracion)* ;

declaracion
    : declaracion_de_nota        {System.out.println("¡Reconocí una declaración de nota!"); }
    | declaracion_de_pausa       {System.out.println("¡Reconocí una declaración de pausa!"); }
    | declaracion_de_secuencia   {System.out.println("¡Reconocí una declaración de secuencia!"); }
    | declaracion_de_reproduccion {System.out.println("¡Reconocí una declaración de reproduccion!"); }
    | declaracion_de_bucle       {System.out.println("¡Reconocí una declaración de bucle!"); }
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

declaracion_de_bucle
    : BUCLE PARENTESIS_IZQ NUMERO PARENTESIS_DER bloque 'finbucle'
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
BUCLE: 'bucle';
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
NUMERO: [0-9]+;
OCTAVA: [0-8]+'o';
DURACION: [0-9]+('.'[0-9]+)?'s';

COMENTARIO: '//' ~[\r\n]* -> skip;
BLOQUE_COMENTARIO: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
