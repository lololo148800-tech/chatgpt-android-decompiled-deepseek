package p385Pj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6437l {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6437l f20898Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6437l f20899Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC6437l[] f20900o0;

    static {
        EnumC6437l enumC6437l = new EnumC6437l("FileNotFound", 0);
        f20898Y = enumC6437l;
        EnumC6437l enumC6437l2 = new EnumC6437l("PermissionDenied", 1);
        f20899Z = enumC6437l2;
        EnumC6437l[] enumC6437lArr = {enumC6437l, enumC6437l2};
        f20900o0 = enumC6437lArr;
        AbstractC7877E4.m8156j(enumC6437lArr);
    }

    public static EnumC6437l valueOf(String str) {
        return (EnumC6437l) Enum.valueOf(EnumC6437l.class, str);
    }

    public static EnumC6437l[] values() {
        return (EnumC6437l[]) f20900o0.clone();
    }
}
