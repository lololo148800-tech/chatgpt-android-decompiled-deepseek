package p278L0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4881j0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4881j0 f15912Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4881j0 f15913Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC4881j0[] f15914o0;

    static {
        EnumC4881j0 enumC4881j0 = new EnumC4881j0("Filled", 0);
        f15912Y = enumC4881j0;
        EnumC4881j0 enumC4881j1 = new EnumC4881j0("Outlined", 1);
        f15913Z = enumC4881j1;
        f15914o0 = new EnumC4881j0[]{enumC4881j0, enumC4881j1};
    }

    public static EnumC4881j0 valueOf(String str) {
        return (EnumC4881j0) Enum.valueOf(EnumC4881j0.class, str);
    }

    public static EnumC4881j0[] values() {
        return (EnumC4881j0[]) f15914o0.clone();
    }
}
