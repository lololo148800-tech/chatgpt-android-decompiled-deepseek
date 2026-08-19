package p268Kf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Kf.D */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4645D {
    public static final C4644C Companion = new C4644C();

    /* JADX INFO: renamed from: a */
    public final String f15106a;

    /* JADX INFO: renamed from: b */
    public final String f15107b;

    public /* synthetic */ C4645D(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C4643B.f15105a.getDescriptor());
            throw null;
        }
        this.f15106a = str;
        this.f15107b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4645D)) {
            return false;
        }
        C4645D c4645d = (C4645D) obj;
        return AbstractC16544l.m18089b(this.f15106a, c4645d.f15106a) && AbstractC16544l.m18089b(this.f15107b, c4645d.f15107b);
    }

    public final int hashCode() {
        return this.f15107b.hashCode() + (this.f15106a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C4645D(String str, String str2) {
        this.f15106a = str;
        this.f15107b = str2;
    }
}
