package fk;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13687h {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13687h f43182Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13687h f43183Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC13687h f43184o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC13687h[] f43185p0;

    static {
        EnumC13687h enumC13687h = new EnumC13687h("Font", 0);
        f43182Y = enumC13687h;
        EnumC13687h enumC13687h2 = new EnumC13687h("Drawable", 1);
        f43183Z = enumC13687h2;
        EnumC13687h enumC13687h3 = new EnumC13687h("Raw", 2);
        f43184o0 = enumC13687h3;
        EnumC13687h[] enumC13687hArr = {enumC13687h, enumC13687h2, enumC13687h3};
        f43185p0 = enumC13687hArr;
        AbstractC7877E4.m8156j(enumC13687hArr);
    }

    public static EnumC13687h valueOf(String str) {
        return (EnumC13687h) Enum.valueOf(EnumC13687h.class, str);
    }

    public static EnumC13687h[] values() {
        return (EnumC13687h[]) f43185p0.clone();
    }
}
