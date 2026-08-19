package p676c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c7.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11684c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11684c f35434Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11684c f35435Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11684c f35436o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11684c f35437p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC11684c[] f35438q0;

    static {
        EnumC11684c enumC11684c = new EnumC11684c("MOBILE", 0);
        f35434Y = enumC11684c;
        EnumC11684c enumC11684c2 = new EnumC11684c("TABLET", 1);
        f35435Z = enumC11684c2;
        EnumC11684c enumC11684c3 = new EnumC11684c("TV", 2);
        f35436o0 = enumC11684c3;
        EnumC11684c enumC11684c4 = new EnumC11684c("DESKTOP", 3);
        EnumC11684c enumC11684c5 = new EnumC11684c("OTHER", 4);
        f35437p0 = enumC11684c5;
        f35438q0 = new EnumC11684c[]{enumC11684c, enumC11684c2, enumC11684c3, enumC11684c4, enumC11684c5};
    }

    public static EnumC11684c valueOf(String str) {
        return (EnumC11684c) Enum.valueOf(EnumC11684c.class, str);
    }

    public static EnumC11684c[] values() {
        return (EnumC11684c[]) f35438q0.clone();
    }
}
