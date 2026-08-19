package p561X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p001A.C0083q0;
import p001A.RunnableC0066i;
import p178H.C3170s0;
import p301M.C5231m;
import p329N3.RunnableC5611a;
import p523V9.AbstractC8072d6;
import p610Z1.C10147n;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.Objects;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: X.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9003q extends AbstractC8995i {

    /* JADX INFO: renamed from: e */
    public SurfaceView f27471e;

    /* JADX INFO: renamed from: f */
    public final SurfaceHolderCallbackC9002p f27472f;

    public C9003q(FrameLayout frameLayout, C8989c c8989c) {
        super(frameLayout, c8989c);
        this.f27472f = new SurfaceHolderCallbackC9002p(this);
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: a */
    public final View mo9581a() {
        return this.f27471e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.o] */
    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: b */
    public final Bitmap mo9582b() {
        SurfaceView surfaceView = this.f27471e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f27471e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f27471e.getWidth(), this.f27471e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f27471e, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.o
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                Semaphore semaphore2 = semaphore;
                if (i10 == 0) {
                    AbstractC8072d6.m8486c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    AbstractC8072d6.m8487d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    AbstractC8072d6.m8487d("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e10) {
                AbstractC8072d6.m8488e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: e */
    public final void mo9585e(C3170s0 c3170s0, C0083q0 c0083q0) {
        SurfaceView surfaceView = this.f27471e;
        boolean zEquals = Objects.equals(this.f27449a, c3170s0.f9535b);
        if (surfaceView == null || !zEquals) {
            this.f27449a = c3170s0.f9535b;
            FrameLayout frameLayout = this.f27450b;
            frameLayout.getClass();
            this.f27449a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f27471e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f27449a.getWidth(), this.f27449a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f27471e);
            this.f27471e.getHolder().addCallback(this.f27472f);
        }
        Executor executorM19557d = AbstractC17803d.m19557d(this.f27471e.getContext());
        RunnableC5611a runnableC5611a = new RunnableC5611a(c0083q0, 16);
        C10147n c10147n = c3170s0.f9543j.f30066c;
        if (c10147n != null) {
            c10147n.mo5766a(runnableC5611a, executorM19557d);
        }
        this.f27471e.post(new RunnableC0066i(this, c3170s0, c0083q0, 17));
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: g */
    public final InterfaceFutureC13608b mo9587g() {
        return C5231m.f16977o0;
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: c */
    public final void mo9583c() {
    }

    @Override // p561X.AbstractC8995i
    /* JADX INFO: renamed from: d */
    public final void mo9584d() {
    }
}
