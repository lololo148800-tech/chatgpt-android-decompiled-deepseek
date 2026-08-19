package p1126yd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yd.E0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21414E0 {
    public static final C21412D0 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f67980Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21414E0 f67981Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21414E0 f67982o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21414E0 f67983p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC21414E0[] f67984q0;

    static {
        EnumC21414E0 enumC21414E0 = new EnumC21414E0("Original", 0);
        f67981Z = enumC21414E0;
        EnumC21414E0 enumC21414E1 = new EnumC21414E0("New", 1);
        f67982o0 = enumC21414E1;
        EnumC21414E0 enumC21414E2 = new EnumC21414E0("Skip", 2);
        f67983p0 = enumC21414E2;
        EnumC21414E0[] enumC21414E0Arr = {enumC21414E0, enumC21414E1, enumC21414E2, new EnumC21414E0("SkipWithoutCompletion", 3)};
        f67984q0 = enumC21414E0Arr;
        AbstractC7877E4.m8156j(enumC21414E0Arr);
        Companion = new C21412D0();
        f67980Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21448W.f68035p0);
    }

    public static EnumC21414E0 valueOf(String str) {
        return (EnumC21414E0) Enum.valueOf(EnumC21414E0.class, str);
    }

    public static EnumC21414E0[] values() {
        return (EnumC21414E0[]) f67984q0.clone();
    }
}
