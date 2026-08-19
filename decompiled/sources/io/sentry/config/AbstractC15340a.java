package io.sentry.config;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p293Lh.C5062h;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.EnumC7546k;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8682o;
import p774h1.C14365u;
import p946pc.AbstractC18319D;
import p946pc.AbstractC18322G;
import p946pc.AbstractC18324I;
import p946pc.C18320E;
import p946pc.C18339e;

/* JADX INFO: renamed from: io.sentry.config.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15340a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47900a = 1;

    /* JADX INFO: renamed from: a */
    public static final void m16568a(C18320E c18320e, int i10, C8410b c8410b, C6021p c6021p, int i11) {
        int i12;
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(489570327);
        if ((i11 & 14) == 0) {
            i12 = (c6021p.m6542f(c18320e) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException("Level must be at least 0");
            }
            c6021p.m6525T(-1030513173);
            C3582M c3582mM19846e = AbstractC18319D.m19846e(c18320e, c6021p);
            long jM4277d = c3582mM19846e.m4277d();
            if (jM4277d == C14365u.f45060j) {
                jM4277d = AbstractC18319D.m19845d(c18320e, c6021p);
            }
            C3582M c3582mM4275c = C3582M.m4275c(c3582mM19846e, jM4277d);
            c6021p.m6553p(false);
            C3582M c3582mM9379b = AbstractC8682o.m9379b(c3582mM4275c, (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l));
            InterfaceC1439n interfaceC1439n = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58482b;
            AbstractC16544l.m18091d(interfaceC1439n);
            AbstractC18324I.m19851a(c18320e, c6021p).mo985d(c3582mM9379b.m4280g((C3582M) interfaceC1439n.invoke(Integer.valueOf(i10), c3582mM9379b)), AbstractC8411c.m8968b(288525821, c6021p, new C18339e(c8410b, c18320e, 1)), c6021p, 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(i10, i11, 8, c18320e, c8410b);
        }
    }

    public int hashCode() {
        switch (this.f47900a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f47900a) {
            case 1:
                String strMo4448c = AbstractC16526C.f51263a.mo5693b(getClass()).mo4448c();
                AbstractC16544l.m18091d(strMo4448c);
                return strMo4448c;
            default:
                return super.toString();
        }
    }
}
