package p979r2;

import android.graphics.Insets;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: r2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18862c {

    /* JADX INFO: renamed from: e */
    public static final C18862c f60085e = new C18862c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f60086a;

    /* JADX INFO: renamed from: b */
    public final int f60087b;

    /* JADX INFO: renamed from: c */
    public final int f60088c;

    /* JADX INFO: renamed from: d */
    public final int f60089d;

    public C18862c(int i10, int i11, int i12, int i13) {
        this.f60086a = i10;
        this.f60087b = i11;
        this.f60088c = i12;
        this.f60089d = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C18862c m20170a(C18862c c18862c, C18862c c18862c2) {
        return m20171b(Math.max(c18862c.f60086a, c18862c2.f60086a), Math.max(c18862c.f60087b, c18862c2.f60087b), Math.max(c18862c.f60088c, c18862c2.f60088c), Math.max(c18862c.f60089d, c18862c2.f60089d));
    }

    /* JADX INFO: renamed from: b */
    public static C18862c m20171b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f60085e : new C18862c(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static C18862c m20172c(Insets insets) {
        return m20171b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m20173d() {
        return AbstractC18860a.m20161b(this.f60086a, this.f60087b, this.f60088c, this.f60089d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18862c.class != obj.getClass()) {
            return false;
        }
        C18862c c18862c = (C18862c) obj;
        return this.f60089d == c18862c.f60089d && this.f60086a == c18862c.f60086a && this.f60088c == c18862c.f60088c && this.f60087b == c18862c.f60087b;
    }

    public final int hashCode() {
        return (((((this.f60086a * 31) + this.f60087b) * 31) + this.f60088c) * 31) + this.f60089d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f60086a);
        sb2.append(", top=");
        sb2.append(this.f60087b);
        sb2.append(", right=");
        sb2.append(this.f60088c);
        sb2.append(", bottom=");
        return AbstractC12107L1.m13826q(sb2, this.f60089d, '}');
    }
}
