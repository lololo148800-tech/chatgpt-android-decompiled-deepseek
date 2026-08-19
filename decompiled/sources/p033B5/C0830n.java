package p033B5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: B5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0830n extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2310a;

    /* JADX INFO: renamed from: b */
    public final Object f2311b;

    public /* synthetic */ C0830n(Object obj, int i10) {
        this.f2310a = i10;
        this.f2311b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f2310a) {
            case 0:
                ((InterfaceC0829m) this.f2311b).mo1878d(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2311b;
                if (actionBarContainer.f32180u0) {
                    Drawable drawable = actionBarContainer.f32179t0;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f32177r0;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f32178s0;
                    if (drawable3 != null && actionBarContainer.f32181v0) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f2310a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f2310a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2311b;
                if (!actionBarContainer.f32180u0) {
                    Drawable drawable = actionBarContainer.f32177r0;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f32179t0 != null) {
                    actionBarContainer.f32177r0.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.f2310a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f2310a;
    }

    /* JADX INFO: renamed from: a */
    private final void m1884a(int i10) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1885b(int i10) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1886c(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1887d(ColorFilter colorFilter) {
    }
}
