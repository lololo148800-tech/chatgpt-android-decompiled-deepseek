package p1126yd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yd.C0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21410C0 {
    public static final C21408B0 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f67974Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21410C0 f67975Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21410C0 f67976o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21410C0[] f67977p0;

    static {
        EnumC21410C0 enumC21410C0 = new EnumC21410C0("Left", 0);
        f67975Z = enumC21410C0;
        EnumC21410C0 enumC21410C1 = new EnumC21410C0("Right", 1);
        f67976o0 = enumC21410C1;
        EnumC21410C0[] enumC21410C0Arr = {enumC21410C0, enumC21410C1};
        f67977p0 = enumC21410C0Arr;
        AbstractC7877E4.m8156j(enumC21410C0Arr);
        Companion = new C21408B0();
        f67974Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21448W.f68034o0);
    }

    public static EnumC21410C0 valueOf(String str) {
        return (EnumC21410C0) Enum.valueOf(EnumC21410C0.class, str);
    }

    public static EnumC21410C0[] values() {
        return (EnumC21410C0[]) f67977p0.clone();
    }
}
