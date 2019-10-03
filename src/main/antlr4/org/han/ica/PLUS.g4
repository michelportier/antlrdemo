grammar PLUS;

sums: sum EOF;
sum:  sum '+' sum| INT;



INT: [0-9]+;

WS: [ \n\t\r]+ -> skip;