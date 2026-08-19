package p857kl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC16465m {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16465m f51080Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16465m f51081Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC16465m[] f51082o0;

    static {
        EnumC16465m enumC16465m = new EnumC16465m("RAW", 0);
        f51080Y = enumC16465m;
        EnumC16465m enumC16465m2 = new EnumC16465m("DQUOTES", 1);
        EnumC16465m enumC16465m3 = new EnumC16465m("URI_ENCODING", 2);
        f51081Z = enumC16465m3;
        EnumC16465m[] enumC16465mArr = {enumC16465m, enumC16465m2, enumC16465m3, new EnumC16465m("BASE64_ENCODING", 3)};
        f51082o0 = enumC16465mArr;
        AbstractC7877E4.m8156j(enumC16465mArr);
    }

    public static EnumC16465m valueOf(String str) {
        return (EnumC16465m) Enum.valueOf(EnumC16465m.class, str);
    }

    public static EnumC16465m[] values() {
        return (EnumC16465m[]) f51082o0.clone();
    }
}
