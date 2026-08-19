package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11966i2 extends AbstractC11957g1 {

    /* JADX INFO: renamed from: Z */
    public final AtomicReferenceFieldUpdater f36279Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReferenceFieldUpdater f36280o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicReferenceFieldUpdater f36281p0;

    /* JADX INFO: renamed from: q0 */
    public final AtomicReferenceFieldUpdater f36282q0;

    /* JADX INFO: renamed from: r0 */
    public final AtomicReferenceFieldUpdater f36283r0;

    public C11966i2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f36279Z = atomicReferenceFieldUpdater;
        this.f36280o0 = atomicReferenceFieldUpdater2;
        this.f36281p0 = atomicReferenceFieldUpdater3;
        this.f36282q0 = atomicReferenceFieldUpdater4;
        this.f36283r0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: A */
    public final boolean mo13461A(C12022w2 c12022w2, C11886K1 c11886k1, C11886K1 c11886k2) {
        return AbstractC11957g1.m13451n(this.f36282q0, c12022w2, c11886k1, c11886k2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: D */
    public final boolean mo13462D(C12022w2 c12022w2, Object obj, Object obj2) {
        return AbstractC11957g1.m13451n(this.f36283r0, c12022w2, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: I */
    public final boolean mo13463I(C12022w2 c12022w2, C12018v2 c12018v2, C12018v2 c12018v3) {
        return AbstractC11957g1.m13451n(this.f36281p0, c12022w2, c12018v2, c12018v3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: k */
    public final void mo13464k(C12018v2 c12018v2, C12018v2 c12018v3) {
        this.f36280o0.lazySet(c12018v2, c12018v3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: v */
    public final void mo13465v(C12018v2 c12018v2, Thread thread) {
        this.f36279Z.lazySet(c12018v2, thread);
    }
}
