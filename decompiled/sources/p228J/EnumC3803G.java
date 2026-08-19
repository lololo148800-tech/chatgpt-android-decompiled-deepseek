package p228J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J.G */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3803G {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3803G f11502Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3803G f11503Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3803G f11504o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3803G f11505p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC3803G[] f11506q0;

    static {
        EnumC3803G enumC3803G = new EnumC3803G("ALWAYS_OVERRIDE", 0);
        f11502Y = enumC3803G;
        EnumC3803G enumC3803G2 = new EnumC3803G("HIGH_PRIORITY_REQUIRED", 1);
        f11503Z = enumC3803G2;
        EnumC3803G enumC3803G3 = new EnumC3803G("REQUIRED", 2);
        f11504o0 = enumC3803G3;
        EnumC3803G enumC3803G4 = new EnumC3803G("OPTIONAL", 3);
        f11505p0 = enumC3803G4;
        f11506q0 = new EnumC3803G[]{enumC3803G, enumC3803G2, enumC3803G3, enumC3803G4};
    }

    public static EnumC3803G valueOf(String str) {
        return (EnumC3803G) Enum.valueOf(EnumC3803G.class, str);
    }

    public static EnumC3803G[] values() {
        return (EnumC3803G[]) f11506q0.clone();
    }
}
