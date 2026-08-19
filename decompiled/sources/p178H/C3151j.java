package p178H;

import android.graphics.Matrix;
import android.graphics.Rect;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: H.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3151j {

    /* JADX INFO: renamed from: a */
    public final Rect f9482a;

    /* JADX INFO: renamed from: b */
    public final int f9483b;

    /* JADX INFO: renamed from: c */
    public final int f9484c;

    /* JADX INFO: renamed from: d */
    public final boolean f9485d;

    /* JADX INFO: renamed from: e */
    public final Matrix f9486e;

    /* JADX INFO: renamed from: f */
    public final boolean f9487f;

    public C3151j(Rect rect, int i10, int i11, boolean z6, Matrix matrix, boolean z10) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f9482a = rect;
        this.f9483b = i10;
        this.f9484c = i11;
        this.f9485d = z6;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f9486e = matrix;
        this.f9487f = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3151j)) {
            return false;
        }
        C3151j c3151j = (C3151j) obj;
        return this.f9482a.equals(c3151j.f9482a) && this.f9483b == c3151j.f9483b && this.f9484c == c3151j.f9484c && this.f9485d == c3151j.f9485d && this.f9486e.equals(c3151j.f9486e) && this.f9487f == c3151j.f9487f;
    }

    public final int hashCode() {
        return ((((((((((this.f9482a.hashCode() ^ 1000003) * 1000003) ^ this.f9483b) * 1000003) ^ this.f9484c) * 1000003) ^ (this.f9485d ? 1231 : 1237)) * 1000003) ^ this.f9486e.hashCode()) * 1000003) ^ (this.f9487f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.f9482a);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f9483b);
        sb2.append(", getTargetRotation=");
        sb2.append(this.f9484c);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.f9485d);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.f9486e);
        sb2.append(", isMirroring=");
        return AbstractC14376f.m15823B(sb2, this.f9487f, "}");
    }
}
