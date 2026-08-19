package p823j3;

import p025An.C0624m;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p334Na.AbstractC5695b;
import p349O0.C5975S;
import p349O0.C6003g;
import p349O0.InterfaceC5977T;
import p722e8.C13298H;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16089k implements InterfaceC5977T {

    /* JADX INFO: renamed from: Y */
    public final C16075N f49825Y;

    /* JADX INFO: renamed from: Z */
    public final int f49826Z;

    /* JADX INFO: renamed from: o0 */
    public final int f49827o0;

    /* JADX INFO: renamed from: p0 */
    public final long f49828p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1426a f49829q0;

    /* JADX INFO: renamed from: r0 */
    public final C6003g f49830r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f49831s0;

    /* JADX INFO: renamed from: t0 */
    public int f49832t0;

    /* JADX INFO: renamed from: u0 */
    public long f49833u0;

    /* JADX INFO: renamed from: v0 */
    public C0624m f49834v0;

    public C16089k(C16075N c16075n) {
        C16086h c16086h = C16086h.f49817Y;
        this.f49825Y = c16075n;
        this.f49826Z = 5;
        this.f49827o0 = 20;
        this.f49828p0 = 5000L;
        this.f49829q0 = c16086h;
        this.f49830r0 = new C6003g(new C13298H(this, 20));
        this.f49831s0 = new Object();
        this.f49832t0 = 5;
    }

    /* JADX INFO: renamed from: b */
    public static final void m17648b(C16089k c16089k, long j10) {
        c16089k.f49830r0.m6475c(j10);
        synchronized (c16089k.f49831s0) {
            c16089k.f49833u0 = j10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17649c() {
        synchronized (this.f49831s0) {
            C0624m c0624m = this.f49834v0;
            if (c0624m != null) {
                c0624m.mo1244b(null);
            }
        }
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return C5975S.f19444Z;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    @Override // p349O0.InterfaceC5977T
    /* JADX INFO: renamed from: v0 */
    public final Object mo876v0(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        return this.f49830r0.mo876v0(interfaceC1436k, abstractC19687c);
    }
}
