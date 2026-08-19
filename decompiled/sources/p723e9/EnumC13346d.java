package p723e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e9.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13346d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13346d f42336Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13346d f42337Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC13346d f42338o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC13346d[] f42339p0;

    static {
        EnumC13346d enumC13346d = new EnumC13346d("NETWORK_UNMETERED", 0);
        f42336Y = enumC13346d;
        EnumC13346d enumC13346d2 = new EnumC13346d("DEVICE_IDLE", 1);
        f42337Z = enumC13346d2;
        EnumC13346d enumC13346d3 = new EnumC13346d("DEVICE_CHARGING", 2);
        f42338o0 = enumC13346d3;
        f42339p0 = new EnumC13346d[]{enumC13346d, enumC13346d2, enumC13346d3};
    }

    public static EnumC13346d valueOf(String str) {
        return (EnumC13346d) Enum.valueOf(EnumC13346d.class, str);
    }

    public static EnumC13346d[] values() {
        return (EnumC13346d[]) f42339p0.clone();
    }
}
