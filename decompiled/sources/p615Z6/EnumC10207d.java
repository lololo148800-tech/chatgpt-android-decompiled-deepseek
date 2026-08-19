package p615Z6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z6.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10207d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10207d f30320Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10207d f30321Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC10207d[] f30322o0;

    static {
        EnumC10207d enumC10207d = new EnumC10207d("all", 0);
        f30320Y = enumC10207d;
        EnumC10207d enumC10207d2 = new EnumC10207d("aural", 1);
        EnumC10207d enumC10207d3 = new EnumC10207d("braille", 2);
        EnumC10207d enumC10207d4 = new EnumC10207d("embossed", 3);
        EnumC10207d enumC10207d5 = new EnumC10207d("handheld", 4);
        EnumC10207d enumC10207d6 = new EnumC10207d("print", 5);
        EnumC10207d enumC10207d7 = new EnumC10207d("projection", 6);
        EnumC10207d enumC10207d8 = new EnumC10207d("screen", 7);
        f30321Z = enumC10207d8;
        f30322o0 = new EnumC10207d[]{enumC10207d, enumC10207d2, enumC10207d3, enumC10207d4, enumC10207d5, enumC10207d6, enumC10207d7, enumC10207d8, new EnumC10207d("speech", 8), new EnumC10207d("tty", 9), new EnumC10207d("tv", 10)};
    }

    public static EnumC10207d valueOf(String str) {
        return (EnumC10207d) Enum.valueOf(EnumC10207d.class, str);
    }

    public static EnumC10207d[] values() {
        return (EnumC10207d[]) f30322o0.clone();
    }
}
