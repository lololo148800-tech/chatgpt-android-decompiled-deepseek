package ye;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ye.m */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21524m {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21524m f68163Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21524m f68164Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21524m f68165o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21524m f68166p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC21524m[] f68167q0;

    static {
        EnumC21524m enumC21524m = new EnumC21524m("Creating", 0);
        f68163Y = enumC21524m;
        EnumC21524m enumC21524m2 = new EnumC21524m("Rewriting", 1);
        f68164Z = enumC21524m2;
        EnumC21524m enumC21524m3 = new EnumC21524m("Commenting", 2);
        EnumC21524m enumC21524m4 = new EnumC21524m("Updating", 3);
        f68165o0 = enumC21524m4;
        EnumC21524m enumC21524m5 = new EnumC21524m("Complete", 4);
        f68166p0 = enumC21524m5;
        EnumC21524m[] enumC21524mArr = {enumC21524m, enumC21524m2, enumC21524m3, enumC21524m4, enumC21524m5};
        f68167q0 = enumC21524mArr;
        AbstractC7877E4.m8156j(enumC21524mArr);
    }

    public static EnumC21524m valueOf(String str) {
        return (EnumC21524m) Enum.valueOf(EnumC21524m.class, str);
    }

    public static EnumC21524m[] values() {
        return (EnumC21524m[]) f68167q0.clone();
    }
}
