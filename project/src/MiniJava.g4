grammar MiniJava;

//start rule: goal
goal: mainClass (classDeclaration)* ;

mainClass: 'class' ID '{'
                'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{'
                    (statement)*
                '}'
            '}' ;

classDeclaration: 'class' ID ('extends' ID)? '{'
                        (varDeclaration)*
                        (methodDeclaration)*
                    '}';

varDeclaration: type ID ';' ;

methodDeclaration: 'public' type ID '(' (type ID (',' type ID)* )? ')' '{'
                        (varDeclaration)*
                        (statement)*
                        'return' expression ';'
                    '}' ;

type: 'int' '[' ']'
     | 'boolean'
     | 'int'
     | ID
     ;

statement: '{' (statement)* '}'
          | 'if' '(' expression ')'
                statement
            'else'
                statement
          | 'while' '(' expression ')'
                statement
          | 'System.out.println' '(' expression ')' ';'
          | ID '=' expression ';'
          | ID '[' expression ']' '=' expression ';'
          | varDeclaration
          ;

expression: expression ('&&' | '<' | '+' | '-' | '*' ) expression
           | expression '[' expression ']'
           | expression '.' 'length'
           | expression '.' ID '(' (expression (',' expression)* )? ')'
           | INT
           | 'true'
           | 'false'
           | ID
           | 'this'
           | 'new' 'int' '[' expression ']'
           | 'new' ID '(' ')'
           | '!' expression
           | '(' expression ')'
           ;

ID: [a-zA-Z_]+[a-zA-Z0-9_]*
    // invalid identifier
    | [0-9]+[a-zA-Z0-9_]*[a-zA-Z]+            {System.err.println("Identifier cannot start with number: " + getText());}
    | [a-zA-Z_\-]+[a-zA-Z0-9_\-]+             {System.err.println("Identifier cannot contain '-': " + getText());}
    ;

INT: [0-9]+ ;

COMMENT: '//' .*? ('\r')? '\n' -> skip ;

WS: [ \t\r\n]+ -> skip ;

