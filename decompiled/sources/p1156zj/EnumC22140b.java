package p1156zj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22140b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC22140b f69987Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22140b f69988Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC22140b[] f69989o0;

    static {
        EnumC22140b enumC22140b = new EnumC22140b("IdTypeRejected", 0);
        f69987Y = enumC22140b;
        EnumC22140b enumC22140b2 = new EnumC22140b("UnableToClassify", 1);
        f69988Z = enumC22140b2;
        EnumC22140b[] enumC22140bArr = {enumC22140b, enumC22140b2};
        f69989o0 = enumC22140bArr;
        AbstractC7877E4.m8156j(enumC22140bArr);
    }

    public static EnumC22140b valueOf(String str) {
        return (EnumC22140b) Enum.valueOf(EnumC22140b.class, str);
    }

    public static EnumC22140b[] values() {
        return (EnumC22140b[]) f69989o0.clone();
    }
}
