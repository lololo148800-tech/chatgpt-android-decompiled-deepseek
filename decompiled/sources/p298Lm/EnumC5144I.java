package p298Lm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Lm.I */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5144I {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5144I f16782Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5144I f16783Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5144I[] f16784o0;

    static {
        EnumC5144I enumC5144I = new EnumC5144I("DECLARED", 0);
        f16782Y = enumC5144I;
        EnumC5144I enumC5144I2 = new EnumC5144I("INHERITED", 1);
        f16783Z = enumC5144I2;
        EnumC5144I[] enumC5144IArr = {enumC5144I, enumC5144I2};
        f16784o0 = enumC5144IArr;
        AbstractC7877E4.m8156j(enumC5144IArr);
    }

    public static EnumC5144I valueOf(String str) {
        return (EnumC5144I) Enum.valueOf(EnumC5144I.class, str);
    }

    public static EnumC5144I[] values() {
        return (EnumC5144I[]) f16784o0.clone();
    }
}
