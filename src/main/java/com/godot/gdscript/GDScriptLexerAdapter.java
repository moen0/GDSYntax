package com.godot.gdscript;

import com.godot.gdscript.lexer._GDScriptLexer;
import com.intellij.lexer.FlexAdapter;

public final class GDScriptLexerAdapter extends FlexAdapter {
    public GDScriptLexerAdapter() {
        super(new _GDScriptLexer((java.io.Reader) null));
    }
}
