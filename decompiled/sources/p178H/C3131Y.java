package p178H;

import java.util.Iterator;
import p001A.RunnableC0000A;
import p209I6.C3632j;
import p228J.AbstractC3842j;
import p228J.C3865u0;
import p228J.InterfaceC3854p;
import p326N.C5561c;
import p514V.C7733g;
import p544W9.AbstractC8577W2;

/* JADX INFO: renamed from: H.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C3131Y extends AbstractC3842j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9418b;

    public /* synthetic */ C3131Y(Object obj, int i10) {
        this.f9417a = i10;
        this.f9418b = obj;
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: b */
    public void mo8b(int i10, InterfaceC3854p interfaceC3854p) {
        switch (this.f9417a) {
            case 0:
                C3132Z c3132z = (C3132Z) this.f9418b;
                synchronized (c3132z.f9419Y) {
                    try {
                        if (c3132z.f9423q0) {
                            return;
                        }
                        c3132z.f9427u0.put(interfaceC3854p.mo4347f(), new C5561c(interfaceC3854p));
                        c3132z.m3976e();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 1:
            default:
                return;
            case 2:
                Iterator it = ((C7733g) this.f9418b).f24387Y.iterator();
                while (it.hasNext()) {
                    C3865u0 c3865u0 = ((AbstractC3174u0) it.next()).f9572m;
                    Iterator it2 = c3865u0.f11683g.f11486e.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC3842j) it2.next()).mo8b(i10, new C3632j(interfaceC3854p, c3865u0.f11683g.f11488g, -1L));
                    }
                }
                return;
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: d */
    public void mo3972d(int i10) {
        switch (this.f9417a) {
            case 1:
                AbstractC8577W2.m9243e().execute(new RunnableC0000A(this, 19));
                break;
        }
    }
}
