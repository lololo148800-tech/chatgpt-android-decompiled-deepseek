package p1014t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t1.g */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC19730g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19730g f62465Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19730g f62466Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19730g f62467o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC19730g[] f62468p0;

    static {
        EnumC19730g enumC19730g = new EnumC19730g("Initial", 0);
        f62465Y = enumC19730g;
        EnumC19730g enumC19730g2 = new EnumC19730g("Main", 1);
        f62466Z = enumC19730g2;
        EnumC19730g enumC19730g3 = new EnumC19730g("Final", 2);
        f62467o0 = enumC19730g3;
        f62468p0 = new EnumC19730g[]{enumC19730g, enumC19730g2, enumC19730g3};
    }

    public static EnumC19730g valueOf(String str) {
        return (EnumC19730g) Enum.valueOf(EnumC19730g.class, str);
    }

    public static EnumC19730g[] values() {
        return (EnumC19730g[]) f62468p0.clone();
    }
}
