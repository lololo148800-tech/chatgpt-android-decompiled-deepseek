package p140Fa;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import va.C20509a;

/* JADX INFO: renamed from: Fa.f */
/* JADX INFO: loaded from: classes.dex */
public class C2686f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C2691k f8220a;

    /* JADX INFO: renamed from: b */
    public C20509a f8221b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f8222c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f8223d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f8224e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f8225f;

    /* JADX INFO: renamed from: g */
    public Rect f8226g;

    /* JADX INFO: renamed from: h */
    public final float f8227h;

    /* JADX INFO: renamed from: i */
    public float f8228i;

    /* JADX INFO: renamed from: j */
    public float f8229j;

    /* JADX INFO: renamed from: k */
    public int f8230k;

    /* JADX INFO: renamed from: l */
    public float f8231l;

    /* JADX INFO: renamed from: m */
    public float f8232m;

    /* JADX INFO: renamed from: n */
    public int f8233n;

    /* JADX INFO: renamed from: o */
    public int f8234o;

    /* JADX INFO: renamed from: p */
    public final int f8235p;

    /* JADX INFO: renamed from: q */
    public final Paint.Style f8236q;

    public C2686f(C2691k c2691k) {
        this.f8222c = null;
        this.f8223d = null;
        this.f8224e = null;
        this.f8225f = PorterDuff.Mode.SRC_IN;
        this.f8226g = null;
        this.f8227h = 1.0f;
        this.f8228i = 1.0f;
        this.f8230k = 255;
        this.f8231l = 0.0f;
        this.f8232m = 0.0f;
        this.f8233n = 0;
        this.f8234o = 0;
        this.f8235p = 0;
        this.f8236q = Paint.Style.FILL_AND_STROKE;
        this.f8220a = c2691k;
        this.f8221b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2687g c2687g = new C2687g(this);
        c2687g.f8250q0 = true;
        return c2687g;
    }

    public C2686f(C2686f c2686f) {
        this.f8222c = null;
        this.f8223d = null;
        this.f8224e = null;
        this.f8225f = PorterDuff.Mode.SRC_IN;
        this.f8226g = null;
        this.f8227h = 1.0f;
        this.f8228i = 1.0f;
        this.f8230k = 255;
        this.f8231l = 0.0f;
        this.f8232m = 0.0f;
        this.f8233n = 0;
        this.f8234o = 0;
        this.f8235p = 0;
        this.f8236q = Paint.Style.FILL_AND_STROKE;
        this.f8220a = c2686f.f8220a;
        this.f8221b = c2686f.f8221b;
        this.f8229j = c2686f.f8229j;
        this.f8222c = c2686f.f8222c;
        this.f8223d = c2686f.f8223d;
        this.f8225f = c2686f.f8225f;
        this.f8224e = c2686f.f8224e;
        this.f8230k = c2686f.f8230k;
        this.f8227h = c2686f.f8227h;
        this.f8234o = c2686f.f8234o;
        this.f8228i = c2686f.f8228i;
        this.f8231l = c2686f.f8231l;
        this.f8232m = c2686f.f8232m;
        this.f8233n = c2686f.f8233n;
        this.f8235p = c2686f.f8235p;
        this.f8236q = c2686f.f8236q;
        if (c2686f.f8226g != null) {
            this.f8226g = new Rect(c2686f.f8226g);
        }
    }
}
