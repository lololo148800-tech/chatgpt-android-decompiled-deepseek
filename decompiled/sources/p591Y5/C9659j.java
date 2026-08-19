package p591Y5;

import android.graphics.Path;
import android.graphics.PointF;
import p003A1.C0284r0;
import p520V5.C7781j;
import p779h6.AbstractC14418g;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9659j extends C14935a {

    /* JADX INFO: renamed from: q */
    public Path f29105q;

    /* JADX INFO: renamed from: r */
    public final C14935a f29106r;

    public C9659j(C7781j c7781j, C14935a c14935a) {
        super(c7781j, (PointF) c14935a.f46525b, (PointF) c14935a.f46526c, c14935a.f46527d, c14935a.f46528e, c14935a.f46529f, c14935a.f46530g, c14935a.f46531h);
        this.f29106r = c14935a;
        m10246d();
    }

    /* JADX INFO: renamed from: d */
    public final void m10246d() {
        Object obj;
        Object obj2 = this.f46526c;
        Object obj3 = this.f46525b;
        boolean z6 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f46526c) == null || z6) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C14935a c14935a = this.f29106r;
        PointF pointF3 = c14935a.f46538o;
        PointF pointF4 = c14935a.f46539p;
        C0284r0 c0284r0 = AbstractC14418g.f45308a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f29105q = path;
    }
}
