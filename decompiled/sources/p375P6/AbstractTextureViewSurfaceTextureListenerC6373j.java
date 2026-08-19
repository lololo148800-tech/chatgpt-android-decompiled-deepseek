package p375P6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.javax.sip.C10808o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import p477Tb.C7296c;
import p571X9.AbstractC9141H2;
import p720e6.C13287b;

/* JADX INFO: renamed from: P6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractTextureViewSurfaceTextureListenerC6373j extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: I0 */
    public static final /* synthetic */ int f20744I0 = 0;

    /* JADX INFO: renamed from: A0 */
    public InterfaceC6371h f20745A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f20746B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC6365b f20747C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC6366c f20748D0;

    /* JADX INFO: renamed from: E0 */
    public InterfaceC6367d f20749E0;

    /* JADX INFO: renamed from: F0 */
    public int f20750F0;

    /* JADX INFO: renamed from: G0 */
    public int f20751G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f20752H0;

    /* JADX INFO: renamed from: o0 */
    public boolean f20753o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f20754p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f20755q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f20756r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f20757s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f20758t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f20759u0;

    /* JADX INFO: renamed from: v0 */
    public final C13287b f20760v0;

    /* JADX INFO: renamed from: w0 */
    public final ReentrantLock f20761w0;

    /* JADX INFO: renamed from: x0 */
    public final Condition f20762x0;

    /* JADX INFO: renamed from: y0 */
    public final WeakReference f20763y0;

    /* JADX INFO: renamed from: z0 */
    public C6368e f20764z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTextureViewSurfaceTextureListenerC6373j(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC16544l.m18094g(context, "context");
        this.f20760v0 = new C13287b(this);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f20761w0 = reentrantLock;
        this.f20762x0 = reentrantLock.newCondition();
        this.f20763y0 = new WeakReference(this);
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m6984a() {
        if (this.f20764z0 != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6985b(int i10, int i11) {
        C6368e c6368e = this.f20764z0;
        AbstractC16544l.m18091d(c6368e);
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = c6368e.f20727E0;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        Condition condition = abstractTextureViewSurfaceTextureListenerC6373j.f20762x0;
        reentrantLock.lock();
        try {
            c6368e.f20736u0 = i10;
            c6368e.f20737v0 = i11;
            c6368e.f20724B0 = true;
            c6368e.f20739x0 = true;
            c6368e.f20741z0 = false;
            if (Thread.currentThread() == c6368e) {
                reentrantLock.unlock();
                return;
            }
            condition.signalAll();
            while (!c6368e.f20729Z && !c6368e.f20741z0 && c6368e.f20733r0 && c6368e.f20734s0 && c6368e.m6978b()) {
                if (abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogSurface$lib_release()) {
                    String message = "onWindowResize waiting for render complete from tid=" + c6368e.getId();
                    AbstractC16544l.m18094g(message, "message");
                    if (AbstractC9141H2.f27918a) {
                        Log.i("Main thread", message);
                    }
                }
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void finalize() {
        C6368e c6368e = this.f20764z0;
        if (c6368e != null) {
            AbstractC16544l.m18091d(c6368e);
            c6368e.m6979c();
        }
    }

    public final int getDebugFlags() {
        return this.f20750F0;
    }

    public final boolean getEnableLogAttachDetach$lib_release() {
        return this.f20753o0;
    }

    public final boolean getEnableLogEgl$lib_release() {
        return this.f20759u0;
    }

    public final boolean getEnableLogPauseResume$lib_release() {
        return this.f20755q0;
    }

    public final boolean getEnableLogRenderer$lib_release() {
        return this.f20757s0;
    }

    public final boolean getEnableLogRendererDrawFrame$lib_release() {
        return this.f20758t0;
    }

    public final boolean getEnableLogSurface$lib_release() {
        return this.f20756r0;
    }

    public final boolean getEnableLogThreads$lib_release() {
        return this.f20754p0;
    }

    public final boolean getPreserveEGLContextOnPause() {
        return this.f20752H0;
    }

    public final int getRenderMode() {
        C6368e c6368e = this.f20764z0;
        AbstractC16544l.m18091d(c6368e);
        ReentrantLock reentrantLock = c6368e.f20727E0.f20761w0;
        reentrantLock.lock();
        try {
            return c6368e.f20738w0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (this.f20753o0) {
            String message = "onAttachedToWindow reattach =" + this.f20746B0;
            AbstractC16544l.m18094g(message, "message");
            if (AbstractC9141H2.f27918a) {
                Log.d("GLTextureView", message);
            }
        }
        if (this.f20746B0 && this.f20745A0 != null) {
            C6368e c6368e = this.f20764z0;
            if (c6368e != null) {
                ReentrantLock reentrantLock = c6368e.f20727E0.f20761w0;
                reentrantLock.lock();
                try {
                    i10 = c6368e.f20738w0;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } else {
                i10 = 1;
            }
            C6368e c6368e2 = new C6368e(this, this.f20763y0);
            this.f20764z0 = c6368e2;
            if (i10 != 1) {
                c6368e2.m6980d(i10);
            }
            C6368e c6368e3 = this.f20764z0;
            AbstractC16544l.m18091d(c6368e3);
            c6368e3.start();
        }
        this.f20746B0 = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.f20753o0 && AbstractC9141H2.f27918a) {
            Log.d("GLTextureView", "onDetachedFromWindow");
        }
        C6368e c6368e = this.f20764z0;
        if (c6368e != null) {
            c6368e.m6979c();
        }
        this.f20746B0 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        getSurfaceTexture();
        m6985b(i12 - i10, i13 - i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        AbstractC16544l.m18094g(surface, "surface");
        C6368e c6368e = this.f20764z0;
        AbstractC16544l.m18091d(c6368e);
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = c6368e.f20727E0;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        reentrantLock.lock();
        try {
            boolean enableLogThreads$lib_release = abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogThreads$lib_release();
            Condition condition = abstractTextureViewSurfaceTextureListenerC6373j.f20762x0;
            if (enableLogThreads$lib_release) {
                String message = "surfaceCreated tid=" + c6368e.getId();
                AbstractC16544l.m18094g(message, "message");
                if (AbstractC9141H2.f27918a) {
                    Log.i("GLThread", message);
                }
            }
            c6368e.f20730o0 = true;
            c6368e.f20735t0 = false;
            condition.signalAll();
            while (c6368e.f20732q0 && !c6368e.f20735t0 && !c6368e.f20729Z) {
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
            m6985b(i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        AbstractC16544l.m18094g(surface, "surface");
        m6985b(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
    }

    public final void setDebugFlags(int i10) {
        this.f20750F0 = i10;
    }

    public final void setEGLConfigChooser(InterfaceC6365b interfaceC6365b) {
        m6984a();
        this.f20747C0 = interfaceC6365b;
    }

    public final void setEGLContextClientVersion(int i10) {
        m6984a();
        this.f20751G0 = i10;
    }

    public final void setEGLContextFactory(InterfaceC6366c interfaceC6366c) {
        m6984a();
        this.f20748D0 = interfaceC6366c;
    }

    public final void setEGLWindowSurfaceFactory(InterfaceC6367d interfaceC6367d) {
        m6984a();
        this.f20749E0 = interfaceC6367d;
    }

    public final void setEnableLogAttachDetach$lib_release(boolean z6) {
        this.f20753o0 = z6;
    }

    public final void setEnableLogEgl$lib_release(boolean z6) {
        this.f20759u0 = z6;
    }

    public final void setEnableLogPauseResume$lib_release(boolean z6) {
        this.f20755q0 = z6;
    }

    public final void setEnableLogRenderer$lib_release(boolean z6) {
        this.f20757s0 = z6;
    }

    public final void setEnableLogRendererDrawFrame$lib_release(boolean z6) {
        this.f20758t0 = z6;
    }

    public final void setEnableLogSurface$lib_release(boolean z6) {
        this.f20756r0 = z6;
    }

    public final void setEnableLogThreads$lib_release(boolean z6) {
        this.f20754p0 = z6;
    }

    public final void setPreserveEGLContextOnPause(boolean z6) {
        this.f20752H0 = z6;
    }

    public final void setRenderMode(int i10) {
        C6368e c6368e = this.f20764z0;
        AbstractC16544l.m18091d(c6368e);
        c6368e.m6980d(i10);
    }

    public final void setRenderer(InterfaceC6371h interfaceC6371h) {
        m6984a();
        if (this.f20747C0 == null) {
            this.f20747C0 = new C6372i(this, true);
        }
        if (this.f20748D0 == null) {
            this.f20748D0 = new C7296c(this);
        }
        if (this.f20749E0 == null) {
            this.f20749E0 = new C10808o(this);
        }
        this.f20745A0 = interfaceC6371h;
        C6368e c6368e = new C6368e(this, this.f20763y0);
        this.f20764z0 = c6368e;
        c6368e.start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
        C6368e c6368e = this.f20764z0;
        AbstractC16544l.m18091d(c6368e);
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = c6368e.f20727E0;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        reentrantLock.lock();
        try {
            boolean enableLogThreads$lib_release = abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogThreads$lib_release();
            Condition condition = abstractTextureViewSurfaceTextureListenerC6373j.f20762x0;
            if (enableLogThreads$lib_release) {
                String str = YladLSetV.IGkEdaRBZrvkxT;
                String message = "surfaceDestroyed tid=" + c6368e.getId();
                AbstractC16544l.m18094g(message, "message");
                if (AbstractC9141H2.f27918a) {
                    Log.i(str, message);
                }
            }
            c6368e.f20730o0 = false;
            condition.signalAll();
            while (!c6368e.f20732q0 && !c6368e.f20729Z) {
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void setEGLConfigChooser(boolean z6) {
        setEGLConfigChooser(new C6372i(this, z6));
    }

    public final void setGLWrapper(InterfaceC6369f interfaceC6369f) {
    }
}
