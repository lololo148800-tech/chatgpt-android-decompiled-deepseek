package p1083we;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: we.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20924j {
    public static final C20923i Companion = new C20923i();

    /* JADX INFO: renamed from: a */
    public final boolean f66687a;

    public /* synthetic */ C20924j(int i10, boolean z6) {
        if (1 == (i10 & 1)) {
            this.f66687a = z6;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C20922h.f66686a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20924j) && this.f66687a == ((C20924j) obj).f66687a;
    }

    public final int hashCode() {
        return this.f66687a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
