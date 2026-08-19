package p193Hf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Hf.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3406u extends AbstractC3409v {
    public static final C3403t Companion = new C3403t();

    /* JADX INFO: renamed from: a */
    public final String f10380a;

    public C3406u(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f10380a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C3400s.f10366a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3406u) && AbstractC16544l.m18089b(this.f10380a, ((C3406u) obj).f10380a);
    }

    public final int hashCode() {
        return this.f10380a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
