package eg;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eg.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC13401x {
    public static final C13400w Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f42451Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13401x f42452Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC13401x[] f42453o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC13401x EF4;

    static {
        EnumC13401x enumC13401x = new EnumC13401x("Pending", 0);
        EnumC13401x enumC13401x2 = new EnumC13401x("Fail", 1);
        EnumC13401x enumC13401x3 = new EnumC13401x("Success", 2);
        EnumC13401x enumC13401x4 = new EnumC13401x("Unknown", 3);
        f42452Z = enumC13401x4;
        EnumC13401x[] enumC13401xArr = {enumC13401x, enumC13401x2, enumC13401x3, enumC13401x4};
        f42453o0 = enumC13401xArr;
        AbstractC7877E4.m8156j(enumC13401xArr);
        Companion = new C13400w();
        f42451Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C13399v.f42450Y);
    }

    public static EnumC13401x valueOf(String str) {
        return (EnumC13401x) Enum.valueOf(EnumC13401x.class, str);
    }

    public static EnumC13401x[] values() {
        return (EnumC13401x[]) f42453o0.clone();
    }
}
