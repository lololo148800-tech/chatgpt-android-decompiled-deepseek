package p879lp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC17120c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17120c f54726Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17120c f54727Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC17120c f54728o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC17120c[] f54729p0;

    static {
        EnumC17120c enumC17120c = new EnumC17120c("URL", 0);
        f54726Y = enumC17120c;
        EnumC17120c enumC17120c2 = new EnumC17120c("EMAIL", 1);
        f54727Z = enumC17120c2;
        EnumC17120c enumC17120c3 = new EnumC17120c("WWW", 2);
        f54728o0 = enumC17120c3;
        f54729p0 = new EnumC17120c[]{enumC17120c, enumC17120c2, enumC17120c3};
    }

    public static EnumC17120c valueOf(String str) {
        return (EnumC17120c) Enum.valueOf(EnumC17120c.class, str);
    }

    public static EnumC17120c[] values() {
        return (EnumC17120c[]) f54729p0.clone();
    }
}
