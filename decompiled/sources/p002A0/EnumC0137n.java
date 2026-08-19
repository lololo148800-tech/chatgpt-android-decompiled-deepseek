package p002A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A0.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0137n {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0137n f571Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0137n f572Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0137n f573o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC0137n[] f574p0;

    static {
        EnumC0137n enumC0137n = new EnumC0137n("None", 0);
        f571Y = enumC0137n;
        EnumC0137n enumC0137n2 = new EnumC0137n("Touch", 1);
        f572Z = enumC0137n2;
        EnumC0137n enumC0137n3 = new EnumC0137n("Mouse", 2);
        f573o0 = enumC0137n3;
        f574p0 = new EnumC0137n[]{enumC0137n, enumC0137n2, enumC0137n3};
    }

    public static EnumC0137n valueOf(String str) {
        return (EnumC0137n) Enum.valueOf(EnumC0137n.class, str);
    }

    public static EnumC0137n[] values() {
        return (EnumC0137n[]) f574p0.clone();
    }
}
