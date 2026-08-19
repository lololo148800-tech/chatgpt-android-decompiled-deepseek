package p561X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import p001A.C0083q0;
import p178H.C3170s0;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8470E2;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: X.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8995i {

    /* JADX INFO: renamed from: a */
    public Size f27449a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f27450b;

    /* JADX INFO: renamed from: c */
    public final C8989c f27451c;

    /* JADX INFO: renamed from: d */
    public boolean f27452d = false;

    public AbstractC8995i(FrameLayout frameLayout, C8989c c8989c) {
        this.f27450b = frameLayout;
        this.f27451c = c8989c;
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo9581a();

    /* JADX INFO: renamed from: b */
    public abstract Bitmap mo9582b();

    /* JADX INFO: renamed from: c */
    public abstract void mo9583c();

    /* JADX INFO: renamed from: d */
    public abstract void mo9584d();

    /* JADX INFO: renamed from: e */
    public abstract void mo9585e(C3170s0 c3170s0, C0083q0 c0083q0);

    /* JADX INFO: renamed from: f */
    public final void m9586f() {
        View viewMo9581a = mo9581a();
        if (viewMo9581a == null || !this.f27452d) {
            return;
        }
        FrameLayout frameLayout = this.f27450b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C8989c c8989c = this.f27451c;
        c8989c.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            AbstractC8072d6.m8492i("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (c8989c.m9578f()) {
            if (viewMo9581a instanceof TextureView) {
                ((TextureView) viewMo9581a).setTransform(c8989c.m9576d());
            } else {
                Display display = viewMo9581a.getDisplay();
                boolean z6 = false;
                boolean z10 = (!c8989c.f27433g || display == null || display.getRotation() == c8989c.f27431e) ? false : true;
                boolean z11 = c8989c.f27433g;
                if (!z11) {
                    if ((!z11 ? c8989c.f27429c : -AbstractC8470E2.m9102c(c8989c.f27431e)) != 0) {
                        z6 = true;
                    }
                }
                if (z10 || z6) {
                    AbstractC8072d6.m8487d("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFM9577e = c8989c.m9577e(size, layoutDirection);
            viewMo9581a.setPivotX(0.0f);
            viewMo9581a.setPivotY(0.0f);
            viewMo9581a.setScaleX(rectFM9577e.width() / c8989c.f27427a.getWidth());
            viewMo9581a.setScaleY(rectFM9577e.height() / c8989c.f27427a.getHeight());
            viewMo9581a.setTranslationX(rectFM9577e.left - viewMo9581a.getLeft());
            viewMo9581a.setTranslationY(rectFM9577e.top - viewMo9581a.getTop());
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceFutureC13608b mo9587g();
}
