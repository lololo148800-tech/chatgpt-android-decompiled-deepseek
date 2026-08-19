package p931ok;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ok.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18225f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18225f f58073Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18225f f58074Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18225f f58075o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18225f[] f58076p0;

    static {
        EnumC18225f enumC18225f = new EnumC18225f("SLIDE_IN", 0);
        f58073Y = enumC18225f;
        EnumC18225f enumC18225f2 = new EnumC18225f("SLIDE_OUT", 1);
        f58074Z = enumC18225f2;
        EnumC18225f enumC18225f3 = new EnumC18225f("NONE", 2);
        f58075o0 = enumC18225f3;
        EnumC18225f[] enumC18225fArr = {enumC18225f, enumC18225f2, enumC18225f3};
        f58076p0 = enumC18225fArr;
        AbstractC7877E4.m8156j(enumC18225fArr);
    }

    public static EnumC18225f valueOf(String str) {
        return (EnumC18225f) Enum.valueOf(EnumC18225f.class, str);
    }

    public static EnumC18225f[] values() {
        return (EnumC18225f[]) f58076p0.clone();
    }
}
