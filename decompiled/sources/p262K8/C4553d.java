package p262K8;

import hm.InterfaceC14537b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1021t8.C19810a;
import p404Qe.C6665a;
import p571X9.AbstractC9306j0;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: K8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4553d implements InterfaceC4552c {

    /* JADX INFO: renamed from: Y */
    public final C4550a f14883Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14537b f14884Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC4552c f14885o0;

    /* JADX INFO: renamed from: p0 */
    public final int f14886p0;

    public C4553d(C4550a c4550a, InterfaceC14537b interfaceC14537b) {
        this.f14883Y = c4550a;
        this.f14884Z = interfaceC14537b;
        ThreadLocal threadLocal = C4550a.f14872e;
        InterfaceC4552c interfaceC4552c = (InterfaceC4552c) threadLocal.get();
        this.f14885o0 = interfaceC4552c;
        threadLocal.set(this);
        this.f14886p0 = interfaceC4552c == null ? 0 : interfaceC4552c.mo5319o0() + 1;
        Iterator it = c4550a.f14874b.iterator();
        while (it.hasNext()) {
            ((C19810a) it.next()).m20767a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4550a c4550a = this.f14883Y;
        Iterator it = c4550a.f14874b.iterator();
        while (it.hasNext()) {
            InterfaceC13823a interfaceC13823a = ((C19810a) it.next()).f62846a.f62860E0;
            AbstractC16544l.m18094g(interfaceC13823a, "<this>");
            interfaceC13823a.mo15460p("tracing", new C6665a(AbstractC9306j0.m9889h("context@", Thread.currentThread().getName()), 17));
        }
        ThreadLocal threadLocal = C4550a.f14872e;
        if (threadLocal.get() == this) {
            InterfaceC4552c interfaceC4552c = this.f14885o0;
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
        return this.f14886p0;
    }

    @Override // p262K8.InterfaceC4552c
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC14537b mo5320q0() {
        return this.f14884Z;
    }
}
