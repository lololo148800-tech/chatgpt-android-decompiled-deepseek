package cc;

import android.graphics.PointF;
import p310M9.C5311e;

/* JADX INFO: renamed from: cc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11700e {

    /* JADX INFO: renamed from: a */
    public final int f35494a;

    /* JADX INFO: renamed from: b */
    public final PointF f35495b;

    public C11700e(int i10, PointF pointF) {
        this.f35494a = i10;
        this.f35495b = pointF;
    }

    public final String toString() {
        C5311e c5311e = new C5311e("FaceLandmark", 17);
        c5311e.m5850E(this.f35494a, "type");
        c5311e.m5851F(this.f35495b, "position");
        return c5311e.toString();
    }
}
