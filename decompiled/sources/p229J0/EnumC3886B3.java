package p229J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J0.B3 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3886B3 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3886B3 f11777Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3886B3 f11778Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3886B3 f11779o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3886B3[] f11780p0;

    static {
        EnumC3886B3 enumC3886B3 = new EnumC3886B3("Hidden", 0);
        f11777Y = enumC3886B3;
        EnumC3886B3 enumC3886B4 = new EnumC3886B3("Expanded", 1);
        f11778Z = enumC3886B4;
        EnumC3886B3 enumC3886B5 = new EnumC3886B3("PartiallyExpanded", 2);
        f11779o0 = enumC3886B5;
        f11780p0 = new EnumC3886B3[]{enumC3886B3, enumC3886B4, enumC3886B5};
    }

    public static EnumC3886B3 valueOf(String str) {
        return (EnumC3886B3) Enum.valueOf(EnumC3886B3.class, str);
    }

    public static EnumC3886B3[] values() {
        return (EnumC3886B3[]) f11780p0.clone();
    }
}
