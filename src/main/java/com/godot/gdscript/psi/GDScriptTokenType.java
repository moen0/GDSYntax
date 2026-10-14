package com.godot.gdscript.psi;

import com.godot.gdscript.GDScriptLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public final class GDScriptTokenType extends IElementType {
    public GDScriptTokenType(@NotNull String debugName) {
        super(debugName, GDScriptLanguage.INSTANCE);
    }
}
