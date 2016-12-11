package validation;

import antlr_gen.MiniJavaBaseListener;
import antlr_gen.MiniJavaParser;
import compiler_utils.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class RefPhase extends MiniJavaBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }

    public void enterGoal(MiniJavaParser.GoalContext ctx) {
        currentScope = globals;
    }

    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterMethodBlock(MiniJavaParser.MethodBlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitMethodBlock(MiniJavaParser.MethodBlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitId(MiniJavaParser.IdContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "No Such Variable: " + name);
        }
        if (var instanceof FunctionSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), "Not A Variable: " + name);
        }
    }

    public void exitStatAssign(MiniJavaParser.StatAssignContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "No Such Variable: " + name);
        }
        if (var instanceof FunctionSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), "Not A Variable: " + name);
        }
    }

    public void exitStatArray(MiniJavaParser.StatArrayContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "No Such Variable: " + name);
        }
        if (var instanceof FunctionSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), "Not A Variable: " + name);
        }
    }

    public void exitCall(MiniJavaParser.CallContext ctx){
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if (meth==null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "No Such Function: " + funcName);
        }
        if (meth instanceof VariableSymbol) {
            CheckSymbols.error(ctx.ID().getSymbol(), "Not A Function: " + funcName);
        }
    }
}
