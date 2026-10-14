package com.godot.gdscript.parser;

import com.godot.gdscript.GDScriptLanguage;
import com.godot.gdscript.GDScriptLexerAdapter;
import com.godot.gdscript.psi.GDScriptFile;
import com.godot.gdscript.psi.GDScriptPsiElement;
import com.godot.gdscript.psi.GDScriptTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public final class GDScriptParserDefinition implements ParserDefinition {
    private static final IFileElementType FILE = new IFileElementType(GDScriptLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new GDScriptLexerAdapter();
    }

    @NotNull
    @Override
    public com.intellij.lang.PsiParser createParser(Project project) {
        return new GDScriptParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.create(TokenType.WHITE_SPACE);
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.create(GDScriptTypes.LINE_COMMENT);
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.create(GDScriptTypes.STRING);
    }

    @NotNull
    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new GDScriptFile(viewProvider);
    }

    @NotNull
    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return new GDScriptPsiElement(node);
    }
}
