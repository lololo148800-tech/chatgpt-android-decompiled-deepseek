package p228J;

import android.util.Range;
import android.util.Size;
import p1138z.C21572a;
import p117Eb.C2392v;
import p178H.C3175v;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3836g {

    /* JADX INFO: renamed from: f */
    public static final Range f11605f = new Range(0, 0);

    /* JADX INFO: renamed from: a */
    public final Size f11606a;

    /* JADX INFO: renamed from: b */
    public final C3175v f11607b;

    /* JADX INFO: renamed from: c */
    public final Range f11608c;

    /* JADX INFO: renamed from: d */
    public final C21572a f11609d;

    /* JADX INFO: renamed from: e */
    public final boolean f11610e;

    public C3836g(Size size, C3175v c3175v, Range range, C21572a c21572a, boolean z6) {
        this.f11606a = size;
        this.f11607b = c3175v;
        this.f11608c = range;
        this.f11609d = c21572a;
        this.f11610e = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C2392v m4569a() {
        C2392v c2392v = new C2392v(7, false);
        c2392v.f7436Z = this.f11606a;
        c2392v.f7437o0 = this.f11607b;
        c2392v.f7438p0 = this.f11608c;
        c2392v.f7439q0 = this.f11609d;
        c2392v.f7440r0 = Boolean.valueOf(this.f11610e);
        return c2392v;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3836g)) {
            return false;
        }
        C3836g c3836g = (C3836g) obj;
        if (this.f11606a.equals(c3836g.f11606a) && this.f11607b.equals(c3836g.f11607b) && this.f11608c.equals(c3836g.f11608c)) {
            C21572a c21572a = c3836g.f11609d;
            C21572a c21572a2 = this.f11609d;
            if (c21572a2 != null ? c21572a2.equals(c21572a) : c21572a == null) {
                if (this.f11610e == c3836g.f11610e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11606a.hashCode() ^ 1000003) * 1000003) ^ this.f11607b.hashCode()) * 1000003) ^ this.f11608c.hashCode()) * 1000003;
        C21572a c21572a = this.f11609d;
        return ((iHashCode ^ (c21572a == null ? 0 : c21572a.hashCode())) * 1000003) ^ (this.f11610e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpec{resolution=");
        sb2.append(this.f11606a);
        sb2.append(", dynamicRange=");
        sb2.append(this.f11607b);
        sb2.append(", expectedFrameRateRange=");
        sb2.append(this.f11608c);
        sb2.append(", implementationOptions=");
        sb2.append(this.f11609d);
        sb2.append(", zslDisabled=");
        return AbstractC14376f.m15823B(sb2, this.f11610e, "}");
    }
}
