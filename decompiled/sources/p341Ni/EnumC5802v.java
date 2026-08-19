package p341Ni;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ni.v */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5802v {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5802v f18949Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5802v f18950Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5802v[] f18951o0;

    static {
        EnumC5802v enumC5802v = new EnumC5802v("Audio", 0);
        f18949Y = enumC5802v;
        EnumC5802v enumC5802v2 = new EnumC5802v("AudioAndScreen", 1);
        f18950Z = enumC5802v2;
        EnumC5802v[] enumC5802vArr = {enumC5802v, enumC5802v2};
        f18951o0 = enumC5802vArr;
        AbstractC7877E4.m8156j(enumC5802vArr);
    }

    public static EnumC5802v valueOf(String str) {
        return (EnumC5802v) Enum.valueOf(EnumC5802v.class, str);
    }

    public static EnumC5802v[] values() {
        return (EnumC5802v[]) f18951o0.clone();
    }
}
