package p221Ii;

import mm.C17321x;
import p594Y9.AbstractC9797R2;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ii.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3722a {

    /* JADX INFO: renamed from: e */
    public static final C3722a f11275e;

    /* JADX INFO: renamed from: f */
    public static final long f11276f;

    /* JADX INFO: renamed from: g */
    public static final long f11277g;

    /* JADX INFO: renamed from: a */
    public final long f11278a;

    /* JADX INFO: renamed from: b */
    public final long f11279b;

    /* JADX INFO: renamed from: c */
    public final long f11280c;

    /* JADX INFO: renamed from: d */
    public final long f11281d;

    static {
        long j10 = C14365u.f45060j;
        f11275e = new C3722a(AbstractC9797R2.m10414b(j10, "DCF7FF"), AbstractC9797R2.m10414b(j10, "0181FE"), AbstractC9797R2.m10414b(j10, "A4EFFF"), AbstractC9797R2.m10414b(j10, "FFFDEF"));
        f11276f = AbstractC9797R2.m10414b(j10, "ECFBFF");
        f11277g = AbstractC9797R2.m10414b(j10, "FFFDEF");
    }

    public C3722a(long j10, long j11, long j12, long j13) {
        this.f11278a = j10;
        this.f11279b = j11;
        this.f11280c = j12;
        this.f11281d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3722a)) {
            return false;
        }
        C3722a c3722a = (C3722a) obj;
        return C14365u.m15775c(this.f11278a, c3722a.f11278a) && C14365u.m15775c(this.f11279b, c3722a.f11279b) && C14365u.m15775c(this.f11280c, c3722a.f11280c) && C14365u.m15775c(this.f11281d, c3722a.f11281d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f11281d) + AbstractC14376f.m15857w(this.f11280c, AbstractC14376f.m15857w(this.f11279b, C17321x.m18981a(this.f11278a) * 31, 31), 31);
    }

    public final String toString() {
        return "█";
    }
}
