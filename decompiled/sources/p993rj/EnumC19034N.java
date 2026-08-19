package p993rj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rj.N */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19034N {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19034N f60679Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19034N f60680Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC19034N[] f60681o0;

    static {
        EnumC19034N enumC19034N = new EnumC19034N("FRONT", 0);
        f60679Y = enumC19034N;
        EnumC19034N enumC19034N2 = new EnumC19034N("BACK", 1);
        f60680Z = enumC19034N2;
        EnumC19034N[] enumC19034NArr = {enumC19034N, enumC19034N2};
        f60681o0 = enumC19034NArr;
        AbstractC7877E4.m8156j(enumC19034NArr);
    }

    public static EnumC19034N valueOf(String str) {
        return (EnumC19034N) Enum.valueOf(EnumC19034N.class, str);
    }

    public static EnumC19034N[] values() {
        return (EnumC19034N[]) f60681o0.clone();
    }
}
