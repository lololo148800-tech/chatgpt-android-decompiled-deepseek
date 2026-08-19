package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14765j0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14765j0 f46185Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14765j0 f46186Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14765j0 f46187o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14765j0 f46188p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14765j0[] f46189q0;

    static {
        EnumC14765j0 enumC14765j0 = new EnumC14765j0("STREAM", 0);
        f46185Y = enumC14765j0;
        EnumC14765j0 enumC14765j1 = new EnumC14765j0("FILE", 1);
        f46186Z = enumC14765j1;
        EnumC14765j0 enumC14765j2 = new EnumC14765j0("SEGMENTS", 2);
        f46187o0 = enumC14765j2;
        EnumC14765j0 enumC14765j3 = new EnumC14765j0("RESULT_NOT_SET", 3);
        f46188p0 = enumC14765j3;
        f46189q0 = new EnumC14765j0[]{enumC14765j0, enumC14765j1, enumC14765j2, enumC14765j3};
    }

    public static EnumC14765j0 valueOf(String str) {
        return (EnumC14765j0) Enum.valueOf(EnumC14765j0.class, str);
    }

    public static EnumC14765j0[] values() {
        return (EnumC14765j0[]) f46189q0.clone();
    }
}
