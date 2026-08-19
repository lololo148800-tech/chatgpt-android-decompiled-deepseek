package p482Tg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Tg.v */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7465v {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7465v f23719Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7465v f23720Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC7465v[] f23721o0;

    static {
        EnumC7465v enumC7465v = new EnumC7465v("Anonymous", 0);
        f23719Y = enumC7465v;
        EnumC7465v enumC7465v2 = new EnumC7465v("LoggedIn", 1);
        f23720Z = enumC7465v2;
        EnumC7465v[] enumC7465vArr = {enumC7465v, enumC7465v2};
        f23721o0 = enumC7465vArr;
        AbstractC7877E4.m8156j(enumC7465vArr);
    }

    public static EnumC7465v valueOf(String str) {
        return (EnumC7465v) Enum.valueOf(EnumC7465v.class, str);
    }

    public static EnumC7465v[] values() {
        return (EnumC7465v[]) f23721o0.clone();
    }
}
