package p062C8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: C8.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1613a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC1613a f4488Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1613a f4489Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC1613a f4490o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC1613a f4491p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC1613a f4492q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC1613a[] f4493r0;

    static {
        EnumC1613a enumC1613a = new EnumC1613a("DATADOG", 0);
        f4488Y = enumC1613a;
        EnumC1613a enumC1613a2 = new EnumC1613a("B3", 1);
        f4489Z = enumC1613a2;
        EnumC1613a enumC1613a3 = new EnumC1613a("B3MULTI", 2);
        f4490o0 = enumC1613a3;
        EnumC1613a enumC1613a4 = new EnumC1613a("TRACECONTEXT", 3);
        f4491p0 = enumC1613a4;
        EnumC1613a enumC1613a5 = new EnumC1613a("HAYSTACK", 4);
        f4492q0 = enumC1613a5;
        f4493r0 = new EnumC1613a[]{enumC1613a, enumC1613a2, enumC1613a3, enumC1613a4, enumC1613a5};
    }

    public static EnumC1613a valueOf(String str) {
        return (EnumC1613a) Enum.valueOf(EnumC1613a.class, str);
    }

    public static EnumC1613a[] values() {
        return (EnumC1613a[]) f4493r0.clone();
    }
}
