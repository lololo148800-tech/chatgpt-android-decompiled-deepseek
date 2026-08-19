package p414R;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import p228J.InterfaceC3854p;
import p253K.C4494e;

/* JADX INFO: renamed from: R.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6768b {

    /* JADX INFO: renamed from: a */
    public final Object f21708a;

    /* JADX INFO: renamed from: b */
    public final C4494e f21709b;

    /* JADX INFO: renamed from: c */
    public final int f21710c;

    /* JADX INFO: renamed from: d */
    public final Size f21711d;

    /* JADX INFO: renamed from: e */
    public final Rect f21712e;

    /* JADX INFO: renamed from: f */
    public final int f21713f;

    /* JADX INFO: renamed from: g */
    public final Matrix f21714g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3854p f21715h;

    public C6768b(Object obj, C4494e c4494e, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC3854p interfaceC3854p) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f21708a = obj;
        this.f21709b = c4494e;
        this.f21710c = i10;
        this.f21711d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f21712e = rect;
        this.f21713f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f21714g = matrix;
        if (interfaceC3854p == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f21715h = interfaceC3854p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6768b)) {
            return false;
        }
        C6768b c6768b = (C6768b) obj;
        if (this.f21708a.equals(c6768b.f21708a)) {
            C4494e c4494e = c6768b.f21709b;
            C4494e c4494e2 = this.f21709b;
            if (c4494e2 != null ? c4494e2.equals(c4494e) : c4494e == null) {
                if (this.f21710c == c6768b.f21710c && this.f21711d.equals(c6768b.f21711d) && this.f21712e.equals(c6768b.f21712e) && this.f21713f == c6768b.f21713f && this.f21714g.equals(c6768b.f21714g) && this.f21715h.equals(c6768b.f21715h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f21708a.hashCode() ^ 1000003) * 1000003;
        C4494e c4494e = this.f21709b;
        return ((((((((((((iHashCode ^ (c4494e == null ? 0 : c4494e.hashCode())) * 1000003) ^ this.f21710c) * 1000003) ^ this.f21711d.hashCode()) * 1000003) ^ this.f21712e.hashCode()) * 1000003) ^ this.f21713f) * 1000003) ^ this.f21714g.hashCode()) * 1000003) ^ this.f21715h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f21708a + ", exif=" + this.f21709b + ", format=" + this.f21710c + ", size=" + this.f21711d + ", cropRect=" + this.f21712e + ", rotationDegrees=" + this.f21713f + ", sensorToBufferTransform=" + this.f21714g + ", cameraCaptureResult=" + this.f21715h + "}";
    }
}
