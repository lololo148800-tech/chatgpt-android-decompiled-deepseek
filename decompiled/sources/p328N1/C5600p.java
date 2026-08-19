package p328N1;

import android.javax.sip.C10808o;
import io.sentry.internal.debugmeta.C15384c;
import p140Fa.C2685e;
import p229J0.C4171z3;
import p292Lg.C5034f;
import p303M1.C5276b;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: N1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5600p implements InterfaceC5598n {

    /* JADX INFO: renamed from: a */
    public final C5586b f18134a;

    /* JADX INFO: renamed from: b */
    public final C5587c f18135b;

    /* JADX INFO: renamed from: c */
    public final C15384c f18136c;

    /* JADX INFO: renamed from: d */
    public final C5604t f18137d;

    /* JADX INFO: renamed from: e */
    public final C10808o f18138e;

    /* JADX INFO: renamed from: f */
    public final C4171z3 f18139f;

    public C5600p(C5586b c5586b, C5587c c5587c) {
        C15384c c15384c = AbstractC5601q.f18140a;
        C5604t c5604t = new C5604t(AbstractC5601q.f18141b);
        C10808o c10808o = new C10808o(16);
        this.f18134a = c5586b;
        this.f18135b = c5587c;
        this.f18136c = c15384c;
        this.f18137d = c5604t;
        this.f18138e = c10808o;
        this.f18139f = new C4171z3(this, 18);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final InterfaceC5584K m5990a(C5581H c5581h) {
        InterfaceC5584K interfaceC5584K;
        C15384c c15384c = this.f18136c;
        C5034f c5034f = new C5034f(this, 4, c5581h);
        synchronized (((C2685e) c15384c.f47967Z)) {
            interfaceC5584K = (InterfaceC5584K) ((C5276b) c15384c.f47968o0).m5785b(c5581h);
            if (interfaceC5584K == null) {
                try {
                    interfaceC5584K = (InterfaceC5584K) c5034f.invoke(new C5034f(c15384c, 5, c5581h));
                    synchronized (((C2685e) c15384c.f47967Z)) {
                        if (((C5276b) c15384c.f47968o0).m5785b(c5581h) == null && interfaceC5584K.mo5985a()) {
                            ((C5276b) c15384c.f47968o0).m5788e(c5581h, interfaceC5584K);
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            } else if (!interfaceC5584K.mo5985a()) {
                interfaceC5584K = (InterfaceC5584K) c5034f.invoke(new C5034f(c15384c, 5, c5581h));
                synchronized (((C2685e) c15384c.f47967Z)) {
                    if (((C5276b) c15384c.f47968o0).m5785b(c5581h) == null) {
                        ((C5276b) c15384c.f47968o0).m5788e(c5581h, interfaceC5584K);
                    }
                }
            }
        }
        return interfaceC5584K;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5584K m5991b(AbstractC5599o abstractC5599o, C5609y c5609y, int i10, int i11) {
        C5587c c5587c = this.f18135b;
        c5587c.getClass();
        int i12 = c5587c.f18098a;
        C5609y c5609y2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? c5609y : new C5609y(AbstractC8301I.m8921l(c5609y.f18160Y + i12, 1, 1000));
        this.f18134a.getClass();
        return m5990a(new C5581H(abstractC5599o, c5609y2, i10, i11, null));
    }
}
