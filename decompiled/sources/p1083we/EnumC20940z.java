package p1083we;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: we.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC20940z {
    public static final C20939y Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f66704Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC20940z[] f66705Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC20940z EF5;

    static {
        EnumC20940z[] enumC20940zArr = {new EnumC20940z("ContentPolicy", 0)};
        f66705Z = enumC20940zArr;
        AbstractC7877E4.m8156j(enumC20940zArr);
        Companion = new C20939y();
        f66704Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C20936v.f66700o0);
    }

    public static EnumC20940z valueOf(String str) {
        return (EnumC20940z) Enum.valueOf(EnumC20940z.class, str);
    }

    public static EnumC20940z[] values() {
        return (EnumC20940z[]) f66705Z.clone();
    }
}
