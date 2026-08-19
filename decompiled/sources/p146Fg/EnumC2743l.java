package p146Fg;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Fg.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC2743l {
    public static final C2742k Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f8410Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC2743l[] f8411Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2743l EF7;

    static {
        EnumC2743l[] enumC2743lArr = {new EnumC2743l("HardDeprecation", 0), new EnumC2743l("SoftDeprecation", 1), new EnumC2743l(SIPHeaderNames.SUPPORTED, 2)};
        f8411Z = enumC2743lArr;
        AbstractC7877E4.m8156j(enumC2743lArr);
        Companion = new C2742k();
        f8410Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2741j.f8409Y);
    }

    public static EnumC2743l valueOf(String str) {
        return (EnumC2743l) Enum.valueOf(EnumC2743l.class, str);
    }

    public static EnumC2743l[] values() {
        return (EnumC2743l[]) f8411Z.clone();
    }
}
