package p180H1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H1.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3197a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3197a f9647Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3197a f9648Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC3197a[] f9649o0;

    static {
        EnumC3197a enumC3197a = new EnumC3197a("On", 0);
        f9647Y = enumC3197a;
        EnumC3197a enumC3197a2 = new EnumC3197a("Off", 1);
        f9648Z = enumC3197a2;
        f9649o0 = new EnumC3197a[]{enumC3197a, enumC3197a2, new EnumC3197a("Indeterminate", 2)};
    }

    public static EnumC3197a valueOf(String str) {
        return (EnumC3197a) Enum.valueOf(EnumC3197a.class, str);
    }

    public static EnumC3197a[] values() {
        return (EnumC3197a[]) f9649o0.clone();
    }
}
