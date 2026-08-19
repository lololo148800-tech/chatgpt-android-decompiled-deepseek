package p615Z6;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z6.h */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10215h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10215h f30335Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10215h f30336Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10215h f30337o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10215h f30338p0;

    /* JADX INFO: renamed from: q0 */
    public static final HashMap f30339q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC10215h[] f30340r0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10215h EF6;

    static {
        EnumC10215h enumC10215h = new EnumC10215h("target", 0);
        EnumC10215h enumC10215h2 = new EnumC10215h("root", 1);
        EnumC10215h enumC10215h3 = new EnumC10215h("nth_child", 2);
        f30335Y = enumC10215h3;
        EnumC10215h enumC10215h4 = new EnumC10215h("nth_last_child", 3);
        EnumC10215h enumC10215h5 = new EnumC10215h("nth_of_type", 4);
        f30336Z = enumC10215h5;
        EnumC10215h enumC10215h6 = new EnumC10215h("nth_last_of_type", 5);
        f30337o0 = enumC10215h6;
        EnumC10215h enumC10215h7 = new EnumC10215h("first_child", 6);
        EnumC10215h enumC10215h8 = new EnumC10215h("last_child", 7);
        EnumC10215h enumC10215h9 = new EnumC10215h("first_of_type", 8);
        EnumC10215h enumC10215h10 = new EnumC10215h("last_of_type", 9);
        EnumC10215h enumC10215h11 = new EnumC10215h("only_child", 10);
        EnumC10215h enumC10215h12 = new EnumC10215h("only_of_type", 11);
        EnumC10215h enumC10215h13 = new EnumC10215h("empty", 12);
        EnumC10215h enumC10215h14 = new EnumC10215h("not", 13);
        EnumC10215h enumC10215h15 = new EnumC10215h("lang", 14);
        EnumC10215h enumC10215h16 = new EnumC10215h("link", 15);
        EnumC10215h enumC10215h17 = new EnumC10215h("visited", 16);
        EnumC10215h enumC10215h18 = new EnumC10215h("hover", 17);
        EnumC10215h enumC10215h19 = new EnumC10215h("active", 18);
        EnumC10215h enumC10215h20 = new EnumC10215h("focus", 19);
        EnumC10215h enumC10215h21 = new EnumC10215h("enabled", 20);
        EnumC10215h enumC10215h22 = new EnumC10215h("disabled", 21);
        EnumC10215h enumC10215h23 = new EnumC10215h("checked", 22);
        EnumC10215h enumC10215h24 = new EnumC10215h("indeterminate", 23);
        EnumC10215h enumC10215h25 = new EnumC10215h("UNSUPPORTED", 24);
        f30338p0 = enumC10215h25;
        f30340r0 = new EnumC10215h[]{enumC10215h, enumC10215h2, enumC10215h3, enumC10215h4, enumC10215h5, enumC10215h6, enumC10215h7, enumC10215h8, enumC10215h9, enumC10215h10, enumC10215h11, enumC10215h12, enumC10215h13, enumC10215h14, enumC10215h15, enumC10215h16, enumC10215h17, enumC10215h18, enumC10215h19, enumC10215h20, enumC10215h21, enumC10215h22, enumC10215h23, enumC10215h24, enumC10215h25};
        f30339q0 = new HashMap();
        for (EnumC10215h enumC10215h26 : values()) {
            if (enumC10215h26 != f30338p0) {
                f30339q0.put(enumC10215h26.name().replace('_', '-'), enumC10215h26);
            }
        }
    }

    public static EnumC10215h valueOf(String str) {
        return (EnumC10215h) Enum.valueOf(EnumC10215h.class, str);
    }

    public static EnumC10215h[] values() {
        return (EnumC10215h[]) f30340r0.clone();
    }
}
