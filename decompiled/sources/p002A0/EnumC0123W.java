package p002A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A0.W */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0123W {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0123W f526Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0123W f527Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0123W f528o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC0123W[] f529p0;

    static {
        EnumC0123W enumC0123W = new EnumC0123W("None", 0);
        f526Y = enumC0123W;
        EnumC0123W enumC0123W2 = new EnumC0123W("Cursor", 1);
        f527Z = enumC0123W2;
        EnumC0123W enumC0123W3 = new EnumC0123W("Selection", 2);
        f528o0 = enumC0123W3;
        f529p0 = new EnumC0123W[]{enumC0123W, enumC0123W2, enumC0123W3};
    }

    public static EnumC0123W valueOf(String str) {
        return (EnumC0123W) Enum.valueOf(EnumC0123W.class, str);
    }

    public static EnumC0123W[] values() {
        return (EnumC0123W[]) f529p0.clone();
    }
}
