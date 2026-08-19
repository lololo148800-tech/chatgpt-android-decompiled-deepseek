package p860l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC16673F0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16673F0 f53401Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16673F0 f53402Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC16673F0[] f53403o0;

    static {
        EnumC16673F0 enumC16673F0 = new EnumC16673F0("Vertical", 0);
        f53401Y = enumC16673F0;
        EnumC16673F0 enumC16673F1 = new EnumC16673F0("Horizontal", 1);
        f53402Z = enumC16673F1;
        f53403o0 = new EnumC16673F0[]{enumC16673F0, enumC16673F1};
    }

    public static EnumC16673F0 valueOf(String str) {
        return (EnumC16673F0) Enum.valueOf(EnumC16673F0.class, str);
    }

    public static EnumC16673F0[] values() {
        return (EnumC16673F0[]) f53403o0.clone();
    }
}
