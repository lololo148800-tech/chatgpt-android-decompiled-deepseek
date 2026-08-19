package p520V5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V5.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7779h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7779h f24571Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7779h f24572Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7779h f24573o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC7779h f24574p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC7779h f24575q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC7779h f24576r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC7779h[] f24577s0;

    static {
        EnumC7779h enumC7779h = new EnumC7779h("SET_ANIMATION", 0);
        f24571Y = enumC7779h;
        EnumC7779h enumC7779h2 = new EnumC7779h("SET_PROGRESS", 1);
        f24572Z = enumC7779h2;
        EnumC7779h enumC7779h3 = new EnumC7779h("SET_REPEAT_MODE", 2);
        f24573o0 = enumC7779h3;
        EnumC7779h enumC7779h4 = new EnumC7779h("SET_REPEAT_COUNT", 3);
        f24574p0 = enumC7779h4;
        EnumC7779h enumC7779h5 = new EnumC7779h("SET_IMAGE_ASSETS", 4);
        f24575q0 = enumC7779h5;
        EnumC7779h enumC7779h6 = new EnumC7779h("PLAY_OPTION", 5);
        f24576r0 = enumC7779h6;
        f24577s0 = new EnumC7779h[]{enumC7779h, enumC7779h2, enumC7779h3, enumC7779h4, enumC7779h5, enumC7779h6};
    }

    public static EnumC7779h valueOf(String str) {
        return (EnumC7779h) Enum.valueOf(EnumC7779h.class, str);
    }

    public static EnumC7779h[] values() {
        return (EnumC7779h[]) f24577s0.clone();
    }
}
