package p318Mh;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mh.I0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC5368I0 {
    public static final C5366H0 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f17608Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5368I0 f17609Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5368I0 f17610o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC5368I0 f17611p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC5368I0[] f17612q0;

    static {
        EnumC5368I0 enumC5368I0 = new EnumC5368I0("Root", 0);
        f17609Z = enumC5368I0;
        EnumC5368I0 enumC5368I1 = new EnumC5368I0("SlideBottom", 1);
        f17610o0 = enumC5368I1;
        EnumC5368I0 enumC5368I2 = new EnumC5368I0("Default", 2);
        f17611p0 = enumC5368I2;
        EnumC5368I0[] enumC5368I0Arr = {enumC5368I0, enumC5368I1, enumC5368I2};
        f17612q0 = enumC5368I0Arr;
        AbstractC7877E4.m8156j(enumC5368I0Arr);
        Companion = new C5366H0();
        f17608Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C5417p.f17705q0);
    }

    public static EnumC5368I0 valueOf(String str) {
        return (EnumC5368I0) Enum.valueOf(EnumC5368I0.class, str);
    }

    public static EnumC5368I0[] values() {
        return (EnumC5368I0[]) f17612q0.clone();
    }
}
