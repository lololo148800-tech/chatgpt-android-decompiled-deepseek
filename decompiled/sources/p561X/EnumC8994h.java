package p561X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8994h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8994h f27446Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8994h f27447Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC8994h[] f27448o0;

    static {
        EnumC8994h enumC8994h = new EnumC8994h("IDLE", 0);
        f27446Y = enumC8994h;
        EnumC8994h enumC8994h2 = new EnumC8994h("STREAMING", 1);
        f27447Z = enumC8994h2;
        f27448o0 = new EnumC8994h[]{enumC8994h, enumC8994h2};
    }

    public static EnumC8994h valueOf(String str) {
        return (EnumC8994h) Enum.valueOf(EnumC8994h.class, str);
    }

    public static EnumC8994h[] values() {
        return (EnumC8994h[]) f27448o0.clone();
    }
}
