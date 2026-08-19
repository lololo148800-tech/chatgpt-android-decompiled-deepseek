package p1083we;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: we.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20927m {
    public static final C20926l Companion = new C20926l();

    /* JADX INFO: renamed from: a */
    public final boolean f66689a;

    public /* synthetic */ C20927m(int i10, boolean z6) {
        if (1 == (i10 & 1)) {
            this.f66689a = z6;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C20925k.f66688a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20927m) && this.f66689a == ((C20927m) obj).f66689a;
    }

    public final int hashCode() {
        return this.f66689a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }

    public C20927m(boolean z6) {
        this.f66689a = z6;
    }
}
