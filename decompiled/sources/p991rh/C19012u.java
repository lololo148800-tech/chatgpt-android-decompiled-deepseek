package p991rh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19012u {
    public static final C19005n Companion = new C19005n();

    /* JADX INFO: renamed from: a */
    public final C19011t f60590a;

    public /* synthetic */ C19012u(int i10, C19011t c19011t) {
        if (1 == (i10 & 1)) {
            this.f60590a = c19011t;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C19004m.f60585a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19012u) && AbstractC16544l.m18089b(this.f60590a, ((C19012u) obj).f60590a);
    }

    public final int hashCode() {
        return this.f60590a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
