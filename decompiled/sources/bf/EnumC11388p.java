package bf;

import android.gov.nist.javax.sip.parser.TokenNames;
import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bf.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC11388p {
    public static final C11387o Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f34406Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11388p f34407Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11388p f34408o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11388p f34409p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC11388p f34410q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC11388p f34411r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC11388p[] f34412s0;

    static {
        EnumC11388p enumC11388p = new EnumC11388p("Instagram", 0);
        f34407Z = enumC11388p;
        EnumC11388p enumC11388p2 = new EnumC11388p("Tiktok", 1);
        EnumC11388p enumC11388p3 = new EnumC11388p("Youtube", 2);
        EnumC11388p enumC11388p4 = new EnumC11388p(TokenNames.f32022X, 3);
        EnumC11388p enumC11388p5 = new EnumC11388p("Facebook", 4);
        EnumC11388p enumC11388p6 = new EnumC11388p("Twitter", 5);
        f34408o0 = enumC11388p6;
        EnumC11388p enumC11388p7 = new EnumC11388p("Github", 6);
        f34409p0 = enumC11388p7;
        EnumC11388p enumC11388p8 = new EnumC11388p("LinkedIn", 7);
        f34410q0 = enumC11388p8;
        EnumC11388p enumC11388p9 = new EnumC11388p("Website", 8);
        f34411r0 = enumC11388p9;
        EnumC11388p[] enumC11388pArr = {enumC11388p, enumC11388p2, enumC11388p3, enumC11388p4, enumC11388p5, enumC11388p6, enumC11388p7, enumC11388p8, enumC11388p9};
        f34412s0 = enumC11388pArr;
        AbstractC7877E4.m8156j(enumC11388pArr);
        Companion = new C11387o();
        f34406Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C11381i.f34390o0);
    }

    public static EnumC11388p valueOf(String str) {
        return (EnumC11388p) Enum.valueOf(EnumC11388p.class, str);
    }

    public static EnumC11388p[] values() {
        return (EnumC11388p[]) f34412s0.clone();
    }
}
