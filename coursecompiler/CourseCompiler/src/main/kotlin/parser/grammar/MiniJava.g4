grammar MiniJava;

program: classdecl+;

//class identifier{...}
classdecl: 'class' Identifier OpenCurlyBracket (constuctorDecl|fieldDecl|methodDecl)* ClosedCurlyBracket;
constuctorDecl: AccessModifier? Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
//public static void main(string[] args) {...}
methodDecl: MainMethodDecl block | AccessModifier? (type | Void) Identifier OpenRoundBracket parameterList? ClosedRoundBracket block;
fieldDecl: AccessModifier? type Identifier Semicolon;
//int param1, string param2,...
parameterList: parameter(Comma parameter)*;
//int param1
parameter: type Identifier;

argumentList: expression? | expression (Comma expression)*?;
//property, object.a, 3+1, a = 3
expression: subExpression | binaryExpr;

//subExpression to dissolve left-recusion
subExpression: This | Identifier | instVar  | value | stmtExpr | notExpr | OpenRoundBracket expression ClosedRoundBracket;

methodCall: receiver? receivingMethod* Identifier OpenRoundBracket argumentList ClosedRoundBracket;
//int a, {...}, while(a > 10){...}, for(i=0;i<10;i++){...}, if(...){...} else if{...} else{...}
statement: returnStmt Semicolon | localVarDecl Semicolon | block | whileStmt | forStmt | ifElseStmt | stmtExpr Semicolon;
//a = expr, new Object(), method(param1)
stmtExpr: assign | newDecl | methodCall | crementExpr;

notExpr: Not expression;

crementExpr: incExpr | decExpr;

incExpr: preIncExpr | sufIncExpr;

preIncExpr: '++' assignableExpr;
sufIncExpr: assignableExpr '++';

decExpr: preDecExpr | sufDecExpr;

preDecExpr: '--' assignableExpr;
sufDecExpr: assignableExpr '--';

assignableExpr: Identifier | instVar;

instVar: This Dot Identifier | (This Dot)? (Identifier Dot)+ Identifier;

binaryExpr: calcExpr | nonCalcExpr;

calcExpr: calcExpr LineOperator dotExpr | dotExpr;
dotExpr: dotExpr DotOperator dotSubExpr | dotSubExpr;
dotSubExpr: IntValue | Identifier | instVar | methodCall | OpenRoundBracket calcExpr ClosedRoundBracket;
nonCalcExpr: subExpression nonCalcOperator expression;

nonCalcOperator: LogicalOpertor | ComparisonOperator;

BooleanValue: 'true'|'false';
NullValue: 'null';

//Statements
returnStmt: Return (expression)?;
localVarDecl: type Identifier (Assign expression)?;
block: OpenCurlyBracket statement* ClosedCurlyBracket;
whileStmt: While OpenRoundBracket expression ClosedRoundBracket block;
forStmt: For OpenRoundBracket (stmtExpr | localVarDecl) Semicolon (expression) Semicolon (stmtExpr) ClosedRoundBracket statement;
ifElseStmt: ifStmt elseStmt?;
ifStmt: If OpenRoundBracket expression ClosedRoundBracket statement;
elseStmt: Else statement;
assign: assignableExpr Assign expression;
newDecl: New Identifier OpenRoundBracket argumentList ClosedRoundBracket;
receiver: ((This | instVar | newDecl | Identifier) Dot);
receivingMethod: Identifier OpenRoundBracket argumentList ClosedRoundBracket Dot; //reciever?
type: Int | Boolean  | Char | Identifier;
value: IntValue | BooleanValue | StringValue | CharValue | NullValue;

//Access modifier
AccessModifier: 'public' | 'private' | 'protected';
MainMethodDecl: 'public static void main(String[] args)';

//Types
Void: 'void';
Boolean: 'boolean';
Char: 'char';
Int: 'int';

//Operators
DotOperator: Mult | Div | Modulo;
LineOperator: Plus | Minus;
ComparisonOperator: Greater | Less | GreaterEqual | LessEqual | Equal | NotEqual;
LogicalOpertor: And | Or;

Assign: '=';
Plus: '+';
Minus: '-';
Mult: '*';
Modulo: '%';
Div: '/';
Greater: '>';
Less: '<';
GreaterEqual: '>=';
LessEqual: '<=';
Equal: '==';
NotEqual: '!=';
Not: '!';
And: '&&';
Or: '||';

//Symbols
Dot: '.';
OpenRoundBracket: '(';
ClosedRoundBracket: ')';
OpenCurlyBracket: '{';
ClosedCurlyBracket: '}';
Semicolon: ';';
Comma: ',';

//Keywords
Class: 'class';
This: 'this';
While: 'while';
If: 'if';
Else: 'else';
For: 'for';
Return: 'return';
New: 'new';

//Identifier
fragment Alpabetic : [a-zA-Z];
fragment Numeric: [0-9];
fragment ValidIdentSymbols : Alpabetic|Numeric|'$'|'_';
Identifier: Alpabetic ValidIdentSymbols*;

//Values
CharValue: '\''~[\r\n]?'\'';
StringValue: '"'~[\r\n]*'"';
IntValue: Minus? Numeric+;

//To be Ignored
WS: ([ \t\r\n]+) -> skip;
InlineComment:'//' ~[\r\n]* -> skip;
MultilineComment: '/*' .*? '*/' -> skip;
