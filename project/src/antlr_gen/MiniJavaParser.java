// Generated from MiniJava.g4 by ANTLR 4.5.3
package antlr_gen;

import recognition_exceptions.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, K_INT_ARRAY=36, K_INT=37, K_BOOLEAN=38, 
		ID=39, INT=40, LINECOMMENT=41, BLOCKCOMMENT=42, WS=43;
	public static final int
		RULE_goal = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_mainClass = 3, RULE_classDeclaration = 4, RULE_varDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_formalParameters = 7, RULE_formalParameter = 8, 
		RULE_type = 9, RULE_statement = 10, RULE_expression = 11;
	public static final String[] ruleNames = {
		"goal", "packageDeclaration", "importDeclaration", "mainClass", "classDeclaration", 
		"varDeclaration", "methodDeclaration", "formalParameters", "formalParameter", 
		"type", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "';'", "'import'", "'.'", "'*'", "'class'", "'{'", 
		"'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", 
		"']'", "')'", "'}'", "'extends'", "'return'", "','", "'if'", "'else'", 
		"'while'", "'System.out.println'", "'='", "'&&'", "'<'", "'+'", "'-'", 
		"'length'", "'true'", "'false'", "'this'", "'new'", "'!'", null, "'int'", 
		"'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"K_INT_ARRAY", "K_INT", "K_BOOLEAN", "ID", "INT", "LINECOMMENT", "BLOCKCOMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(24);
				packageDeclaration();
				}
			}

			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(27);
				importDeclaration();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			mainClass();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(34);
				classDeclaration();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(ID);
			setState(42);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(46);
				match(T__3);
				setState(47);
				match(ID);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(53);
				match(T__4);
				}
			}

			setState(56);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__5);
			setState(59);
			match(ID);
			setState(60);
			match(T__6);
			setState(61);
			match(T__7);
			setState(62);
			match(T__8);
			setState(63);
			match(T__9);
			setState(64);
			match(T__10);
			setState(65);
			match(T__11);
			setState(66);
			match(T__12);
			setState(67);
			match(T__13);
			setState(68);
			match(T__14);
			setState(69);
			match(ID);
			setState(70);
			match(T__15);
			setState(71);
			match(T__6);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << K_INT) | (1L << K_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__16);
			setState(79);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__5);
			setState(82);
			match(ID);
			setState(85);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(83);
				match(T__17);
				setState(84);
				match(ID);
				}
			}

			setState(87);
			match(T__6);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_INT) | (1L << K_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				varDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(94);
				methodDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			setState(104);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			type();
			setState(108);
			match(ID);
			setState(109);
			match(T__11);
			setState(111);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_INT) | (1L << K_BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(110);
				formalParameters();
				}
			}

			setState(113);
			match(T__15);
			setState(114);
			match(T__6);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					varDeclaration();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << K_INT) | (1L << K_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(121);
				statement();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__18);
			setState(128);
			expression(0);
			setState(129);
			match(T__1);
			setState(130);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			formalParameter();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(133);
				match(T__19);
				setState(134);
				formalParameter();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			type();
			setState(141);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(K_INT);
				setState(144);
				match(T__13);
				setState(145);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(K_BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(K_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__6);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << K_INT) | (1L << K_BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(152);
					statement();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__20);
				setState(160);
				match(T__11);
				setState(161);
				expression(0);
				setState(162);
				match(T__15);
				setState(163);
				statement();
				setState(164);
				match(T__21);
				setState(165);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__22);
				setState(168);
				match(T__11);
				setState(169);
				expression(0);
				setState(170);
				match(T__15);
				setState(171);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(T__23);
				setState(174);
				match(T__11);
				setState(175);
				expression(0);
				setState(176);
				match(T__15);
				setState(177);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(ID);
				setState(180);
				match(T__24);
				setState(181);
				expression(0);
				setState(182);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(ID);
				setState(185);
				match(T__13);
				setState(186);
				expression(0);
				setState(187);
				match(T__14);
				setState(188);
				match(T__24);
				setState(189);
				expression(0);
				setState(190);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				varDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(196);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(197);
				expression(15);
				notifyErrorListeners(this.getCurrentToken(),
				                    "Missing left operand",
				                    new OperandMissingException(this));
				}
				break;
			case 2:
				{
				setState(200);
				match(INT);
				}
				break;
			case 3:
				{
				setState(201);
				match(T__30);
				}
				break;
			case 4:
				{
				setState(202);
				match(T__31);
				}
				break;
			case 5:
				{
				setState(203);
				match(ID);
				}
				break;
			case 6:
				{
				setState(204);
				match(T__32);
				}
				break;
			case 7:
				{
				setState(205);
				match(T__33);
				setState(206);
				match(K_INT);
				setState(207);
				match(T__13);
				setState(208);
				expression(0);
				setState(209);
				match(T__14);
				}
				break;
			case 8:
				{
				setState(211);
				match(T__33);
				setState(212);
				match(ID);
				setState(213);
				match(T__11);
				setState(214);
				match(T__15);
				}
				break;
			case 9:
				{
				setState(215);
				match(T__34);
				setState(216);
				expression(2);
				}
				break;
			case 10:
				{
				setState(217);
				match(T__11);
				setState(218);
				expression(0);
				setState(219);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(224);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(225);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(227);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						notifyErrorListeners(this.getCurrentToken(),
						                              "Missing right operand",
						                              new OperandMissingException(this));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(230);
						match(T__13);
						setState(231);
						expression(0);
						setState(232);
						match(T__14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(235);
						match(T__3);
						setState(236);
						match(T__29);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(238);
						match(T__3);
						setState(239);
						match(ID);
						setState(240);
						match(T__11);
						setState(249);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(241);
							expression(0);
							setState(246);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__19) {
								{
								{
								setState(242);
								match(T__19);
								setState(243);
								expression(0);
								}
								}
								setState(248);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(251);
						match(T__15);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(253);
						match(T__3);
						setState(254);
						match(ID);
						setState(255);
						match(T__11);
						setState(264);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(256);
							expression(0);
							setState(261);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__19) {
								{
								{
								setState(257);
								match(T__19);
								setState(258);
								expression(0);
								}
								}
								setState(263);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(266);
						match(T__15);
						setState(267);
						match(T__15);
						notifyErrorListeners(this.getCurrentToken(),
						                              "Too many parentheses",
						                              new ParenthesisDismatchException(this));
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(270);
						match(T__3);
						setState(271);
						match(ID);
						setState(272);
						match(T__11);
						setState(281);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(273);
							expression(0);
							setState(278);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(274);
									match(T__19);
									setState(275);
									expression(0);
									}
									} 
								}
								setState(280);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
							}
							}
							break;
						}
						notifyErrorListeners(this.getCurrentToken(),
						                              "Missing closing ')'",
						                              new ParenthesisDismatchException(this));
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\63\n"+
		"\4\f\4\16\4\66\13\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\7\6b\n\6\f"+
		"\6\16\6e\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\b"+
		"\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\7\f\u009c\n"+
		"\f\f\f\16\f\u009f\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00e0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r\u00fa\13\r\5\r\u00fc"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0106\n\r\f\r\16\r\u0109\13\r"+
		"\5\r\u010b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0117\n\r\f"+
		"\r\16\r\u011a\13\r\5\r\u011c\n\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13\r"+
		"\3\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\7\7\34\37\u0144\2"+
		"\33\3\2\2\2\4*\3\2\2\2\6.\3\2\2\2\b<\3\2\2\2\nS\3\2\2\2\fh\3\2\2\2\16"+
		"l\3\2\2\2\20\u0086\3\2\2\2\22\u008e\3\2\2\2\24\u0097\3\2\2\2\26\u00c3"+
		"\3\2\2\2\30\u00df\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34"+
		" \3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2"+
		"\2!#\3\2\2\2\" \3\2\2\2#\'\5\b\5\2$&\5\n\6\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*+\7\3\2\2+,\7)\2\2,-\7\4\2\2-"+
		"\5\3\2\2\2./\7\5\2\2/\64\7)\2\2\60\61\7\6\2\2\61\63\7)\2\2\62\60\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\679\7\7\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\4\2\2;\7\3\2\2\2<=\7"+
		"\b\2\2=>\7)\2\2>?\7\t\2\2?@\7\n\2\2@A\7\13\2\2AB\7\f\2\2BC\7\r\2\2CD\7"+
		"\16\2\2DE\7\17\2\2EF\7\20\2\2FG\7\21\2\2GH\7)\2\2HI\7\22\2\2IM\7\t\2\2"+
		"JL\5\26\f\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\7\23\2\2QR\7\23\2\2R\t\3\2\2\2ST\7\b\2\2TW\7)\2\2UV\7\24\2\2VX\7"+
		")\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\7\t\2\2Z\\\5\f\7\2[Z\3\2\2\2\\_"+
		"\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\16\b\2a`\3\2\2\2"+
		"be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\23\2\2g\13\3\2"+
		"\2\2hi\5\24\13\2ij\7)\2\2jk\7\4\2\2k\r\3\2\2\2lm\7\n\2\2mn\5\24\13\2n"+
		"o\7)\2\2oq\7\16\2\2pr\5\20\t\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\22\2"+
		"\2tx\7\t\2\2uw\5\f\7\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2"+
		"\2zx\3\2\2\2{}\5\26\f\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083\5"+
		"\30\r\2\u0083\u0084\7\4\2\2\u0084\u0085\7\23\2\2\u0085\17\3\2\2\2\u0086"+
		"\u008b\5\22\n\2\u0087\u0088\7\26\2\2\u0088\u008a\5\22\n\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7)\2"+
		"\2\u0090\23\3\2\2\2\u0091\u0092\7\'\2\2\u0092\u0093\7\20\2\2\u0093\u0098"+
		"\7\21\2\2\u0094\u0098\7(\2\2\u0095\u0098\7\'\2\2\u0096\u0098\7)\2\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\25\3\2\2\2\u0099\u009d\7\t\2\2\u009a\u009c\5\26\f\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00c4\7\23\2\2\u00a1\u00a2\7"+
		"\27\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\22\2\2"+
		"\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\5\26\f\2\u00a8"+
		"\u00c4\3\2\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\5"+
		"\30\r\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00c4\3\2\2\2"+
		"\u00af\u00b0\7\32\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\30\r\2\u00b2"+
		"\u00b3\7\22\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00c4\3\2\2\2\u00b5\u00b6\7"+
		")\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\u00c4\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5\30"+
		"\r\2\u00bd\u00be\7\21\2\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\5\30\r\2\u00c0"+
		"\u00c1\7\4\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\5\f\7\2\u00c3\u0099\3\2"+
		"\2\2\u00c3\u00a1\3\2\2\2\u00c3\u00a9\3\2\2\2\u00c3\u00af\3\2\2\2\u00c3"+
		"\u00b5\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\27\3\2\2"+
		"\2\u00c5\u00c6\b\r\1\2\u00c6\u00c7\t\2\2\2\u00c7\u00c8\5\30\r\21\u00c8"+
		"\u00c9\b\r\1\2\u00c9\u00e0\3\2\2\2\u00ca\u00e0\7*\2\2\u00cb\u00e0\7!\2"+
		"\2\u00cc\u00e0\7\"\2\2\u00cd\u00e0\7)\2\2\u00ce\u00e0\7#\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0\u00d1\7\'\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\5\30\r\2"+
		"\u00d3\u00d4\7\21\2\2\u00d4\u00e0\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6\u00d7"+
		"\7)\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00e0\7\22\2\2\u00d9\u00da\7%\2\2\u00da"+
		"\u00e0\5\30\r\4\u00db\u00dc\7\16\2\2\u00dc\u00dd\5\30\r\2\u00dd\u00de"+
		"\7\22\2\2\u00de\u00e0\3\2\2\2\u00df\u00c5\3\2\2\2\u00df\u00ca\3\2\2\2"+
		"\u00df\u00cb\3\2\2\2\u00df\u00cc\3\2\2\2\u00df\u00cd\3\2\2\2\u00df\u00ce"+
		"\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00e0\u0120\3\2\2\2\u00e1\u00e2\f\23\2\2\u00e2\u00e3\t"+
		"\2\2\2\u00e3\u011f\5\30\r\24\u00e4\u00e5\f\22\2\2\u00e5\u00e6\t\2\2\2"+
		"\u00e6\u011f\b\r\1\2\u00e7\u00e8\f\20\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea"+
		"\5\30\r\2\u00ea\u00eb\7\21\2\2\u00eb\u011f\3\2\2\2\u00ec\u00ed\f\17\2"+
		"\2\u00ed\u00ee\7\6\2\2\u00ee\u011f\7 \2\2\u00ef\u00f0\f\16\2\2\u00f0\u00f1"+
		"\7\6\2\2\u00f1\u00f2\7)\2\2\u00f2\u00fb\7\16\2\2\u00f3\u00f8\5\30\r\2"+
		"\u00f4\u00f5\7\26\2\2\u00f5\u00f7\5\30\r\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u011f\7\22\2\2\u00fe\u00ff\f\r\2\2\u00ff\u0100\7\6\2\2\u0100"+
		"\u0101\7)\2\2\u0101\u010a\7\16\2\2\u0102\u0107\5\30\r\2\u0103\u0104\7"+
		"\26\2\2\u0104\u0106\5\30\r\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u0102\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\7\22\2\2\u010d\u010e\7\22\2\2\u010e\u011f\b\r\1\2\u010f\u0110\f"+
		"\f\2\2\u0110\u0111\7\6\2\2\u0111\u0112\7)\2\2\u0112\u011b\7\16\2\2\u0113"+
		"\u0118\5\30\r\2\u0114\u0115\7\26\2\2\u0115\u0117\5\30\r\2\u0116\u0114"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011f\b\r\1\2\u011e\u00e1\3\2\2\2\u011e"+
		"\u00e4\3\2\2\2\u011e\u00e7\3\2\2\2\u011e\u00ec\3\2\2\2\u011e\u00ef\3\2"+
		"\2\2\u011e\u00fe\3\2\2\2\u011e\u010f\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\31\3\2\2\2\u0122\u0120\3\2\2"+
		"\2\33\33 \'\648MW]cqx~\u008b\u0097\u009d\u00c3\u00df\u00f8\u00fb\u0107"+
		"\u010a\u0118\u011b\u011e\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}