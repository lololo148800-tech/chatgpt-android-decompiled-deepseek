package p041Be;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Be.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC1244p {
    public static final C1243o Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f3277Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1244p f3278Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC1244p[] f3279o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1244p EF2;

    static {
        EnumC1244p enumC1244p = new EnumC1244p("Created", 0);
        EnumC1244p enumC1244p2 = new EnumC1244p("Updated", 1);
        f3278Z = enumC1244p2;
        EnumC1244p[] enumC1244pArr = {enumC1244p, enumC1244p2};
        f3279o0 = enumC1244pArr;
        AbstractC7877E4.m8156j(enumC1244pArr);
        Companion = new C1243o();
        f3277Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1242n.f3276Y);
    }

    public static EnumC1244p valueOf(String str) {
        return (EnumC1244p) Enum.valueOf(EnumC1244p.class, str);
    }

    public static EnumC1244p[] values() {
        return (EnumC1244p[]) f3279o0.clone();
    }
}
