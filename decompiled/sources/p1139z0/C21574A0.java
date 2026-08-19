package p1139z0;

import p049Bm.InterfaceC1439n;
import p1013t0.C19715c;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7540e;
import p759g1.C13800b;
import p759g1.C13801c;

/* JADX INFO: renamed from: z0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21574A0 {

    /* JADX INFO: renamed from: a */
    public final C21650x0 f68313a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1439n f68314b;

    /* JADX INFO: renamed from: c */
    public final C21650x0 f68315c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f68316d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f68317e;

    /* JADX INFO: renamed from: f */
    public final C6002f0 f68318f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f68319g;

    /* JADX INFO: renamed from: h */
    public final C19715c f68320h;

    public C21574A0() {
        C21650x0 c21650x0 = new C21650x0();
        this.f68313a = c21650x0;
        this.f68315c = c21650x0;
        C5975S c5975s = C5975S.f19445o0;
        this.f68316d = C5997d.m6430Q(null, c5975s);
        this.f68317e = C5997d.m6430Q(null, c5975s);
        this.f68318f = C5997d.m6430Q(null, c5975s);
        this.f68319g = C5997d.m6430Q(new C7540e(0), C5975S.f19448r0);
        this.f68320h = new C19715c();
    }

    /* JADX INFO: renamed from: a */
    public final long m21848a(long j10) {
        C13801c c13801cMo21528y;
        InterfaceC21098s interfaceC21098sM21851d = m21851d();
        C13801c c13801c = C13801c.f43585e;
        if (interfaceC21098sM21851d != null) {
            if (interfaceC21098sM21851d.mo21522h()) {
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f68318f.getValue();
                c13801cMo21528y = interfaceC21098s != null ? interfaceC21098s.mo21528y(interfaceC21098sM21851d, true) : null;
            } else {
                c13801cMo21528y = c13801c;
            }
            if (c13801cMo21528y != null) {
                c13801c = c13801cMo21528y;
            }
        }
        return AbstractC21627m.m21962j(j10, c13801c);
    }

    /* JADX INFO: renamed from: b */
    public final C3578I m21849b() {
        return (C3578I) this.f68315c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m21850c(long j10, boolean z6) {
        C3578I c3578iM21849b = m21849b();
        if (c3578iM21849b == null) {
            return -1;
        }
        if (z6) {
            j10 = m21848a(j10);
        }
        return c3578iM21849b.f10893b.m4313e(AbstractC21627m.m21966n(this, j10));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC21098s m21851d() {
        return (InterfaceC21098s) this.f68316d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21852e(long j10) {
        C3578I c3578iM21849b = m21849b();
        if (c3578iM21849b == null) {
            return false;
        }
        long jM21966n = AbstractC21627m.m21966n(this, m21848a(j10));
        int iM4311c = c3578iM21849b.f10893b.m4311c(C13800b.m15307h(jM21966n));
        return C13800b.m15306g(jM21966n) >= c3578iM21849b.m4258h(iM4311c) && C13800b.m15306g(jM21966n) <= c3578iM21849b.m4259i(iM4311c);
    }
}
