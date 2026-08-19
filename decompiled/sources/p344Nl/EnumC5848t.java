package p344Nl;

import p1053v3.p1054lN.IGDwkYw;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5848t {
    public static final C5847s Companion;

    /* JADX INFO: renamed from: Y */
    public static final EnumC5848t f19131Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5848t f19132Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5848t f19133o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC5848t f19134p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC5848t f19135q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC5848t f19136r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC5848t[] f19137s0;

    static {
        EnumC5848t enumC5848t = new EnumC5848t("AGENT", 0);
        f19131Y = enumC5848t;
        EnumC5848t enumC5848t2 = new EnumC5848t("STANDARD", 1);
        f19132Z = enumC5848t2;
        EnumC5848t enumC5848t3 = new EnumC5848t("INGRESS", 2);
        f19133o0 = enumC5848t3;
        EnumC5848t enumC5848t4 = new EnumC5848t(IGDwkYw.qwwAsd, 3);
        f19134p0 = enumC5848t4;
        EnumC5848t enumC5848t5 = new EnumC5848t("SIP", 4);
        f19135q0 = enumC5848t5;
        EnumC5848t enumC5848t6 = new EnumC5848t("UNKNOWN", 5);
        f19136r0 = enumC5848t6;
        EnumC5848t[] enumC5848tArr = {enumC5848t, enumC5848t2, enumC5848t3, enumC5848t4, enumC5848t5, enumC5848t6};
        f19137s0 = enumC5848tArr;
        AbstractC7877E4.m8156j(enumC5848tArr);
        Companion = new C5847s();
    }

    public static EnumC5848t valueOf(String str) {
        return (EnumC5848t) Enum.valueOf(EnumC5848t.class, str);
    }

    public static EnumC5848t[] values() {
        return (EnumC5848t[]) f19137s0.clone();
    }
}
