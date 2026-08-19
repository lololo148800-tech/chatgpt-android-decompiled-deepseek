package p262K8;

import hm.InterfaceC14537b;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p1021t8.C19810a;
import p164G8.C3007a;
import p211I8.C3651a;
import p211I8.C3652b;
import p404Qe.C6665a;
import p571X9.AbstractC9306j0;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: K8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4551b implements InterfaceC4552c, Closeable {

    /* JADX INFO: renamed from: Y */
    public final C4550a f14877Y;

    /* JADX INFO: renamed from: Z */
    public final C3007a f14878Z;

    /* JADX INFO: renamed from: o0 */
    public final C3651a f14879o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicInteger f14880p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC4552c f14881q0;

    /* JADX INFO: renamed from: r0 */
    public final int f14882r0;

    public C4551b(C4550a c4550a, C3007a c3007a, C3652b c3652b) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        new AtomicBoolean(false);
        this.f14877Y = c4550a;
        this.f14880p0 = atomicInteger;
        this.f14878Z = c3007a;
        c3652b.getClass();
        this.f14879o0 = C3651a.f11136a;
        ThreadLocal threadLocal = C4550a.f14872e;
        InterfaceC4552c interfaceC4552c = (InterfaceC4552c) threadLocal.get();
        this.f14881q0 = interfaceC4552c;
        threadLocal.set(this);
        this.f14882r0 = interfaceC4552c != null ? interfaceC4552c.mo5319o0() + 1 : 0;
        Iterator it = c4550a.f14874b.iterator();
        while (it.hasNext()) {
            ((C19810a) it.next()).m20767a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14879o0.getClass();
        this.f14880p0.decrementAndGet();
        C4550a c4550a = this.f14877Y;
        Iterator it = c4550a.f14874b.iterator();
        while (it.hasNext()) {
            InterfaceC13823a interfaceC13823a = ((C19810a) it.next()).f62846a.f62860E0;
            AbstractC16544l.m18094g(interfaceC13823a, "<this>");
            interfaceC13823a.mo15460p("tracing", new C6665a(AbstractC9306j0.m9889h("context@", Thread.currentThread().getName()), 17));
        }
        ThreadLocal threadLocal = C4550a.f14872e;
        if (threadLocal.get() == this) {
            InterfaceC4552c interfaceC4552c = this.f14881q0;
            threadLocal.set(interfaceC4552c);
            if (interfaceC4552c != null) {
                Iterator it2 = c4550a.f14874b.iterator();
                while (it2.hasNext()) {
                    ((C19810a) it2.next()).m20767a();
                }
            }
        }
    }

    @Override // p262K8.InterfaceC4552c
    /* JADX INFO: renamed from: o0 */
    public final int mo5319o0() {
        return this.f14882r0;
    }

    @Override // p262K8.InterfaceC4552c
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC14537b mo5320q0() {
        return this.f14878Z;
    }

    public final String toString() {
        return super.toString() + "->" + this.f14878Z;
    }
}
