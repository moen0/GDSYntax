package com.godot.gdscript;

import com.intellij.lang.Language;

public final class GDScriptLanguage extends Language {
    public static final GDScriptLanguage INSTANCE = new GDScriptLanguage();

    private GDScriptLanguage() {
        super("GDScript");
    }
}
