package p773h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14284g0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14284g0 f44821Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14284g0 f44822Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14284g0 f44823o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14284g0[] f44824p0;

    static {
        EnumC14284g0 enumC14284g0 = new EnumC14284g0("Default", 0);
        f44821Y = enumC14284g0;
        EnumC14284g0 enumC14284g1 = new EnumC14284g0("UserInput", 1);
        f44822Z = enumC14284g1;
        EnumC14284g0 enumC14284g2 = new EnumC14284g0("PreventUserInput", 2);
        f44823o0 = enumC14284g2;
        f44824p0 = new EnumC14284g0[]{enumC14284g0, enumC14284g1, enumC14284g2};
    }

    public static EnumC14284g0 valueOf(String str) {
        return (EnumC14284g0) Enum.valueOf(EnumC14284g0.class, str);
    }

    public static EnumC14284g0[] values() {
        return (EnumC14284g0[]) f44824p0.clone();
    }
}
