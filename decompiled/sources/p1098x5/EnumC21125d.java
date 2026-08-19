package p1098x5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x5.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21125d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21125d f67121Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21125d f67122Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21125d f67123o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21125d[] f67124p0;

    static {
        EnumC21125d enumC21125d = new EnumC21125d("EXACT", 0);
        f67121Y = enumC21125d;
        EnumC21125d enumC21125d2 = new EnumC21125d("INEXACT", 1);
        f67122Z = enumC21125d2;
        EnumC21125d enumC21125d3 = new EnumC21125d("AUTOMATIC", 2);
        f67123o0 = enumC21125d3;
        EnumC21125d[] enumC21125dArr = {enumC21125d, enumC21125d2, enumC21125d3};
        f67124p0 = enumC21125dArr;
        AbstractC7877E4.m8156j(enumC21125dArr);
    }

    public static EnumC21125d valueOf(String str) {
        return (EnumC21125d) Enum.valueOf(EnumC21125d.class, str);
    }

    public static EnumC21125d[] values() {
        return (EnumC21125d[]) f67124p0.clone();
    }
}
