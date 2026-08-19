package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6664z extends AbstractC6659u {
    public static final C6663y Companion = new C6663y();

    /* JADX INFO: renamed from: c */
    public final C7351f0 f21432c;

    public /* synthetic */ C6664z(int i10, C7351f0 c7351f0) {
        if (1 == (i10 & 1)) {
            this.f21432c = c7351f0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6662x.f21431a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6664z) && AbstractC16544l.m18089b(this.f21432c, ((C6664z) obj).f21432c);
    }

    public final int hashCode() {
        return this.f21432c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6664z(C7351f0 c7351f0) {
        this.f21432c = c7351f0;
    }
}
