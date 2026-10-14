package com.godot.gdscript.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class GDScriptPsiElement extends ASTWrapperPsiElement {
    public GDScriptPsiElement(@NotNull ASTNode node) {
        super(node);
    }
}
