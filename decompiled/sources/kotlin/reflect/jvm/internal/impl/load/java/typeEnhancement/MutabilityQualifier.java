package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class MutabilityQualifier {
    public static final MutabilityQualifier MUTABLE;
    public static final MutabilityQualifier READ_ONLY;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ MutabilityQualifier[] f51984Y;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        READ_ONLY = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        MUTABLE = mutabilityQualifier2;
        MutabilityQualifier[] mutabilityQualifierArr = {mutabilityQualifier, mutabilityQualifier2};
        f51984Y = mutabilityQualifierArr;
        AbstractC7877E4.m8156j(mutabilityQualifierArr);
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f51984Y.clone();
    }
}
