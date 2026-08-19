package p057C3;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p232J3.C4253y;

/* JADX INFO: renamed from: C3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1538P {

    /* JADX INFO: renamed from: a */
    public final C4253y f4192a;

    /* JADX INFO: renamed from: b */
    public final long f4193b;

    /* JADX INFO: renamed from: c */
    public final long f4194c;

    /* JADX INFO: renamed from: d */
    public final long f4195d;

    /* JADX INFO: renamed from: e */
    public final long f4196e;

    /* JADX INFO: renamed from: f */
    public final boolean f4197f;

    /* JADX INFO: renamed from: g */
    public final boolean f4198g;

    /* JADX INFO: renamed from: h */
    public final boolean f4199h;

    /* JADX INFO: renamed from: i */
    public final boolean f4200i;

    public C1538P(C4253y c4253y, long j10, long j11, long j12, long j13, boolean z6, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        AbstractC20800b.m21316d(!z12 || z10);
        AbstractC20800b.m21316d(!z11 || z10);
        if (z6 && (z10 || z11 || z12)) {
            z13 = false;
        }
        AbstractC20800b.m21316d(z13);
        this.f4192a = c4253y;
        this.f4193b = j10;
        this.f4194c = j11;
        this.f4195d = j12;
        this.f4196e = j13;
        this.f4197f = z6;
        this.f4198g = z10;
        this.f4199h = z11;
        this.f4200i = z12;
    }

    /* JADX INFO: renamed from: a */
    public final C1538P m2342a(long j10) {
        if (j10 == this.f4194c) {
            return this;
        }
        return new C1538P(this.f4192a, this.f4193b, j10, this.f4195d, this.f4196e, this.f4197f, this.f4198g, this.f4199h, this.f4200i);
    }

    /* JADX INFO: renamed from: b */
    public final C1538P m2343b(long j10) {
        if (j10 == this.f4193b) {
            return this;
        }
        return new C1538P(this.f4192a, j10, this.f4194c, this.f4195d, this.f4196e, this.f4197f, this.f4198g, this.f4199h, this.f4200i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1538P.class != obj.getClass()) {
            return false;
        }
        C1538P c1538p = (C1538P) obj;
        return this.f4193b == c1538p.f4193b && this.f4194c == c1538p.f4194c && this.f4195d == c1538p.f4195d && this.f4196e == c1538p.f4196e && this.f4197f == c1538p.f4197f && this.f4198g == c1538p.f4198g && this.f4199h == c1538p.f4199h && this.f4200i == c1538p.f4200i && AbstractC20817s.m21400a(this.f4192a, c1538p.f4192a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f4192a.hashCode() + 527) * 31) + ((int) this.f4193b)) * 31) + ((int) this.f4194c)) * 31) + ((int) this.f4195d)) * 31) + ((int) this.f4196e)) * 31) + (this.f4197f ? 1 : 0)) * 31) + (this.f4198g ? 1 : 0)) * 31) + (this.f4199h ? 1 : 0)) * 31) + (this.f4200i ? 1 : 0);
    }
}
