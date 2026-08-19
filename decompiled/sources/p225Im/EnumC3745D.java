package p225Im;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Im.D */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3745D {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3745D f11398Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3745D f11399Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3745D f11400o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3745D f11401p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC3745D[] f11402q0;

    static {
        EnumC3745D enumC3745D = new EnumC3745D("PUBLIC", 0);
        f11398Y = enumC3745D;
        EnumC3745D enumC3745D2 = new EnumC3745D("PROTECTED", 1);
        f11399Z = enumC3745D2;
        EnumC3745D enumC3745D3 = new EnumC3745D("INTERNAL", 2);
        f11400o0 = enumC3745D3;
        EnumC3745D enumC3745D4 = new EnumC3745D("PRIVATE", 3);
        f11401p0 = enumC3745D4;
        EnumC3745D[] enumC3745DArr = {enumC3745D, enumC3745D2, enumC3745D3, enumC3745D4};
        f11402q0 = enumC3745DArr;
        AbstractC7877E4.m8156j(enumC3745DArr);
    }

    public static EnumC3745D valueOf(String str) {
        return (EnumC3745D) Enum.valueOf(EnumC3745D.class, str);
    }

    public static EnumC3745D[] values() {
        return (EnumC3745D[]) f11402q0.clone();
    }
}
