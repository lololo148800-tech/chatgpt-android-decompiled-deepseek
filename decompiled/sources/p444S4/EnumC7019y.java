package p444S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S4.y */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7019y {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7019y f22432Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7019y f22433Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7019y f22434o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC7019y f22435p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC7019y f22436q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC7019y f22437r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC7019y[] f22438s0;

    static {
        EnumC7019y enumC7019y = new EnumC7019y("ENQUEUED", 0);
        f22432Y = enumC7019y;
        EnumC7019y enumC7019y2 = new EnumC7019y("RUNNING", 1);
        f22433Z = enumC7019y2;
        EnumC7019y enumC7019y3 = new EnumC7019y("SUCCEEDED", 2);
        f22434o0 = enumC7019y3;
        EnumC7019y enumC7019y4 = new EnumC7019y("FAILED", 3);
        f22435p0 = enumC7019y4;
        EnumC7019y enumC7019y5 = new EnumC7019y("BLOCKED", 4);
        f22436q0 = enumC7019y5;
        EnumC7019y enumC7019y6 = new EnumC7019y("CANCELLED", 5);
        f22437r0 = enumC7019y6;
        f22438s0 = new EnumC7019y[]{enumC7019y, enumC7019y2, enumC7019y3, enumC7019y4, enumC7019y5, enumC7019y6};
    }

    public static EnumC7019y valueOf(String str) {
        return (EnumC7019y) Enum.valueOf(EnumC7019y.class, str);
    }

    public static EnumC7019y[] values() {
        return (EnumC7019y[]) f22438s0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7415a() {
        return this == f22434o0 || this == f22435p0 || this == f22437r0;
    }
}
