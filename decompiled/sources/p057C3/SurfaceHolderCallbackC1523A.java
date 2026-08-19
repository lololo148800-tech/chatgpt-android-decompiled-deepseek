package p057C3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: C3.A */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC1523A implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1526D f4046Y;

    public SurfaceHolderCallbackC1523A(C1526D c1526d) {
        this.f4046Y = c1526d;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C1526D c1526d = this.f4046Y;
        c1526d.getClass();
        Surface surface = new Surface(surfaceTexture);
        c1526d.m2251l0(surface);
        c1526d.f4076Z0 = surface;
        C1526D.m2230Q(c1526d, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1526D c1526d = this.f4046Y;
        c1526d.m2251l0(null);
        C1526D.m2230Q(c1526d, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        C1526D.m2230Q(this.f4046Y, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C1526D.m2230Q(this.f4046Y, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f4046Y.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1526D c1526d = this.f4046Y;
        c1526d.getClass();
        C1526D.m2230Q(c1526d, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
