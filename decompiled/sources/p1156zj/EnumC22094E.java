package p1156zj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zj.E */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22094E {

    /* JADX INFO: renamed from: Y */
    public static final EnumC22094E f69838Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22094E f69839Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC22094E f69840o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC22094E[] f69841p0;

    static {
        EnumC22094E enumC22094E = new EnumC22094E("FRONT", 0);
        f69838Y = enumC22094E;
        EnumC22094E enumC22094E2 = new EnumC22094E("BACK", 1);
        f69839Z = enumC22094E2;
        EnumC22094E enumC22094E3 = new EnumC22094E("FRONT_AND_BACK", 2);
        f69840o0 = enumC22094E3;
        EnumC22094E[] enumC22094EArr = {enumC22094E, enumC22094E2, enumC22094E3};
        f69841p0 = enumC22094EArr;
        AbstractC7877E4.m8156j(enumC22094EArr);
    }

    public static EnumC22094E valueOf(String str) {
        return (EnumC22094E) Enum.valueOf(EnumC22094E.class, str);
    }

    public static EnumC22094E[] values() {
        return (EnumC22094E[]) f69841p0.clone();
    }
}
