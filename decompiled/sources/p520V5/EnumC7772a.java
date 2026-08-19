package p520V5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V5.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7772a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7772a f24556Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7772a f24557Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC7772a[] f24558o0;

    static {
        EnumC7772a enumC7772a = new EnumC7772a("AUTOMATIC", 0);
        f24556Y = enumC7772a;
        EnumC7772a enumC7772a2 = new EnumC7772a("ENABLED", 1);
        f24557Z = enumC7772a2;
        f24558o0 = new EnumC7772a[]{enumC7772a, enumC7772a2, new EnumC7772a("DISABLED", 2)};
    }

    public static EnumC7772a valueOf(String str) {
        return (EnumC7772a) Enum.valueOf(EnumC7772a.class, str);
    }

    public static EnumC7772a[] values() {
        return (EnumC7772a[]) f24558o0.clone();
    }
}
