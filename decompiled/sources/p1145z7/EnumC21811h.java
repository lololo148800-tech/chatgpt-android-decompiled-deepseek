package p1145z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z7.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21811h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21811h f69174Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21811h f69175Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21811h f69176o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21811h f69177p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC21811h f69178q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC21811h[] f69179r0;

    static {
        EnumC21811h enumC21811h = new EnumC21811h("UNKNOWN", 0);
        f69174Y = enumC21811h;
        EnumC21811h enumC21811h2 = new EnumC21811h("CHARGING", 1);
        f69175Z = enumC21811h2;
        EnumC21811h enumC21811h3 = new EnumC21811h("DISCHARGING", 2);
        f69176o0 = enumC21811h3;
        EnumC21811h enumC21811h4 = new EnumC21811h("NOT_CHARGING", 3);
        f69177p0 = enumC21811h4;
        EnumC21811h enumC21811h5 = new EnumC21811h("FULL", 4);
        f69178q0 = enumC21811h5;
        f69179r0 = new EnumC21811h[]{enumC21811h, enumC21811h2, enumC21811h3, enumC21811h4, enumC21811h5};
    }

    public static EnumC21811h valueOf(String str) {
        return (EnumC21811h) Enum.valueOf(EnumC21811h.class, str);
    }

    public static EnumC21811h[] values() {
        return (EnumC21811h[]) f69179r0.clone();
    }
}
