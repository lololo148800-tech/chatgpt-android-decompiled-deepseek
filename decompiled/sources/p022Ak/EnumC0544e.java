package p022Ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ak.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0544e {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0544e f1734Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0544e f1735Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0544e f1736o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC0544e[] f1737p0;

    static {
        EnumC0544e enumC0544e = new EnumC0544e("Manual", 0);
        f1734Y = enumC0544e;
        EnumC0544e enumC0544e2 = new EnumC0544e("Auto", 1);
        f1735Z = enumC0544e2;
        EnumC0544e enumC0544e3 = new EnumC0544e("Upload", 2);
        f1736o0 = enumC0544e3;
        EnumC0544e[] enumC0544eArr = {enumC0544e, enumC0544e2, enumC0544e3};
        f1737p0 = enumC0544eArr;
        AbstractC7877E4.m8156j(enumC0544eArr);
    }

    public static EnumC0544e valueOf(String str) {
        return (EnumC0544e) Enum.valueOf(EnumC0544e.class, str);
    }

    public static EnumC0544e[] values() {
        return (EnumC0544e[]) f1737p0.clone();
    }
}
