package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.Q0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21954Q0 {
    public static final C21951P0 Companion = new C21951P0();

    /* JADX INFO: renamed from: a */
    public final String f69512a;

    /* JADX INFO: renamed from: b */
    public final String f69513b;

    /* JADX INFO: renamed from: c */
    public final String f69514c;

    /* JADX INFO: renamed from: d */
    public final String f69515d;

    public /* synthetic */ C21954Q0(int i10, String str, String str2, String str3, String str4) {
        if (8 != (i10 & 8)) {
            AbstractC11153a0.m12389l(i10, 8, C21948O0.f69505a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f69512a = null;
        } else {
            this.f69512a = str;
        }
        if ((i10 & 2) == 0) {
            this.f69513b = null;
        } else {
            this.f69513b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f69514c = null;
        } else {
            this.f69514c = str3;
        }
        this.f69515d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21954Q0)) {
            return false;
        }
        C21954Q0 c21954q0 = (C21954Q0) obj;
        return AbstractC16544l.m18089b(this.f69512a, c21954q0.f69512a) && AbstractC16544l.m18089b(this.f69513b, c21954q0.f69513b) && AbstractC16544l.m18089b(this.f69514c, c21954q0.f69514c) && AbstractC16544l.m18089b(this.f69515d, c21954q0.f69515d);
    }

    public final int hashCode() {
        String str = this.f69512a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f69513b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69514c;
        return this.f69515d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
