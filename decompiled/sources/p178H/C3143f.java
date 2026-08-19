package p178H;

import android.graphics.Matrix;
import p228J.C3875z0;
import p253K.C4498i;

/* JADX INFO: renamed from: H.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3143f implements InterfaceC3125S {

    /* JADX INFO: renamed from: a */
    public final C3875z0 f9455a;

    /* JADX INFO: renamed from: b */
    public final long f9456b;

    /* JADX INFO: renamed from: c */
    public final int f9457c;

    /* JADX INFO: renamed from: d */
    public final Matrix f9458d;

    public C3143f(C3875z0 c3875z0, long j10, int i10, Matrix matrix) {
        if (c3875z0 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f9455a = c3875z0;
        this.f9456b = j10;
        this.f9457c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f9458d = matrix;
    }

    @Override // p178H.InterfaceC3125S
    /* JADX INFO: renamed from: c */
    public final C3875z0 mo3964c() {
        return this.f9455a;
    }

    @Override // p178H.InterfaceC3125S
    /* JADX INFO: renamed from: e */
    public final void mo3965e(C4498i c4498i) {
        c4498i.m5236d(this.f9457c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3143f)) {
            return false;
        }
        C3143f c3143f = (C3143f) obj;
        return this.f9455a.equals(c3143f.f9455a) && this.f9456b == c3143f.f9456b && this.f9457c == c3143f.f9457c && this.f9458d.equals(c3143f.f9458d);
    }

    @Override // p178H.InterfaceC3125S
    /* JADX INFO: renamed from: f */
    public final long mo3966f() {
        return this.f9456b;
    }

    @Override // p178H.InterfaceC3125S
    /* JADX INFO: renamed from: g */
    public final int mo3967g() {
        return this.f9457c;
    }

    public final int hashCode() {
        int iHashCode = (this.f9455a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f9456b;
        return ((((iHashCode ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f9457c) * 1000003) ^ this.f9458d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f9455a + ", timestamp=" + this.f9456b + ", rotationDegrees=" + this.f9457c + ", sensorToBufferTransformMatrix=" + this.f9458d + "}";
    }
}
