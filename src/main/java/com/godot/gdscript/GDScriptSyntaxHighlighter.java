package com.godot.gdscript;

import com.godot.gdscript.psi.GDScriptTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public final class GDScriptSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("GDSCRIPT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("GDSCRIPT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING = createTextAttributesKey("GDSCRIPT_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("GDSCRIPT_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("GDSCRIPT_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey OPERATION_SIGN = createTextAttributesKey("GDSCRIPT_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("GDSCRIPT_BAD_CHARACTER", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);

    private static final TextAttributesKey[] KEYWORD_KEYS = {KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = {IDENTIFIER};
    private static final TextAttributesKey[] STRING_KEYS = {STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = {NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = {LINE_COMMENT};
    private static final TextAttributesKey[] OP_KEYS = {OPERATION_SIGN};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = {BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GDScriptLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType == GDScriptTypes.KEY_FUNC
                || tokenType == GDScriptTypes.KEY_VAR
                || tokenType == GDScriptTypes.KEY_CONST
                || tokenType == GDScriptTypes.KEY_EXTENDS
                || tokenType == GDScriptTypes.KEY_CLASS_NAME
                || tokenType == GDScriptTypes.KEY_IF
                || tokenType == GDScriptTypes.KEY_ELIF
                || tokenType == GDScriptTypes.KEY_ELSE
                || tokenType == GDScriptTypes.KEY_FOR
                || tokenType == GDScriptTypes.KEY_WHILE
                || tokenType == GDScriptTypes.KEY_RETURN
                || tokenType == GDScriptTypes.KEY_PASS
                || tokenType == GDScriptTypes.KEY_IN
                || tokenType == GDScriptTypes.KEY_NOT
                || tokenType == GDScriptTypes.KEY_AND
                || tokenType == GDScriptTypes.KEY_OR
                || tokenType == GDScriptTypes.KEY_SELF
                || tokenType == GDScriptTypes.KEY_SIGNAL
                || tokenType == GDScriptTypes.KEY_ENUM) {
            return KEYWORD_KEYS;
        }
        if (tokenType == GDScriptTypes.IDENTIFIER) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType == GDScriptTypes.STRING) {
            return STRING_KEYS;
        }
        if (tokenType == GDScriptTypes.NUMBER) {
            return NUMBER_KEYS;
        }
        if (tokenType == GDScriptTypes.LINE_COMMENT) {
            return COMMENT_KEYS;
        }
        if (tokenType == GDScriptTypes.ASSIGN
                || tokenType == GDScriptTypes.EQ
                || tokenType == GDScriptTypes.NEQ
                || tokenType == GDScriptTypes.PLUS
                || tokenType == GDScriptTypes.MINUS
                || tokenType == GDScriptTypes.MUL
                || tokenType == GDScriptTypes.DIV
                || tokenType == GDScriptTypes.COLON
                || tokenType == GDScriptTypes.COMMA
                || tokenType == GDScriptTypes.LPAREN
                || tokenType == GDScriptTypes.RPAREN
                || tokenType == GDScriptTypes.LBRACKET
                || tokenType == GDScriptTypes.RBRACKET
                || tokenType == GDScriptTypes.LBRACE
                || tokenType == GDScriptTypes.RBRACE
                || tokenType == GDScriptTypes.DOT) {
            return OP_KEYS;
        }
        if (tokenType == TokenType.BAD_CHARACTER) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}
