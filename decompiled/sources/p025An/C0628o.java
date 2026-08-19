package p025An;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p153Fn.AbstractC2923a;
import p153Fn.C2928f;
import p153Fn.C2942t;

/* JADX INFO: renamed from: An.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C0628o extends AbstractC0633q0 {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f1877q0;

    /* JADX INFO: renamed from: r0 */
    public final C0624m f1878r0;

    public /* synthetic */ C0628o(C0624m c0624m, int i10) {
        this.f1877q0 = i10;
        this.f1878r0 = c0624m;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        switch (this.f1877q0) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        switch (this.f1877q0) {
            case 0:
                C0641u0 c0641u0M1280i = m1280i();
                C0624m c0624m = this.f1878r0;
                Throwable thMo1260p = c0624m.mo1260p(c0641u0M1280i);
                if (c0624m.m1267x()) {
                    C2928f c2928f = (C2928f) c0624m.f1873p0;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2928f.f8772t0;
                        Object obj = atomicReferenceFieldUpdater.get(c2928f);
                        C2942t c2942t = AbstractC2923a.f8762c;
                        if (AbstractC16544l.m18089b(obj, c2942t)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2928f, c2942t, thMo1260p)) {
                                if (atomicReferenceFieldUpdater.get(c2928f) != c2942t) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c2928f, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c2928f) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0624m.mo1244b(thMo1260p);
                if (!c0624m.m1267x()) {
                    c0624m.m1258m();
                }
                break;
            default:
                this.f1878r0.resumeWith(C17296C.f55119a);
                break;
        }
    }
}
