package p229J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: J0.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4039d3 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4039d3 f12717Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4039d3 f12718Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4039d3 f12719o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC4039d3 f12720p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC4039d3 f12721q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC4039d3[] f12722r0;

    static {
        EnumC4039d3 enumC4039d3 = new EnumC4039d3("TopBar", 0);
        f12717Y = enumC4039d3;
        EnumC4039d3 enumC4039d4 = new EnumC4039d3("MainContent", 1);
        f12718Z = enumC4039d4;
        EnumC4039d3 enumC4039d5 = new EnumC4039d3("Snackbar", 2);
        f12719o0 = enumC4039d5;
        EnumC4039d3 enumC4039d6 = new EnumC4039d3("Fab", 3);
        f12720p0 = enumC4039d6;
        EnumC4039d3 enumC4039d7 = new EnumC4039d3("BottomBar", 4);
        f12721q0 = enumC4039d7;
        f12722r0 = new EnumC4039d3[]{enumC4039d3, enumC4039d4, enumC4039d5, enumC4039d6, enumC4039d7};
    }

    public static EnumC4039d3 valueOf(String str) {
        return (EnumC4039d3) Enum.valueOf(EnumC4039d3.class, str);
    }

    public static EnumC4039d3[] values() {
        return (EnumC4039d3[]) f12722r0.clone();
    }
}
