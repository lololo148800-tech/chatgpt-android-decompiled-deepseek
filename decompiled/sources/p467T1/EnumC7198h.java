package p467T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T1.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7198h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7198h f22859Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7198h f22860Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC7198h[] f22861o0;

    static {
        EnumC7198h enumC7198h = new EnumC7198h("Ltr", 0);
        f22859Y = enumC7198h;
        EnumC7198h enumC7198h2 = new EnumC7198h("Rtl", 1);
        f22860Z = enumC7198h2;
        f22861o0 = new EnumC7198h[]{enumC7198h, enumC7198h2};
    }

    public static EnumC7198h valueOf(String str) {
        return (EnumC7198h) Enum.valueOf(EnumC7198h.class, str);
    }

    public static EnumC7198h[] values() {
        return (EnumC7198h[]) f22861o0.clone();
    }
}
