package p858ko;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ko.k */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC16508k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16508k f51205Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16508k f51206Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC16508k[] f51207o0;

    static {
        EnumC16508k enumC16508k = new EnumC16508k("In", 0);
        f51205Y = enumC16508k;
        EnumC16508k enumC16508k2 = new EnumC16508k("Out", 1);
        f51206Z = enumC16508k2;
        EnumC16508k[] enumC16508kArr = {enumC16508k, enumC16508k2};
        f51207o0 = enumC16508kArr;
        AbstractC7877E4.m8156j(enumC16508kArr);
    }

    public static EnumC16508k valueOf(String str) {
        return (EnumC16508k) Enum.valueOf(EnumC16508k.class, str);
    }

    public static EnumC16508k[] values() {
        return (EnumC16508k[]) f51207o0.clone();
    }
}
