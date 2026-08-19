package p193Hf;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Hf.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3397r extends AbstractC3409v {
    public static final C3394q Companion = new C3394q();

    /* JADX INFO: renamed from: a */
    public final boolean f10355a;

    public C3397r(int i10, boolean z6) {
        if (1 == (i10 & 1)) {
            this.f10355a = z6;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C3391p.f10339a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3397r) && this.f10355a == ((C3397r) obj).f10355a;
    }

    public final int hashCode() {
        return this.f10355a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
