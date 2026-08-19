package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21947O;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.S3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0998S3 implements InterfaceC1028X3 {
    public static final C0992R3 Companion = new C0992R3();

    /* JADX INFO: renamed from: a */
    public final C21947O f2791a;

    public /* synthetic */ C0998S3(int i10, C21947O c21947o) {
        if (1 == (i10 & 1)) {
            this.f2791a = c21947o;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C0987Q3.f2770a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0998S3) && AbstractC16544l.m18089b(this.f2791a, ((C0998S3) obj).f2791a);
    }

    public final int hashCode() {
        return this.f2791a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
