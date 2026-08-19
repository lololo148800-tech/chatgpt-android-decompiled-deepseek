package p228J;

import android.util.Range;
import android.util.Size;
import java.util.List;
import p1138z.C21572a;
import p178H.C3175v;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3824a {

    /* JADX INFO: renamed from: a */
    public final C3838h f11578a;

    /* JADX INFO: renamed from: b */
    public final int f11579b;

    /* JADX INFO: renamed from: c */
    public final Size f11580c;

    /* JADX INFO: renamed from: d */
    public final C3175v f11581d;

    /* JADX INFO: renamed from: e */
    public final List f11582e;

    /* JADX INFO: renamed from: f */
    public final C21572a f11583f;

    /* JADX INFO: renamed from: g */
    public final Range f11584g;

    public C3824a(C3838h c3838h, int i10, Size size, C3175v c3175v, List list, C21572a c21572a, Range range) {
        if (c3838h == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f11578a = c3838h;
        this.f11579b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f11580c = size;
        if (c3175v == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f11581d = c3175v;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f11582e = list;
        this.f11583f = c21572a;
        this.f11584g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3824a)) {
            return false;
        }
        C3824a c3824a = (C3824a) obj;
        if (this.f11578a.equals(c3824a.f11578a) && this.f11579b == c3824a.f11579b && this.f11580c.equals(c3824a.f11580c) && this.f11581d.equals(c3824a.f11581d) && this.f11582e.equals(c3824a.f11582e)) {
            C21572a c21572a = c3824a.f11583f;
            C21572a c21572a2 = this.f11583f;
            if (c21572a2 != null ? c21572a2.equals(c21572a) : c21572a == null) {
                Range range = c3824a.f11584g;
                Range range2 = this.f11584g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f11578a.hashCode() ^ 1000003) * 1000003) ^ this.f11579b) * 1000003) ^ this.f11580c.hashCode()) * 1000003) ^ this.f11581d.hashCode()) * 1000003) ^ this.f11582e.hashCode()) * 1000003;
        C21572a c21572a = this.f11583f;
        int iHashCode2 = (iHashCode ^ (c21572a == null ? 0 : c21572a.hashCode())) * 1000003;
        Range range = this.f11584g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f11578a + ", imageFormat=" + this.f11579b + ", size=" + this.f11580c + ", dynamicRange=" + this.f11581d + ", captureTypes=" + this.f11582e + ", implementationOptions=" + this.f11583f + ", targetFrameRate=" + this.f11584g + "}";
    }
}
