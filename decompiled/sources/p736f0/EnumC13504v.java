package p736f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f0.v */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13504v {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13504v f42754Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13504v f42755Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC13504v f42756o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC13504v[] f42757p0;

    static {
        EnumC13504v enumC13504v = new EnumC13504v("PreEnter", 0);
        f42754Y = enumC13504v;
        EnumC13504v enumC13504v2 = new EnumC13504v("Visible", 1);
        f42755Z = enumC13504v2;
        EnumC13504v enumC13504v3 = new EnumC13504v("PostExit", 2);
        f42756o0 = enumC13504v3;
        f42757p0 = new EnumC13504v[]{enumC13504v, enumC13504v2, enumC13504v3};
    }

    public static EnumC13504v valueOf(String str) {
        return (EnumC13504v) Enum.valueOf(EnumC13504v.class, str);
    }

    public static EnumC13504v[] values() {
        return (EnumC13504v[]) f42757p0.clone();
    }
}
