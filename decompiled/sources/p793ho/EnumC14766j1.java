package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.j1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14766j1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14766j1 f46190Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14766j1 f46191Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14766j1 f46192o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14766j1 f46193p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14766j1[] f46194q0;

    static {
        EnumC14766j1 enumC14766j1 = new EnumC14766j1("FILE", 0);
        f46190Y = enumC14766j1;
        EnumC14766j1 enumC14766j2 = new EnumC14766j1("STREAM", 1);
        f46191Z = enumC14766j2;
        EnumC14766j1 enumC14766j3 = new EnumC14766j1("SEGMENTS", 2);
        f46192o0 = enumC14766j3;
        EnumC14766j1 enumC14766j4 = new EnumC14766j1("OUTPUT_NOT_SET", 3);
        f46193p0 = enumC14766j4;
        f46194q0 = new EnumC14766j1[]{enumC14766j1, enumC14766j2, enumC14766j3, enumC14766j4};
    }

    public static EnumC14766j1 valueOf(String str) {
        return (EnumC14766j1) Enum.valueOf(EnumC14766j1.class, str);
    }

    public static EnumC14766j1[] values() {
        return (EnumC14766j1[]) f46194q0.clone();
    }
}
