package p439S;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p178H.C3130X;
import p178H.C3175v;
import p283L5.AbstractC4941g;
import p414R.C6773g;
import p414R.C6779m;
import p465T.AbstractC7171g;
import p465T.AbstractC7173i;
import p465T.C7165a;
import p465T.C7167c;
import p465T.C7172h;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;

/* JADX INFO: renamed from: S.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6972c extends C6773g {

    /* JADX INFO: renamed from: B0 */
    public final C3130X f22287B0;

    /* JADX INFO: renamed from: C0 */
    public final C3130X f22288C0;

    /* JADX INFO: renamed from: z0 */
    public int f22289z0 = -1;

    /* JADX INFO: renamed from: A0 */
    public int f22286A0 = -1;

    public C6972c(C3130X c3130x, C3130X c3130x2) {
        this.f22287B0 = c3130x;
        this.f22288C0 = c3130x2;
    }

    @Override // p414R.C6773g
    /* JADX INFO: renamed from: h */
    public final C7165a mo7214h(C3175v c3175v, Map map) {
        C7165a c7165aMo7214h = super.mo7214h(c3175v, map);
        this.f22289z0 = AbstractC7173i.m7550h();
        this.f22286A0 = AbstractC7173i.m7550h();
        return c7165aMo7214h;
    }

    /* JADX INFO: renamed from: p */
    public final void m7333p(long j10, Surface surface, C6779m c6779m, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC7173i.m7546d((AtomicBoolean) this.f21738o0, true);
        AbstractC7173i.m7545c((Thread) this.f21740q0);
        HashMap map = (HashMap) this.f21739p0;
        AbstractC4941g.m5559R("The surface is not registered.", map.containsKey(surface));
        C7167c c7167cM7209b = (C7167c) map.get(surface);
        Objects.requireNonNull(c7167cM7209b);
        if (c7167cM7209b == AbstractC7173i.f22805j) {
            c7167cM7209b = m7209b(surface);
            if (c7167cM7209b == null) {
                return;
            } else {
                map.put(surface, c7167cM7209b);
            }
        }
        Surface surface2 = (Surface) this.f21745v0;
        EGLSurface eGLSurface = c7167cM7209b.f22781a;
        if (surface != surface2) {
            m7216j(eGLSurface);
            this.f21745v0 = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        C7167c c7167c = c7167cM7209b;
        m7334r(c7167c, c6779m, surfaceTexture, this.f22287B0, this.f22289z0);
        m7334r(c7167c, c6779m, surfaceTexture2, this.f22288C0, this.f22286A0);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f21741r0, eGLSurface, j10);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f21741r0, eGLSurface)) {
            return;
        }
        AbstractC8072d6.m8492i("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m7219m(surface, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m7334r(C7167c c7167c, C6779m c6779m, SurfaceTexture surfaceTexture, C3130X c3130x, int i10) {
        m7221o(i10);
        int i11 = c7167c.f22782b;
        int i12 = c7167c.f22783c;
        GLES20.glViewport(0, 0, i11, i12);
        GLES20.glScissor(0, 0, i11, i12);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, c6779m.f21781q0, 0);
        AbstractC7171g abstractC7171g = (AbstractC7171g) this.f21747x0;
        abstractC7171g.getClass();
        if (abstractC7171g instanceof C7172h) {
            GLES20.glUniformMatrix4fv(((C7172h) abstractC7171g).f22794f, 1, false, fArr2, 0);
            AbstractC7173i.m7544b("glUniformMatrix4fv");
        }
        c3130x.getClass();
        Size size = new Size((int) (i11 * 1.0f), (int) (i12 * 1.0f));
        Size size2 = new Size(i11, i12);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC7171g.f22790b, 1, false, fArr5, 0);
        AbstractC7173i.m7544b("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC7171g.f22791c, 1.0f);
        AbstractC7173i.m7544b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7173i.m7544b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
