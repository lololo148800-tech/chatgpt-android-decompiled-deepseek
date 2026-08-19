package p228J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3850n {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3850n f11637Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3850n f11638Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3850n f11639o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3850n f11640p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3850n f11641q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC3850n f11642r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC3850n f11643s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ EnumC3850n[] f11644t0;

    static {
        EnumC3850n enumC3850n = new EnumC3850n("UNKNOWN", 0);
        f11637Y = enumC3850n;
        EnumC3850n enumC3850n2 = new EnumC3850n("INACTIVE", 1);
        f11638Z = enumC3850n2;
        EnumC3850n enumC3850n3 = new EnumC3850n("SCANNING", 2);
        f11639o0 = enumC3850n3;
        EnumC3850n enumC3850n4 = new EnumC3850n("PASSIVE_FOCUSED", 3);
        f11640p0 = enumC3850n4;
        EnumC3850n enumC3850n5 = new EnumC3850n("PASSIVE_NOT_FOCUSED", 4);
        f11641q0 = enumC3850n5;
        EnumC3850n enumC3850n6 = new EnumC3850n("LOCKED_FOCUSED", 5);
        f11642r0 = enumC3850n6;
        EnumC3850n enumC3850n7 = new EnumC3850n("LOCKED_NOT_FOCUSED", 6);
        f11643s0 = enumC3850n7;
        f11644t0 = new EnumC3850n[]{enumC3850n, enumC3850n2, enumC3850n3, enumC3850n4, enumC3850n5, enumC3850n6, enumC3850n7};
    }

    public static EnumC3850n valueOf(String str) {
        return (EnumC3850n) Enum.valueOf(EnumC3850n.class, str);
    }

    public static EnumC3850n[] values() {
        return (EnumC3850n[]) f11644t0.clone();
    }
}
