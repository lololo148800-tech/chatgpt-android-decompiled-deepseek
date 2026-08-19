package p946pc;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pc.x */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18358x {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18358x f58617Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18358x f58618Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC18358x[] f58619o0;

    static {
        EnumC18358x enumC18358x = new EnumC18358x("Ordered", 0);
        f58617Y = enumC18358x;
        EnumC18358x enumC18358x2 = new EnumC18358x("Unordered", 1);
        f58618Z = enumC18358x2;
        EnumC18358x[] enumC18358xArr = {enumC18358x, enumC18358x2};
        f58619o0 = enumC18358xArr;
        AbstractC7877E4.m8156j(enumC18358xArr);
    }

    public static EnumC18358x valueOf(String str) {
        return (EnumC18358x) Enum.valueOf(EnumC18358x.class, str);
    }

    public static EnumC18358x[] values() {
        return (EnumC18358x[]) f58619o0.clone();
    }
}
