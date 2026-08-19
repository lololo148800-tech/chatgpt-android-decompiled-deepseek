package p414R;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p004A2.InterfaceC0310a;
import p178H.C3145g;
import p221Ii.RunnableC3724c;
import p228J.InterfaceC3870x;
import p239Ja.C4307j;
import p253K.AbstractC4503n;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8482G2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: R.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6779m implements Closeable {

    /* JADX INFO: renamed from: Z */
    public final Surface f21778Z;

    /* JADX INFO: renamed from: o0 */
    public final int f21779o0;

    /* JADX INFO: renamed from: p0 */
    public final Size f21780p0;

    /* JADX INFO: renamed from: q0 */
    public final float[] f21781q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC0310a f21782r0;

    /* JADX INFO: renamed from: s0 */
    public ScheduledExecutorServiceC4831d f21783s0;

    /* JADX INFO: renamed from: v0 */
    public final C10145l f21786v0;

    /* JADX INFO: renamed from: w0 */
    public C10142i f21787w0;

    /* JADX INFO: renamed from: Y */
    public final Object f21777Y = new Object();

    /* JADX INFO: renamed from: t0 */
    public boolean f21784t0 = false;

    /* JADX INFO: renamed from: u0 */
    public boolean f21785u0 = false;

    public C6779m(Surface surface, int i10, Size size, C3145g c3145g, C3145g c3145g2) {
        float[] fArr = new float[16];
        this.f21781q0 = fArr;
        this.f21778Z = surface;
        this.f21779o0 = i10;
        this.f21780p0 = size;
        m7228a(fArr, new float[16], c3145g);
        m7228a(new float[16], new float[16], c3145g2);
        this.f21786v0 = AbstractC16347a.m17947b(new C4307j(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public static void m7228a(float[] fArr, float[] fArr2, C3145g c3145g) {
        Matrix.setIdentityM(fArr, 0);
        if (c3145g == null) {
            return;
        }
        AbstractC8482G2.m9130d(fArr);
        int i10 = c3145g.f9463d;
        AbstractC8482G2.m9129c(fArr, i10);
        boolean z6 = c3145g.f9464e;
        if (z6) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size size = c3145g.f9460a;
        Size sizeM5250f = AbstractC4503n.m5250f(size, i10);
        float f10 = 0;
        android.graphics.Matrix matrixM5245a = AbstractC4503n.m5245a(new RectF(f10, f10, size.getWidth(), size.getHeight()), new RectF(f10, f10, sizeM5250f.getWidth(), sizeM5250f.getHeight()), i10, z6);
        RectF rectF = new RectF(c3145g.f9461b);
        matrixM5245a.mapRect(rectF);
        float width = rectF.left / sizeM5250f.getWidth();
        float height = ((sizeM5250f.getHeight() - rectF.height()) - rectF.top) / sizeM5250f.getHeight();
        float fWidth = rectF.width() / sizeM5250f.getWidth();
        float fHeight = rectF.height() / sizeM5250f.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        AbstractC8482G2.m9130d(fArr2);
        InterfaceC3870x interfaceC3870x = c3145g.f9462c;
        if (interfaceC3870x != null) {
            AbstractC4941g.m5559R("Camera has no transform.", interfaceC3870x.mo120p());
            AbstractC8482G2.m9129c(fArr2, interfaceC3870x.mo105a().mo136a());
            if (interfaceC3870x.mo108d()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f21777Y) {
            try {
                if (!this.f21785u0) {
                    this.f21785u0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f21787w0.m10747a(null);
    }

    /* JADX INFO: renamed from: e */
    public final Surface m7229e(ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, InterfaceC0310a interfaceC0310a) {
        boolean z6;
        synchronized (this.f21777Y) {
            this.f21783s0 = scheduledExecutorServiceC4831d;
            this.f21782r0 = interfaceC0310a;
            z6 = this.f21784t0;
        }
        if (z6) {
            m7230k();
        }
        return this.f21778Z;
    }

    /* JADX INFO: renamed from: k */
    public final void m7230k() {
        ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d;
        InterfaceC0310a interfaceC0310a;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f21777Y) {
            try {
                if (this.f21783s0 == null || (interfaceC0310a = this.f21782r0) == null) {
                    this.f21784t0 = true;
                } else if (!this.f21785u0) {
                    atomicReference.set(interfaceC0310a);
                    scheduledExecutorServiceC4831d = this.f21783s0;
                    this.f21784t0 = false;
                }
                scheduledExecutorServiceC4831d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (scheduledExecutorServiceC4831d != null) {
            try {
                scheduledExecutorServiceC4831d.execute(new RunnableC3724c(this, 14, atomicReference));
            } catch (RejectedExecutionException e10) {
                String strM8491h = AbstractC8072d6.m8491h("SurfaceOutputImpl");
                if (AbstractC8072d6.m8490g(3, strM8491h)) {
                    Log.d(strM8491h, "Processor executor closed. Close request not posted.", e10);
                }
            }
        }
    }
}
