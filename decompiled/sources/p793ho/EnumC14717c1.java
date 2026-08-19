package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14717c1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14717c1 f46044Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14717c1 f46045Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14717c1 f46046o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14717c1 f46047p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14717c1[] f46048q0;

    static {
        EnumC14717c1 enumC14717c1 = new EnumC14717c1("FILE", 0);
        f46044Y = enumC14717c1;
        EnumC14717c1 enumC14717c2 = new EnumC14717c1("STREAM", 1);
        f46045Z = enumC14717c2;
        EnumC14717c1 enumC14717c3 = new EnumC14717c1("SEGMENTS", 2);
        f46046o0 = enumC14717c3;
        EnumC14717c1 enumC14717c4 = new EnumC14717c1("OUTPUT_NOT_SET", 3);
        f46047p0 = enumC14717c4;
        f46048q0 = new EnumC14717c1[]{enumC14717c1, enumC14717c2, enumC14717c3, enumC14717c4};
    }

    public static EnumC14717c1 valueOf(String str) {
        return (EnumC14717c1) Enum.valueOf(EnumC14717c1.class, str);
    }

    public static EnumC14717c1[] values() {
        return (EnumC14717c1[]) f46048q0.clone();
    }
}
