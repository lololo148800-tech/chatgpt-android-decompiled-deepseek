package p229J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J0.D3 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3898D3 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3898D3 f11877Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3898D3 f11878Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3898D3 f11879o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3898D3[] f11880p0;

    static {
        EnumC3898D3 enumC3898D3 = new EnumC3898D3("Short", 0);
        f11877Y = enumC3898D3;
        EnumC3898D3 enumC3898D4 = new EnumC3898D3("Long", 1);
        f11878Z = enumC3898D4;
        EnumC3898D3 enumC3898D5 = new EnumC3898D3("Indefinite", 2);
        f11879o0 = enumC3898D5;
        f11880p0 = new EnumC3898D3[]{enumC3898D3, enumC3898D4, enumC3898D5};
    }

    public static EnumC3898D3 valueOf(String str) {
        return (EnumC3898D3) Enum.valueOf(EnumC3898D3.class, str);
    }

    public static EnumC3898D3[] values() {
        return (EnumC3898D3[]) f11880p0.clone();
    }
}
