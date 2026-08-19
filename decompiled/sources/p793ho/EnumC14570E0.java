package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14570E0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14570E0 f45824Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14570E0 f45825Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14570E0 f45826o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14570E0[] f45827p0;

    static {
        EnumC14570E0 enumC14570E0 = new EnumC14570E0("PRESET", 0);
        f45824Y = enumC14570E0;
        EnumC14570E0 enumC14570E1 = new EnumC14570E0("ADVANCED", 1);
        f45825Z = enumC14570E1;
        EnumC14570E0 enumC14570E2 = new EnumC14570E0("OPTIONS_NOT_SET", 2);
        f45826o0 = enumC14570E2;
        f45827p0 = new EnumC14570E0[]{enumC14570E0, enumC14570E1, enumC14570E2};
    }

    public static EnumC14570E0 valueOf(String str) {
        return (EnumC14570E0) Enum.valueOf(EnumC14570E0.class, str);
    }

    public static EnumC14570E0[] values() {
        return (EnumC14570E0[]) f45827p0.clone();
    }
}
