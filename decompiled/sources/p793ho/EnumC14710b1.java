package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.b1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14710b1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14710b1 f46023Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14710b1 f46024Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14710b1 f46025o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14710b1[] f46026p0;

    static {
        EnumC14710b1 enumC14710b1 = new EnumC14710b1("PRESET", 0);
        f46023Y = enumC14710b1;
        EnumC14710b1 enumC14710b2 = new EnumC14710b1("ADVANCED", 1);
        f46024Z = enumC14710b2;
        EnumC14710b1 enumC14710b3 = new EnumC14710b1("OPTIONS_NOT_SET", 2);
        f46025o0 = enumC14710b3;
        f46026p0 = new EnumC14710b1[]{enumC14710b1, enumC14710b2, enumC14710b3};
    }

    public static EnumC14710b1 valueOf(String str) {
        return (EnumC14710b1) Enum.valueOf(EnumC14710b1.class, str);
    }

    public static EnumC14710b1[] values() {
        return (EnumC14710b1[]) f46026p0.clone();
    }
}
