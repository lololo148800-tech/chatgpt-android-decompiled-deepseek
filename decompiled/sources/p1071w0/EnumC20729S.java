package p1071w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w0.S */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC20729S {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20729S f65724Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20729S f65725Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20729S f65726o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC20729S[] f65727p0;

    static {
        EnumC20729S enumC20729S = new EnumC20729S("Cursor", 0);
        f65724Y = enumC20729S;
        EnumC20729S enumC20729S2 = new EnumC20729S("SelectionStart", 1);
        f65725Z = enumC20729S2;
        EnumC20729S enumC20729S3 = new EnumC20729S("SelectionEnd", 2);
        f65726o0 = enumC20729S3;
        f65727p0 = new EnumC20729S[]{enumC20729S, enumC20729S2, enumC20729S3};
    }

    public static EnumC20729S valueOf(String str) {
        return (EnumC20729S) Enum.valueOf(EnumC20729S.class, str);
    }

    public static EnumC20729S[] values() {
        return (EnumC20729S[]) f65727p0.clone();
    }
}
