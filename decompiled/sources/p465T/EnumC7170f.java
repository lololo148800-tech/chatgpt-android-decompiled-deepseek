package p465T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7170f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7170f f22785Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7170f f22786Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7170f f22787o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC7170f[] f22788p0;

    static {
        EnumC7170f enumC7170f = new EnumC7170f("UNKNOWN", 0);
        f22785Y = enumC7170f;
        EnumC7170f enumC7170f2 = new EnumC7170f("DEFAULT", 1);
        f22786Z = enumC7170f2;
        EnumC7170f enumC7170f3 = new EnumC7170f("YUV", 2);
        f22787o0 = enumC7170f3;
        f22788p0 = new EnumC7170f[]{enumC7170f, enumC7170f2, enumC7170f3};
    }

    public static EnumC7170f valueOf(String str) {
        return (EnumC7170f) Enum.valueOf(EnumC7170f.class, str);
    }

    public static EnumC7170f[] values() {
        return (EnumC7170f[]) f22788p0.clone();
    }
}
