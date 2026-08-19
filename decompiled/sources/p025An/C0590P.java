package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p153Fn.AbstractC2923a;
import p153Fn.C2939q;
import p523V9.AbstractC8154o0;

/* JADX INFO: renamed from: An.P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0590P extends C2939q {

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1821q0 = AtomicIntegerFieldUpdater.newUpdater(C0590P.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p153Fn.C2939q, p025An.C0641u0
    /* JADX INFO: renamed from: r */
    public final void mo1213r(Object obj) {
        mo1210s(obj);
    }

    @Override // p153Fn.C2939q, p025An.C0641u0
    /* JADX INFO: renamed from: s */
    public final void mo1210s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1821q0;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC2923a.m3736j(AbstractC0575H.m1159G(obj), AbstractC8154o0.m8714e(this.f8802p0));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
