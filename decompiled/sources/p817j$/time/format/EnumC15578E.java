package p817j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.format.E */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15578E {
    public static final EnumC15578E LENIENT;
    public static final EnumC15578E SMART;
    public static final EnumC15578E STRICT;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15578E[] f48648a;

    public static EnumC15578E valueOf(String str) {
        return (EnumC15578E) Enum.valueOf(EnumC15578E.class, str);
    }

    public static EnumC15578E[] values() {
        return (EnumC15578E[]) f48648a.clone();
    }

    static {
        EnumC15578E enumC15578E = new EnumC15578E("STRICT", 0);
        STRICT = enumC15578E;
        EnumC15578E enumC15578E2 = new EnumC15578E("SMART", 1);
        SMART = enumC15578E2;
        EnumC15578E enumC15578E3 = new EnumC15578E("LENIENT", 2);
        LENIENT = enumC15578E3;
        f48648a = new EnumC15578E[]{enumC15578E, enumC15578E2, enumC15578E3};
    }
}
