package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12014u2 extends AbstractC11957g1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: A */
    public final boolean mo13461A(C12022w2 c12022w2, C11886K1 c11886k1, C11886K1 c11886k2) {
        synchronized (c12022w2) {
            try {
                if (c12022w2.f36350Z != c11886k1) {
                    return false;
                }
                c12022w2.f36350Z = c11886k2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: D */
    public final boolean mo13462D(C12022w2 c12022w2, Object obj, Object obj2) {
        synchronized (c12022w2) {
            try {
                if (c12022w2.f36349Y != obj) {
                    return false;
                }
                c12022w2.f36349Y = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: I */
    public final boolean mo13463I(C12022w2 c12022w2, C12018v2 c12018v2, C12018v2 c12018v3) {
        synchronized (c12022w2) {
            try {
                if (c12022w2.f36351o0 != c12018v2) {
                    return false;
                }
                c12022w2.f36351o0 = c12018v3;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: k */
    public final void mo13464k(C12018v2 c12018v2, C12018v2 c12018v3) {
        c12018v2.f36341b = c12018v3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11957g1
    /* JADX INFO: renamed from: v */
    public final void mo13465v(C12018v2 c12018v2, Thread thread) {
        c12018v2.f36340a = thread;
    }
}
