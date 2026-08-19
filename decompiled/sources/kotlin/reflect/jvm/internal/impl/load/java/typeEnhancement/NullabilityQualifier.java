package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityQualifier {
    public static final NullabilityQualifier FORCE_FLEXIBILITY;
    public static final NullabilityQualifier NOT_NULL;
    public static final NullabilityQualifier NULLABLE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ NullabilityQualifier[] f51986Y;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        FORCE_FLEXIBILITY = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        NULLABLE = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        NOT_NULL = nullabilityQualifier3;
        NullabilityQualifier[] nullabilityQualifierArr = {nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
        f51986Y = nullabilityQualifierArr;
        AbstractC7877E4.m8156j(nullabilityQualifierArr);
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f51986Y.clone();
    }
}
