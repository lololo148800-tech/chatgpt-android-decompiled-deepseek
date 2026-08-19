package p465T;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p174Gk.uSfJ.HpucjswO;
import p178H.C3175v;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: T.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7173i {

    /* JADX INFO: renamed from: a */
    public static final int[] f22796a = {12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f22797b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c */
    public static final String f22798c;

    /* JADX INFO: renamed from: d */
    public static final String f22799d;

    /* JADX INFO: renamed from: e */
    public static final C7168d f22800e;

    /* JADX INFO: renamed from: f */
    public static final C7168d f22801f;

    /* JADX INFO: renamed from: g */
    public static final C7168d f22802g;

    /* JADX INFO: renamed from: h */
    public static final FloatBuffer f22803h;

    /* JADX INFO: renamed from: i */
    public static final FloatBuffer f22804i;

    /* JADX INFO: renamed from: j */
    public static final C7167c f22805j;

    static {
        Locale locale = Locale.US;
        f22798c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f22799d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f22800e = new C7168d(0);
        f22801f = new C7168d(1);
        f22802g = new C7168d(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f22803h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f22804i = floatBufferAsFloatBuffer2;
        f22805j = new C7167c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m7543a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ": EGL error: 0x");
        sbM9895n.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbM9895n.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m7544b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ": GL error 0x");
        sbM9895n.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbM9895n.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m7545c(Thread thread) {
        AbstractC4941g.m5559R("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    /* JADX INFO: renamed from: d */
    public static void m7546d(AtomicBoolean atomicBoolean, boolean z6) {
        AbstractC4941g.m5559R(z6 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z6 == atomicBoolean.get());
    }

    /* JADX INFO: renamed from: e */
    public static void m7547e(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC10763a.m11054l("Unable to locate '", str, "' in program"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static int[] m7548f(String str, C3175v c3175v) {
        int[] iArr = f22796a;
        if (c3175v.f9581a != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f22797b;
        }
        AbstractC8072d6.m8492i("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static int m7550h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m7544b("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        m7544b("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m7544b("glTexParameter");
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public static EGLSurface m7551i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m7543a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException(HpucjswO.BWFsjnvzgulwe);
    }

    /* JADX INFO: renamed from: j */
    public static String m7552j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return AbstractC9306j0.m9890i(strGroup, Separators.DOT, strGroup2);
    }

    /* JADX INFO: renamed from: k */
    public static int m7553k(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        m7544b("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC8072d6.m8492i("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Could not compile shader type ", ":");
        sbM11057o.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m7549g(C3175v c3175v, Map map) {
        Object c7172h;
        EnumC7170f enumC7170f;
        HashMap map2 = new HashMap();
        EnumC7170f[] enumC7170fArrValues = EnumC7170f.values();
        int length = enumC7170fArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            EnumC7170f enumC7170f2 = enumC7170fArrValues[i10];
            C7168d c7168d = (C7168d) map.get(enumC7170f2);
            if (c7168d != null) {
                c7172h = new C7172h(c3175v, c7168d);
            } else if (enumC7170f2 == EnumC7170f.f22787o0 || enumC7170f2 == (enumC7170f = EnumC7170f.f22786Z)) {
                c7172h = new C7172h(c3175v, enumC7170f2);
            } else {
                AbstractC4941g.m5559R("Unhandled input format: " + enumC7170f2, enumC7170f2 == EnumC7170f.f22785Y);
                if (c3175v.m4022a()) {
                    c7172h = new C7169e("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    C7168d c7168d2 = (C7168d) map.get(enumC7170f);
                    c7172h = c7168d2 != null ? new C7172h(c3175v, c7168d2) : new C7172h(c3175v, enumC7170f);
                }
            }
            Log.d(zakks.uiSXPu, "Shader program for input format " + enumC7170f2 + " created: " + c7172h);
            map2.put(enumC7170f2, c7172h);
        }
        return map2;
    }
}
