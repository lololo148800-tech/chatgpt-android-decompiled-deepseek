package p758g0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p153Fn.C2925c;
import p349O0.AbstractC5993b;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C5998d0;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p382Pf.C6401d;
import p552Wg.C8847i;
import p586Y0.C9566r;
import p736f0.C13495m;

/* JADX INFO: renamed from: g0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13771k0 {

    /* JADX INFO: renamed from: a */
    public final C13740P f43489a;

    /* JADX INFO: renamed from: b */
    public final C13771k0 f43490b;

    /* JADX INFO: renamed from: c */
    public final String f43491c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f43492d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f43493e;

    /* JADX INFO: renamed from: f */
    public final C5998d0 f43494f;

    /* JADX INFO: renamed from: g */
    public final C5998d0 f43495g;

    /* JADX INFO: renamed from: h */
    public final C6002f0 f43496h;

    /* JADX INFO: renamed from: i */
    public final C9566r f43497i;

    /* JADX INFO: renamed from: j */
    public final C9566r f43498j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f43499k;

    public C13771k0(C13740P c13740p, C13771k0 c13771k0, String str) {
        this.f43489a = c13740p;
        this.f43490b = c13771k0;
        this.f43491c = str;
        Object objM15272c = m15272c();
        C5975S c5975s = C5975S.f19448r0;
        this.f43492d = C5997d.m6430Q(objM15272c, c5975s);
        this.f43493e = C5997d.m6430Q(new C13765h0(m15272c(), m15272c()), c5975s);
        int i10 = AbstractC5993b.f19471b;
        this.f43494f = new C5998d0(0L);
        this.f43495g = new C5998d0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f43496h = C5997d.m6430Q(bool, c5975s);
        this.f43497i = new C9566r();
        this.f43498j = new C9566r();
        this.f43499k = C5997d.m6430Q(bool, c5975s);
        C5997d.m6421H(new C13495m(this, 1));
        c13740p.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX INFO: renamed from: a */
    public final void m15270a(Object obj, C6021p c6021p, int i10) {
        int i11;
        Object objM6514H;
        C5975S c5975s;
        C2925c c2925c;
        boolean zM6545h;
        Object objM6514H2;
        c6021p.m6526U(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(obj) : c6021p.m6545h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (m15276g()) {
            c6021p.m6524S(1823992347);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(1822507602);
            m15281l(obj);
            if (AbstractC16544l.m18089b(obj, m15272c())) {
                if ((this.f43495g.m6471g() != Long.MIN_VALUE) || ((Boolean) this.f43496h.getValue()).booleanValue()) {
                    c6021p.m6524S(1822738893);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                    }
                    c2925c = ((C6035w) objM6514H).f19668Y;
                    zM6545h = c6021p.m6545h(c2925c) | ((i11 & 112) == 32);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6545h) {
                        objM6514H2 = new C8847i(c2925c, 28, this);
                        c6021p.m6537c0(objM6514H2);
                    } else {
                        objM6514H2 = new C8847i(c2925c, 28, this);
                        c6021p.m6537c0(objM6514H2);
                    }
                    C5997d.m6446d(c2925c, this, (InterfaceC1436k) objM6514H2, c6021p);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1823982427);
                    c6021p.m6553p(false);
                }
            } else {
                c6021p.m6524S(1822738893);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c2925c = ((C6035w) objM6514H).f19668Y;
                zM6545h = c6021p.m6545h(c2925c) | ((i11 & 112) == 32);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == c5975s) {
                    objM6514H2 = new C8847i(c2925c, 28, this);
                    c6021p.m6537c0(objM6514H2);
                }
                C5997d.m6446d(c2925c, this, (InterfaceC1436k) objM6514H2, c6021p);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(this, obj, i10, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m15271b() {
        C9566r c9566r = this.f43497i;
        int size = c9566r.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((C13767i0) c9566r.get(i10)).f43470v0.m6471g());
        }
        C9566r c9566r2 = this.f43498j;
        int size2 = c9566r2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((C13771k0) c9566r2.get(i11)).m15271b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final Object m15272c() {
        return this.f43489a.f43330b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15273d() {
        C9566r c9566r = this.f43497i;
        int size = c9566r.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C13767i0) c9566r.get(i10)).getClass();
        }
        C9566r c9566r2 = this.f43498j;
        int size2 = c9566r2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((C13771k0) c9566r2.get(i11)).m15273d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m15274e() {
        C13771k0 c13771k0 = this.f43490b;
        return c13771k0 != null ? c13771k0.m15274e() : this.f43494f.m6471g();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13763g0 m15275f() {
        return (InterfaceC13763g0) this.f43493e.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15276g() {
        return ((Boolean) this.f43499k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m15277h(long j10, boolean z6) {
        C5998d0 c5998d0 = this.f43495g;
        long jM6471g = c5998d0.m6471g();
        C13740P c13740p = this.f43489a;
        if (jM6471g == Long.MIN_VALUE) {
            c5998d0.m6472h(j10);
            c13740p.f43329a.setValue(Boolean.TRUE);
        } else if (!((Boolean) c13740p.f43329a.getValue()).booleanValue()) {
            c13740p.f43329a.setValue(Boolean.TRUE);
        }
        this.f43496h.setValue(Boolean.FALSE);
        C9566r c9566r = this.f43497i;
        int size = c9566r.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            C13767i0 c13767i0 = (C13767i0) c9566r.get(i10);
            boolean zBooleanValue = ((Boolean) c13767i0.f43465q0.getValue()).booleanValue();
            C6002f0 c6002f0 = c13767i0.f43465q0;
            if (!zBooleanValue) {
                long jMo15230e = z6 ? c13767i0.m15263c().mo15230e() : j10;
                c13767i0.f43468t0.setValue(c13767i0.m15263c().mo15234i(jMo15230e));
                c13767i0.f43469u0 = c13767i0.m15263c().mo15232g(jMo15230e);
                C13757d0 c13757d0M15263c = c13767i0.m15263c();
                c13757d0M15263c.getClass();
                if (AbstractC12107L1.m13810a(c13757d0M15263c, jMo15230e)) {
                    c6002f0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c6002f0.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        C9566r c9566r2 = this.f43498j;
        int size2 = c9566r2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C13771k0 c13771k0 = (C13771k0) c9566r2.get(i11);
            if (!AbstractC16544l.m18089b(c13771k0.f43492d.getValue(), c13771k0.m15272c())) {
                c13771k0.m15277h(j10, z6);
            }
            if (!AbstractC16544l.m18089b(c13771k0.f43492d.getValue(), c13771k0.m15272c())) {
                z10 = false;
            }
        }
        if (z10) {
            m15278i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15278i() {
        this.f43495g.m6472h(Long.MIN_VALUE);
        C13740P c13740p = this.f43489a;
        if (c13740p instanceof C13740P) {
            c13740p.f43330b.setValue(this.f43492d.getValue());
        }
        if (this.f43490b == null) {
            this.f43494f.m6472h(0L);
        }
        c13740p.f43329a.setValue(Boolean.FALSE);
        C9566r c9566r = this.f43498j;
        int size = c9566r.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C13771k0) c9566r.get(i10)).m15278i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15279j() {
        C9566r c9566r = this.f43497i;
        int size = c9566r.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C13767i0) c9566r.get(i10)).f43466r0.m6410h(-2.0f);
        }
        C9566r c9566r2 = this.f43498j;
        int size2 = c9566r2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((C13771k0) c9566r2.get(i11)).m15279j();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15280k(Object obj, Object obj2) {
        this.f43495g.m6472h(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        C13740P c13740p = this.f43489a;
        c13740p.f43329a.setValue(bool);
        boolean zM15276g = m15276g();
        C6002f0 c6002f0 = this.f43492d;
        if (!zM15276g || !AbstractC16544l.m18089b(m15272c(), obj) || !AbstractC16544l.m18089b(c6002f0.getValue(), obj2)) {
            if (!AbstractC16544l.m18089b(m15272c(), obj)) {
                c13740p.f43330b.setValue(obj);
            }
            c6002f0.setValue(obj2);
            this.f43499k.setValue(Boolean.TRUE);
            this.f43493e.setValue(new C13765h0(obj, obj2));
        }
        C9566r c9566r = this.f43498j;
        int size = c9566r.size();
        for (int i10 = 0; i10 < size; i10++) {
            C13771k0 c13771k0 = (C13771k0) c9566r.get(i10);
            AbstractC16544l.m18092e(c13771k0, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (c13771k0.m15276g()) {
                c13771k0.m15280k(c13771k0.m15272c(), c13771k0.f43492d.getValue());
            }
        }
        C9566r c9566r2 = this.f43497i;
        int size2 = c9566r2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((C13767i0) c9566r2.get(i11)).m15264d();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15281l(Object obj) {
        C6002f0 c6002f0 = this.f43492d;
        if (AbstractC16544l.m18089b(c6002f0.getValue(), obj)) {
            return;
        }
        this.f43493e.setValue(new C13765h0(c6002f0.getValue(), obj));
        if (!AbstractC16544l.m18089b(m15272c(), c6002f0.getValue())) {
            this.f43489a.f43330b.setValue(c6002f0.getValue());
        }
        c6002f0.setValue(obj);
        if (this.f43495g.m6471g() == Long.MIN_VALUE) {
            this.f43496h.setValue(Boolean.TRUE);
        }
        m15279j();
    }

    public final String toString() {
        C9566r c9566r = this.f43497i;
        int size = c9566r.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((C13767i0) c9566r.get(i10)) + ", ";
        }
        return str;
    }
}
