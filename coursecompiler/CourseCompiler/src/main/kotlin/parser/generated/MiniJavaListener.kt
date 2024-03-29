package parser.generated

import org.antlr.v4.runtime.tree.ParseTreeListener
import parser.generated.MiniJavaParser.*
interface MiniJavaListener : ParseTreeListener {
    fun enterProgram(ctx: ProgramContext?)
    fun exitProgram(ctx: ProgramContext?)
    fun enterClassdecl(ctx: ClassdeclContext?)
    fun exitClassdecl(ctx: ClassdeclContext?)
    fun enterConstuctorDecl(ctx: ConstuctorDeclContext?)
    fun exitConstuctorDecl(ctx: ConstuctorDeclContext?)
    fun enterMethodDecl(ctx: MethodDeclContext?)
    fun exitMethodDecl(ctx: MethodDeclContext?)
    fun enterFieldDecl(ctx: FieldDeclContext?)
    fun exitFieldDecl(ctx: FieldDeclContext?)
    fun enterParameterList(ctx: ParameterListContext?)
    fun exitParameterList(ctx: ParameterListContext?)
    fun enterParameter(ctx: MiniJavaParser.ParameterContext?)
    fun exitParameter(ctx: MiniJavaParser.ParameterContext?)
    fun enterArgumentList(ctx: ArgumentListContext?)
    fun exitArgumentList(ctx: ArgumentListContext?)
    fun enterExpression(ctx: MiniJavaParser.ExpressionContext?)
    fun exitExpression(ctx: MiniJavaParser.ExpressionContext?)
    fun enterSubExpression(ctx: SubExpressionContext?)
    fun exitSubExpression(ctx: SubExpressionContext?)
    fun enterMethodCall(ctx: MethodCallContext?)
    fun exitMethodCall(ctx: MethodCallContext?)
    fun enterStatement(ctx: StatementContext?)
    fun exitStatement(ctx: StatementContext?)
    fun enterStmtExpr(ctx: StmtExprContext?)
    fun exitStmtExpr(ctx: StmtExprContext?)
    fun enterNotExpr(ctx: NotExprContext?)
    fun exitNotExpr(ctx: NotExprContext?)
    fun enterCrementExpr(ctx: CrementExprContext?)
    fun exitCrementExpr(ctx: CrementExprContext?)
    fun enterIncExpr(ctx: IncExprContext?)
    fun exitIncExpr(ctx: IncExprContext?)
    fun enterPreIncExpr(ctx: PreIncExprContext?)
    fun exitPreIncExpr(ctx: PreIncExprContext?)
    fun enterSufIncExpr(ctx: SufIncExprContext?)
    fun exitSufIncExpr(ctx: SufIncExprContext?)
    fun enterDecExpr(ctx: DecExprContext?)
    fun exitDecExpr(ctx: DecExprContext?)
    fun enterPreDecExpr(ctx: PreDecExprContext?)
    fun exitPreDecExpr(ctx: PreDecExprContext?)
    fun enterSufDecExpr(ctx: SufDecExprContext?)
    fun exitSufDecExpr(ctx: SufDecExprContext?)
    fun enterAssignableExpr(ctx: AssignableExprContext?)
    fun exitAssignableExpr(ctx: AssignableExprContext?)
    fun enterInstVar(ctx: InstVarContext?)
    fun exitInstVar(ctx: InstVarContext?)
    fun enterBinaryExpr(ctx: BinaryExprContext?)
    fun exitBinaryExpr(ctx: BinaryExprContext?)
    fun enterCalcExpr(ctx: CalcExprContext?)
    fun exitCalcExpr(ctx: CalcExprContext?)
    fun enterDotExpr(ctx: DotExprContext?)
    fun exitDotExpr(ctx: DotExprContext?)
    fun enterDotSubExpr(ctx: DotSubExprContext?)
    fun exitDotSubExpr(ctx: DotSubExprContext?)
    fun enterNonCalcExpr(ctx: NonCalcExprContext?)
    fun exitNonCalcExpr(ctx: NonCalcExprContext?)
    fun enterNonCalcOperator(ctx: NonCalcOperatorContext?)
    fun exitNonCalcOperator(ctx: NonCalcOperatorContext?)
    fun enterReturnStmt(ctx: ReturnStmtContext?)
    fun exitReturnStmt(ctx: ReturnStmtContext?)
    fun enterLocalVarDecl(ctx: LocalVarDeclContext?)
    fun exitLocalVarDecl(ctx: LocalVarDeclContext?)
    fun enterBlock(ctx: BlockContext?)
    fun exitBlock(ctx: BlockContext?)
    fun enterWhileStmt(ctx: WhileStmtContext?)
    fun exitWhileStmt(ctx: WhileStmtContext?)
    fun enterForStmt(ctx: ForStmtContext?)
    fun exitForStmt(ctx: ForStmtContext?)
    fun enterIfElseStmt(ctx: IfElseStmtContext?)
    fun exitIfElseStmt(ctx: IfElseStmtContext?)
    fun enterIfStmt(ctx: IfStmtContext?)
    fun exitIfStmt(ctx: IfStmtContext?)
    fun enterElseStmt(ctx: ElseStmtContext?)
    fun exitElseStmt(ctx: ElseStmtContext?)
    fun enterAssign(ctx: AssignContext?)
    fun exitAssign(ctx: AssignContext?)
    fun enterNewDecl(ctx: NewDeclContext?)
    fun exitNewDecl(ctx: NewDeclContext?)
    fun enterReceiver(ctx: ReceiverContext?)
    fun exitReceiver(ctx: ReceiverContext?)
    fun enterReceivingMethod(ctx: ReceivingMethodContext?)
    fun exitReceivingMethod(ctx: ReceivingMethodContext?)
    fun enterType(ctx: TypeContext?)
    fun exitType(ctx: TypeContext?)
    fun enterValue(ctx: ValueContext?)
    fun exitValue(ctx: ValueContext?)
}