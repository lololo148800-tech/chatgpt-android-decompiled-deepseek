package p520V5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V5.G */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7769G {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7769G f24552Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7769G f24553Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7769G f24554o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC7769G[] f24555p0;

    static {
        EnumC7769G enumC7769G = new EnumC7769G("AUTOMATIC", 0);
        f24552Y = enumC7769G;
        EnumC7769G enumC7769G2 = new EnumC7769G("HARDWARE", 1);
        f24553Z = enumC7769G2;
        EnumC7769G enumC7769G3 = new EnumC7769G("SOFTWARE", 2);
        f24554o0 = enumC7769G3;
        f24555p0 = new EnumC7769G[]{enumC7769G, enumC7769G2, enumC7769G3};
    }

    public static EnumC7769G valueOf(String str) {
        return (EnumC7769G) Enum.valueOf(EnumC7769G.class, str);
    }

    public static EnumC7769G[] values() {
        return (EnumC7769G[]) f24555p0.clone();
    }
}
