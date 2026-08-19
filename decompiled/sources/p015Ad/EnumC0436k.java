package p015Ad;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ad.k */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0436k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0436k f1421Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0436k f1422Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0436k f1423o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC0436k[] f1424p0;

    static {
        EnumC0436k enumC0436k = new EnumC0436k("UPGRADED", 0);
        f1421Y = enumC0436k;
        EnumC0436k enumC0436k2 = new EnumC0436k("DOWNGRADED", 1);
        f1422Z = enumC0436k2;
        EnumC0436k enumC0436k3 = new EnumC0436k("NONE", 2);
        f1423o0 = enumC0436k3;
        EnumC0436k[] enumC0436kArr = {enumC0436k, enumC0436k2, enumC0436k3};
        f1424p0 = enumC0436kArr;
        AbstractC7877E4.m8156j(enumC0436kArr);
    }

    public static EnumC0436k valueOf(String str) {
        return (EnumC0436k) Enum.valueOf(EnumC0436k.class, str);
    }

    public static EnumC0436k[] values() {
        return (EnumC0436k[]) f1424p0.clone();
    }
}
