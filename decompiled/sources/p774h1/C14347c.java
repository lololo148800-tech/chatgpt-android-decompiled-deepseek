package p774h1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.jvm.internal.AbstractC16544l;
import p759g1.C13800b;
import p759g1.C13801c;
import p985r9.C18903m;

/* JADX INFO: renamed from: h1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14347c implements InterfaceC14362r {

    /* JADX INFO: renamed from: a */
    public Canvas f45028a = AbstractC14348d.f45031a;

    /* JADX INFO: renamed from: b */
    public Rect f45029b;

    /* JADX INFO: renamed from: c */
    public Rect f45030c;

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: a */
    public final void mo15702a(float f10, float f11) {
        this.f45028a.scale(f10, f11);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: b */
    public final void mo15703b(float f10) {
        this.f45028a.rotate(f10);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: c */
    public final void mo15704c(C13801c c13801c, C18903m c18903m) {
        mo15710i(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d, c18903m);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: d */
    public final void mo15705d(C14351g c14351g, long j10, long j11, long j12, long j13, C18903m c18903m) {
        if (this.f45029b == null) {
            this.f45029b = new Rect();
            this.f45030c = new Rect();
        }
        Canvas canvas = this.f45028a;
        Bitmap bitmapM15635m = AbstractC14334L.m15635m(c14351g);
        Rect rect = this.f45029b;
        AbstractC16544l.m18091d(rect);
        int i10 = (int) (j10 >> 32);
        rect.left = i10;
        int i11 = (int) (j10 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j11 >> 32));
        rect.bottom = i11 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f45030c;
        AbstractC16544l.m18091d(rect2);
        int i12 = (int) (j12 >> 32);
        rect2.left = i12;
        int i13 = (int) (j12 & 4294967295L);
        rect2.top = i13;
        rect2.right = i12 + ((int) (j13 >> 32));
        rect2.bottom = i13 + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(bitmapM15635m, rect, rect2, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: e */
    public final void mo15706e() {
        this.f45028a.save();
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: f */
    public final void mo15707f() {
        AbstractC14334L.m15638p(this.f45028a, false);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: g */
    public final void mo15708g(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (fArr[(i10 * 4) + i11] != (i10 == i11 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    AbstractC14334L.m15648z(matrix, fArr);
                    this.f45028a.concat(matrix);
                    return;
                }
                i11++;
            }
            i10++;
        }
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: h */
    public final void mo15709h(C13801c c13801c, int i10) {
        mo15716o(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d, i10);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: i */
    public final void mo15710i(float f10, float f11, float f12, float f13, C18903m c18903m) {
        this.f45028a.drawRect(f10, f11, f12, f13, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: j */
    public final void mo15711j(long j10, long j11, C18903m c18903m) {
        this.f45028a.drawLine(C13800b.m15306g(j10), C13800b.m15307h(j10), C13800b.m15306g(j11), C13800b.m15307h(j11), (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: k */
    public final void mo15712k(C14351g c14351g, long j10, C18903m c18903m) {
        this.f45028a.drawBitmap(AbstractC14334L.m15635m(c14351g), C13800b.m15306g(j10), C13800b.m15307h(j10), (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: l */
    public final void mo15713l(InterfaceC14333K interfaceC14333K, C18903m c18903m) {
        Canvas canvas = this.f45028a;
        if (!(interfaceC14333K instanceof C14353i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C14353i) interfaceC14333K).f45039a, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: m */
    public final void mo15714m(C13801c c13801c, C18903m c18903m) {
        Canvas canvas = this.f45028a;
        Paint paint = (Paint) c18903m.f60268b;
        canvas.saveLayer(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d, paint, 31);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: n */
    public final void mo15715n(float f10, float f11, float f12, float f13, float f14, float f15, C18903m c18903m) {
        this.f45028a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: o */
    public final void mo15716o(float f10, float f11, float f12, float f13, int i10) {
        this.f45028a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: p */
    public final void mo15717p(float f10, float f11) {
        this.f45028a.translate(f10, f11);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: q */
    public final void mo15718q(float f10, float f11, float f12, float f13, float f14, float f15, C18903m c18903m) {
        this.f45028a.drawArc(f10, f11, f12, f13, f14, f15, false, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: r */
    public final void mo15719r() {
        this.f45028a.restore();
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: s */
    public final void mo15720s(float f10, long j10, C18903m c18903m) {
        this.f45028a.drawCircle(C13800b.m15306g(j10), C13800b.m15307h(j10), f10, (Paint) c18903m.f60268b);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: t */
    public final void mo15721t() {
        AbstractC14334L.m15638p(this.f45028a, true);
    }

    @Override // p774h1.InterfaceC14362r
    /* JADX INFO: renamed from: u */
    public final void mo15722u(InterfaceC14333K interfaceC14333K, int i10) {
        Canvas canvas = this.f45028a;
        if (!(interfaceC14333K instanceof C14353i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C14353i) interfaceC14333K).f45039a, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* JADX INFO: renamed from: v */
    public final Canvas m15723v() {
        return this.f45028a;
    }

    /* JADX INFO: renamed from: w */
    public final void m15724w(Canvas canvas) {
        this.f45028a = canvas;
    }
}
