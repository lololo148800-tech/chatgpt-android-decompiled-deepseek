package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.e1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14731e1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14731e1 f46074Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14731e1 f46075Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14731e1 f46076o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14731e1[] f46077p0;

    static {
        EnumC14731e1 enumC14731e1 = new EnumC14731e1("FILE", 0);
        f46074Y = enumC14731e1;
        EnumC14731e1 enumC14731e2 = new EnumC14731e1("WEBSOCKET_URL", 1);
        f46075Z = enumC14731e2;
        EnumC14731e1 enumC14731e3 = new EnumC14731e1("OUTPUT_NOT_SET", 2);
        f46076o0 = enumC14731e3;
        f46077p0 = new EnumC14731e1[]{enumC14731e1, enumC14731e2, enumC14731e3};
    }

    public static EnumC14731e1 valueOf(String str) {
        return (EnumC14731e1) Enum.valueOf(EnumC14731e1.class, str);
    }

    public static EnumC14731e1[] values() {
        return (EnumC14731e1[]) f46077p0.clone();
    }
}
