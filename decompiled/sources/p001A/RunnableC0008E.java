package p001A;

import io.sentry.internal.debugmeta.C15384c;
import java.util.concurrent.atomic.AtomicBoolean;
import p310M9.C5311e;

/* JADX INFO: renamed from: A.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0008E implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5311e f44Z;

    public /* synthetic */ RunnableC0008E(C5311e c5311e, int i10) {
        this.f43Y = i10;
        this.f44Z = c5311e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43Y) {
            case 0:
                C5311e c5311e = this.f44Z;
                if (!((AtomicBoolean) c5311e.f17485o0).getAndSet(true)) {
                    ((C0018J) ((C15384c) c5311e.f17486p0).f47968o0).f92o0.execute(new RunnableC0008E(c5311e, 1));
                    break;
                }
                break;
            default:
                C5311e c5311e2 = this.f44Z;
                if (((C0018J) ((C15384c) c5311e2.f17486p0).f47968o0).f89T0 == 8) {
                    ((C0018J) ((C15384c) c5311e2.f17486p0).f47968o0).m126v("Camera onError timeout, reopen it.", null);
                    ((C0018J) ((C15384c) c5311e2.f17486p0).f47968o0).m97G(7);
                    ((C0018J) ((C15384c) c5311e2.f17486p0).f47968o0).f97t0.m53b();
                } else {
                    C0018J c0018j = (C0018J) ((C15384c) c5311e2.f17486p0).f47968o0;
                    c0018j.m126v("Camera skip reopen at state: ".concat(AbstractC0010F.m25i(c0018j.f89T0)), null);
                }
                break;
        }
    }
}
