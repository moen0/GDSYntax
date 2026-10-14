package com.godot.gdscript.psi;

import com.godot.gdscript.GDScriptFileType;
import com.godot.gdscript.GDScriptLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public final class GDScriptFile extends PsiFileBase {
    public GDScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GDScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GDScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "GDScript File";
    }
}
