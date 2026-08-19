package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11104m {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11104m f33474Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11104m f33475Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11104m f33476o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11104m f33477p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC11104m f33478q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC11104m[] f33479r0;

    static {
        EnumC11104m enumC11104m = new EnumC11104m("DESTROYED", 0);
        f33474Y = enumC11104m;
        EnumC11104m enumC11104m2 = new EnumC11104m("INITIALIZED", 1);
        f33475Z = enumC11104m2;
        EnumC11104m enumC11104m3 = new EnumC11104m("CREATED", 2);
        f33476o0 = enumC11104m3;
        EnumC11104m enumC11104m4 = new EnumC11104m("STARTED", 3);
        f33477p0 = enumC11104m4;
        EnumC11104m enumC11104m5 = new EnumC11104m("RESUMED", 4);
        f33478q0 = enumC11104m5;
        f33479r0 = new EnumC11104m[]{enumC11104m, enumC11104m2, enumC11104m3, enumC11104m4, enumC11104m5};
    }

    public static EnumC11104m valueOf(String str) {
        return (EnumC11104m) Enum.valueOf(EnumC11104m.class, str);
    }

    public static EnumC11104m[] values() {
        return (EnumC11104m[]) f33479r0.clone();
    }
}
