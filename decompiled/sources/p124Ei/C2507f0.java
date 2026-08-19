package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p855kj.AbstractC16428g;

/* JADX INFO: renamed from: Ei.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2507f0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC16428g f7802a;

    public C2507f0(AbstractC16428g device) {
        AbstractC16544l.m18094g(device, "device");
        this.f7802a = device;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2507f0) && AbstractC16544l.m18089b(this.f7802a, ((C2507f0) obj).f7802a);
    }

    public final int hashCode() {
        return this.f7802a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
