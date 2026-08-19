package bo;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC11514b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11514b f34839Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11514b f34840Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC11514b[] f34841o0;

    static {
        EnumC11514b enumC11514b = new EnumC11514b("WHITESPACE_SEPARATED", 0);
        f34839Y = enumC11514b;
        EnumC11514b enumC11514b2 = new EnumC11514b("ARRAY_WRAPPED", 1);
        f34840Z = enumC11514b2;
        EnumC11514b[] enumC11514bArr = {enumC11514b, enumC11514b2, new EnumC11514b("AUTO_DETECT", 2)};
        f34841o0 = enumC11514bArr;
        AbstractC7877E4.m8156j(enumC11514bArr);
    }

    public static EnumC11514b valueOf(String str) {
        return (EnumC11514b) Enum.valueOf(EnumC11514b.class, str);
    }

    public static EnumC11514b[] values() {
        return (EnumC11514b[]) f34841o0.clone();
    }
}
