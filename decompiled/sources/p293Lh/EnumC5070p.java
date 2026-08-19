package p293Lh;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Lh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5070p {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5070p f16579Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5070p f16580Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5070p[] f16581o0;

    static {
        EnumC5070p enumC5070p = new EnumC5070p("ScrollContent", 0);
        f16579Y = enumC5070p;
        EnumC5070p enumC5070p2 = new EnumC5070p("ScrollAll", 1);
        f16580Z = enumC5070p2;
        EnumC5070p[] enumC5070pArr = {enumC5070p, enumC5070p2};
        f16581o0 = enumC5070pArr;
        AbstractC7877E4.m8156j(enumC5070pArr);
    }

    public static EnumC5070p valueOf(String str) {
        return (EnumC5070p) Enum.valueOf(EnumC5070p.class, str);
    }

    public static EnumC5070p[] values() {
        return (EnumC5070p[]) f16581o0.clone();
    }
}
