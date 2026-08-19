package p244Jg;

import p098Di.InterfaceC2053b;

/* JADX INFO: renamed from: Jg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4337a implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final boolean f14122a;

    public C4337a(boolean z6) {
        this.f14122a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4337a) && this.f14122a == ((C4337a) obj).f14122a;
    }

    public final int hashCode() {
        return this.f14122a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
