package p773h0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p349O0.C5972Q;

/* JADX INFO: renamed from: h0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14292k0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f44872a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C4816c f44873b = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: a */
    public static final void m15578a(C14292k0 c14292k0, C14286h0 c14286h0) {
        while (true) {
            AtomicReference atomicReference = c14292k0.f44872a;
            C14286h0 c14286h1 = (C14286h0) atomicReference.get();
            if (c14286h1 != null && c14286h0.f44826a.compareTo(c14286h1.f44826a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(c14286h1, c14286h0)) {
                    if (c14286h1 != null) {
                        c14286h1.f44827b.mo1275e(new C5972Q("Mutation interrupted", 4));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c14286h1);
        }
    }
}
