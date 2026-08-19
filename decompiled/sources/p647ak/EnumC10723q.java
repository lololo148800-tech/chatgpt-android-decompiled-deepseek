package p647ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ak.q */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10723q {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10723q f31854Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10723q f31855Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10723q f31856o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC10723q[] f31857p0;

    static {
        EnumC10723q enumC10723q = new EnumC10723q("Center", 0);
        f31854Y = enumC10723q;
        EnumC10723q enumC10723q2 = new EnumC10723q("Left", 1);
        f31855Z = enumC10723q2;
        EnumC10723q enumC10723q3 = new EnumC10723q("Right", 2);
        f31856o0 = enumC10723q3;
        EnumC10723q[] enumC10723qArr = {enumC10723q, enumC10723q2, enumC10723q3};
        f31857p0 = enumC10723qArr;
        AbstractC7877E4.m8156j(enumC10723qArr);
    }

    public static EnumC10723q valueOf(String str) {
        return (EnumC10723q) Enum.valueOf(EnumC10723q.class, str);
    }

    public static EnumC10723q[] values() {
        return (EnumC10723q[]) f31857p0.clone();
    }
}
