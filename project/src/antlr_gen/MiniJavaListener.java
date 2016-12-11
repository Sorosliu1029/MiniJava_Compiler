// Generated from MiniJava.g4 by ANTLR 4.5.3
package antlr_gen;

import recognition_exceptions.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(MiniJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(MiniJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(MiniJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(MiniJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void enterMethodBlock(MiniJavaParser.MethodBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void exitMethodBlock(MiniJavaParser.MethodBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MiniJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MiniJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(MiniJavaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(MiniJavaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallLessParenteses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallLessParenteses(MiniJavaParser.CallLessParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallLessParenteses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallLessParenteses(MiniJavaParser.CallLessParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpMissLeft}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOpMissLeft(MiniJavaParser.BinOpMissLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpMissLeft}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOpMissLeft(MiniJavaParser.BinOpMissLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(MiniJavaParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(MiniJavaParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(MiniJavaParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(MiniJavaParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceClass}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceClass(MiniJavaParser.InstanceClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceClass}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceClass(MiniJavaParser.InstanceClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(MiniJavaParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(MiniJavaParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(MiniJavaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(MiniJavaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(MiniJavaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(MiniJavaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceArray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceArray(MiniJavaParser.InstanceArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceArray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceArray(MiniJavaParser.InstanceArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code This}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code This}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(MiniJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(MiniJavaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(MiniJavaParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(MiniJavaParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpMissRight}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOpMissRight(MiniJavaParser.BinOpMissRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpMissRight}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOpMissRight(MiniJavaParser.BinOpMissRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MiniJavaParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MiniJavaParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMoreParetheses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallMoreParetheses(MiniJavaParser.CallMoreParethesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMoreParetheses}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallMoreParetheses(MiniJavaParser.CallMoreParethesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptAccess}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptAccess(MiniJavaParser.SubscriptAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptAccess}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptAccess(MiniJavaParser.SubscriptAccessContext ctx);
}