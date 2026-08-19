package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21470f {
    public static final C21468e Companion = new C21468e();

    /* JADX INFO: renamed from: a */
    public final Integer f68067a;

    public /* synthetic */ C21470f(int i10, Integer num) {
        if (1 == (i10 & 1)) {
            this.f68067a = num;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21465d.f68064a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21470f) && AbstractC16544l.m18089b(this.f68067a, ((C21470f) obj).f68067a);
    }

    public final int hashCode() {
        Integer num = this.f68067a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C21470f(Integer num) {
        this.f68067a = num;
    }
}
