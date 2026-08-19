package p203I0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p774h1.C14365u;

/* JADX INFO: renamed from: I0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C3543D extends RippleDrawable {

    /* JADX INFO: renamed from: Y */
    public final boolean f10727Y;

    /* JADX INFO: renamed from: Z */
    public C14365u f10728Z;

    /* JADX INFO: renamed from: o0 */
    public Integer f10729o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f10730p0;

    public C3543D(boolean z6) {
        super(ColorStateList.valueOf(-16777216), null, z6 ? new ColorDrawable(-1) : null);
        this.f10727Y = z6;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f10727Y) {
            this.f10730p0 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f10730p0 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10730p0;
    }
}
