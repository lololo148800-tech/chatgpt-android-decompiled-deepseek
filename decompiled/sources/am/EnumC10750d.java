package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: am.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10750d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10750d f31938Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10750d f31939Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC10750d[] f31940o0;

    static {
        EnumC10750d enumC10750d = new EnumC10750d("BULLET", 0);
        f31938Y = enumC10750d;
        EnumC10750d enumC10750d2 = new EnumC10750d("ORDERED", 1);
        f31939Z = enumC10750d2;
        f31940o0 = new EnumC10750d[]{enumC10750d, enumC10750d2};
    }

    public static EnumC10750d valueOf(String str) {
        return (EnumC10750d) Enum.valueOf(EnumC10750d.class, str);
    }

    public static EnumC10750d[] values() {
        return (EnumC10750d[]) f31940o0.clone();
    }
}
