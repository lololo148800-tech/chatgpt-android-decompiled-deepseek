package p823j3;

import java.util.concurrent.atomic.AtomicReference;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p561X.C8990d;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: j3.N */
/* JADX INFO: loaded from: classes.dex */
public final class C16075N implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC0571F f49777Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicReference f49778Z = new AtomicReference(null);

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8990d f49779o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f49780p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16104z f49781q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AtomicReference f49782r0;

    public C16075N(InterfaceC0571F interfaceC0571F, C8990d c8990d, InterfaceC0571F interfaceC0571F2, C16104z c16104z, AtomicReference atomicReference) {
        this.f49779o0 = c8990d;
        this.f49780p0 = interfaceC0571F2;
        this.f49781q0 = c16104z;
        this.f49782r0 = atomicReference;
        this.f49777Y = interfaceC0571F;
    }

    /* JADX INFO: renamed from: a */
    public final long m17643a() {
        Long l4 = (Long) this.f49778Z.get();
        if (l4 == null) {
            C21554a c21554a = C21555b.f68260Z;
            return C21555b.f68261o0;
        }
        long jLongValue = l4.longValue();
        this.f49779o0.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        C21554a c21554a2 = C21555b.f68260Z;
        return AbstractC8128k6.m8645k(jCurrentTimeMillis, EnumC21557d.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m17644b(long j10) {
        if (C21555b.m21835e(j10) <= 0) {
            AbstractC0575H.m1180i(this.f49780p0, new C16072K("Timed out immediately", this.f49781q0.hashCode()));
            return;
        }
        if (C21555b.m21833c(m17643a(), j10) < 0) {
            return;
        }
        AtomicReference atomicReference = this.f49778Z;
        this.f49779o0.getClass();
        atomicReference.set(Long.valueOf(C21555b.m21835e(j10) + System.currentTimeMillis()));
        C8990d c8990d = this.f49779o0;
        InterfaceC0571F interfaceC0571F = this.f49780p0;
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) this.f49782r0.getAndSet(AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16074M(this, c8990d, interfaceC0571F, this.f49781q0, null), 3));
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1275e(null);
        }
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f49777Y.getCoroutineContext();
    }
}
