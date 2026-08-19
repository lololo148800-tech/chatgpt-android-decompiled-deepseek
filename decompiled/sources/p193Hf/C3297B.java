package p193Hf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C1026X1;
import p040Bd.C1032Y1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Hf.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3297B {
    public static final C3295A Companion = new C3295A();

    /* JADX INFO: renamed from: a */
    public final C1032Y1 f10054a;

    static {
        C1026X1 c1026x1 = C1032Y1.Companion;
    }

    public /* synthetic */ C3297B(int i10, C1032Y1 c1032y1) {
        if (1 == (i10 & 1)) {
            this.f10054a = c1032y1;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C3419z.f10415a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3297B) && AbstractC16544l.m18089b(this.f10054a, ((C3297B) obj).f10054a);
    }

    public final int hashCode() {
        return this.f10054a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C3297B(C1032Y1 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f10054a = message;
    }
}
