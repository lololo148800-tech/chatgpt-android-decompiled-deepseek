package p871lf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: lf.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16926j extends AbstractC16927k {
    public static final C16925i Companion = new C16925i();

    /* JADX INFO: renamed from: a */
    public final C16919c f54364a;

    public C16926j(int i10, C16919c c16919c) {
        if (1 == (i10 & 1)) {
            this.f54364a = c16919c;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C16924h.f54363a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16926j) && AbstractC16544l.m18089b(this.f54364a, ((C16926j) obj).f54364a);
    }

    public final int hashCode() {
        return this.f54364a.f54359a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
