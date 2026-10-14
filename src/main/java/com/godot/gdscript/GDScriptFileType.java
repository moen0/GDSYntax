package com.godot.gdscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public final class GDScriptFileType extends LanguageFileType {
    public static final GDScriptFileType INSTANCE = new GDScriptFileType();

    private GDScriptFileType() {
        super(GDScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "GDScript File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Godot GDScript source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gd";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
