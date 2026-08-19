package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.L2 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14615L2 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14615L2 f45905Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14615L2 f45906Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14615L2 f45907o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14615L2[] f45908p0;

    static {
        EnumC14615L2 enumC14615L2 = new EnumC14615L2("PAYLOAD", 0);
        f45905Y = enumC14615L2;
        EnumC14615L2 enumC14615L3 = new EnumC14615L2("ERROR", 1);
        f45906Z = enumC14615L3;
        EnumC14615L2 enumC14615L4 = new EnumC14615L2("VALUE_NOT_SET", 2);
        f45907o0 = enumC14615L4;
        f45908p0 = new EnumC14615L2[]{enumC14615L2, enumC14615L3, enumC14615L4};
    }

    public static EnumC14615L2 valueOf(String str) {
        return (EnumC14615L2) Enum.valueOf(EnumC14615L2.class, str);
    }

    public static EnumC14615L2[] values() {
        return (EnumC14615L2[]) f45908p0.clone();
    }
}
