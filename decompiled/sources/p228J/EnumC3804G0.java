package p228J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3804G0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3804G0 f11507Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3804G0 f11508Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3804G0 f11509o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3804G0 f11510p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3804G0 f11511q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC3804G0 f11512r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC3804G0[] f11513s0;

    static {
        EnumC3804G0 enumC3804G0 = new EnumC3804G0("IMAGE_CAPTURE", 0);
        f11507Y = enumC3804G0;
        EnumC3804G0 enumC3804G1 = new EnumC3804G0("PREVIEW", 1);
        f11508Z = enumC3804G1;
        EnumC3804G0 enumC3804G2 = new EnumC3804G0("IMAGE_ANALYSIS", 2);
        f11509o0 = enumC3804G2;
        EnumC3804G0 enumC3804G3 = new EnumC3804G0("VIDEO_CAPTURE", 3);
        f11510p0 = enumC3804G3;
        EnumC3804G0 enumC3804G4 = new EnumC3804G0("STREAM_SHARING", 4);
        f11511q0 = enumC3804G4;
        EnumC3804G0 enumC3804G5 = new EnumC3804G0("METERING_REPEATING", 5);
        f11512r0 = enumC3804G5;
        f11513s0 = new EnumC3804G0[]{enumC3804G0, enumC3804G1, enumC3804G2, enumC3804G3, enumC3804G4, enumC3804G5};
    }

    public static EnumC3804G0 valueOf(String str) {
        return (EnumC3804G0) Enum.valueOf(EnumC3804G0.class, str);
    }

    public static EnumC3804G0[] values() {
        return (EnumC3804G0[]) f11513s0.clone();
    }
}
