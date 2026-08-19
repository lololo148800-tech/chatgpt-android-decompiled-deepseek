package p569X7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X7.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9072a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC9072a f27783Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9072a f27784Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9072a f27785o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC9072a[] f27786p0;

    static {
        EnumC9072a enumC9072a = new EnumC9072a("GRANTED", 0);
        f27783Y = enumC9072a;
        EnumC9072a enumC9072a2 = new EnumC9072a("NOT_GRANTED", 1);
        f27784Z = enumC9072a2;
        EnumC9072a enumC9072a3 = new EnumC9072a("PENDING", 2);
        f27785o0 = enumC9072a3;
        f27786p0 = new EnumC9072a[]{enumC9072a, enumC9072a2, enumC9072a3};
    }

    public static EnumC9072a valueOf(String str) {
        return (EnumC9072a) Enum.valueOf(EnumC9072a.class, str);
    }

    public static EnumC9072a[] values() {
        return (EnumC9072a[]) f27786p0.clone();
    }
}
