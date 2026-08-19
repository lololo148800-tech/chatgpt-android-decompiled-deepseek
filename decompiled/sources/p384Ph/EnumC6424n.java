package p384Ph;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ph.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC6424n {
    public static final C6423m Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f20874Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6424n f20875Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC6424n[] f20876o0;

    static {
        EnumC6424n enumC6424n = new EnumC6424n("UnsupportedCountry", 0);
        f20875Z = enumC6424n;
        EnumC6424n[] enumC6424nArr = {enumC6424n};
        f20876o0 = enumC6424nArr;
        AbstractC7877E4.m8156j(enumC6424nArr);
        Companion = new C6423m();
        f20874Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C6422l.f20873Y);
    }

    public static EnumC6424n valueOf(String str) {
        return (EnumC6424n) Enum.valueOf(EnumC6424n.class, str);
    }

    public static EnumC6424n[] values() {
        return (EnumC6424n[]) f20876o0.clone();
    }
}
