package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.j5 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14770j5 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14770j5 f46209Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14770j5 f46210Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14770j5 f46211o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14770j5 f46212p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC14770j5[] f46213q0;

    static {
        EnumC14770j5 enumC14770j5 = new EnumC14770j5("DISPATCH_RULE_DIRECT", 0);
        f46209Y = enumC14770j5;
        EnumC14770j5 enumC14770j6 = new EnumC14770j5("DISPATCH_RULE_INDIVIDUAL", 1);
        f46210Z = enumC14770j6;
        EnumC14770j5 enumC14770j7 = new EnumC14770j5("DISPATCH_RULE_CALLEE", 2);
        f46211o0 = enumC14770j7;
        EnumC14770j5 enumC14770j8 = new EnumC14770j5("RULE_NOT_SET", 3);
        f46212p0 = enumC14770j8;
        f46213q0 = new EnumC14770j5[]{enumC14770j5, enumC14770j6, enumC14770j7, enumC14770j8};
    }

    public static EnumC14770j5 valueOf(String str) {
        return (EnumC14770j5) Enum.valueOf(EnumC14770j5.class, str);
    }

    public static EnumC14770j5[] values() {
        return (EnumC14770j5[]) f46213q0.clone();
    }
}
