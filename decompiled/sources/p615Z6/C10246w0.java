package p615Z6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.android.core.AbstractC15256t;
import p938p2.AbstractC18290d;

/* JADX INFO: renamed from: Z6.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10246w0 extends AbstractC18290d {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f30423c;

    /* JADX INFO: renamed from: d */
    public float f30424d;

    /* JADX INFO: renamed from: e */
    public final float f30425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C10252z0 f30426f;

    /* JADX INFO: renamed from: g */
    public final Object f30427g;

    public C10246w0(C10252z0 c10252z0, float f10, float f11) {
        this.f30423c = 1;
        this.f30426f = c10252z0;
        this.f30427g = new RectF();
        this.f30424d = f10;
        this.f30425e = f11;
    }

    @Override // p938p2.AbstractC18290d
    /* JADX INFO: renamed from: b */
    public final boolean mo10801b(AbstractC10224l0 abstractC10224l0) {
        switch (this.f30423c) {
            case 0:
                if (!(abstractC10224l0 instanceof C10226m0)) {
                    return true;
                }
                AbstractC15256t.m16482t("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(abstractC10224l0 instanceof C10226m0)) {
                    return true;
                }
                C10226m0 c10226m0 = (C10226m0) abstractC10224l0;
                AbstractC10199Y abstractC10199YM15182C = abstractC10224l0.f30314a.m15182C(c10226m0.f30354n);
                if (abstractC10199YM15182C == null) {
                    C10252z0.m10812t("TextPath path reference '%s' not found", c10226m0.f30354n);
                    return false;
                }
                C10185J c10185j = (C10185J) abstractC10199YM15182C;
                Path path = new C10240t0(c10185j.f30239o).f30411a;
                Matrix matrix = c10185j.f30452n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.f30427g).union(rectF);
                return false;
        }
    }

    @Override // p938p2.AbstractC18290d
    /* JADX INFO: renamed from: e */
    public final void mo10800e(String str) {
        switch (this.f30423c) {
            case 0:
                C10252z0 c10252z0 = this.f30426f;
                if (c10252z0.m10845e0()) {
                    Path path = new Path();
                    ((C10248x0) c10252z0.f30456o0).f30435d.getTextPath(str, 0, str.length(), this.f30424d, this.f30425e, path);
                    ((Path) this.f30427g).addPath(path);
                }
                this.f30424d = ((C10248x0) c10252z0.f30456o0).f30435d.measureText(str) + this.f30424d;
                break;
            default:
                C10252z0 c10252z1 = this.f30426f;
                if (c10252z1.m10845e0()) {
                    Rect rect = new Rect();
                    ((C10248x0) c10252z1.f30456o0).f30435d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f30424d, this.f30425e);
                    ((RectF) this.f30427g).union(rectF);
                }
                this.f30424d = ((C10248x0) c10252z1.f30456o0).f30435d.measureText(str) + this.f30424d;
                break;
        }
    }

    public C10246w0(C10252z0 c10252z0, float f10, float f11, Path path) {
        this.f30423c = 0;
        this.f30426f = c10252z0;
        this.f30424d = f10;
        this.f30425e = f11;
        this.f30427g = path;
    }
}
