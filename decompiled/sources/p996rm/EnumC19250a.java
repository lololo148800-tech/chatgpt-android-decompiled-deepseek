package p996rm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19250a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19250a f61036Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19250a f61037Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19250a f61038o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC19250a[] f61039p0;

    static {
        EnumC19250a enumC19250a = new EnumC19250a("COROUTINE_SUSPENDED", 0);
        f61036Y = enumC19250a;
        EnumC19250a enumC19250a2 = new EnumC19250a("UNDECIDED", 1);
        f61037Z = enumC19250a2;
        EnumC19250a enumC19250a3 = new EnumC19250a("RESUMED", 2);
        f61038o0 = enumC19250a3;
        EnumC19250a[] enumC19250aArr = {enumC19250a, enumC19250a2, enumC19250a3};
        f61039p0 = enumC19250aArr;
        AbstractC7877E4.m8156j(enumC19250aArr);
    }

    public static EnumC19250a valueOf(String str) {
        return (EnumC19250a) Enum.valueOf(EnumC19250a.class, str);
    }

    public static EnumC19250a[] values() {
        return (EnumC19250a[]) f61039p0.clone();
    }
}
