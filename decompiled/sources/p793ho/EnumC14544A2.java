package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.A2 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14544A2 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14544A2 f45814Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14544A2 f45815Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC14544A2[] f45816o0;

    static {
        EnumC14544A2 enumC14544A2 = new EnumC14544A2("VP8_MUNGER", 0);
        f45814Y = enumC14544A2;
        EnumC14544A2 enumC14544A3 = new EnumC14544A2("CODECMUNGER_NOT_SET", 1);
        f45815Z = enumC14544A3;
        f45816o0 = new EnumC14544A2[]{enumC14544A2, enumC14544A3};
    }

    public static EnumC14544A2 valueOf(String str) {
        return (EnumC14544A2) Enum.valueOf(EnumC14544A2.class, str);
    }

    public static EnumC14544A2[] values() {
        return (EnumC14544A2[]) f45816o0.clone();
    }
}
