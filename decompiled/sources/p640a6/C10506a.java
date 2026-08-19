package p640a6;

import android.graphics.PointF;

/* JADX INFO: renamed from: a6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10506a {

    /* JADX INFO: renamed from: a */
    public final PointF f31125a;

    /* JADX INFO: renamed from: b */
    public final PointF f31126b;

    /* JADX INFO: renamed from: c */
    public final PointF f31127c;

    public C10506a() {
        this.f31125a = new PointF();
        this.f31126b = new PointF();
        this.f31127c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f31127c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f31125a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f31126b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C10506a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f31125a = pointF;
        this.f31126b = pointF2;
        this.f31127c = pointF3;
    }
}
