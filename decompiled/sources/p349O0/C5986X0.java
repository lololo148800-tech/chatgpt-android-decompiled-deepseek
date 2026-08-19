package p349O0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: O0.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5986X0 implements InterfaceC5988Y0 {

    /* JADX INFO: renamed from: a */
    public final Object f19463a;

    public C5986X0(Object obj) {
        this.f19463a = obj;
    }

    @Override // p349O0.InterfaceC5988Y0
    /* JADX INFO: renamed from: a */
    public final Object mo6389a(InterfaceC6008i0 interfaceC6008i0) {
        return this.f19463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5986X0) && AbstractC16544l.m18089b(this.f19463a, ((C5986X0) obj).f19463a);
    }

    public final int hashCode() {
        Object obj = this.f19463a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f19463a + ')';
    }
}
