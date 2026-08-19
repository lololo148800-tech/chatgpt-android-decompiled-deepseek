package p785hc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14442a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14442a f45417Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14442a f45418Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14442a f45419o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14442a f45420p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14442a f45421q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC14442a f45422r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC14442a f45423s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ EnumC14442a[] f45424t0;

    static {
        EnumC14442a enumC14442a = new EnumC14442a("ERROR_CORRECTION", 0);
        f45417Y = enumC14442a;
        EnumC14442a enumC14442a2 = new EnumC14442a("CHARACTER_SET", 1);
        f45418Z = enumC14442a2;
        EnumC14442a enumC14442a3 = new EnumC14442a("DATA_MATRIX_SHAPE", 2);
        EnumC14442a enumC14442a4 = new EnumC14442a("DATA_MATRIX_COMPACT", 3);
        EnumC14442a enumC14442a5 = new EnumC14442a("MIN_SIZE", 4);
        EnumC14442a enumC14442a6 = new EnumC14442a("MAX_SIZE", 5);
        EnumC14442a enumC14442a7 = new EnumC14442a("MARGIN", 6);
        f45419o0 = enumC14442a7;
        EnumC14442a enumC14442a8 = new EnumC14442a("PDF417_COMPACT", 7);
        EnumC14442a enumC14442a9 = new EnumC14442a("PDF417_COMPACTION", 8);
        EnumC14442a enumC14442a10 = new EnumC14442a("PDF417_DIMENSIONS", 9);
        EnumC14442a enumC14442a11 = new EnumC14442a("PDF417_AUTO_ECI", 10);
        EnumC14442a enumC14442a12 = new EnumC14442a("AZTEC_LAYERS", 11);
        EnumC14442a enumC14442a13 = new EnumC14442a("QR_VERSION", 12);
        f45420p0 = enumC14442a13;
        EnumC14442a enumC14442a14 = new EnumC14442a("QR_MASK_PATTERN", 13);
        f45421q0 = enumC14442a14;
        EnumC14442a enumC14442a15 = new EnumC14442a("QR_COMPACT", 14);
        f45422r0 = enumC14442a15;
        EnumC14442a enumC14442a16 = new EnumC14442a("GS1_FORMAT", 15);
        f45423s0 = enumC14442a16;
        f45424t0 = new EnumC14442a[]{enumC14442a, enumC14442a2, enumC14442a3, enumC14442a4, enumC14442a5, enumC14442a6, enumC14442a7, enumC14442a8, enumC14442a9, enumC14442a10, enumC14442a11, enumC14442a12, enumC14442a13, enumC14442a14, enumC14442a15, enumC14442a16, new EnumC14442a("FORCE_CODE_SET", 16), new EnumC14442a("FORCE_C40", 17), new EnumC14442a("CODE128_COMPACT", 18)};
    }

    public static EnumC14442a valueOf(String str) {
        return (EnumC14442a) Enum.valueOf(EnumC14442a.class, str);
    }

    public static EnumC14442a[] values() {
        return (EnumC14442a[]) f45424t0.clone();
    }
}
