package p592Y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y7.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9671f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC9671f f29156Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9671f f29157Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9671f f29158o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC9671f[] f29159p0;

    static {
        EnumC9671f enumC9671f = new EnumC9671f("FLUTTER_BUILD_TIME", 0);
        f29156Y = enumC9671f;
        EnumC9671f enumC9671f2 = new EnumC9671f("FLUTTER_RASTER_TIME", 1);
        f29157Z = enumC9671f2;
        EnumC9671f enumC9671f3 = new EnumC9671f("JS_FRAME_TIME", 2);
        f29158o0 = enumC9671f3;
        f29159p0 = new EnumC9671f[]{enumC9671f, enumC9671f2, enumC9671f3};
    }

    public static EnumC9671f valueOf(String str) {
        return (EnumC9671f) Enum.valueOf(EnumC9671f.class, str);
    }

    public static EnumC9671f[] values() {
        return (EnumC9671f[]) f29159p0.clone();
    }
}
