package mm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: mm.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C17297D implements InterfaceC17306i, Serializable {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1426a f55120Y;

    /* JADX INFO: renamed from: Z */
    public Object f55121Z;

    @Override // mm.InterfaceC17306i
    public final Object getValue() {
        if (this.f55121Z == C17323z.f55155a) {
            InterfaceC1426a interfaceC1426a = this.f55120Y;
            AbstractC16544l.m18091d(interfaceC1426a);
            this.f55121Z = interfaceC1426a.invoke();
            this.f55120Y = null;
        }
        return this.f55121Z;
    }

    @Override // mm.InterfaceC17306i
    public final boolean isInitialized() {
        return this.f55121Z != C17323z.f55155a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
