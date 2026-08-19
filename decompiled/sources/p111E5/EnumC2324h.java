package p111E5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: E5.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2324h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC2324h f7224Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC2324h f7225Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC2324h f7226o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC2324h f7227p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC2324h[] f7228q0;

    static {
        EnumC2324h enumC2324h = new EnumC2324h("MEMORY_CACHE", 0);
        f7224Y = enumC2324h;
        EnumC2324h enumC2324h2 = new EnumC2324h("MEMORY", 1);
        f7225Z = enumC2324h2;
        EnumC2324h enumC2324h3 = new EnumC2324h("DISK", 2);
        f7226o0 = enumC2324h3;
        EnumC2324h enumC2324h4 = new EnumC2324h("NETWORK", 3);
        f7227p0 = enumC2324h4;
        EnumC2324h[] enumC2324hArr = {enumC2324h, enumC2324h2, enumC2324h3, enumC2324h4};
        f7228q0 = enumC2324hArr;
        AbstractC7877E4.m8156j(enumC2324hArr);
    }

    public static EnumC2324h valueOf(String str) {
        return (EnumC2324h) Enum.valueOf(EnumC2324h.class, str);
    }

    public static EnumC2324h[] values() {
        return (EnumC2324h[]) f7228q0.clone();
    }
}
