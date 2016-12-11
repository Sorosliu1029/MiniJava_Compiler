package validation;

import antlr_gen.MiniJavaBaseListener;
import antlr_gen.MiniJavaParser;
import compiler_utils.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class DefPhase extends MiniJavaBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

    public void enterGoal(MiniJavaParser.GoalContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitGoal(MiniJavaParser.GoalContext ctx) {
//        System.out.println(globals);
    }

    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String methodName = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);

        FunctionSymbol function = new FunctionSymbol(methodName, type, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
//        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterMethodBlock(MiniJavaParser.MethodBlockContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitMethodBlock(MiniJavaParser.MethodBlockContext ctx) {
//        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitFormalParameter(MiniJavaParser.FormalParameterContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    public void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    void defineVar(MiniJavaParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }
}
