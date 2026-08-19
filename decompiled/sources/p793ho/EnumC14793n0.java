package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14793n0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14793n0 f46240Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14793n0 f46241Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14793n0 f46242o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14793n0 f46243p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14793n0 f46244q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC14793n0[] f46245r0;

    static {
        EnumC14793n0 enumC14793n0 = new EnumC14793n0("S3", 0);
        f46240Y = enumC14793n0;
        EnumC14793n0 enumC14793n1 = new EnumC14793n0("GCP", 1);
        f46241Z = enumC14793n1;
        EnumC14793n0 enumC14793n2 = new EnumC14793n0("AZURE", 2);
        f46242o0 = enumC14793n2;
        EnumC14793n0 enumC14793n3 = new EnumC14793n0("ALIOSS", 3);
        f46243p0 = enumC14793n3;
        EnumC14793n0 enumC14793n4 = new EnumC14793n0("OUTPUT_NOT_SET", 4);
        f46244q0 = enumC14793n4;
        f46245r0 = new EnumC14793n0[]{enumC14793n0, enumC14793n1, enumC14793n2, enumC14793n3, enumC14793n4};
    }

    public static EnumC14793n0 valueOf(String str) {
        return (EnumC14793n0) Enum.valueOf(EnumC14793n0.class, str);
    }

    public static EnumC14793n0[] values() {
        return (EnumC14793n0[]) f46245r0.clone();
    }
}
