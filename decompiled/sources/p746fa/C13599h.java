package p746fa;

import p1009s9.C19506i;
import p1060v9.AbstractC20502t;
import p594Y9.C9895g4;
import p729ej.C13414e;

/* JADX INFO: renamed from: fa.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13599h {

    /* JADX INFO: renamed from: a */
    public final C13606o f42961a = new C13606o();

    public C13599h() {
    }

    /* JADX INFO: renamed from: a */
    public final void m15113a(Exception exc) {
        this.f42961a.m15134m(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m15114b(Object obj) {
        this.f42961a.m15135n(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15115c(Exception exc) {
        C13606o c13606o = this.f42961a;
        c13606o.getClass();
        AbstractC20502t.m21158i(exc, "Exception must not be null");
        synchronized (c13606o.f42982a) {
            try {
                if (c13606o.f42984c) {
                    return false;
                }
                c13606o.f42984c = true;
                c13606o.f42987f = exc;
                c13606o.f42983b.m339C(c13606o);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15116d(Object obj) {
        this.f42961a.m15137p(obj);
    }

    public C13599h(C9895g4 c9895g4) {
        C13414e c13414e = new C13414e(this);
        c9895g4.getClass();
        C19506i c19506i = new C19506i(c13414e, 27);
        ((C13606o) c9895g4.f29409Y).m15126e(AbstractC13600i.f42962a, c19506i);
    }
}
