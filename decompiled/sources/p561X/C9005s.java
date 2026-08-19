package p561X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001A.C0083q0;
import p001A.C0100z;
import p028B.RunnableC0696c;
import p178H.C3170s0;
import p221Ii.RunnableC3724c;
import p239Ja.C4307j;
import p610Z1.C10145l;
import p610Z1.C10147n;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: X.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9005s extends AbstractC8995i {

    /* JADX INFO: renamed from: e */
    public TextureView f27474e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f27475f;

    /* JADX INFO: renamed from: g */
    public C10145l f27476g;

    /* JADX INFO: renamed from: h */
    public C3170s0 f27477h;

    /* JADX INFO: renamed from: i */
    public boolean f27478i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f27479j;

    /* JADX INFO: renamed from: k */
    public AtomicReference f27480k;

    /* JADX INFO: renamed from: l */
    public C0083q0 f27481l;

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: a */
    public final View mo9581a() {
        return this.f27474e;
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: b */
    public final Bitmap mo9582b() {
        TextureView textureView = this.f27474e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f27474e.getBitmap();
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: c */
    public final void mo9583c() {
        if (!this.f27478i || this.f27479j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f27474e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f27479j;
        if (surfaceTexture != surfaceTexture2) {
            this.f27474e.setSurfaceTexture(surfaceTexture2);
            this.f27479j = null;
            this.f27478i = false;
        }
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: d */
    public final void mo9584d() {
        this.f27478i = true;
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: e */
    public final void mo9585e(C3170s0 c3170s0, C0083q0 c0083q0) {
        this.f27449a = c3170s0.f9535b;
        this.f27481l = c0083q0;
        FrameLayout frameLayout = this.f27450b;
        frameLayout.getClass();
        this.f27449a.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f27474e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f27449a.getWidth(), this.f27449a.getHeight()));
        this.f27474e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC9004r(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f27474e);
        C3170s0 c3170s1 = this.f27477h;
        if (c3170s1 != null) {
            c3170s1.m4001c();
        }
        this.f27477h = c3170s0;
        Executor executorM19557d = AbstractC17803d.m19557d(this.f27474e.getContext());
        RunnableC3724c runnableC3724c = new RunnableC3724c(this, 23, c3170s0);
        C10147n c10147n = c3170s0.f9543j.f30066c;
        if (c10147n != null) {
            c10147n.mo5766a(runnableC3724c, executorM19557d);
        }
        m9592h();
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: g */
    public final InterfaceFutureC13608b mo9587g() {
        return AbstractC16347a.m17947b(new C4307j(this, 12));
    }

    /* JADX INFO: renamed from: h */
    public final void m9592h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f27449a;
        if (size == null || (surfaceTexture = this.f27475f) == null || this.f27477h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f27449a.getHeight());
        Surface surface = new Surface(this.f27475f);
        C3170s0 c3170s0 = this.f27477h;
        C10145l c10145lM17947b = AbstractC16347a.m17947b(new C0100z(this, 23, surface));
        this.f27476g = c10145lM17947b;
        c10145lM17947b.f30070Z.mo5766a(new RunnableC0696c(this, surface, c10145lM17947b, c3170s0, 7), AbstractC17803d.m19557d(this.f27474e.getContext()));
        this.f27452d = true;
        m9586f();
    }
}
