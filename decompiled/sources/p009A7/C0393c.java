package p009A7;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.AbstractC0010F;
import p002A0.C0130g;
import p003A1.C0254h0;
import p025An.C0644w;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p780h7.C14419a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p918o7.C17878e;

/* JADX INFO: renamed from: A7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0393c extends LinkedBlockingQueue {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC11256c f1308Y;

    /* JADX INFO: renamed from: Z */
    public final String f1309Z;

    /* JADX INFO: renamed from: o0 */
    public final C14419a f1310o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393c(InterfaceC11256c logger, C14419a c14419a, String str) {
        super(c14419a.f45313a);
        AbstractC16544l.m18094g(logger, "logger");
        this.f1308Y = logger;
        this.f1309Z = str;
        this.f1310o0 = c14419a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: i */
    public final void m1020i(Object obj) {
        C14419a c14419a = this.f1310o0;
        c14419a.f45315c.invoke(obj);
        ((C17878e) this.f1308Y).m19602a(5, EnumC11255b.f34099Z, new C0392b(obj, 0), null, false, AbstractC17659D.m19244f(new C17309l("backpressure.capacity", Integer.valueOf(c14419a.f45313a)), new C17309l("executor.context", this.f1309Z)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: j */
    public final void m1021j() {
        C14419a c14419a = this.f1310o0;
        c14419a.f45314b.invoke();
        ((C17878e) this.f1308Y).m19603b(4, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0130g(this, 4), null, false, AbstractC17659D.m19244f(new C17309l("backpressure.capacity", Integer.valueOf(c14419a.f45313a)), new C17309l("executor.context", this.f1309Z)));
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object e10) throws InterruptedException {
        AbstractC16544l.m18094g(e10, "e");
        C0254h0 c0254h0 = new C0254h0(this, 5);
        int iRemainingCapacity = remainingCapacity();
        if (iRemainingCapacity != 0) {
            if (iRemainingCapacity == 1) {
                m1021j();
            }
            return ((Boolean) c0254h0.invoke(e10)).booleanValue();
        }
        int iM24h = AbstractC0010F.m24h(this.f1310o0.f45316d);
        if (iM24h != 0) {
            if (iM24h != 1) {
                throw new C0644w();
            }
            m1020i(e10);
            return true;
        }
        Object first = take();
        AbstractC16544l.m18093f(first, "first");
        m1020i(first);
        return ((Boolean) c0254h0.invoke(e10)).booleanValue();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object e10, long j10, TimeUnit timeUnit) {
        AbstractC16544l.m18094g(e10, "e");
        if (!super.offer(e10, j10, timeUnit)) {
            return offer(e10);
        }
        if (remainingCapacity() != 0) {
            return true;
        }
        m1021j();
        return true;
    }
}
