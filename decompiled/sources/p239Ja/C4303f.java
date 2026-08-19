package p239Ja;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p140Fa.C2686f;
import p140Fa.C2691k;

/* JADX INFO: renamed from: Ja.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4303f extends C2686f {

    /* JADX INFO: renamed from: r */
    public final RectF f13990r;

    public C4303f(C2691k c2691k, RectF rectF) {
        super(c2691k);
        this.f13990r = rectF;
    }

    @Override // p140Fa.C2686f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C4304g c4304g = new C4304g(this);
        c4304g.f13992J0 = this;
        c4304g.invalidateSelf();
        return c4304g;
    }

    public C4303f(C4303f c4303f) {
        super(c4303f);
        this.f13990r = c4303f.f13990r;
    }
}
