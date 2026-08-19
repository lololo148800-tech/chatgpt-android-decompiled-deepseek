package p647ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ak.J */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10649J {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10649J f31594Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10649J f31595Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC10649J[] f31596o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10649J EF3;

    static {
        EnumC10649J enumC10649J = new EnumC10649J("Center", 0);
        EnumC10649J enumC10649J2 = new EnumC10649J("Left", 1);
        f31594Y = enumC10649J2;
        EnumC10649J enumC10649J3 = new EnumC10649J("Right", 2);
        f31595Z = enumC10649J3;
        EnumC10649J[] enumC10649JArr = {enumC10649J, enumC10649J2, enumC10649J3};
        f31596o0 = enumC10649JArr;
        AbstractC7877E4.m8156j(enumC10649JArr);
    }

    public static EnumC10649J valueOf(String str) {
        return (EnumC10649J) Enum.valueOf(EnumC10649J.class, str);
    }

    public static EnumC10649J[] values() {
        return (EnumC10649J[]) f31596o0.clone();
    }
}
