package p178H;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p001A.C0072l;
import p1072w2.C20797i;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p253K.AbstractC4503n;
import p301M.C5231m;
import p523V9.AbstractC8064c6;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: H.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3115H implements InterfaceC3819V {

    /* JADX INFO: renamed from: A0 */
    public ByteBuffer f9373A0;

    /* JADX INFO: renamed from: B0 */
    public ByteBuffer f9374B0;

    /* JADX INFO: renamed from: C0 */
    public ByteBuffer f9375C0;

    /* JADX INFO: renamed from: Y */
    public C0072l f9378Y;

    /* JADX INFO: renamed from: Z */
    public volatile int f9379Z;

    /* JADX INFO: renamed from: o0 */
    public volatile int f9380o0;

    /* JADX INFO: renamed from: q0 */
    public volatile boolean f9382q0;

    /* JADX INFO: renamed from: r0 */
    public volatile boolean f9383r0;

    /* JADX INFO: renamed from: s0 */
    public Executor f9384s0;

    /* JADX INFO: renamed from: t0 */
    public C3150i0 f9385t0;

    /* JADX INFO: renamed from: u0 */
    public ImageWriter f9386u0;

    /* JADX INFO: renamed from: z0 */
    public ByteBuffer f9391z0;

    /* JADX INFO: renamed from: p0 */
    public volatile int f9381p0 = 1;

    /* JADX INFO: renamed from: v0 */
    public Rect f9387v0 = new Rect();

    /* JADX INFO: renamed from: w0 */
    public Rect f9388w0 = new Rect();

    /* JADX INFO: renamed from: x0 */
    public Matrix f9389x0 = new Matrix();

    /* JADX INFO: renamed from: y0 */
    public Matrix f9390y0 = new Matrix();

    /* JADX INFO: renamed from: D0 */
    public final Object f9376D0 = new Object();

    /* JADX INFO: renamed from: E0 */
    public boolean f9377E0 = true;

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC3127U mo3945a(InterfaceC3820W interfaceC3820W);

    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC13608b m3946b(final InterfaceC3127U interfaceC3127U) {
        final Executor executor;
        final C0072l c0072l;
        boolean z6;
        C3150i0 c3150i0;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        C3118K c3118kM11189h;
        int i10 = this.f9382q0 ? this.f9379Z : 0;
        synchronized (this.f9376D0) {
            try {
                executor = this.f9384s0;
                c0072l = this.f9378Y;
                z6 = this.f9382q0 && i10 != this.f9380o0;
                if (z6) {
                    m3951h(interfaceC3127U, i10);
                }
                if (this.f9382q0) {
                    m3948e(interfaceC3127U);
                }
                c3150i0 = this.f9385t0;
                imageWriter = this.f9386u0;
                byteBuffer = this.f9391z0;
                byteBuffer2 = this.f9373A0;
                byteBuffer3 = this.f9374B0;
                byteBuffer4 = this.f9375C0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0072l == null || executor == null || !this.f9377E0) {
            return new C5231m(new C20797i("No analyzer or executor currently set."), 1);
        }
        if (c3150i0 == null) {
            c3118kM11189h = null;
        } else if (this.f9381p0 == 2) {
            c3118kM11189h = ImageProcessingUtil.m11185d(interfaceC3127U, c3150i0, byteBuffer, i10, this.f9383r0);
        } else if (this.f9381p0 != 1) {
            c3118kM11189h = null;
        } else {
            if (this.f9383r0) {
                ImageProcessingUtil.m11182a(interfaceC3127U);
            }
            if (imageWriter == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
                c3118kM11189h = null;
            } else {
                c3118kM11189h = ImageProcessingUtil.m11189h(interfaceC3127U, c3150i0, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
            }
        }
        boolean z10 = c3118kM11189h == null;
        final InterfaceC3127U interfaceC3127U2 = z10 ? interfaceC3127U : c3118kM11189h;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f9376D0) {
            if (z6 && !z10) {
                try {
                    m3950g(interfaceC3127U.getWidth(), interfaceC3127U.getHeight(), interfaceC3127U2.getWidth(), interfaceC3127U2.getHeight());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f9380o0 = i10;
            rect.set(this.f9388w0);
            matrix.set(this.f9390y0);
        }
        return AbstractC16347a.m17947b(new InterfaceC10143j() { // from class: H.F
            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(final C10142i c10142i) {
                final AbstractC3115H abstractC3115H = this.f9359Y;
                final InterfaceC3127U interfaceC3127U3 = interfaceC3127U;
                final Matrix matrix2 = matrix;
                final Rect rect2 = rect;
                final C0072l c0072l2 = c0072l;
                final InterfaceC3127U interfaceC3127U4 = interfaceC3127U2;
                executor.execute(new Runnable() { // from class: H.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3115H abstractC3115H2 = abstractC3115H;
                        InterfaceC3127U interfaceC3127U5 = interfaceC3127U3;
                        Matrix matrix3 = matrix2;
                        InterfaceC3127U interfaceC3127U6 = interfaceC3127U4;
                        Rect rect3 = rect2;
                        C0072l c0072l3 = c0072l2;
                        C10142i c10142i2 = c10142i;
                        if (!abstractC3115H2.f9377E0) {
                            c10142i2.m10748b(new C20797i("ImageAnalysis is detached"));
                            return;
                        }
                        C3152j0 c3152j0 = new C3152j0(interfaceC3127U6, null, new C3143f(interfaceC3127U5.mo3968k0().mo3964c(), interfaceC3127U5.mo3968k0().mo3966f(), abstractC3115H2.f9382q0 ? 0 : abstractC3115H2.f9379Z, matrix3));
                        if (!rect3.isEmpty()) {
                            c3152j0.m3988e(rect3);
                        }
                        c0072l3.mo255c(c3152j0);
                        c10142i2.m10747a(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3947c();

    @Override // p228J.InterfaceC3819V
    /* JADX INFO: renamed from: d */
    public final void mo256d(InterfaceC3820W interfaceC3820W) {
        try {
            InterfaceC3127U interfaceC3127UMo3945a = mo3945a(interfaceC3820W);
            if (interfaceC3127UMo3945a != null) {
                mo3949f(interfaceC3127UMo3945a);
            }
        } catch (IllegalStateException e10) {
            AbstractC8072d6.m8488e("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3948e(InterfaceC3127U interfaceC3127U) {
        if (this.f9381p0 != 1) {
            if (this.f9381p0 == 2 && this.f9391z0 == null) {
                this.f9391z0 = ByteBuffer.allocateDirect(interfaceC3127U.getHeight() * interfaceC3127U.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f9373A0 == null) {
            this.f9373A0 = ByteBuffer.allocateDirect(interfaceC3127U.getHeight() * interfaceC3127U.getWidth());
        }
        this.f9373A0.position(0);
        if (this.f9374B0 == null) {
            this.f9374B0 = ByteBuffer.allocateDirect((interfaceC3127U.getHeight() * interfaceC3127U.getWidth()) / 4);
        }
        this.f9374B0.position(0);
        if (this.f9375C0 == null) {
            this.f9375C0 = ByteBuffer.allocateDirect((interfaceC3127U.getHeight() * interfaceC3127U.getWidth()) / 4);
        }
        this.f9375C0.position(0);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo3949f(InterfaceC3127U interfaceC3127U);

    /* JADX INFO: renamed from: g */
    public final void m3950g(int i10, int i11, int i12, int i13) {
        int i14 = this.f9379Z;
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            RectF rectF2 = AbstractC4503n.f14693a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i14);
            RectF rectF3 = new RectF(0.0f, 0.0f, i12, i13);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f9387v0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f9388w0 = rect;
        this.f9390y0.setConcat(this.f9389x0, matrix);
    }

    /* JADX INFO: renamed from: h */
    public final void m3951h(InterfaceC3127U interfaceC3127U, int i10) {
        C3150i0 c3150i0 = this.f9385t0;
        if (c3150i0 == null) {
            return;
        }
        c3150i0.m3987a();
        int width = interfaceC3127U.getWidth();
        int height = interfaceC3127U.getHeight();
        int iMo343j = this.f9385t0.mo343j();
        int iMo350t = this.f9385t0.mo350t();
        boolean z6 = i10 == 90 || i10 == 270;
        int i11 = z6 ? height : width;
        if (!z6) {
            width = height;
        }
        this.f9385t0 = new C3150i0(AbstractC8064c6.m8472c(i11, width, iMo343j, iMo350t));
        if (this.f9381p0 == 1) {
            ImageWriter imageWriter = this.f9386u0;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f9386u0 = ImageWriter.newInstance(this.f9385t0.getSurface(), this.f9385t0.mo350t());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3952i(Executor executor, C0072l c0072l) {
        synchronized (this.f9376D0) {
            this.f9378Y = c0072l;
            this.f9384s0 = executor;
        }
    }
}
