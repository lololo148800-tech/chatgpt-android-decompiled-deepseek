package p675c6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: c6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C11676k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35378a;

    /* JADX INFO: renamed from: b */
    public PointF f35379b;

    /* JADX INFO: renamed from: c */
    public boolean f35380c;

    public C11676k(PointF pointF, boolean z6, List list) {
        this.f35379b = pointF;
        this.f35380c = z6;
        this.f35378a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m13024a(float f10, float f11) {
        if (this.f35379b == null) {
            this.f35379b = new PointF();
        }
        this.f35379b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f35378a.size());
        sb2.append("closed=");
        return AbstractC3794B0.m4499x(sb2, this.f35380c, '}');
    }

    public C11676k() {
        this.f35378a = new ArrayList();
    }
}
