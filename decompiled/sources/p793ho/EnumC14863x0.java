package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14863x0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14863x0 f46346Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14863x0 f46347Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14863x0 f46348o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14863x0 f46349p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14863x0 f46350q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC14863x0[] f46351r0;

    static {
        EnumC14863x0 enumC14863x0 = new EnumC14863x0("S3", 0);
        f46346Y = enumC14863x0;
        EnumC14863x0 enumC14863x1 = new EnumC14863x0("GCP", 1);
        f46347Z = enumC14863x1;
        EnumC14863x0 enumC14863x2 = new EnumC14863x0("AZURE", 2);
        f46348o0 = enumC14863x2;
        EnumC14863x0 enumC14863x3 = new EnumC14863x0("ALIOSS", 3);
        f46349p0 = enumC14863x3;
        EnumC14863x0 enumC14863x4 = new EnumC14863x0("OUTPUT_NOT_SET", 4);
        f46350q0 = enumC14863x4;
        f46351r0 = new EnumC14863x0[]{enumC14863x0, enumC14863x1, enumC14863x2, enumC14863x3, enumC14863x4};
    }

    public static EnumC14863x0 valueOf(String str) {
        return (EnumC14863x0) Enum.valueOf(EnumC14863x0.class, str);
    }

    public static EnumC14863x0[] values() {
        return (EnumC14863x0[]) f46351r0.clone();
    }
}
