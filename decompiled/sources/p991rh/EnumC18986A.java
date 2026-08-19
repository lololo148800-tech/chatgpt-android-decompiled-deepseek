package p991rh;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rh.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC18986A {
    public static final C19017z Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f60557Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18986A f60558Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18986A f60559o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18986A[] f60560p0;

    static {
        EnumC18986A enumC18986A = new EnumC18986A("Success", 0);
        f60558Z = enumC18986A;
        EnumC18986A enumC18986A2 = new EnumC18986A("Retry", 1);
        EnumC18986A enumC18986A3 = new EnumC18986A("Error", 2);
        f60559o0 = enumC18986A3;
        EnumC18986A[] enumC18986AArr = {enumC18986A, enumC18986A2, enumC18986A3};
        f60560p0 = enumC18986AArr;
        AbstractC7877E4.m8156j(enumC18986AArr);
        Companion = new C19017z();
        f60557Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C19016y.f60596Z);
    }

    public static EnumC18986A valueOf(String str) {
        return (EnumC18986A) Enum.valueOf(EnumC18986A.class, str);
    }

    public static EnumC18986A[] values() {
        return (EnumC18986A[]) f60560p0.clone();
    }
}
