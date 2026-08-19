package p330N4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: N4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5651b extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18358a = 1;

    /* JADX INFO: renamed from: b */
    public Object f18359b;

    public /* synthetic */ C5651b(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f18358a) {
            case 0:
                Rect rect = (Rect) this.f18359b;
                ((Drawable) obj).copyBounds(rect);
                return new PointF(rect.left, rect.top);
            default:
                Matrix matrix = (Matrix) this.f18359b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f18358a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) this.f18359b;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    public C5651b() {
        super(Matrix.class, "imageMatrixProperty");
        this.f18359b = new Matrix();
    }
}
