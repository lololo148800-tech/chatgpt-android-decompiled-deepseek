package p025An;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p153Fn.C2942t;

/* JADX INFO: renamed from: An.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0604c extends AbstractC0633q0 {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1838t0 = AtomicReferenceFieldUpdater.newUpdater(C0604c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: q0 */
    public final C0624m f1839q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC0595V f1840r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C0608e f1841s0;

    public C0604c(C0608e c0608e, C0624m c0624m) {
        this.f1841s0 = c0608e;
        this.f1839q0 = c0624m;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        return false;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        C0624m c0624m = this.f1839q0;
        if (th2 != null) {
            c0624m.getClass();
            C2942t c2942tM1254F = c0624m.m1254F(new C0642v(th2, false), null);
            if (c2942tM1254F != null) {
                c0624m.mo1247t(c2942tM1254F);
                C0606d c0606d = (C0606d) f1838t0.get(this);
                if (c0606d != null) {
                    c0606d.m1236a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0608e.f1850b;
        C0608e c0608e = this.f1841s0;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0608e) == 0) {
            InterfaceC0581K[] interfaceC0581KArr = c0608e.f1851a;
            ArrayList arrayList = new ArrayList(interfaceC0581KArr.length);
            for (InterfaceC0581K interfaceC0581K : interfaceC0581KArr) {
                arrayList.add(interfaceC0581K.m1205m());
            }
            c0624m.resumeWith(arrayList);
        }
    }
}
