package kotlin.reflect.jvm.internal.impl.load.java.structure;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LightClassOriginKind {
    public static final LightClassOriginKind BINARY;
    public static final LightClassOriginKind SOURCE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ LightClassOriginKind[] f51977Y;

    static {
        LightClassOriginKind lightClassOriginKind = new LightClassOriginKind("SOURCE", 0);
        SOURCE = lightClassOriginKind;
        LightClassOriginKind lightClassOriginKind2 = new LightClassOriginKind("BINARY", 1);
        BINARY = lightClassOriginKind2;
        LightClassOriginKind[] lightClassOriginKindArr = {lightClassOriginKind, lightClassOriginKind2};
        f51977Y = lightClassOriginKindArr;
        AbstractC7877E4.m8156j(lightClassOriginKindArr);
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) f51977Y.clone();
    }
}
