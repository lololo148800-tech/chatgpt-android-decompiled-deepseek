package p239Ja;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p140Fa.C2687g;

/* JADX INFO: renamed from: Ja.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4304g extends C2687g {

    /* JADX INFO: renamed from: K0 */
    public static final /* synthetic */ int f13991K0 = 0;

    /* JADX INFO: renamed from: J0 */
    public C4303f f13992J0;

    @Override // p140Fa.C2687g
    /* JADX INFO: renamed from: e */
    public final void mo3675e(Canvas canvas) {
        if (this.f13992J0.f13990r.isEmpty()) {
            super.mo3675e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f13992J0.f13990r);
        } else {
            canvas.clipRect(this.f13992J0.f13990r, Region.Op.DIFFERENCE);
        }
        super.mo3675e(canvas);
        canvas.restore();
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f13992J0 = new C4303f(this.f13992J0);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final void m5053r(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f13992J0.f13990r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
