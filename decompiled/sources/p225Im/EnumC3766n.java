package p225Im;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Im.n */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3766n {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3766n f11414Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3766n f11415Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3766n f11416o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3766n[] f11417p0;

    static {
        EnumC3766n enumC3766n = new EnumC3766n("INSTANCE", 0);
        f11414Y = enumC3766n;
        EnumC3766n enumC3766n2 = new EnumC3766n("EXTENSION_RECEIVER", 1);
        f11415Z = enumC3766n2;
        EnumC3766n enumC3766n3 = new EnumC3766n("VALUE", 2);
        f11416o0 = enumC3766n3;
        EnumC3766n[] enumC3766nArr = {enumC3766n, enumC3766n2, enumC3766n3};
        f11417p0 = enumC3766nArr;
        AbstractC7877E4.m8156j(enumC3766nArr);
    }

    public static EnumC3766n valueOf(String str) {
        return (EnumC3766n) Enum.valueOf(EnumC3766n.class, str);
    }

    public static EnumC3766n[] values() {
        return (EnumC3766n[]) f11417p0.clone();
    }
}
