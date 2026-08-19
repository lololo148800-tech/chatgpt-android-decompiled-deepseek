package p624Zg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Zg.X */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10353X {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10353X f30695Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10353X f30696Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10353X f30697o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC10353X[] f30698p0;

    static {
        EnumC10353X enumC10353X = new EnumC10353X("DisabledPurchaseButton", 0);
        f30695Y = enumC10353X;
        EnumC10353X enumC10353X2 = new EnumC10353X("Alert", 1);
        f30696Z = enumC10353X2;
        EnumC10353X enumC10353X3 = new EnumC10353X("ExitAlert", 2);
        f30697o0 = enumC10353X3;
        EnumC10353X[] enumC10353XArr = {enumC10353X, enumC10353X2, enumC10353X3};
        f30698p0 = enumC10353XArr;
        AbstractC7877E4.m8156j(enumC10353XArr);
    }

    public static EnumC10353X valueOf(String str) {
        return (EnumC10353X) Enum.valueOf(EnumC10353X.class, str);
    }

    public static EnumC10353X[] values() {
        return (EnumC10353X[]) f30698p0.clone();
    }
}
