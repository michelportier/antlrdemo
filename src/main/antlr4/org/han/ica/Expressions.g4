grammar Expressions;

expressions: expression EOF;
expression:   expression MUL expression
            | expression DIVIDE expression
            | expression PLUS expression
            | expression MIN expression
            | INT;

MUL: '*';
DIVIDE: '/';
PLUS: '+';
MIN: '-';

INT: [0-9]+;

WS: [ \n\t\r]+ -> skip;