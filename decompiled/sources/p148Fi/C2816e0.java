package p148Fi;

import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.e0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2816e0 {
    public static final C2813d0 Companion = new C2813d0();

    /* JADX INFO: renamed from: a */
    public final boolean f8550a;

    /* JADX INFO: renamed from: b */
    public final boolean f8551b;

    public /* synthetic */ C2816e0(int i10, boolean z6, boolean z10) {
        if ((i10 & 1) == 0) {
            this.f8550a = false;
        } else {
            this.f8550a = z6;
        }
        if ((i10 & 2) == 0) {
            this.f8551b = false;
        } else {
            this.f8551b = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2816e0)) {
            return false;
        }
        C2816e0 c2816e0 = (C2816e0) obj;
        return this.f8550a == c2816e0.f8550a && this.f8551b == c2816e0.f8551b;
    }

    public final int hashCode() {
        return ((this.f8550a ? 1231 : 1237) * 31) + (this.f8551b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
