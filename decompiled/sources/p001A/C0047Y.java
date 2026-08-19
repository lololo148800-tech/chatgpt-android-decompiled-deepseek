package p001A;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p105E.C2222a;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5231m;
import p610Z1.C10145l;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: A.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0047Y {

    /* JADX INFO: renamed from: j */
    public static final long f219j;

    /* JADX INFO: renamed from: k */
    public static final long f220k;

    /* JADX INFO: renamed from: a */
    public final int f221a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC4836i f222b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorServiceC4831d f223c;

    /* JADX INFO: renamed from: d */
    public final C0088t f224d;

    /* JADX INFO: renamed from: e */
    public final C2222a f225e;

    /* JADX INFO: renamed from: f */
    public final boolean f226f;

    /* JADX INFO: renamed from: g */
    public long f227g = f219j;

    /* JADX INFO: renamed from: h */
    public final ArrayList f228h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final C0043W f229i = new C0043W(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f219j = timeUnit.toNanos(1L);
        f220k = timeUnit.toNanos(5L);
    }

    public C0047Y(int i10, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, C0088t c0088t, boolean z6, C2222a c2222a) {
        this.f221a = i10;
        this.f222b = executorC4836i;
        this.f223c = scheduledExecutorServiceC4831d;
        this.f224d = c0088t;
        this.f226f = z6;
        this.f225e = c2222a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b m232a(int i10) {
        InterfaceFutureC13608b interfaceFutureC13608b;
        C5231m c5231m = C5231m.f16977o0;
        if (this.f228h.isEmpty()) {
            return c5231m;
        }
        if (this.f229i.mo171b()) {
            interfaceFutureC13608b = c5231m;
            C0051a0 c0051a0 = new C0051a0(null);
            C0088t c0088t = this.f224d;
            c0088t.m297a(c0051a0);
            RunnableC0074m runnableC0074m = new RunnableC0074m(c0088t, 7, c0051a0);
            C10145l c10145l = c0051a0.f241b;
            c10145l.f30070Z.mo5766a(runnableC0074m, c0088t.f369Z);
            interfaceFutureC13608b = c10145l;
        }
        interfaceFutureC13608b = c5231m;
        C5222d c5222dM5765c = C5222d.m5765c(interfaceFutureC13608b);
        C0041V c0041v = new C0041V(this, i10, 0);
        c5222dM5765c.getClass();
        ExecutorC4836i executorC4836i = this.f222b;
        return AbstractC5229k.m5782f(AbstractC5229k.m5782f(c5222dM5765c, c0041v, executorC4836i), new C0072l(this, 6), executorC4836i);
    }
}
