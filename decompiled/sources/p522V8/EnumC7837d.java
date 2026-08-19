package p522V8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V8.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7837d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7837d f24731Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7837d f24732Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7837d f24733o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC7837d[] f24734p0;

    static {
        EnumC7837d enumC7837d = new EnumC7837d("DEFAULT", 0);
        f24731Y = enumC7837d;
        EnumC7837d enumC7837d2 = new EnumC7837d("VERY_LOW", 1);
        f24732Z = enumC7837d2;
        EnumC7837d enumC7837d3 = new EnumC7837d("HIGHEST", 2);
        f24733o0 = enumC7837d3;
        f24734p0 = new EnumC7837d[]{enumC7837d, enumC7837d2, enumC7837d3};
    }

    public static EnumC7837d valueOf(String str) {
        return (EnumC7837d) Enum.valueOf(EnumC7837d.class, str);
    }

    public static EnumC7837d[] values() {
        return (EnumC7837d[]) f24734p0.clone();
    }
}
