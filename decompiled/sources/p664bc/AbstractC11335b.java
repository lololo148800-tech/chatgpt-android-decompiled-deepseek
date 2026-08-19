package p664bc;

import ac.C10539a;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11071G;
import androidx.lifecycle.InterfaceC11111t;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p038Ba.AbstractC0865o;
import p1060v9.AbstractC20502t;
import p110E4.C2307e;
import p301M.RunnableC5228j;
import p401Qb.C6584a;
import p523V9.AbstractC7854B5;
import p594Y9.C9895g4;
import p746fa.C13599h;
import p746fa.C13606o;
import p813ij.C15026j;
import p960q9.C18655i;

/* JADX INFO: renamed from: bc.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11335b implements Closeable, InterfaceC11111t {

    /* JADX INFO: renamed from: q0 */
    public static final C15026j f34269q0 = new C15026j("MobileVisionBase", "");

    /* JADX INFO: renamed from: Y */
    public final AtomicBoolean f34270Y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Z */
    public final AbstractC0865o f34271Z;

    /* JADX INFO: renamed from: o0 */
    public final C18655i f34272o0;

    /* JADX INFO: renamed from: p0 */
    public final Executor f34273p0;

    public AbstractC11335b(AbstractC0865o abstractC0865o, Executor executor) {
        this.f34271Z = abstractC0865o;
        C18655i c18655i = new C18655i(28);
        this.f34272o0 = c18655i;
        this.f34273p0 = executor;
        ((AtomicInteger) abstractC0865o.f2432b).incrementAndGet();
        abstractC0865o.m1929b(executor, CallableC11339f.f34280a, (C9895g4) c18655i.f59414Z).m15124c(C11337d.f34275Z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC11071G(EnumC11103l.ON_DESTROY)
    public synchronized void close() {
        boolean z6 = true;
        if (this.f34270Y.getAndSet(true)) {
            return;
        }
        this.f34272o0.m20028h();
        AbstractC0865o abstractC0865o = this.f34271Z;
        Executor executor = this.f34273p0;
        if (((AtomicInteger) abstractC0865o.f2432b).get() <= 0) {
            z6 = false;
        }
        AbstractC20502t.m21160k(z6);
        ((C2307e) abstractC0865o.f2431a).m3408t(new RunnableC5228j(abstractC0865o, 13, new C13599h()), executor);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized C13606o m12770k(C10539a c10539a) {
        AbstractC20502t.m21158i(c10539a, "InputImage can not be null");
        if (this.f34270Y.get()) {
            return AbstractC7854B5.m8116d(new C6584a("This detector is already closed!", 14));
        }
        if (c10539a.f31257d < 32 || c10539a.f31258e < 32) {
            return AbstractC7854B5.m8116d(new C6584a("InputImage width and height should be at least 32!", 3));
        }
        return this.f34271Z.m1929b(this.f34273p0, new CallableC11338e(this, 0, c10539a), (C9895g4) this.f34272o0.f59414Z);
    }
}
