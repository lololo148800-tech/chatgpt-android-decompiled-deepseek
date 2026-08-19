package p624Zg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Zg.E */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10335E {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10335E f30663Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10335E f30664Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10335E f30665o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10335E f30666p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC10335E[] f30667q0;

    static {
        EnumC10335E enumC10335E = new EnumC10335E("Lifetime", 0);
        f30663Y = enumC10335E;
        EnumC10335E enumC10335E2 = new EnumC10335E("Annual", 1);
        f30664Z = enumC10335E2;
        EnumC10335E enumC10335E3 = new EnumC10335E("Monthly", 2);
        f30665o0 = enumC10335E3;
        EnumC10335E enumC10335E4 = new EnumC10335E("Weekly", 3);
        f30666p0 = enumC10335E4;
        EnumC10335E[] enumC10335EArr = {enumC10335E, enumC10335E2, enumC10335E3, enumC10335E4};
        f30667q0 = enumC10335EArr;
        AbstractC7877E4.m8156j(enumC10335EArr);
    }

    public static EnumC10335E valueOf(String str) {
        return (EnumC10335E) Enum.valueOf(EnumC10335E.class, str);
    }

    public static EnumC10335E[] values() {
        return (EnumC10335E[]) f30667q0.clone();
    }
}
