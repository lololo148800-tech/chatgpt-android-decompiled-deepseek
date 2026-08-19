package p349O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6020o0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6020o0 f19542Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6020o0 f19543Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6020o0 f19544o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6020o0 f19545p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC6020o0 f19546q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC6020o0 f19547r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC6020o0[] f19548s0;

    static {
        EnumC6020o0 enumC6020o0 = new EnumC6020o0("ShutDown", 0);
        f19542Y = enumC6020o0;
        EnumC6020o0 enumC6020o1 = new EnumC6020o0("ShuttingDown", 1);
        f19543Z = enumC6020o1;
        EnumC6020o0 enumC6020o2 = new EnumC6020o0("Inactive", 2);
        f19544o0 = enumC6020o2;
        EnumC6020o0 enumC6020o3 = new EnumC6020o0("InactivePendingWork", 3);
        f19545p0 = enumC6020o3;
        EnumC6020o0 enumC6020o4 = new EnumC6020o0("Idle", 4);
        f19546q0 = enumC6020o4;
        EnumC6020o0 enumC6020o5 = new EnumC6020o0("PendingWork", 5);
        f19547r0 = enumC6020o5;
        f19548s0 = new EnumC6020o0[]{enumC6020o0, enumC6020o1, enumC6020o2, enumC6020o3, enumC6020o4, enumC6020o5};
    }

    public static EnumC6020o0 valueOf(String str) {
        return (EnumC6020o0) Enum.valueOf(EnumC6020o0.class, str);
    }

    public static EnumC6020o0[] values() {
        return (EnumC6020o0[]) f19548s0.clone();
    }
}
