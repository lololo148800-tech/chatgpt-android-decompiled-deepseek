package p077Cn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Cn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1733a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC1733a f4961Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1733a f4962Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC1733a f4963o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC1733a[] f4964p0;

    static {
        EnumC1733a enumC1733a = new EnumC1733a("SUSPEND", 0);
        f4961Y = enumC1733a;
        EnumC1733a enumC1733a2 = new EnumC1733a("DROP_OLDEST", 1);
        f4962Z = enumC1733a2;
        EnumC1733a enumC1733a3 = new EnumC1733a("DROP_LATEST", 2);
        f4963o0 = enumC1733a3;
        EnumC1733a[] enumC1733aArr = {enumC1733a, enumC1733a2, enumC1733a3};
        f4964p0 = enumC1733aArr;
        AbstractC7877E4.m8156j(enumC1733aArr);
    }

    public static EnumC1733a valueOf(String str) {
        return (EnumC1733a) Enum.valueOf(EnumC1733a.class, str);
    }

    public static EnumC1733a[] values() {
        return (EnumC1733a[]) f4964p0.clone();
    }
}
