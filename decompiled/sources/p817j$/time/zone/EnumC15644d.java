package p817j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.zone.d */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15644d {
    public static final EnumC15644d STANDARD;
    public static final EnumC15644d UTC;
    public static final EnumC15644d WALL;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15644d[] f48824a;

    public static EnumC15644d valueOf(String str) {
        return (EnumC15644d) Enum.valueOf(EnumC15644d.class, str);
    }

    public static EnumC15644d[] values() {
        return (EnumC15644d[]) f48824a.clone();
    }

    static {
        EnumC15644d enumC15644d = new EnumC15644d("UTC", 0);
        UTC = enumC15644d;
        EnumC15644d enumC15644d2 = new EnumC15644d("WALL", 1);
        WALL = enumC15644d2;
        EnumC15644d enumC15644d3 = new EnumC15644d("STANDARD", 2);
        STANDARD = enumC15644d3;
        f48824a = new EnumC15644d[]{enumC15644d, enumC15644d2, enumC15644d3};
    }
}
