package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zi.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC22034n {
    public static final C22030m Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f69697Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22034n f69698Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC22034n f69699o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC22034n f69700p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC22034n[] f69701q0;

    static {
        EnumC22034n enumC22034n = new EnumC22034n("Personal", 0);
        f69698Z = enumC22034n;
        EnumC22034n enumC22034n2 = new EnumC22034n("Workspace", 1);
        f69699o0 = enumC22034n2;
        EnumC22034n enumC22034n3 = new EnumC22034n("Unknown", 2);
        f69700p0 = enumC22034n3;
        EnumC22034n[] enumC22034nArr = {enumC22034n, enumC22034n2, enumC22034n3};
        f69701q0 = enumC22034nArr;
        AbstractC7877E4.m8156j(enumC22034nArr);
        Companion = new C22030m();
        f69697Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69594o0);
    }

    public static EnumC22034n valueOf(String str) {
        return (EnumC22034n) Enum.valueOf(EnumC22034n.class, str);
    }

    public static EnumC22034n[] values() {
        return (EnumC22034n[]) f69701q0.clone();
    }
}
