package p403Qd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Qd.I */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6603I {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6603I f21318Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6603I f21319Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6603I f21320o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6603I f21321p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC6603I[] f21322q0;

    static {
        EnumC6603I enumC6603I = new EnumC6603I("NotLoaded", 0);
        f21318Y = enumC6603I;
        EnumC6603I enumC6603I2 = new EnumC6603I("Loading", 1);
        f21319Z = enumC6603I2;
        EnumC6603I enumC6603I3 = new EnumC6603I("Loaded", 2);
        f21320o0 = enumC6603I3;
        EnumC6603I enumC6603I4 = new EnumC6603I("Error", 3);
        f21321p0 = enumC6603I4;
        EnumC6603I[] enumC6603IArr = {enumC6603I, enumC6603I2, enumC6603I3, enumC6603I4};
        f21322q0 = enumC6603IArr;
        AbstractC7877E4.m8156j(enumC6603IArr);
    }

    public static EnumC6603I valueOf(String str) {
        return (EnumC6603I) Enum.valueOf(EnumC6603I.class, str);
    }

    public static EnumC6603I[] values() {
        return (EnumC6603I[]) f21322q0.clone();
    }
}
