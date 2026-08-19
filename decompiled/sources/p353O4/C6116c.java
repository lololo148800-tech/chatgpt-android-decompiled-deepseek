package p353O4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.jvm.internal.AbstractC16544l;
import p448S8.AbstractC7031b;
import p523V9.AbstractC8112i6;
import p759g1.C13803e;

/* JADX INFO: renamed from: O4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6116c implements Drawable.Callback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19908Y;

    /* JADX INFO: renamed from: Z */
    public Object f19909Z;

    public /* synthetic */ C6116c() {
        this.f19908Y = 2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d10) {
        switch (this.f19908Y) {
            case 0:
                ((C6119f) this.f19909Z).invalidateSelf();
                break;
            case 1:
                AbstractC16544l.m18094g(d10, "d");
                DrawablePainter drawablePainter = (DrawablePainter) this.f19909Z;
                drawablePainter.f35999s0.setValue(Integer.valueOf(((Number) drawablePainter.f35999s0.getValue()).intValue() + 1));
                Object obj = AbstractC7031b.f22486a;
                Drawable drawable = drawablePainter.f35998r0;
                drawablePainter.f36000t0.setValue(new C13803e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC8112i6.m8603a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mm.i] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d10, Runnable what, long j10) {
        switch (this.f19908Y) {
            case 0:
                ((C6119f) this.f19909Z).scheduleSelf(what, j10);
                break;
            case 1:
                AbstractC16544l.m18094g(d10, "d");
                AbstractC16544l.m18094g(what, "what");
                ((Handler) AbstractC7031b.f22486a.getValue()).postAtTime(what, j10);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f19909Z;
                if (callback != null) {
                    callback.scheduleDrawable(d10, what, j10);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mm.i] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d10, Runnable what) {
        switch (this.f19908Y) {
            case 0:
                ((C6119f) this.f19909Z).unscheduleSelf(what);
                break;
            case 1:
                AbstractC16544l.m18094g(d10, "d");
                AbstractC16544l.m18094g(what, "what");
                ((Handler) AbstractC7031b.f22486a.getValue()).removeCallbacks(what);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f19909Z;
                if (callback != null) {
                    callback.unscheduleDrawable(d10, what);
                }
                break;
        }
    }

    public /* synthetic */ C6116c(Object obj, int i10) {
        this.f19908Y = i10;
        this.f19909Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m6669a(Drawable drawable) {
    }
}
