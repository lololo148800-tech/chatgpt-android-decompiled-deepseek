package p349O0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: O0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6039y implements InterfaceC5988Y0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f19675a;

    /* JADX WARN: Multi-variable type inference failed */
    public C6039y(InterfaceC1436k interfaceC1436k) {
        this.f19675a = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p349O0.InterfaceC5988Y0
    /* JADX INFO: renamed from: a */
    public final Object mo6389a(InterfaceC6008i0 interfaceC6008i0) {
        return this.f19675a.invoke(interfaceC6008i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6039y) && this.f19675a.equals(((C6039y) obj).f19675a);
    }

    public final int hashCode() {
        return this.f19675a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f19675a + ')';
    }
}
