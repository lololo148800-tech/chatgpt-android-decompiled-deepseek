package p753fh;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: fh.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13668z {
    public static final C13667y Companion = new C13667y();

    /* JADX INFO: renamed from: a */
    public final boolean f43146a;

    public /* synthetic */ C13668z(int i10, boolean z6) {
        if (1 == (i10 & 1)) {
            this.f43146a = z6;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C13666x.f43145a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13668z) && this.f43146a == ((C13668z) obj).f43146a;
    }

    public final int hashCode() {
        return this.f43146a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }

    public C13668z(boolean z6) {
        this.f43146a = z6;
    }
}
