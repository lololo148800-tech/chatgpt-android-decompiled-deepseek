package mm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: mm.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C17314q implements InterfaceC17306i, Serializable {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1426a f55143Y;

    /* JADX INFO: renamed from: Z */
    public volatile Object f55144Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f55145o0;

    public C17314q(InterfaceC1426a initializer) {
        AbstractC16544l.m18094g(initializer, "initializer");
        this.f55143Y = initializer;
        this.f55144Z = C17323z.f55155a;
        this.f55145o0 = this;
    }

    @Override // mm.InterfaceC17306i
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f55144Z;
        C17323z c17323z = C17323z.f55155a;
        if (obj != c17323z) {
            return obj;
        }
        synchronized (this.f55145o0) {
            objInvoke = this.f55144Z;
            if (objInvoke == c17323z) {
                InterfaceC1426a interfaceC1426a = this.f55143Y;
                AbstractC16544l.m18091d(interfaceC1426a);
                objInvoke = interfaceC1426a.invoke();
                this.f55144Z = objInvoke;
                this.f55143Y = null;
            }
        }
        return objInvoke;
    }

    @Override // mm.InterfaceC17306i
    public final boolean isInitialized() {
        return this.f55144Z != C17323z.f55155a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
