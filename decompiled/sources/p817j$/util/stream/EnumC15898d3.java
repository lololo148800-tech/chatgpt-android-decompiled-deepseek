package p817j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.d3 */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15898d3 {

    /* JADX INFO: renamed from: OP */
    public static final EnumC15898d3 f49253OP;
    public static final EnumC15898d3 SPLITERATOR;
    public static final EnumC15898d3 STREAM;
    public static final EnumC15898d3 TERMINAL_OP;
    public static final EnumC15898d3 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15898d3[] f49254a;

    public static EnumC15898d3 valueOf(String str) {
        return (EnumC15898d3) Enum.valueOf(EnumC15898d3.class, str);
    }

    public static EnumC15898d3[] values() {
        return (EnumC15898d3[]) f49254a.clone();
    }

    static {
        EnumC15898d3 enumC15898d3 = new EnumC15898d3("SPLITERATOR", 0);
        SPLITERATOR = enumC15898d3;
        EnumC15898d3 enumC15898d4 = new EnumC15898d3("STREAM", 1);
        STREAM = enumC15898d4;
        EnumC15898d3 enumC15898d5 = new EnumC15898d3("OP", 2);
        f49253OP = enumC15898d5;
        EnumC15898d3 enumC15898d6 = new EnumC15898d3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC15898d6;
        EnumC15898d3 enumC15898d7 = new EnumC15898d3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC15898d7;
        f49254a = new EnumC15898d3[]{enumC15898d3, enumC15898d4, enumC15898d5, enumC15898d6, enumC15898d7};
    }
}
