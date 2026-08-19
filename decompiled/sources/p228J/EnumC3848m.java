package p228J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3848m {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3848m f11630Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3848m f11631Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3848m f11632o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3848m f11633p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3848m f11634q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC3848m f11635r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC3848m[] f11636s0;

    static {
        EnumC3848m enumC3848m = new EnumC3848m("UNKNOWN", 0);
        f11630Y = enumC3848m;
        EnumC3848m enumC3848m2 = new EnumC3848m("INACTIVE", 1);
        f11631Z = enumC3848m2;
        EnumC3848m enumC3848m3 = new EnumC3848m("SEARCHING", 2);
        f11632o0 = enumC3848m3;
        EnumC3848m enumC3848m4 = new EnumC3848m("FLASH_REQUIRED", 3);
        f11633p0 = enumC3848m4;
        EnumC3848m enumC3848m5 = new EnumC3848m("CONVERGED", 4);
        f11634q0 = enumC3848m5;
        EnumC3848m enumC3848m6 = new EnumC3848m("LOCKED", 5);
        f11635r0 = enumC3848m6;
        f11636s0 = new EnumC3848m[]{enumC3848m, enumC3848m2, enumC3848m3, enumC3848m4, enumC3848m5, enumC3848m6};
    }

    public static EnumC3848m valueOf(String str) {
        return (EnumC3848m) Enum.valueOf(EnumC3848m.class, str);
    }

    public static EnumC3848m[] values() {
        return (EnumC3848m[]) f11636s0.clone();
    }
}
