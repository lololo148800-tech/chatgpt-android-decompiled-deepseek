package mm;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: mm.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C17313p implements InterfaceC17306i, Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final AtomicReferenceFieldUpdater f55140o0 = AtomicReferenceFieldUpdater.newUpdater(C17313p.class, Object.class, "Z");

    /* JADX INFO: renamed from: Y */
    public volatile InterfaceC1426a f55141Y;

    /* JADX INFO: renamed from: Z */
    public volatile Object f55142Z;

    @Override // mm.InterfaceC17306i
    public final Object getValue() {
        Object obj = this.f55142Z;
        C17323z c17323z = C17323z.f55155a;
        if (obj != c17323z) {
            return obj;
        }
        InterfaceC1426a interfaceC1426a = this.f55141Y;
        if (interfaceC1426a != null) {
            Object objInvoke = interfaceC1426a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55140o0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c17323z, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c17323z) {
                }
            }
            this.f55141Y = null;
            return objInvoke;
        }
        return this.f55142Z;
    }

    @Override // mm.InterfaceC17306i
    public final boolean isInitialized() {
        return this.f55142Z != C17323z.f55155a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
