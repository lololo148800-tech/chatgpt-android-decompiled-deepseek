package p178H;

import android.graphics.Rect;
import android.util.Size;
import p228J.InterfaceC3870x;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: H.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3145g {

    /* JADX INFO: renamed from: a */
    public final Size f9460a;

    /* JADX INFO: renamed from: b */
    public final Rect f9461b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3870x f9462c;

    /* JADX INFO: renamed from: d */
    public final int f9463d;

    /* JADX INFO: renamed from: e */
    public final boolean f9464e;

    public C3145g(Size size, Rect rect, InterfaceC3870x interfaceC3870x, int i10, boolean z6) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f9460a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f9461b = rect;
        this.f9462c = interfaceC3870x;
        this.f9463d = i10;
        this.f9464e = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3145g)) {
            return false;
        }
        C3145g c3145g = (C3145g) obj;
        if (this.f9460a.equals(c3145g.f9460a) && this.f9461b.equals(c3145g.f9461b)) {
            InterfaceC3870x interfaceC3870x = c3145g.f9462c;
            InterfaceC3870x interfaceC3870x2 = this.f9462c;
            if (interfaceC3870x2 != null ? interfaceC3870x2.equals(interfaceC3870x) : interfaceC3870x == null) {
                if (this.f9463d == c3145g.f9463d && this.f9464e == c3145g.f9464e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9460a.hashCode() ^ 1000003) * 1000003) ^ this.f9461b.hashCode()) * 1000003;
        InterfaceC3870x interfaceC3870x = this.f9462c;
        return ((((iHashCode ^ (interfaceC3870x == null ? 0 : interfaceC3870x.hashCode())) * 1000003) ^ this.f9463d) * 1000003) ^ (this.f9464e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.f9460a);
        sb2.append(", inputCropRect=");
        sb2.append(this.f9461b);
        sb2.append(", cameraInternal=");
        sb2.append(this.f9462c);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f9463d);
        sb2.append(", mirroring=");
        return AbstractC14376f.m15823B(sb2, this.f9464e, "}");
    }
}
