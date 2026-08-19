package p817j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.f3 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15910f3 {
    public static final EnumC15910f3 DOUBLE_VALUE;
    public static final EnumC15910f3 INT_VALUE;
    public static final EnumC15910f3 LONG_VALUE;
    public static final EnumC15910f3 REFERENCE;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15910f3[] f49289a;

    public static EnumC15910f3 valueOf(String str) {
        return (EnumC15910f3) Enum.valueOf(EnumC15910f3.class, str);
    }

    public static EnumC15910f3[] values() {
        return (EnumC15910f3[]) f49289a.clone();
    }

    static {
        EnumC15910f3 enumC15910f3 = new EnumC15910f3("REFERENCE", 0);
        REFERENCE = enumC15910f3;
        EnumC15910f3 enumC15910f4 = new EnumC15910f3("INT_VALUE", 1);
        INT_VALUE = enumC15910f4;
        EnumC15910f3 enumC15910f5 = new EnumC15910f3("LONG_VALUE", 2);
        LONG_VALUE = enumC15910f5;
        EnumC15910f3 enumC15910f6 = new EnumC15910f3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC15910f6;
        f49289a = new EnumC15910f3[]{enumC15910f3, enumC15910f4, enumC15910f5, enumC15910f6};
    }
}
