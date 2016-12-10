// Generated from MiniJava.g4 by ANTLR 4.5.3
package antlr_gen;
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		LINECOMMENT=40, BLOCKCOMMENT=41, WS=42;
	public static final int
		RULE_goal = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_mainClass = 3, RULE_classDeclaration = 4, RULE_varDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_type = 7, RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "packageDeclaration", "importDeclaration", "mainClass", "classDeclaration", 
		"varDeclaration", "methodDeclaration", "type", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "';'", "'import'", "'.'", "'*'", "'class'", "'{'", 
		"'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", 
		"']'", "')'", "'}'", "'extends'", "','", "'return'", "'int'", "'boolean'", 
		"'if'", "'else'", "'while'", "'System.out.println'", "'='", "'&&'", "'<'", 
		"'+'", "'-'", "'length'", "'true'", "'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "INT", "LINECOMMENT", "BLOCKCOMMENT", "WS"
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
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
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
			setState(20);
			packageDeclaration();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(21);
				importDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			mainClass();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(28);
				classDeclaration();
				}
				}
				setState(33);
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
			setState(34);
			match(T__0);
			setState(35);
			match(ID);
			setState(36);
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
			setState(38);
			match(T__2);
			setState(39);
			match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(40);
				match(T__3);
				setState(41);
				match(ID);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(47);
				match(T__4);
				}
			}

			setState(50);
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
			setState(52);
			match(T__5);
			setState(53);
			match(ID);
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			match(T__8);
			setState(57);
			match(T__9);
			setState(58);
			match(T__10);
			setState(59);
			match(T__11);
			setState(60);
			match(T__12);
			setState(61);
			match(T__13);
			setState(62);
			match(T__14);
			setState(63);
			match(ID);
			setState(64);
			match(T__15);
			setState(65);
			match(T__6);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__16);
			setState(73);
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
			setState(75);
			match(T__5);
			setState(76);
			match(ID);
			setState(79);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(77);
				match(T__17);
				setState(78);
				match(ID);
				}
			}

			setState(81);
			match(T__6);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				varDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(88);
				methodDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
			setState(96);
			type();
			setState(97);
			match(ID);
			setState(98);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(100);
			match(T__7);
			setState(101);
			type();
			setState(102);
			match(ID);
			setState(103);
			match(T__11);
			setState(115);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				setState(104);
				type();
				setState(105);
				match(ID);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(106);
					match(T__18);
					setState(107);
					type();
					setState(108);
					match(ID);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(117);
			match(T__15);
			setState(118);
			match(T__6);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					varDeclaration();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__19);
			setState(132);
			expression(0);
			setState(133);
			match(T__1);
			setState(134);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__20);
				setState(137);
				match(T__13);
				setState(138);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__6);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0)) {
					{
					{
					setState(145);
					statement();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__22);
				setState(153);
				match(T__11);
				setState(154);
				expression(0);
				setState(155);
				match(T__15);
				setState(156);
				statement();
				setState(157);
				match(T__23);
				setState(158);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__24);
				setState(161);
				match(T__11);
				setState(162);
				expression(0);
				setState(163);
				match(T__15);
				setState(164);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(T__25);
				setState(167);
				match(T__11);
				setState(168);
				expression(0);
				setState(169);
				match(T__15);
				setState(170);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__26);
				setState(174);
				expression(0);
				setState(175);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__13);
				setState(179);
				expression(0);
				setState(180);
				match(T__14);
				setState(181);
				match(T__26);
				setState(182);
				expression(0);
				setState(183);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
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
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(189);
				match(INT);
				}
				break;
			case 2:
				{
				setState(190);
				match(T__32);
				}
				break;
			case 3:
				{
				setState(191);
				match(T__33);
				}
				break;
			case 4:
				{
				setState(192);
				match(ID);
				}
				break;
			case 5:
				{
				setState(193);
				match(T__34);
				}
				break;
			case 6:
				{
				setState(194);
				match(T__35);
				setState(195);
				match(T__20);
				setState(196);
				match(T__13);
				setState(197);
				expression(0);
				setState(198);
				match(T__14);
				}
				break;
			case 7:
				{
				setState(200);
				match(T__35);
				setState(201);
				match(ID);
				setState(202);
				match(T__11);
				setState(203);
				match(T__15);
				}
				break;
			case 8:
				{
				setState(204);
				match(T__36);
				setState(205);
				expression(2);
				}
				break;
			case 9:
				{
				setState(206);
				match(T__11);
				setState(207);
				expression(0);
				setState(208);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(213);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(214);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(216);
						match(T__13);
						setState(217);
						expression(0);
						setState(218);
						match(T__14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(221);
						match(T__3);
						setState(222);
						match(T__31);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(224);
						match(T__3);
						setState(225);
						match(ID);
						setState(226);
						match(T__11);
						setState(235);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(227);
							expression(0);
							setState(232);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__18) {
								{
								{
								setState(228);
								match(T__18);
								setState(229);
								expression(0);
								}
								}
								setState(234);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(237);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\5\4\63"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3"+
		"\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt"+
		"\13\b\5\bv\n\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\7\b\u0081\n\b\f"+
		"\b\16\b\u0084\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091"+
		"\n\t\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00e9\n\13\f\13\16\13\u00ec\13\13\5\13\u00ee\n\13\3\13\7\13\u00f1\n\13"+
		"\f\13\16\13\u00f4\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\3\4\2"+
		"\7\7\36!\u010f\2\26\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b\66\3\2\2\2\nM\3\2"+
		"\2\2\fb\3\2\2\2\16f\3\2\2\2\20\u0090\3\2\2\2\22\u00bc\3\2\2\2\24\u00d4"+
		"\3\2\2\2\26\32\5\4\3\2\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35!\5\b\5\2\36 \5\n"+
		"\6\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2"+
		"\2\2$%\7\3\2\2%&\7(\2\2&\'\7\4\2\2\'\5\3\2\2\2()\7\5\2\2).\7(\2\2*+\7"+
		"\6\2\2+-\7(\2\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2"+
		"\60.\3\2\2\2\61\63\7\7\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\7\4\2\2\65\7\3\2\2\2\66\67\7\b\2\2\678\7(\2\289\7\t\2\29:\7\n\2\2"+
		":;\7\13\2\2;<\7\f\2\2<=\7\r\2\2=>\7\16\2\2>?\7\17\2\2?@\7\20\2\2@A\7\21"+
		"\2\2AB\7(\2\2BC\7\22\2\2CG\7\t\2\2DF\5\22\n\2ED\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\23\2\2KL\7\23\2\2L\t\3\2\2\2"+
		"MN\7\b\2\2NQ\7(\2\2OP\7\24\2\2PR\7(\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
		"SW\7\t\2\2TV\5\f\7\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2"+
		"YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2"+
		"\2\2_]\3\2\2\2`a\7\23\2\2a\13\3\2\2\2bc\5\20\t\2cd\7(\2\2de\7\4\2\2e\r"+
		"\3\2\2\2fg\7\n\2\2gh\5\20\t\2hi\7(\2\2iu\7\16\2\2jk\5\20\t\2kr\7(\2\2"+
		"lm\7\25\2\2mn\5\20\t\2no\7(\2\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uj\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\22"+
		"\2\2x|\7\t\2\2y{\5\f\7\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0082"+
		"\3\2\2\2~|\3\2\2\2\177\u0081\5\22\n\2\u0080\177\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\26\2\2\u0086\u0087\5\24\13\2\u0087\u0088"+
		"\7\4\2\2\u0088\u0089\7\23\2\2\u0089\17\3\2\2\2\u008a\u008b\7\27\2\2\u008b"+
		"\u008c\7\20\2\2\u008c\u0091\7\21\2\2\u008d\u0091\7\30\2\2\u008e\u0091"+
		"\7\27\2\2\u008f\u0091\7(\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\21\3\2\2\2\u0092\u0096\7\t\2"+
		"\2\u0093\u0095\5\22\n\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u00bd\7\23\2\2\u009a\u009b\7\31\2\2\u009b\u009c\7\16\2\2\u009c"+
		"\u009d\5\24\13\2\u009d\u009e\7\22\2\2\u009e\u009f\5\22\n\2\u009f\u00a0"+
		"\7\32\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00bd\3\2\2\2\u00a2\u00a3\7\33\2"+
		"\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\u00a7\5\22\n\2\u00a7\u00bd\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa\7"+
		"\16\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\7\4\2\2"+
		"\u00ad\u00bd\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b1"+
		"\5\24\13\2\u00b1\u00b2\7\4\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\7(\2\2"+
		"\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\21\2\2\u00b7"+
		"\u00b8\7\35\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\4\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00bd\5\f\7\2\u00bc\u0092\3\2\2\2\u00bc\u009a\3\2\2\2\u00bc"+
		"\u00a2\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b3\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\23\3\2\2\2\u00be\u00bf\b\13\1\2\u00bf\u00d5"+
		"\7)\2\2\u00c0\u00d5\7#\2\2\u00c1\u00d5\7$\2\2\u00c2\u00d5\7(\2\2\u00c3"+
		"\u00d5\7%\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\20"+
		"\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\7\21\2\2\u00c9\u00d5\3\2\2\2\u00ca"+
		"\u00cb\7&\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00d5\7\22"+
		"\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00d5\5\24\13\4\u00d0\u00d1\7\16\2\2\u00d1"+
		"\u00d2\5\24\13\2\u00d2\u00d3\7\22\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00be"+
		"\3\2\2\2\u00d4\u00c0\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4"+
		"\u00c3\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00ce\3\2"+
		"\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00f2\3\2\2\2\u00d6\u00d7\f\17\2\2\u00d7"+
		"\u00d8\t\2\2\2\u00d8\u00f1\5\24\13\20\u00d9\u00da\f\16\2\2\u00da\u00db"+
		"\7\20\2\2\u00db\u00dc\5\24\13\2\u00dc\u00dd\7\21\2\2\u00dd\u00f1\3\2\2"+
		"\2\u00de\u00df\f\r\2\2\u00df\u00e0\7\6\2\2\u00e0\u00f1\7\"\2\2\u00e1\u00e2"+
		"\f\f\2\2\u00e2\u00e3\7\6\2\2\u00e3\u00e4\7(\2\2\u00e4\u00ed\7\16\2\2\u00e5"+
		"\u00ea\5\24\13\2\u00e6\u00e7\7\25\2\2\u00e7\u00e9\5\24\13\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7\22\2\2\u00f0\u00d6\3\2\2\2\u00f0"+
		"\u00d9\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\25\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\26\32!.\62GQW]ru|\u0082\u0090\u0096\u00bc\u00d4\u00ea\u00ed\u00f0"+
		"\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}