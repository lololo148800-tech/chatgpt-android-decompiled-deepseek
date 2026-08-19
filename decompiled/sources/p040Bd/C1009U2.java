package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.U2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1009U2 {
    public static final C0968N2 Companion = new C0968N2();

    /* JADX INFO: renamed from: a */
    public final String f2804a;

    /* JADX INFO: renamed from: b */
    public final String f2805b;

    /* JADX INFO: renamed from: c */
    public final C1003T2 f2806c;

    /* JADX INFO: renamed from: d */
    public final C0944J2 f2807d;

    /* JADX INFO: renamed from: e */
    public final C0962M2 f2808e;

    /* JADX INFO: renamed from: f */
    public final C0986Q2 f2809f;

    public /* synthetic */ C1009U2(int i10, String str, String str2, C1003T2 c1003t2, C0944J2 c0944j2, C0962M2 c0962m2, C0986Q2 c0986q2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0926G2.f2672a.getDescriptor());
            throw null;
        }
        this.f2804a = str;
        this.f2805b = str2;
        if ((i10 & 4) == 0) {
            this.f2806c = null;
        } else {
            this.f2806c = c1003t2;
        }
        if ((i10 & 8) == 0) {
            this.f2807d = null;
        } else {
            this.f2807d = c0944j2;
        }
        if ((i10 & 16) == 0) {
            this.f2808e = null;
        } else {
            this.f2808e = c0962m2;
        }
        if ((i10 & 32) == 0) {
            this.f2809f = null;
        } else {
            this.f2809f = c0986q2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1009U2)) {
            return false;
        }
        C1009U2 c1009u2 = (C1009U2) obj;
        return AbstractC16544l.m18089b(this.f2804a, c1009u2.f2804a) && AbstractC16544l.m18089b(this.f2805b, c1009u2.f2805b) && AbstractC16544l.m18089b(this.f2806c, c1009u2.f2806c) && AbstractC16544l.m18089b(this.f2807d, c1009u2.f2807d) && AbstractC16544l.m18089b(this.f2808e, c1009u2.f2808e) && AbstractC16544l.m18089b(this.f2809f, c1009u2.f2809f);
    }

    public final int hashCode() {
        String str = this.f2804a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2805b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1003T2 c1003t2 = this.f2806c;
        int iHashCode3 = (iHashCode2 + (c1003t2 == null ? 0 : c1003t2.hashCode())) * 31;
        C0944J2 c0944j2 = this.f2807d;
        int iHashCode4 = (iHashCode3 + (c0944j2 == null ? 0 : c0944j2.hashCode())) * 31;
        C0962M2 c0962m2 = this.f2808e;
        int iHashCode5 = (iHashCode4 + (c0962m2 == null ? 0 : c0962m2.hashCode())) * 31;
        C0986Q2 c0986q2 = this.f2809f;
        return iHashCode5 + (c0986q2 != null ? c0986q2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
