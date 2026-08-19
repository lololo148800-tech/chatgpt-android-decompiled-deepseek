package p550We;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: We.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8833n {
    public static final C8832m Companion = new C8832m();

    /* JADX INFO: renamed from: a */
    public final String f27023a;

    public /* synthetic */ C8833n(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f27023a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C8831l.f27022a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8833n) && AbstractC16544l.m18089b(this.f27023a, ((C8833n) obj).f27023a);
    }

    public final int hashCode() {
        return this.f27023a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C8833n(String str) {
        this.f27023a = str;
    }
}
