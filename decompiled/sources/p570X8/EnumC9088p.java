package p570X8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X8.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9088p {

    /* JADX INFO: renamed from: Y */
    public static final EnumC9088p f27854Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC9088p[] f27855Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9088p EF2;

    static {
        EnumC9088p enumC9088p = new EnumC9088p("UNKNOWN", 0);
        EnumC9088p enumC9088p2 = new EnumC9088p("ANDROID_FIREBASE", 1);
        f27854Y = enumC9088p2;
        f27855Z = new EnumC9088p[]{enumC9088p, enumC9088p2};
    }

    public static EnumC9088p valueOf(String str) {
        return (EnumC9088p) Enum.valueOf(EnumC9088p.class, str);
    }

    public static EnumC9088p[] values() {
        return (EnumC9088p[]) f27855Z.clone();
    }
}
