package p759g1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8080e6;

/* JADX INFO: renamed from: g1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13802d {

    /* JADX INFO: renamed from: a */
    public final float f43590a;

    /* JADX INFO: renamed from: b */
    public final float f43591b;

    /* JADX INFO: renamed from: c */
    public final float f43592c;

    /* JADX INFO: renamed from: d */
    public final float f43593d;

    /* JADX INFO: renamed from: e */
    public final long f43594e;

    /* JADX INFO: renamed from: f */
    public final long f43595f;

    /* JADX INFO: renamed from: g */
    public final long f43596g;

    /* JADX INFO: renamed from: h */
    public final long f43597h;

    static {
        long j10 = AbstractC13799a.f43582a;
        AbstractC8072d6.m8484a(AbstractC13799a.m15297b(j10), AbstractC13799a.m15298c(j10));
    }

    public C13802d(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f43590a = f10;
        this.f43591b = f11;
        this.f43592c = f12;
        this.f43593d = f13;
        this.f43594e = j10;
        this.f43595f = j11;
        this.f43596g = j12;
        this.f43597h = j13;
    }

    /* JADX INFO: renamed from: a */
    public final float m15327a() {
        return this.f43593d - this.f43591b;
    }

    /* JADX INFO: renamed from: b */
    public final float m15328b() {
        return this.f43592c - this.f43590a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13802d)) {
            return false;
        }
        C13802d c13802d = (C13802d) obj;
        return Float.compare(this.f43590a, c13802d.f43590a) == 0 && Float.compare(this.f43591b, c13802d.f43591b) == 0 && Float.compare(this.f43592c, c13802d.f43592c) == 0 && Float.compare(this.f43593d, c13802d.f43593d) == 0 && AbstractC13799a.m15296a(this.f43594e, c13802d.f43594e) && AbstractC13799a.m15296a(this.f43595f, c13802d.f43595f) && AbstractC13799a.m15296a(this.f43596g, c13802d.f43596g) && AbstractC13799a.m15296a(this.f43597h, c13802d.f43597h);
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f43593d, AbstractC12107L1.m13819j(this.f43592c, AbstractC12107L1.m13819j(this.f43591b, Float.floatToIntBits(this.f43590a) * 31, 31), 31), 31);
        long j10 = this.f43594e;
        long j11 = this.f43595f;
        int i10 = (((int) (j11 ^ (j11 >>> 32))) + ((((int) (j10 ^ (j10 >>> 32))) + iM13819j) * 31)) * 31;
        long j12 = this.f43596g;
        int i11 = (((int) (j12 ^ (j12 >>> 32))) + i10) * 31;
        long j13 = this.f43597h;
        return ((int) (j13 ^ (j13 >>> 32))) + i11;
    }

    public final String toString() {
        String str = AbstractC8080e6.m8508c(this.f43590a) + ", " + AbstractC8080e6.m8508c(this.f43591b) + ", " + AbstractC8080e6.m8508c(this.f43592c) + ", " + AbstractC8080e6.m8508c(this.f43593d);
        long j10 = this.f43594e;
        long j11 = this.f43595f;
        boolean zM15296a = AbstractC13799a.m15296a(j10, j11);
        long j12 = this.f43596g;
        long j13 = this.f43597h;
        if (!zM15296a || !AbstractC13799a.m15296a(j11, j12) || !AbstractC13799a.m15296a(j12, j13)) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("RoundRect(rect=", str, ", topLeft=");
            sbM11058p.append((Object) AbstractC13799a.m15299d(j10));
            sbM11058p.append(", topRight=");
            sbM11058p.append((Object) AbstractC13799a.m15299d(j11));
            sbM11058p.append(", bottomRight=");
            sbM11058p.append((Object) AbstractC13799a.m15299d(j12));
            sbM11058p.append(", bottomLeft=");
            sbM11058p.append((Object) AbstractC13799a.m15299d(j13));
            sbM11058p.append(')');
            return sbM11058p.toString();
        }
        if (AbstractC13799a.m15297b(j10) == AbstractC13799a.m15298c(j10)) {
            StringBuilder sbM11058p2 = AbstractC10763a.m11058p("RoundRect(rect=", str, ", radius=");
            sbM11058p2.append(AbstractC8080e6.m8508c(AbstractC13799a.m15297b(j10)));
            sbM11058p2.append(')');
            return sbM11058p2.toString();
        }
        StringBuilder sbM11058p3 = AbstractC10763a.m11058p("RoundRect(rect=", str, ", x=");
        sbM11058p3.append(AbstractC8080e6.m8508c(AbstractC13799a.m15297b(j10)));
        sbM11058p3.append(", y=");
        sbM11058p3.append(AbstractC8080e6.m8508c(AbstractC13799a.m15298c(j10)));
        sbM11058p3.append(')');
        return sbM11058p3.toString();
    }
}
