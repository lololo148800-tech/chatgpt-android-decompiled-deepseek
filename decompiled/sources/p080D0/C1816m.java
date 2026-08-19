package p080D0;

import p054C0.C1494g;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p204I1.C3590f;
import p204I1.C3599o;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: D0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1816m {

    /* JADX INFO: renamed from: a */
    public final long f5227a;

    /* JADX INFO: renamed from: b */
    public final C1494g f5228b;

    /* JADX INFO: renamed from: c */
    public final C1494g f5229c;

    /* JADX INFO: renamed from: d */
    public C3578I f5230d;

    /* JADX INFO: renamed from: e */
    public int f5231e = -1;

    public C1816m(long j10, C1494g c1494g, C1494g c1494g2) {
        this.f5227a = j10;
        this.f5228b = c1494g;
        this.f5229c = c1494g2;
    }

    /* JADX INFO: renamed from: a */
    public final long m2642a(C1824q c1824q, boolean z6) {
        C3578I c3578i;
        C1822p c1822p = c1824q.f5257a;
        long j10 = this.f5227a;
        if (!z6 || c1822p.f5255c == j10) {
            C1822p c1822p2 = c1824q.f5258b;
            if ((!z6 && c1822p2.f5255c != j10) || m2644c() == null || (c3578i = (C3578I) this.f5229c.invoke()) == null) {
                return 9205357640488583168L;
            }
            return AbstractC1807h0.m2637z(c3578i, AbstractC8301I.m8921l(z6 ? c1822p.f5254b : c1822p2.f5254b, 0, m2643b(c3578i)), z6, c1824q.f5259c);
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m2643b(C3578I c3578i) {
        try {
            if (this.f5230d != c3578i) {
                C3599o c3599o = c3578i.f10893b;
                boolean z6 = c3599o.f10960c;
                int i10 = 0;
                if (!(z6 || ((float) ((int) (c3578i.f10894c & 4294967295L))) < c3599o.f10962e) || z6) {
                    i10 = c3599o.f10963f - 1;
                } else {
                    int iM4311c = c3599o.m4311c((int) (c3578i.f10894c & 4294967295L));
                    int i11 = c3578i.f10893b.f10963f - 1;
                    if (iM4311c > i11) {
                        iM4311c = i11;
                    }
                    while (iM4311c >= 0 && c3578i.f10893b.m4312d(iM4311c) >= ((int) (c3578i.f10894c & 4294967295L))) {
                        iM4311c--;
                    }
                    if (iM4311c >= 0) {
                        i10 = iM4311c;
                    }
                }
                this.f5231e = c3578i.m4256f(i10, true);
                this.f5230d = c3578i;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f5231e;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC21098s m2644c() {
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f5228b.invoke();
        if (interfaceC21098s == null || !interfaceC21098s.mo21522h()) {
            return null;
        }
        return interfaceC21098s;
    }

    /* JADX INFO: renamed from: d */
    public final C3590f m2645d() {
        C3578I c3578i = (C3578I) this.f5229c.invoke();
        return c3578i == null ? new C3590f(6, "", null) : c3578i.f10892a.f10882a;
    }
}
