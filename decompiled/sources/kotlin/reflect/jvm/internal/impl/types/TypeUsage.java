package kotlin.reflect.jvm.internal.impl.types;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeUsage {
    public static final TypeUsage COMMON;
    public static final TypeUsage SUPERTYPE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ TypeUsage[] f53216Y;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        SUPERTYPE = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage("COMMON", 1);
        COMMON = typeUsage2;
        TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        f53216Y = typeUsageArr;
        AbstractC7877E4.m8156j(typeUsageArr);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f53216Y.clone();
    }
}
