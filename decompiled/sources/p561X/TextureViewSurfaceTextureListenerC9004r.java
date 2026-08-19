package p561X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import p301M.RunnableC5228j;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p658b5.C11234e;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: X.r */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC9004r implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C9005s f27473Y;

    public TextureViewSurfaceTextureListenerC9004r(C9005s c9005s) {
        this.f27473Y = c9005s;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC8072d6.m8486c("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
        C9005s c9005s = this.f27473Y;
        c9005s.f27475f = surfaceTexture;
        if (c9005s.f27476g == null) {
            c9005s.m9592h();
            return;
        }
        c9005s.f27477h.getClass();
        AbstractC8072d6.m8486c("TextureViewImpl", "Surface invalidated " + c9005s.f27477h);
        c9005s.f27477h.f9544k.mo4507a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C9005s c9005s = this.f27473Y;
        c9005s.f27475f = null;
        C10145l c10145l = c9005s.f27476g;
        if (c10145l == null) {
            AbstractC8072d6.m8486c("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        C11234e c11234e = new C11234e(this, surfaceTexture, false, 17);
        c10145l.mo5766a(new RunnableC5228j(c10145l, 0, c11234e), AbstractC17803d.m19557d(c9005s.f27474e.getContext()));
        c9005s.f27479j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC8072d6.m8486c("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C10142i c10142i = (C10142i) this.f27473Y.f27480k.getAndSet(null);
        if (c10142i != null) {
            c10142i.m10747a(null);
        }
    }
}
