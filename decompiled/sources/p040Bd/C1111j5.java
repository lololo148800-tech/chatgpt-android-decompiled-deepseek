package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.j5 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1111j5 {
    public static final C1104i5 Companion = new C1104i5();

    /* JADX INFO: renamed from: a */
    public final String f3015a;

    /* JADX INFO: renamed from: b */
    public final String f3016b;

    public /* synthetic */ C1111j5(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1097h5.f2997a.getDescriptor());
            throw null;
        }
        this.f3015a = str;
        if ((i10 & 2) == 0) {
            this.f3016b = null;
        } else {
            this.f3016b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1111j5)) {
            return false;
        }
        C1111j5 c1111j5 = (C1111j5) obj;
        return AbstractC16544l.m18089b(this.f3015a, c1111j5.f3015a) && AbstractC16544l.m18089b(this.f3016b, c1111j5.f3016b);
    }

    public final int hashCode() {
        int iHashCode = this.f3015a.hashCode() * 31;
        String str = this.f3016b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
