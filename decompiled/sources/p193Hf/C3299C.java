package p193Hf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C1026X1;
import p040Bd.C1032Y1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Hf.C */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3299C implements InterfaceC3305F {
    public static final C3417y Companion = new C3417y();

    /* JADX INFO: renamed from: a */
    public final C3297B f10058a;

    static {
        C1026X1 c1026x1 = C1032Y1.Companion;
    }

    public /* synthetic */ C3299C(int i10, C3297B c3297b) {
        if (1 == (i10 & 1)) {
            this.f10058a = c3297b;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C3415x.f10403a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3299C) && AbstractC16544l.m18089b(this.f10058a, ((C3299C) obj).f10058a);
    }

    public final int hashCode() {
        return this.f10058a.f10054a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C3299C(C1032Y1 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f10058a = new C3297B(message);
    }
}
