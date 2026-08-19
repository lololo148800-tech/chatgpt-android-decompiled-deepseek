package p591Y5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9660k extends AbstractC9658i {

    /* JADX INFO: renamed from: i */
    public final PointF f29107i;

    /* JADX INFO: renamed from: j */
    public final float[] f29108j;

    /* JADX INFO: renamed from: k */
    public final float[] f29109k;

    /* JADX INFO: renamed from: l */
    public final PathMeasure f29110l;

    /* JADX INFO: renamed from: m */
    public C9659j f29111m;

    public C9660k(ArrayList arrayList) {
        super(arrayList);
        this.f29107i = new PointF();
        this.f29108j = new float[2];
        this.f29109k = new float[2];
        this.f29110l = new PathMeasure();
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        C9659j c9659j = (C9659j) c14935a;
        Path path = c9659j.f29105q;
        C15384c c15384c = this.f29086e;
        if (c15384c != null && c14935a.f46531h != null) {
            PointF pointF = (PointF) c15384c.m16641r(c9659j.f46530g, c9659j.f46531h.floatValue(), (PointF) c9659j.f46525b, (PointF) c9659j.f46526c, m10233d(), f10, this.f29085d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c14935a.f46525b;
        }
        C9659j c9659j2 = this.f29111m;
        PathMeasure pathMeasure = this.f29110l;
        if (c9659j2 != c9659j) {
            pathMeasure.setPath(path, false);
            this.f29111m = c9659j;
        }
        float length = pathMeasure.getLength();
        float f11 = f10 * length;
        float[] fArr = this.f29108j;
        float[] fArr2 = this.f29109k;
        pathMeasure.getPosTan(f11, fArr, fArr2);
        PointF pointF2 = this.f29107i;
        pointF2.set(fArr[0], fArr[1]);
        if (f11 < 0.0f) {
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
            return pointF2;
        }
        if (f11 <= length) {
            return pointF2;
        }
        float f12 = f11 - length;
        pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
        return pointF2;
    }
}
