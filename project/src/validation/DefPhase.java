package validation;

import antlr_gen.MiniJavaBaseListener;
import antlr_gen.MiniJavaParser;
import compiler_utils.GlobalScope;
import compiler_utils.Scope;
import compiler_utils.Symbol;
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
        System.out.println(globals);
    }

    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String methodName = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        System.out.println(ctx.type().getText());
        System.out.println(typeTokenType);
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        System.out.println("" + methodName + type);
    }
}
