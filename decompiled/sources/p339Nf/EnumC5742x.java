package p339Nf;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nf.x */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5742x {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5742x f18691Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5742x f18692Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5742x[] f18693o0;

    static {
        EnumC5742x enumC5742x = new EnumC5742x("Links", 0);
        f18691Y = enumC5742x;
        EnumC5742x enumC5742x2 = new EnumC5742x("Images", 1);
        f18692Z = enumC5742x2;
        EnumC5742x[] enumC5742xArr = {enumC5742x, enumC5742x2};
        f18693o0 = enumC5742xArr;
        AbstractC7877E4.m8156j(enumC5742xArr);
    }

    public static EnumC5742x valueOf(String str) {
        return (EnumC5742x) Enum.valueOf(EnumC5742x.class, str);
    }

    public static EnumC5742x[] values() {
        return (EnumC5742x[]) f18693o0.clone();
    }
}
