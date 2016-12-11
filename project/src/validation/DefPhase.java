package validation;

import antlr_gen.MiniJavaBaseListener;
import antlr_gen.MiniJavaParser;
import compiler_utils.GlobalScope;
import compiler_utils.Scope;
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
        String name = ctx.ID(0).getText();
//        System.out.println(ctx.type());
//        int typeTokenType = ctx.type().start.getType();
    }
}
