package p439S;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0083q0;
import p001A.RunnableC0066i;
import p001A.RunnableC0068j;
import p178H.C3130X;
import p178H.C3170s0;
import p178H.C3175v;
import p178H.RunnableC3160n0;
import p221Ii.RunnableC3724c;
import p277L.ScheduledExecutorServiceC4831d;
import p329N3.RunnableC5611a;
import p414R.C6779m;
import p414R.InterfaceC6780n;
import p465T.AbstractC7173i;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: S.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6974e implements InterfaceC6780n, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: Y */
    public final C6972c f22293Y;

    /* JADX INFO: renamed from: Z */
    public final HandlerThread f22294Z;

    /* JADX INFO: renamed from: o0 */
    public final ScheduledExecutorServiceC4831d f22295o0;

    /* JADX INFO: renamed from: p0 */
    public final Handler f22296p0;

    /* JADX INFO: renamed from: q0 */
    public int f22297q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f22298r0;

    /* JADX INFO: renamed from: s0 */
    public final AtomicBoolean f22299s0;

    /* JADX INFO: renamed from: t0 */
    public final LinkedHashMap f22300t0;

    /* JADX INFO: renamed from: u0 */
    public SurfaceTexture f22301u0;

    /* JADX INFO: renamed from: v0 */
    public SurfaceTexture f22302v0;

    public C6974e(C3175v c3175v, C3130X c3130x, C3130X c3130x2) {
        Map mapEmptyMap = Collections.emptyMap();
        this.f22297q0 = 0;
        this.f22298r0 = false;
        this.f22299s0 = new AtomicBoolean(false);
        this.f22300t0 = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f22294Z = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f22296p0 = handler;
        this.f22295o0 = new ScheduledExecutorServiceC4831d(handler);
        this.f22293Y = new C6972c(c3130x, c3130x2);
        try {
            try {
                AbstractC16347a.m17947b(new C0083q0(this, c3175v, mapEmptyMap, 4)).get();
            } catch (InterruptedException | ExecutionException e10) {
                e = e10;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    @Override // p414R.InterfaceC6780n
    /* JADX INFO: renamed from: a */
    public final void mo7201a(C3170s0 c3170s0) {
        if (this.f22299s0.get()) {
            c3170s0.m4001c();
        } else {
            m7336d(new RunnableC3724c(this, 15, c3170s0), new RunnableC3160n0(c3170s0, 1));
        }
    }

    @Override // p414R.InterfaceC6780n
    /* JADX INFO: renamed from: b */
    public final void mo7202b(C6779m c6779m) {
        if (this.f22299s0.get()) {
            c6779m.close();
            return;
        }
        RunnableC3724c runnableC3724c = new RunnableC3724c(this, 16, c6779m);
        Objects.requireNonNull(c6779m);
        m7336d(runnableC3724c, new RunnableC5611a(c6779m, 2));
    }

    /* JADX INFO: renamed from: c */
    public final void m7335c() {
        if (this.f22298r0 && this.f22297q0 == 0) {
            LinkedHashMap linkedHashMap = this.f22300t0;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C6779m) it.next()).close();
            }
            linkedHashMap.clear();
            C6972c c6972c = this.f22293Y;
            if (((AtomicBoolean) c6972c.f21738o0).getAndSet(false)) {
                AbstractC7173i.m7545c((Thread) c6972c.f21740q0);
                c6972c.m7218l();
            }
            c6972c.f22289z0 = -1;
            c6972c.f22286A0 = -1;
            this.f22294Z.quit();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7336d(Runnable runnable, Runnable runnable2) {
        try {
            this.f22295o0.execute(new RunnableC0066i(this, runnable2, runnable, 14));
        } catch (RejectedExecutionException e10) {
            AbstractC8072d6.m8493j("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f22299s0.get() || (surfaceTexture2 = this.f22301u0) == null || this.f22302v0 == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f22302v0.updateTexImage();
        for (Map.Entry entry : this.f22300t0.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C6779m c6779m = (C6779m) entry.getKey();
            if (c6779m.f21779o0 == 34) {
                try {
                    this.f22293Y.m7333p(surfaceTexture.getTimestamp(), surface, c6779m, this.f22301u0, this.f22302v0);
                } catch (RuntimeException e10) {
                    AbstractC8072d6.m8488e("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // p414R.InterfaceC6780n
    public final void release() {
        if (this.f22299s0.getAndSet(true)) {
            return;
        }
        m7336d(new RunnableC5611a(this, 8), new RunnableC0068j(0));
    }
}
