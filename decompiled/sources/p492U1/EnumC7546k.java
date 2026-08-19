package p492U1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U1.k */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7546k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7546k f23904Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7546k f23905Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC7546k[] f23906o0;

    static {
        EnumC7546k enumC7546k = new EnumC7546k("Ltr", 0);
        f23904Y = enumC7546k;
        EnumC7546k enumC7546k2 = new EnumC7546k("Rtl", 1);
        f23905Z = enumC7546k2;
        f23906o0 = new EnumC7546k[]{enumC7546k, enumC7546k2};
    }

    public static EnumC7546k valueOf(String str) {
        return (EnumC7546k) Enum.valueOf(EnumC7546k.class, str);
    }

    public static EnumC7546k[] values() {
        return (EnumC7546k[]) f23906o0.clone();
    }
}
