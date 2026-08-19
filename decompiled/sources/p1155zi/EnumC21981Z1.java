package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zi.Z1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21981Z1 {
    public static final C21978Y1 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f69579Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21981Z1 f69580Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21981Z1 f69581o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21981Z1 f69582p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC21981Z1 f69583q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC21981Z1 f69584r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC21981Z1 f69585s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ EnumC21981Z1[] f69586t0;

    static {
        EnumC21981Z1 enumC21981Z1 = new EnumC21981Z1("UNKNOWN", 0);
        f69580Z = enumC21981Z1;
        EnumC21981Z1 enumC21981Z2 = new EnumC21981Z1("FREE", 1);
        f69581o0 = enumC21981Z2;
        EnumC21981Z1 enumC21981Z3 = new EnumC21981Z1("PLUS", 2);
        f69582p0 = enumC21981Z3;
        EnumC21981Z1 enumC21981Z4 = new EnumC21981Z1("PRO", 3);
        f69583q0 = enumC21981Z4;
        EnumC21981Z1 enumC21981Z5 = new EnumC21981Z1("TEAM", 4);
        f69584r0 = enumC21981Z5;
        EnumC21981Z1 enumC21981Z6 = new EnumC21981Z1("ENTERPRISE", 5);
        f69585s0 = enumC21981Z6;
        EnumC21981Z1[] enumC21981Z1Arr = {enumC21981Z1, enumC21981Z2, enumC21981Z3, enumC21981Z4, enumC21981Z5, enumC21981Z6};
        f69586t0 = enumC21981Z1Arr;
        AbstractC7877E4.m8156j(enumC21981Z1Arr);
        Companion = new C21978Y1();
        f69579Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69587A0);
    }

    public static EnumC21981Z1 valueOf(String str) {
        return (EnumC21981Z1) Enum.valueOf(EnumC21981Z1.class, str);
    }

    public static EnumC21981Z1[] values() {
        return (EnumC21981Z1[]) f69586t0.clone();
    }
}
