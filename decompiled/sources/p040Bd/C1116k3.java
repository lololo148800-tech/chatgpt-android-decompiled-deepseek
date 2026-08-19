package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.k3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1116k3 {
    public static final C1109j3 Companion = new C1109j3();

    /* JADX INFO: renamed from: a */
    public final Integer f3023a;

    /* JADX INFO: renamed from: b */
    public final Integer f3024b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1164s3 f3025c;

    public /* synthetic */ C1116k3(int i10, Integer num, Integer num2, InterfaceC1164s3 interfaceC1164s3) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1102i3.f3003a.getDescriptor());
            throw null;
        }
        this.f3023a = num;
        this.f3024b = num2;
        this.f3025c = interfaceC1164s3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116k3)) {
            return false;
        }
        C1116k3 c1116k3 = (C1116k3) obj;
        return AbstractC16544l.m18089b(this.f3023a, c1116k3.f3023a) && AbstractC16544l.m18089b(this.f3024b, c1116k3.f3024b) && AbstractC16544l.m18089b(this.f3025c, c1116k3.f3025c);
    }

    public final int hashCode() {
        Integer num = this.f3023a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3024b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        InterfaceC1164s3 interfaceC1164s3 = this.f3025c;
        return iHashCode2 + (interfaceC1164s3 != null ? interfaceC1164s3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
