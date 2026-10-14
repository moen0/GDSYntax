package com.godot.gdscript.psi;

import com.intellij.psi.tree.IElementType;

public interface GDScriptTypes {
    IElementType KEY_FUNC = new GDScriptTokenType("KEY_FUNC");
    IElementType KEY_VAR = new GDScriptTokenType("KEY_VAR");
    IElementType KEY_CONST = new GDScriptTokenType("KEY_CONST");
    IElementType KEY_EXTENDS = new GDScriptTokenType("KEY_EXTENDS");
    IElementType KEY_CLASS_NAME = new GDScriptTokenType("KEY_CLASS_NAME");
    IElementType KEY_IF = new GDScriptTokenType("KEY_IF");
    IElementType KEY_ELIF = new GDScriptTokenType("KEY_ELIF");
    IElementType KEY_ELSE = new GDScriptTokenType("KEY_ELSE");
    IElementType KEY_FOR = new GDScriptTokenType("KEY_FOR");
    IElementType KEY_WHILE = new GDScriptTokenType("KEY_WHILE");
    IElementType KEY_RETURN = new GDScriptTokenType("KEY_RETURN");
    IElementType KEY_PASS = new GDScriptTokenType("KEY_PASS");
    IElementType KEY_IN = new GDScriptTokenType("KEY_IN");
    IElementType KEY_NOT = new GDScriptTokenType("KEY_NOT");
    IElementType KEY_AND = new GDScriptTokenType("KEY_AND");
    IElementType KEY_OR = new GDScriptTokenType("KEY_OR");
    IElementType KEY_SELF = new GDScriptTokenType("KEY_SELF");
    IElementType KEY_SIGNAL = new GDScriptTokenType("KEY_SIGNAL");
    IElementType KEY_ENUM = new GDScriptTokenType("KEY_ENUM");

    IElementType COLON = new GDScriptTokenType("COLON");
    IElementType COMMA = new GDScriptTokenType("COMMA");
    IElementType ASSIGN = new GDScriptTokenType("ASSIGN");
    IElementType EQ = new GDScriptTokenType("EQ");
    IElementType NEQ = new GDScriptTokenType("NEQ");
    IElementType LPAREN = new GDScriptTokenType("LPAREN");
    IElementType RPAREN = new GDScriptTokenType("RPAREN");
    IElementType LBRACKET = new GDScriptTokenType("LBRACKET");
    IElementType RBRACKET = new GDScriptTokenType("RBRACKET");
    IElementType LBRACE = new GDScriptTokenType("LBRACE");
    IElementType RBRACE = new GDScriptTokenType("RBRACE");
    IElementType DOT = new GDScriptTokenType("DOT");
    IElementType PLUS = new GDScriptTokenType("PLUS");
    IElementType MINUS = new GDScriptTokenType("MINUS");
    IElementType MUL = new GDScriptTokenType("MUL");
    IElementType DIV = new GDScriptTokenType("DIV");

    IElementType IDENTIFIER = new GDScriptTokenType("IDENTIFIER");
    IElementType NUMBER = new GDScriptTokenType("NUMBER");
    IElementType STRING = new GDScriptTokenType("STRING");
    IElementType LINE_COMMENT = new GDScriptTokenType("LINE_COMMENT");
}
