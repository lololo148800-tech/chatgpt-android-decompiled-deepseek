package p781h8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h8.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14426a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14426a f45341Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14426a f45342Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14426a f45343o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14426a f45344p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14426a[] f45345q0;

    static {
        EnumC14426a enumC14426a = new EnumC14426a("ACTION", 0);
        f45341Y = enumC14426a;
        EnumC14426a enumC14426a2 = new EnumC14426a("RESOURCE", 1);
        f45342Z = enumC14426a2;
        EnumC14426a enumC14426a3 = new EnumC14426a("ERROR", 2);
        f45343o0 = enumC14426a3;
        EnumC14426a enumC14426a4 = new EnumC14426a("LONG_TASK", 3);
        f45344p0 = enumC14426a4;
        f45345q0 = new EnumC14426a[]{enumC14426a, enumC14426a2, enumC14426a3, enumC14426a4};
    }

    public static EnumC14426a valueOf(String str) {
        return (EnumC14426a) Enum.valueOf(EnumC14426a.class, str);
    }

    public static EnumC14426a[] values() {
        return (EnumC14426a[]) f45345q0.clone();
    }
}
