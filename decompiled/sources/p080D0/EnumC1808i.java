package p080D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D0.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1808i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC1808i f5205Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1808i f5206Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC1808i f5207o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC1808i f5208p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC1808i[] f5209q0;

    static {
        EnumC1808i enumC1808i = new EnumC1808i("Up", 0);
        f5205Y = enumC1808i;
        EnumC1808i enumC1808i2 = new EnumC1808i("Drag", 1);
        f5206Z = enumC1808i2;
        EnumC1808i enumC1808i3 = new EnumC1808i("Timeout", 2);
        f5207o0 = enumC1808i3;
        EnumC1808i enumC1808i4 = new EnumC1808i("Cancel", 3);
        f5208p0 = enumC1808i4;
        f5209q0 = new EnumC1808i[]{enumC1808i, enumC1808i2, enumC1808i3, enumC1808i4};
    }

    public static EnumC1808i valueOf(String str) {
        return (EnumC1808i) Enum.valueOf(EnumC1808i.class, str);
    }

    public static EnumC1808i[] values() {
        return (EnumC1808i[]) f5209q0.clone();
    }
}
