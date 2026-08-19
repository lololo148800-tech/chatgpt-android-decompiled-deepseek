package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.z1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1204z1 extends AbstractC0888A0 {
    public static final C1198y1 Companion = new C1198y1();

    /* JADX INFO: renamed from: a */
    public final Integer f3167a;

    /* JADX INFO: renamed from: b */
    public final Integer f3168b;

    /* JADX INFO: renamed from: c */
    public final String f3169c;

    /* JADX INFO: renamed from: d */
    public final String f3170d;

    /* JADX INFO: renamed from: e */
    public final String f3171e;

    /* JADX INFO: renamed from: f */
    public final String f3172f;

    public C1204z1(int i10, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1192x1.f3145a.getDescriptor());
            throw null;
        }
        this.f3167a = num;
        this.f3168b = num2;
        this.f3169c = str;
        if ((i10 & 8) == 0) {
            this.f3170d = null;
        } else {
            this.f3170d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f3171e = null;
        } else {
            this.f3171e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f3172f = "title_citation";
        } else {
            this.f3172f = str4;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3168b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3167a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3172f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204z1)) {
            return false;
        }
        C1204z1 c1204z1 = (C1204z1) obj;
        return AbstractC16544l.m18089b(this.f3167a, c1204z1.f3167a) && AbstractC16544l.m18089b(this.f3168b, c1204z1.f3168b) && AbstractC16544l.m18089b(this.f3169c, c1204z1.f3169c) && AbstractC16544l.m18089b(this.f3170d, c1204z1.f3170d) && AbstractC16544l.m18089b(this.f3171e, c1204z1.f3171e) && AbstractC16544l.m18089b(this.f3172f, c1204z1.f3172f);
    }

    public final int hashCode() {
        Integer num = this.f3167a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3168b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f3169c);
        String str = this.f3170d;
        int iHashCode2 = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3171e;
        return this.f3172f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
