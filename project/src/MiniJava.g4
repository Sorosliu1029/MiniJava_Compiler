grammar MiniJava;

@header {
import recognition_exceptions.*;
}
//start rule: goal
goal: packageDeclaration? (importDeclaration)* mainClass (classDeclaration)* ;

packageDeclaration: 'package' ID ';' ;

importDeclaration: 'import' ID ('.' ID)* ('*')? ';' ;

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

methodDeclaration: 'public' type ID '(' formalParameters? ')' methodBlock ;

methodBlock: '{'
            (varDeclaration)*
            (statement)*
            'return' expression ';'
        '}' ;

formalParameters:  formalParameter (',' formalParameter)* ;

formalParameter: type ID ;

type: 'int[]'
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

expression: expression ('&&' | '<' | '+' | '-' | '*' ) expression   #BinOp
           | expression ('&&' | '<' | '+' | '-' | '*' )
                {notifyErrorListeners(this.getCurrentToken(),
                    "Missing right operand",
                    new OperandMissingException(this));}            #BinOpMissRight
           | ('&&' | '<' | '+' | '-' | '*' ) expression
                {notifyErrorListeners(this.getCurrentToken(),
                    "Missing left operand",
                    new OperandMissingException(this));}            #BinOpMissLeft
           | expression '[' expression ']'                          #SubscriptAccess
           | expression '.' 'length'                                #ArrayLength
           | expression '.' ID '(' (expression (',' expression)* )? ')' #Call
            // parenthesis dismatch in function call
           | expression '.' ID '(' (expression (',' expression)* )? ')' ')'
                {notifyErrorListeners(this.getCurrentToken(),
                    "Too many parentheses",
                    new ParenthesisDismatchException(this));}           #CallMoreParetheses
           | expression '.' ID '(' (expression (',' expression)* )?
                {notifyErrorListeners(this.getCurrentToken(),
                    "Missing closing ')'",
                    new ParenthesisDismatchException(this));}           #CallLessParenteses
           | INT                                #Int
           | 'true'                             #True
           | 'false'                            #False
           | ID                                 #Id
           | 'this'                             #This
           | 'new' 'int' '[' expression ']'     #InstanceArray
           | 'new' ID '(' ')'                   #InstanceClass
           | '!' expression                     #Not
           | '(' expression ')'                 #Parentheses
           ;

K_INT_ARRAY: 'int' '[' ']' ;
K_INT: 'int' ;
K_BOOLEAN: 'boolean' ;

ID: LETTER (LETTER|DIGIT|'_')*
    // invalid identifier
    | DIGIT (LETTER|DIGIT|'_')* (LETTER|'_')+
            {System.err.println("[Lexical Error]:\tIdentifier cannot start with number: " + getText());}
    ;
fragment LETTER  : [a-zA-Z] ;
fragment DIGIT   : [0-9] ;

INT: '-'? [0-9]+ ;

LINECOMMENT: '//' .*? ('\r')? '\n' -> skip;
BLOCKCOMMENT:  '/**' ('\r')? '\n' (' *' .*? ('\r')? '\n')*? ' */' -> skip;

WS: [ \t\r\n]+ -> skip ;

