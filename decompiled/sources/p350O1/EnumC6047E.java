package p350O1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O1.E */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6047E {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6047E f19687Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6047E f19688Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6047E f19689o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6047E f19690p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC6047E[] f19691q0;

    static {
        EnumC6047E enumC6047E = new EnumC6047E("StartInput", 0);
        f19687Y = enumC6047E;
        EnumC6047E enumC6047E2 = new EnumC6047E("StopInput", 1);
        f19688Z = enumC6047E2;
        EnumC6047E enumC6047E3 = new EnumC6047E("ShowKeyboard", 2);
        f19689o0 = enumC6047E3;
        EnumC6047E enumC6047E4 = new EnumC6047E("HideKeyboard", 3);
        f19690p0 = enumC6047E4;
        f19691q0 = new EnumC6047E[]{enumC6047E, enumC6047E2, enumC6047E3, enumC6047E4};
    }

    public static EnumC6047E valueOf(String str) {
        return (EnumC6047E) Enum.valueOf(EnumC6047E.class, str);
    }

    public static EnumC6047E[] values() {
        return (EnumC6047E[]) f19691q0.clone();
    }
}
