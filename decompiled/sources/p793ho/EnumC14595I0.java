package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.I0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14595I0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14595I0 f45858Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14595I0 f45859Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14595I0 f45860o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14595I0 f45861p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14595I0[] f45862q0;

    static {
        EnumC14595I0 enumC14595I0 = new EnumC14595I0("FILE", 0);
        f45858Y = enumC14595I0;
        EnumC14595I0 enumC14595I1 = new EnumC14595I0("STREAM", 1);
        f45859Z = enumC14595I1;
        EnumC14595I0 enumC14595I2 = new EnumC14595I0("SEGMENTS", 2);
        f45860o0 = enumC14595I2;
        EnumC14595I0 enumC14595I3 = new EnumC14595I0("OUTPUT_NOT_SET", 3);
        f45861p0 = enumC14595I3;
        f45862q0 = new EnumC14595I0[]{enumC14595I0, enumC14595I1, enumC14595I2, enumC14595I3};
    }

    public static EnumC14595I0 valueOf(String str) {
        return (EnumC14595I0) Enum.valueOf(EnumC14595I0.class, str);
    }

    public static EnumC14595I0[] values() {
        return (EnumC14595I0[]) f45862q0.clone();
    }
}
