package p637a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.q */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10500q {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10500q f31100Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC10500q[] f31101Z;

    static {
        EnumC10500q enumC10500q = new EnumC10500q("Visible", 0);
        f31100Y = enumC10500q;
        f31101Z = new EnumC10500q[]{enumC10500q, new EnumC10500q("Invisible", 1), new EnumC10500q("Gone", 2)};
    }

    public static EnumC10500q valueOf(String str) {
        return (EnumC10500q) Enum.valueOf(EnumC10500q.class, str);
    }

    public static EnumC10500q[] values() {
        return (EnumC10500q[]) f31101Z.clone();
    }
}
