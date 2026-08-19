package kotlin.reflect.jvm.internal.impl.incremental.components;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeKind {
    public static final ScopeKind CLASSIFIER;
    public static final ScopeKind PACKAGE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ ScopeKind[] f51715Y;

    static {
        ScopeKind scopeKind = new ScopeKind("PACKAGE", 0);
        PACKAGE = scopeKind;
        ScopeKind scopeKind2 = new ScopeKind("CLASSIFIER", 1);
        CLASSIFIER = scopeKind2;
        ScopeKind[] scopeKindArr = {scopeKind, scopeKind2};
        f51715Y = scopeKindArr;
        AbstractC7877E4.m8156j(scopeKindArr);
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) f51715Y.clone();
    }
}
