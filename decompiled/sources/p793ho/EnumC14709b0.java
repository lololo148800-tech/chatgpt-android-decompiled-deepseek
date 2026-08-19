package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14709b0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14709b0 f46019Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14709b0 f46020Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14709b0 f46021o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14709b0[] f46022p0;

    static {
        EnumC14709b0 enumC14709b0 = new EnumC14709b0("PRESET", 0);
        f46019Y = enumC14709b0;
        EnumC14709b0 enumC14709b1 = new EnumC14709b0("ADVANCED", 1);
        f46020Z = enumC14709b1;
        EnumC14709b0 enumC14709b2 = new EnumC14709b0("OPTIONS_NOT_SET", 2);
        f46021o0 = enumC14709b2;
        f46022p0 = new EnumC14709b0[]{enumC14709b0, enumC14709b1, enumC14709b2};
    }

    public static EnumC14709b0 valueOf(String str) {
        return (EnumC14709b0) Enum.valueOf(EnumC14709b0.class, str);
    }

    public static EnumC14709b0[] values() {
        return (EnumC14709b0[]) f46022p0.clone();
    }
}
