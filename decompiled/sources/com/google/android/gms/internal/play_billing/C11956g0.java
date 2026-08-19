package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11956g0 extends AbstractC11957g1 {

    /* JADX INFO: renamed from: Z */
    public final AtomicReferenceFieldUpdater f36265Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReferenceFieldUpdater f36266o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicReferenceFieldUpdater f36267p0;

    /* JADX INFO: renamed from: q0 */
    public final AtomicReferenceFieldUpdater f36268q0;

    /* JADX INFO: renamed from: r0 */
    public final AtomicReferenceFieldUpdater f36269r0;

    public C11956g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f36265Z = atomicReferenceFieldUpdater;
        this.f36266o0 = atomicReferenceFieldUpdater2;
        this.f36267p0 = atomicReferenceFieldUpdater3;
        this.f36268q0 = atomicReferenceFieldUpdater4;
        this.f36269r0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: B */
    public final void mo13421B(C11980m0 c11980m0, Thread thread) {
        this.f36265Z.lazySet(c11980m0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: H */
    public final boolean mo13422H(AbstractC11984n0 abstractC11984n0, C11952f0 c11952f0, C11952f0 c11952f1) {
        return AbstractC11957g1.m13450m(this.f36268q0, abstractC11984n0, c11952f0, c11952f1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: L */
    public final boolean mo13423L(AbstractC11984n0 abstractC11984n0, Object obj, Object obj2) {
        return AbstractC11957g1.m13450m(this.f36269r0, abstractC11984n0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: N */
    public final boolean mo13424N(AbstractC11984n0 abstractC11984n0, C11980m0 c11980m0, C11980m0 c11980m1) {
        return AbstractC11957g1.m13450m(this.f36267p0, abstractC11984n0, c11980m0, c11980m1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: e */
    public final C11952f0 mo13425e(AbstractC11984n0 abstractC11984n0) {
        return (C11952f0) this.f36268q0.getAndSet(abstractC11984n0, C11952f0.f36260d);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: r */
    public final C11980m0 mo13426r(AbstractC11984n0 abstractC11984n0) {
        return (C11980m0) this.f36267p0.getAndSet(abstractC11984n0, C11980m0.f36296c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: z */
    public final void mo13427z(C11980m0 c11980m0, C11980m0 c11980m1) {
        this.f36266o0.lazySet(c11980m0, c11980m1);
    }
}
