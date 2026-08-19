package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.h0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1092h0 extends AbstractC1142p {
    public static final C0983Q Companion = new C0983Q();

    /* JADX INFO: renamed from: a */
    public final Integer f2987a;

    /* JADX INFO: renamed from: b */
    public final Integer f2988b;

    /* JADX INFO: renamed from: c */
    public final C1085g0 f2989c;

    /* JADX INFO: renamed from: d */
    public final C1147p4 f2990d;

    /* JADX INFO: renamed from: e */
    public final String f2991e;

    public C1092h0(int i10, Integer num, Integer num2, C1085g0 c1085g0, C1147p4 c1147p4, String str) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0977P.f2757a.getDescriptor());
            throw null;
        }
        this.f2987a = num;
        this.f2988b = num2;
        this.f2989c = c1085g0;
        if ((i10 & 8) == 0) {
            this.f2990d = null;
        } else {
            this.f2990d = c1147p4;
        }
        if ((i10 & 16) == 0) {
            this.f2991e = "forecast";
        } else {
            this.f2991e = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2988b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2987a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2991e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092h0)) {
            return false;
        }
        C1092h0 c1092h0 = (C1092h0) obj;
        return AbstractC16544l.m18089b(this.f2987a, c1092h0.f2987a) && AbstractC16544l.m18089b(this.f2988b, c1092h0.f2988b) && AbstractC16544l.m18089b(this.f2989c, c1092h0.f2989c) && AbstractC16544l.m18089b(this.f2990d, c1092h0.f2990d) && AbstractC16544l.m18089b(this.f2991e, c1092h0.f2991e);
    }

    public final int hashCode() {
        Integer num = this.f2987a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2988b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        C1085g0 c1085g0 = this.f2989c;
        int iHashCode3 = (iHashCode2 + (c1085g0 == null ? 0 : c1085g0.hashCode())) * 31;
        C1147p4 c1147p4 = this.f2990d;
        return this.f2991e.hashCode() + ((iHashCode3 + (c1147p4 != null ? c1147p4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
