package p228J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J.o */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3852o {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3852o f11647Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3852o f11648Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3852o f11649o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3852o f11650p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3852o f11651q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC3852o[] f11652r0;

    static {
        EnumC3852o enumC3852o = new EnumC3852o("UNKNOWN", 0);
        f11647Y = enumC3852o;
        EnumC3852o enumC3852o2 = new EnumC3852o("INACTIVE", 1);
        f11648Z = enumC3852o2;
        EnumC3852o enumC3852o3 = new EnumC3852o("METERING", 2);
        f11649o0 = enumC3852o3;
        EnumC3852o enumC3852o4 = new EnumC3852o("CONVERGED", 3);
        f11650p0 = enumC3852o4;
        EnumC3852o enumC3852o5 = new EnumC3852o("LOCKED", 4);
        f11651q0 = enumC3852o5;
        f11652r0 = new EnumC3852o[]{enumC3852o, enumC3852o2, enumC3852o3, enumC3852o4, enumC3852o5};
    }

    public static EnumC3852o valueOf(String str) {
        return (EnumC3852o) Enum.valueOf(EnumC3852o.class, str);
    }

    public static EnumC3852o[] values() {
        return (EnumC3852o[]) f11652r0.clone();
    }
}
