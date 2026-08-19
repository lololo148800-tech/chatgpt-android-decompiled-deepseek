package p204I1;

import com.google.protobuf.AbstractC12107L1;
import p011A9.p012Ra.ahZQMZ;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: I1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3601q {

    /* JADX INFO: renamed from: a */
    public final C3585a f10968a;

    /* JADX INFO: renamed from: b */
    public final int f10969b;

    /* JADX INFO: renamed from: c */
    public final int f10970c;

    /* JADX INFO: renamed from: d */
    public final int f10971d;

    /* JADX INFO: renamed from: e */
    public final int f10972e;

    /* JADX INFO: renamed from: f */
    public final float f10973f;

    /* JADX INFO: renamed from: g */
    public final float f10974g;

    public C3601q(C3585a c3585a, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f10968a = c3585a;
        this.f10969b = i10;
        this.f10970c = i11;
        this.f10971d = i12;
        this.f10972e = i13;
        this.f10973f = f10;
        this.f10974g = f11;
    }

    /* JADX INFO: renamed from: a */
    public final long m4318a(long j10, boolean z6) {
        if (z6) {
            int i10 = C3581L.f10907c;
            long j11 = C3581L.f10906b;
            if (C3581L.m4266b(j10, j11)) {
                return j11;
            }
        }
        int i11 = C3581L.f10907c;
        int i12 = (int) (j10 >> 32);
        int i13 = this.f10969b;
        return AbstractC8676n.m9365b(i12 + i13, ((int) (j10 & 4294967295L)) + i13);
    }

    /* JADX INFO: renamed from: b */
    public final int m4319b(int i10) {
        int i11 = this.f10970c;
        int i12 = this.f10969b;
        return AbstractC8301I.m8921l(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3601q)) {
            return false;
        }
        C3601q c3601q = (C3601q) obj;
        return this.f10968a.equals(c3601q.f10968a) && this.f10969b == c3601q.f10969b && this.f10970c == c3601q.f10970c && this.f10971d == c3601q.f10971d && this.f10972e == c3601q.f10972e && Float.compare(this.f10973f, c3601q.f10973f) == 0 && Float.compare(this.f10974g, c3601q.f10974g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10974g) + AbstractC12107L1.m13819j(this.f10973f, ((((((((this.f10968a.hashCode() * 31) + this.f10969b) * 31) + this.f10970c) * 31) + this.f10971d) * 31) + this.f10972e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(ahZQMZ.oVPQRqgexxtXmp);
        sb2.append(this.f10968a);
        sb2.append(", startIndex=");
        sb2.append(this.f10969b);
        sb2.append(", endIndex=");
        sb2.append(this.f10970c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f10971d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f10972e);
        sb2.append(", top=");
        sb2.append(this.f10973f);
        sb2.append(", bottom=");
        return AbstractC12107L1.m13825p(sb2, this.f10974g, ')');
    }
}
