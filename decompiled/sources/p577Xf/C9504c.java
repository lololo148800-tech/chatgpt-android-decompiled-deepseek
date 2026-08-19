package p577Xf;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import ni.C17634h;
import p025An.AbstractC0575H;
import p103Dn.AbstractC2124C;
import p216Id.C3694b;
import p360Od.C6172d;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6617X;
import p437Rn.C6949g;
import p479Td.C7351f0;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p575Xd.C9460s;
import p575Xd.C9463v;
import p575Xd.InterfaceC9461t;
import p594Y9.AbstractC9985v4;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9504c {

    /* JADX INFO: renamed from: a */
    public final C14459O f28617a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f28618b;

    /* JADX INFO: renamed from: c */
    public final C17634h f28619c;

    /* JADX INFO: renamed from: d */
    public final C17314q f28620d;

    public C9504c(C14459O c14459o, InterfaceC17068a provider, C17634h c17634h) {
        AbstractC16544l.m18094g(provider, "provider");
        this.f28617a = c14459o;
        this.f28618b = provider;
        this.f28619c = c17634h;
        this.f28620d = AbstractC9227W.m9800c(new C6949g(this, 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m10024a(boolean z6, AbstractC19687c abstractC19687c) {
        C9502a c9502a;
        boolean z10;
        C9504c c9504c;
        Object objPrevious;
        C6172d c6172d;
        C9463v c9463v;
        List list;
        Object objPrevious2;
        String str;
        if (abstractC19687c instanceof C9502a) {
            c9502a = (C9502a) abstractC19687c;
            int i10 = c9502a.f28613q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c9502a.f28613q0 = i10 - Integer.MIN_VALUE;
            } else {
                c9502a = new C9502a(this, abstractC19687c);
            }
        } else {
            c9502a = new C9502a(this, abstractC19687c);
        }
        Object objM3221t = c9502a.f28611o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c9502a.f28613q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                z10 = c9502a.f28610Z;
                c9504c = c9502a.f28609Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        C14459O c14459o = this.f28617a;
        c9502a.f28609Y = this;
        z10 = z6;
        c9502a.f28610Z = z10;
        c9502a.f28613q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c14459o.f45526y, c9502a);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c9504c = this;
        C3694b c3694b = (C3694b) objM3221t;
        List list2 = c3694b.f11224i;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            AbstractC6601G abstractC6601G = (AbstractC6601G) objPrevious;
            if ((abstractC6601G instanceof C6600F) && (((C6600F) abstractC6601G).f21314f instanceof C6617X)) {
                break;
            }
        }
        AbstractC6601G abstractC6601G2 = (AbstractC6601G) objPrevious;
        if (abstractC6601G2 != null) {
            C6600F c6600f = abstractC6601G2 instanceof C6600F ? (C6600F) abstractC6601G2 : null;
            AbstractC6653q0 abstractC6653q0 = c6600f != null ? c6600f.f21314f : null;
            C6617X c6617x = abstractC6653q0 instanceof C6617X ? (C6617X) abstractC6653q0 : null;
            if (c6617x != null && (c9463v = (c6172d = c6617x.f21344b).f20091a) != null && (list = c9463v.f28485g) != null) {
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator2.previous();
                } while (!(((InterfaceC9461t) objPrevious2) instanceof C9460s));
                InterfaceC9461t interfaceC9461t = (InterfaceC9461t) objPrevious2;
                if (interfaceC9461t != null) {
                    C9460s c9460s = interfaceC9461t instanceof C9460s ? (C9460s) interfaceC9461t : null;
                    if (c9460s == null || (str = c9460s.f28477e) == null) {
                        C7351f0 c7351f0 = (C7351f0) AbstractC17680n.m19343S(((C6600F) abstractC6601G2).f21312d);
                        if (c7351f0 != null) {
                            String str2 = c7351f0.f23286a;
                            str = str2;
                        } else {
                            str = null;
                        }
                    } else {
                        str = str2;
                    }
                    String str3 = c3694b.f11216a;
                    if (str3 == null) {
                        return c17296c;
                    }
                    C7351f0 c7351f0M10626c = AbstractC9985v4.m10626c("oauth_success", c6172d.f20092b, str, null, str3, null);
                    if (z10) {
                        AbstractC0575H.m1156D(c9504c.f28619c, null, null, new C9503b(c9504c, c7351f0M10626c, null), 3);
                    } else {
                        C14459O c14459o2 = c9504c.f28617a;
                        c9502a.f28609Y = null;
                        c9502a.f28613q0 = 2;
                        if (c14459o2.m15987p(c7351f0M10626c, c9502a) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
            }
        }
        return c17296c;
    }
}
