package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14723d0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14723d0 f46049Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14723d0 f46050Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14723d0 f46051o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14723d0 f46052p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14723d0 f46053q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC14723d0[] f46054r0;

    static {
        EnumC14723d0 enumC14723d0 = new EnumC14723d0("S3", 0);
        f46049Y = enumC14723d0;
        EnumC14723d0 enumC14723d1 = new EnumC14723d0("GCP", 1);
        f46050Z = enumC14723d1;
        EnumC14723d0 enumC14723d2 = new EnumC14723d0("AZURE", 2);
        f46051o0 = enumC14723d2;
        EnumC14723d0 enumC14723d3 = new EnumC14723d0("ALIOSS", 3);
        f46052p0 = enumC14723d3;
        EnumC14723d0 enumC14723d4 = new EnumC14723d0("OUTPUT_NOT_SET", 4);
        f46053q0 = enumC14723d4;
        f46054r0 = new EnumC14723d0[]{enumC14723d0, enumC14723d1, enumC14723d2, enumC14723d3, enumC14723d4};
    }

    public static EnumC14723d0 valueOf(String str) {
        return (EnumC14723d0) Enum.valueOf(EnumC14723d0.class, str);
    }

    public static EnumC14723d0[] values() {
        return (EnumC14723d0[]) f46054r0.clone();
    }
}
