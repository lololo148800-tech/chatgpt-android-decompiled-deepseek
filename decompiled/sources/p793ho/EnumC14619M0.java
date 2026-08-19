package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14619M0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14619M0 f45909Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14619M0 f45910Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14619M0 f45911o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14619M0 f45912p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14619M0 f45913q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC14619M0[] f45914r0;

    static {
        EnumC14619M0 enumC14619M0 = new EnumC14619M0("S3", 0);
        f45909Y = enumC14619M0;
        EnumC14619M0 enumC14619M1 = new EnumC14619M0("GCP", 1);
        f45910Z = enumC14619M1;
        EnumC14619M0 enumC14619M2 = new EnumC14619M0("AZURE", 2);
        f45911o0 = enumC14619M2;
        EnumC14619M0 enumC14619M3 = new EnumC14619M0("ALIOSS", 3);
        f45912p0 = enumC14619M3;
        EnumC14619M0 enumC14619M4 = new EnumC14619M0("OUTPUT_NOT_SET", 4);
        f45913q0 = enumC14619M4;
        f45914r0 = new EnumC14619M0[]{enumC14619M0, enumC14619M1, enumC14619M2, enumC14619M3, enumC14619M4};
    }

    public static EnumC14619M0 valueOf(String str) {
        return (EnumC14619M0) Enum.valueOf(EnumC14619M0.class, str);
    }

    public static EnumC14619M0[] values() {
        return (EnumC14619M0[]) f45914r0.clone();
    }
}
