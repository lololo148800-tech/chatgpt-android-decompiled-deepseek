package p022Ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ak.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0546g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0546g f1740Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0546g f1741Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0546g f1742o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC0546g[] f1743p0;

    static {
        EnumC0546g enumC0546g = new EnumC0546g("Front", 0);
        f1740Y = enumC0546g;
        EnumC0546g enumC0546g2 = new EnumC0546g("Back", 1);
        f1741Z = enumC0546g2;
        EnumC0546g enumC0546g3 = new EnumC0546g("FrontAndBack", 2);
        f1742o0 = enumC0546g3;
        EnumC0546g[] enumC0546gArr = {enumC0546g, enumC0546g2, enumC0546g3};
        f1743p0 = enumC0546gArr;
        AbstractC7877E4.m8156j(enumC0546gArr);
    }

    public static EnumC0546g valueOf(String str) {
        return (EnumC0546g) Enum.valueOf(EnumC0546g.class, str);
    }

    public static EnumC0546g[] values() {
        return (EnumC0546g[]) f1743p0.clone();
    }
}
