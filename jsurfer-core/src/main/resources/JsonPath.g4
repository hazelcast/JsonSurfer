grammar JsonPath;

@header {
package org.jsfr.json.compiler;
}

path: syntaxMode? '$' relativePath* EOF;
syntaxMode: 'lax' | 'LAX' | 'strict' | 'STRICT';
relativePath: searchChild|search|childNode|array|childrenNode|anyChild|any;
searchChild: '..' KEY array?;
search: '..' ;
anyChild: '.*' ;
any: '*' ;
ANY_INDEX: '[*]' ;
index: ('[' NUM ']') | ('.' NUM);
indexes: OPEN_SQ_BRACKET NUM (TO NUM)? ( COMMA NUM (TO NUM)? ) * CLOSE_SQ_BRACKET ;
OPEN_SQ_BRACKET: '[';
CLOSE_SQ_BRACKET: ']';
TO: 'to';
COMMA: ',';
slicing: '[' NUM? COLON NUM? ']';
filter: '[?(' filterExpr ')]';
COLON : ':';
childNode: '.' (KEY | QUOTED_STRING) array?;
array: index | indexes | slicing | filter | ANY_INDEX;
childrenNode: '[' QUOTED_STRING ( ',' QUOTED_STRING )* ']' ;
filterExpr : NegationOperator '(' filterExpr ')'
           | filterExpr AndOperator filterExpr
           | filterExpr OrOperator filterExpr
           | filterEqualNum
           | filterNEqualNum
           | filterEqualStr
           | filterNEqualStr
           | filterMatchRegex
           | filterEqualBool
           | filterNEqualBool
           | filterGtNum
           | filterGeNum
           | filterLtNum
           | filterLeNum
           | filterExist
           ;
filterExist:  '@' relativePath*;
filterGtNum:  '@' relativePath* '>' NUM;
filterGeNum:  '@' relativePath* '>=' NUM;
filterLtNum:  '@' relativePath* '<' NUM;
filterLeNum:  '@' relativePath* '<=' NUM;
filterEqualNum: '@' relativePath* '==' NUM;
filterNEqualNum: '@' relativePath* NE NUM;
filterEqualBool: '@' relativePath* '==' BOOL;
filterNEqualBool: '@' relativePath* NE BOOL;
filterEqualStr: '@' relativePath* '==' QUOTED_STRING;
filterNEqualStr: '@' relativePath* NE QUOTED_STRING;
filterMatchRegex: '@' relativePath* '=~' REGEX;
//exprArrayIdx: '@.length-' NUM;
NegationOperator: '!';
AndOperator: '&&';
OrOperator: '||';
NUM
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
QUOTED_STRING : ('\'' ( ~('\''|'\\') | ('\\' .) )* '\'') | ('"' ( ~('"'|'\\') | ('\\' .) )* '"');
REGEX : '/' ( ~('/'|'\\') | ('\\' .) )* '/' [idmsuxU]*;
BOOL: 'true'|'false';
NE: '<>'|'!=';
KEY :  (ESC | ~(["\\] | '.' | '*' | '[' | ']' | '(' | ')' | ',' | ':'| '=' | '@' | '?' | '&' | '|' | '>' | '<' | '\''| '!' | [ \t\n\r]))+  ;

fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

WS  :   [ \t\n\r]+ -> skip ;
