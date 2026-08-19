package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14589H0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14589H0 f45848Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14589H0 f45849Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14589H0 f45850o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14589H0[] f45851p0;

    static {
        EnumC14589H0 enumC14589H0 = new EnumC14589H0("PRESET", 0);
        f45848Y = enumC14589H0;
        EnumC14589H0 enumC14589H1 = new EnumC14589H0("ADVANCED", 1);
        f45849Z = enumC14589H1;
        EnumC14589H0 enumC14589H2 = new EnumC14589H0("OPTIONS_NOT_SET", 2);
        f45850o0 = enumC14589H2;
        f45851p0 = new EnumC14589H0[]{enumC14589H0, enumC14589H1, enumC14589H2};
    }

    public static EnumC14589H0 valueOf(String str) {
        return (EnumC14589H0) Enum.valueOf(EnumC14589H0.class, str);
    }

    public static EnumC14589H0[] values() {
        return (EnumC14589H0[]) f45851p0.clone();
    }
}
