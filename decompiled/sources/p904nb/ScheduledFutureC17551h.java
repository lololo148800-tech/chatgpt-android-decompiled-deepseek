package p904nb;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p604Yk.C10077b;
import p610Z1.AbstractC10141h;
import p610Z1.C10134a;

/* JADX INFO: renamed from: nb.h */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC17551h extends AbstractC10141h implements ScheduledFuture {

    /* JADX INFO: renamed from: t0 */
    public final ScheduledFuture f56149t0;

    public ScheduledFutureC17551h(InterfaceC17550g interfaceC17550g) {
        this.f56149t0 = interfaceC17550g.mo14939b(new C10077b(this, 15));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f56149t0.compareTo(delayed);
    }

    @Override // p610Z1.AbstractC10141h
    /* JADX INFO: renamed from: d */
    public final void mo10742d() {
        ScheduledFuture scheduledFuture = this.f56149t0;
        Object obj = this.f30061Y;
        scheduledFuture.cancel((obj instanceof C10134a) && ((C10134a) obj).f30041a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f56149t0.getDelay(timeUnit);
    }
}
