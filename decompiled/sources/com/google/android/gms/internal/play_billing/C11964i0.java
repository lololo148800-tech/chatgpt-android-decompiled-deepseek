package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11964i0 extends AbstractC11957g1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: B */
    public final void mo13421B(C11980m0 c11980m0, Thread thread) {
        c11980m0.f36297a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: H */
    public final boolean mo13422H(AbstractC11984n0 abstractC11984n0, C11952f0 c11952f0, C11952f0 c11952f1) {
        synchronized (abstractC11984n0) {
            try {
                if (abstractC11984n0.f36305Z != c11952f0) {
                    return false;
                }
                abstractC11984n0.f36305Z = c11952f1;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: L */
    public final boolean mo13423L(AbstractC11984n0 abstractC11984n0, Object obj, Object obj2) {
        synchronized (abstractC11984n0) {
            try {
                if (abstractC11984n0.f36304Y != obj) {
                    return false;
                }
                abstractC11984n0.f36304Y = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: N */
    public final boolean mo13424N(AbstractC11984n0 abstractC11984n0, C11980m0 c11980m0, C11980m0 c11980m1) {
        synchronized (abstractC11984n0) {
            try {
                if (abstractC11984n0.f36306o0 != c11980m0) {
                    return false;
                }
                abstractC11984n0.f36306o0 = c11980m1;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: e */
    public final C11952f0 mo13425e(AbstractC11984n0 abstractC11984n0) {
        C11952f0 c11952f0;
        C11952f0 c11952f1 = C11952f0.f36260d;
        synchronized (abstractC11984n0) {
            c11952f0 = abstractC11984n0.f36305Z;
            if (c11952f0 != c11952f1) {
                abstractC11984n0.f36305Z = c11952f1;
            }
        }
        return c11952f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: r */
    public final C11980m0 mo13426r(AbstractC11984n0 abstractC11984n0) {
        C11980m0 c11980m0;
        C11980m0 c11980m1 = C11980m0.f36296c;
        synchronized (abstractC11984n0) {
            c11980m0 = abstractC11984n0.f36306o0;
            if (c11980m0 != c11980m1) {
                abstractC11984n0.f36306o0 = c11980m1;
            }
        }
        return c11980m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: z */
    public final void mo13427z(C11980m0 c11980m0, C11980m0 c11980m1) {
        c11980m0.f36298b = c11980m1;
    }
}
