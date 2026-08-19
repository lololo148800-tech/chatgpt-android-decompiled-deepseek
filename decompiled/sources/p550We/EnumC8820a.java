package p550We;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: We.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8820a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8820a f27003Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8820a f27004Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8820a f27005o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC8820a[] f27006p0;

    static {
        EnumC8820a enumC8820a = new EnumC8820a("Valid", 0);
        f27003Y = enumC8820a;
        EnumC8820a enumC8820a2 = new EnumC8820a("Expired", 1);
        f27004Z = enumC8820a2;
        EnumC8820a enumC8820a3 = new EnumC8820a("Missing", 2);
        f27005o0 = enumC8820a3;
        EnumC8820a[] enumC8820aArr = {enumC8820a, enumC8820a2, enumC8820a3};
        f27006p0 = enumC8820aArr;
        AbstractC7877E4.m8156j(enumC8820aArr);
    }

    public static EnumC8820a valueOf(String str) {
        return (EnumC8820a) Enum.valueOf(EnumC8820a.class, str);
    }

    public static EnumC8820a[] values() {
        return (EnumC8820a[]) f27006p0.clone();
    }
}
