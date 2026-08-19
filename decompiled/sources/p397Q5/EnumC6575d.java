package p397Q5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Q5.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6575d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6575d f21258Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6575d f21259Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC6575d[] f21260o0;

    static {
        EnumC6575d enumC6575d = new EnumC6575d("EXACT", 0);
        f21258Y = enumC6575d;
        EnumC6575d enumC6575d2 = new EnumC6575d("INEXACT", 1);
        f21259Z = enumC6575d2;
        EnumC6575d[] enumC6575dArr = {enumC6575d, enumC6575d2};
        f21260o0 = enumC6575dArr;
        AbstractC7877E4.m8156j(enumC6575dArr);
    }

    public static EnumC6575d valueOf(String str) {
        return (EnumC6575d) Enum.valueOf(EnumC6575d.class, str);
    }

    public static EnumC6575d[] values() {
        return (EnumC6575d[]) f21260o0.clone();
    }
}
