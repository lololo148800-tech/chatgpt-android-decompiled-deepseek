package p902n8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1976c;
import p523V9.AbstractC8150n4;
import p677c8.C11689a;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: n8.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC17526m implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f56052Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC17525l f56053Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC17524k f56054o0;

    /* JADX INFO: renamed from: p0 */
    public final ScheduledExecutorService f56055p0;

    /* JADX INFO: renamed from: q0 */
    public final long f56056q0;

    public RunnableC17526m(InterfaceC13823a interfaceC13823a, InterfaceC17525l interfaceC17525l, InterfaceC17524k observer, ScheduledExecutorService executor, long j10) {
        AbstractC16544l.m18094g(observer, "observer");
        AbstractC16544l.m18094g(executor, "executor");
        this.f56052Y = interfaceC13823a;
        this.f56053Z = interfaceC17525l;
        this.f56054o0 = observer;
        this.f56055p0 = executor;
        this.f56056q0 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double dMo19205a;
        String str = C11689a.f35456p;
        InterfaceC13823a interfaceC13823a = this.f56052Y;
        if (AbstractC8150n4.m8689b(interfaceC13823a.mo15448d("rum")).f35471o == 2 && (dMo19205a = this.f56053Z.mo19205a()) != null) {
            this.f56054o0.mo19201b(dMo19205a.doubleValue());
        }
        AbstractC1976c.m3151h(this.f56055p0, "Vitals monitoring", this.f56056q0, TimeUnit.MILLISECONDS, interfaceC13823a.mo15463s(), this);
    }
}
