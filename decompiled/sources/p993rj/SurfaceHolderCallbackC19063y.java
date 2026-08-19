package p993rj;

import android.view.SurfaceHolder;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: rj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC19063y implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19024D f60735Y;

    public SurfaceHolderCallbackC19063y(C19024D c19024d) {
        this.f60735Y = c19024d;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i10, int i11, int i12) {
        AbstractC16544l.m18094g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        AbstractC16544l.m18094g(holder, "holder");
        this.f60735Y.f60635t = true;
        C19024D c19024d = this.f60735Y;
        Camera2PreviewView camera2PreviewView = c19024d.f60618c;
        int width = c19024d.f60617b.f60670b.getWidth();
        int height = this.f60735Y.f60617b.f60670b.getHeight();
        int i10 = this.f60735Y.f60627l;
        if (i10 == 90 || i10 == 270) {
            camera2PreviewView.f40537o0 = height;
            camera2PreviewView.f40538p0 = width;
        } else {
            camera2PreviewView.f40537o0 = width;
            camera2PreviewView.f40538p0 = height;
        }
        camera2PreviewView.getHolder().setFixedSize(width, height);
        camera2PreviewView.requestLayout();
        C19024D c19024d2 = this.f60735Y;
        c19024d2.f60618c.post(new RunnableC13542a(c19024d2, 14));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        AbstractC16544l.m18094g(holder, "holder");
        this.f60735Y.f60635t = false;
        C19024D c19024d = this.f60735Y;
        AbstractC0575H.m1156D(c19024d.f60624i, null, null, new C19062x(c19024d, null), 3);
    }
}
