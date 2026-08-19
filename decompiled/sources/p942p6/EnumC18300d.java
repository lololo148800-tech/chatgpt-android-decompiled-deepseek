package p942p6;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p6.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18300d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18300d f58413Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18300d f58414Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC18300d[] f58415o0;

    static {
        EnumC18300d enumC18300d = new EnumC18300d("Get", 0);
        f58413Y = enumC18300d;
        EnumC18300d enumC18300d2 = new EnumC18300d("Post", 1);
        f58414Z = enumC18300d2;
        EnumC18300d[] enumC18300dArr = {enumC18300d, enumC18300d2};
        f58415o0 = enumC18300dArr;
        AbstractC7877E4.m8156j(enumC18300dArr);
    }

    public static EnumC18300d valueOf(String str) {
        return (EnumC18300d) Enum.valueOf(EnumC18300d.class, str);
    }

    public static EnumC18300d[] values() {
        return (EnumC18300d[]) f58415o0.clone();
    }
}
