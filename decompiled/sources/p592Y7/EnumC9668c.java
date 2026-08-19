package p592Y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y7.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9668c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC9668c f29148Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9668c f29149Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9668c f29150o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC9668c f29151p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC9668c f29152q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC9668c f29153r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC9668c[] f29154s0;

    static {
        EnumC9668c enumC9668c = new EnumC9668c("TAP", 0);
        f29148Y = enumC9668c;
        EnumC9668c enumC9668c2 = new EnumC9668c("SCROLL", 1);
        f29149Z = enumC9668c2;
        EnumC9668c enumC9668c3 = new EnumC9668c("SWIPE", 2);
        f29150o0 = enumC9668c3;
        EnumC9668c enumC9668c4 = new EnumC9668c("CLICK", 3);
        f29151p0 = enumC9668c4;
        EnumC9668c enumC9668c5 = new EnumC9668c("BACK", 4);
        f29152q0 = enumC9668c5;
        EnumC9668c enumC9668c6 = new EnumC9668c("CUSTOM", 5);
        f29153r0 = enumC9668c6;
        f29154s0 = new EnumC9668c[]{enumC9668c, enumC9668c2, enumC9668c3, enumC9668c4, enumC9668c5, enumC9668c6};
    }

    public static EnumC9668c valueOf(String str) {
        return (EnumC9668c) Enum.valueOf(EnumC9668c.class, str);
    }

    public static EnumC9668c[] values() {
        return (EnumC9668c[]) f29154s0.clone();
    }
}
