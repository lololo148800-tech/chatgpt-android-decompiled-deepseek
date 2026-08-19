package p1071w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w0.T */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC20730T {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20730T f65728Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20730T f65729Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20730T f65730o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC20730T[] f65731p0;

    static {
        EnumC20730T enumC20730T = new EnumC20730T("None", 0);
        f65728Y = enumC20730T;
        EnumC20730T enumC20730T2 = new EnumC20730T("Selection", 1);
        f65729Z = enumC20730T2;
        EnumC20730T enumC20730T3 = new EnumC20730T("Cursor", 2);
        f65730o0 = enumC20730T3;
        f65731p0 = new EnumC20730T[]{enumC20730T, enumC20730T2, enumC20730T3};
    }

    public static EnumC20730T valueOf(String str) {
        return (EnumC20730T) Enum.valueOf(EnumC20730T.class, str);
    }

    public static EnumC20730T[] values() {
        return (EnumC20730T[]) f65731p0.clone();
    }
}
