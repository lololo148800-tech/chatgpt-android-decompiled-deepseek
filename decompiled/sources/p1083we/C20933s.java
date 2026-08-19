package p1083we;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: we.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20933s {
    public static final C20932r Companion = new C20932r();

    /* JADX INFO: renamed from: a */
    public final C20910A f66697a;

    public /* synthetic */ C20933s(int i10, C20910A c20910a) {
        if (1 == (i10 & 1)) {
            this.f66697a = c20910a;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C20931q.f66696a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20933s) && AbstractC16544l.m18089b(this.f66697a, ((C20933s) obj).f66697a);
    }

    public final int hashCode() {
        return this.f66697a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
