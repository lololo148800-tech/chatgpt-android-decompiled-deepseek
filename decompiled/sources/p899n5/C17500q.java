package p899n5;

import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p026Ao.AbstractC0682p;
import p026Ao.C0691y;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9195Q2;

/* JADX INFO: renamed from: n5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C17500q extends AbstractC17497n {

    /* JADX INFO: renamed from: Y */
    public final AbstractC9195Q2 f55974Y;

    /* JADX INFO: renamed from: Z */
    public boolean f55975Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC0677k f55976o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1426a f55977p0;

    public C17500q(InterfaceC0677k interfaceC0677k, InterfaceC1426a interfaceC1426a, AbstractC9195Q2 abstractC9195Q2) {
        this.f55974Y = abstractC9195Q2;
        this.f55976o0 = interfaceC0677k;
        this.f55977p0 = interfaceC1426a;
    }

    @Override // p899n5.AbstractC17497n
    /* JADX INFO: renamed from: O0 */
    public final synchronized InterfaceC0677k mo19197O0() {
        InterfaceC0677k interfaceC0677k;
        try {
            if (this.f55975Z) {
                throw new IllegalStateException("closed");
            }
            interfaceC0677k = this.f55976o0;
            if (interfaceC0677k == null) {
                C0691y c0691y = AbstractC0682p.f1991a;
                AbstractC16544l.m18091d(null);
                c0691y.mo1400j(null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return interfaceC0677k;
    }

    @Override // p899n5.AbstractC17497n
    /* JADX INFO: renamed from: a */
    public final AbstractC9195Q2 mo19198a() {
        return this.f55974Y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f55975Z = true;
        InterfaceC0677k interfaceC0677k = this.f55976o0;
        if (interfaceC0677k != null) {
            AbstractC0371f.m1001a(interfaceC0677k);
        }
    }
}
