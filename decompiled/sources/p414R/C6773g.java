package p414R;

import android.gov.nist.core.Separators;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.protobuf.AbstractC12107L1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import p004A2.C0311b;
import p117Eb.C2391u;
import p178H.C3175v;
import p211I8.lPE.sRXLFOsOgS;
import p283L5.AbstractC4941g;
import p465T.AbstractC7171g;
import p465T.AbstractC7173i;
import p465T.C7165a;
import p465T.C7167c;
import p465T.C7172h;
import p465T.EnumC7170f;
import p523V9.AbstractC8072d6;
import p530Vi.AbstractC8301I;
import p561X.C8990d;
import p692d0.C12981t;
import p692d0.C12982u;
import p758g0.AbstractC13784r;
import p758g0.AbstractC13785r0;
import p758g0.C13783q0;
import p758g0.C13788t;
import p758g0.C13793v0;
import p758g0.InterfaceC13789t0;
import p758g0.InterfaceC13798z;
import p817j$.util.Objects;
import p960q9.C18655i;

/* JADX INFO: renamed from: R.g */
/* JADX INFO: loaded from: classes.dex */
public class C6773g implements InterfaceC13789t0 {

    /* JADX INFO: renamed from: Y */
    public int f21736Y;

    /* JADX INFO: renamed from: Z */
    public int[] f21737Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f21738o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f21739p0;

    /* JADX INFO: renamed from: q0 */
    public Object f21740q0;

    /* JADX INFO: renamed from: r0 */
    public Object f21741r0;

    /* JADX INFO: renamed from: s0 */
    public Object f21742s0;

    /* JADX INFO: renamed from: t0 */
    public Object f21743t0;

    /* JADX INFO: renamed from: u0 */
    public Object f21744u0;

    /* JADX INFO: renamed from: v0 */
    public Object f21745v0;

    /* JADX INFO: renamed from: w0 */
    public Object f21746w0;

    /* JADX INFO: renamed from: x0 */
    public Object f21747x0;

    /* JADX INFO: renamed from: y0 */
    public Object f21748y0;

    public C6773g() {
        this.f21738o0 = new AtomicBoolean(false);
        this.f21739p0 = new HashMap();
        this.f21741r0 = EGL14.EGL_NO_DISPLAY;
        this.f21742s0 = EGL14.EGL_NO_CONTEXT;
        this.f21737Z = AbstractC7173i.f22796a;
        this.f21744u0 = EGL14.EGL_NO_SURFACE;
        this.f21746w0 = Collections.emptyMap();
        this.f21747x0 = null;
        this.f21748y0 = EnumC7170f.f22785Y;
        this.f21736Y = -1;
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: F */
    public int mo3876F() {
        return 0;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        int i10 = 0;
        long jM8922m = AbstractC8301I.m8922m((j10 / 1000000) - ((long) 0), 0L, this.f21736Y);
        if (jM8922m < 0) {
            return abstractC13784r3;
        }
        m7215i(abstractC13784r, abstractC13784r2, abstractC13784r3);
        if (((C18655i) this.f21748y0) == null) {
            AbstractC13784r abstractC13784rMo3884u = mo3884u((jM8922m - 1) * 1000000, abstractC13784r, abstractC13784r2, abstractC13784r3);
            AbstractC13784r abstractC13784rMo3884u2 = mo3884u(jM8922m * 1000000, abstractC13784r, abstractC13784r2, abstractC13784r3);
            int iMo15284b = abstractC13784rMo3884u.mo15284b();
            while (i10 < iMo15284b) {
                AbstractC13784r abstractC13784r4 = (AbstractC13784r) this.f21743t0;
                if (abstractC13784r4 == null) {
                    AbstractC16544l.m18103p("velocityVector");
                    throw null;
                }
                abstractC13784r4.mo15287e(i10, (abstractC13784rMo3884u.mo15283a(i10) - abstractC13784rMo3884u2.mo15283a(i10)) * 1000.0f);
                i10++;
            }
            AbstractC13784r abstractC13784r5 = (AbstractC13784r) this.f21743t0;
            if (abstractC13784r5 != null) {
                return abstractC13784r5;
            }
            AbstractC16544l.m18103p("velocityVector");
            throw null;
        }
        int i11 = (int) jM8922m;
        float fM7212f = m7212f(m7211e(i11), i11, false);
        C18655i c18655i = (C18655i) this.f21748y0;
        if (c18655i == null) {
            AbstractC16544l.m18103p("arcSpline");
            throw null;
        }
        float[] fArr = (float[]) this.f21747x0;
        if (fArr == null) {
            AbstractC16544l.m18103p("slopeArray");
            throw null;
        }
        C13788t[][] c13788tArr = (C13788t[][]) c18655i.f59414Z;
        float f10 = c13788tArr[0][0].f43538a;
        if (fM7212f < f10) {
            fM7212f = f10;
        } else if (fM7212f > c13788tArr[c13788tArr.length - 1][0].f43539b) {
            fM7212f = c13788tArr[c13788tArr.length - 1][0].f43539b;
        }
        int length = c13788tArr.length;
        boolean z6 = false;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < fArr.length) {
                C13788t c13788t = c13788tArr[i12][i14];
                if (fM7212f <= c13788t.f43539b) {
                    if (c13788t.f43555r) {
                        fArr[i13] = c13788t.f43551n;
                        fArr[i13 + 1] = c13788t.f43552o;
                    } else {
                        c13788t.m15294c(fM7212f);
                        fArr[i13] = c13788tArr[i12][i14].m15292a();
                        fArr[i13 + 1] = c13788tArr[i12][i14].m15293b();
                    }
                    z6 = true;
                }
                i13 += 2;
                i14++;
            }
            if (z6) {
                break;
            }
        }
        float[] fArr2 = (float[]) this.f21747x0;
        if (fArr2 == null) {
            AbstractC16544l.m18103p("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i10 < length2) {
            AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f21743t0;
            if (abstractC13784r6 == null) {
                AbstractC16544l.m18103p("velocityVector");
                throw null;
            }
            float[] fArr3 = (float[]) this.f21747x0;
            if (fArr3 == null) {
                AbstractC16544l.m18103p("slopeArray");
                throw null;
            }
            abstractC13784r6.mo15287e(i10, fArr3[i10]);
            i10++;
        }
        AbstractC13784r abstractC13784r7 = (AbstractC13784r) this.f21743t0;
        if (abstractC13784r7 != null) {
            return abstractC13784r7;
        }
        AbstractC16544l.m18103p("velocityVector");
        throw null;
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: N */
    public int mo3878N() {
        return this.f21736Y;
    }

    /* JADX INFO: renamed from: a */
    public void m7208a(C3175v c3175v, C2391u c2391u) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f21741r0 = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f21741r0, iArr, 0, iArr, 1)) {
            this.f21741r0 = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (c2391u != null) {
            String str = iArr[0] + Separators.DOT + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            c2391u.f7430o0 = str;
        }
        int i10 = c3175v.m4022a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f21741r0, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, c3175v.m4022a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c3175v.m4022a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, c3175v.m4022a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f21741r0, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c3175v.m4022a() ? 3 : 2, 12344}, 0);
        AbstractC7173i.m7543a("eglCreateContext");
        this.f21743t0 = eGLConfig;
        this.f21742s0 = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f21741r0, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    /* JADX INFO: renamed from: b */
    public C7167c m7209b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f21741r0;
            EGLConfig eGLConfig = (EGLConfig) this.f21743t0;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM7551i = AbstractC7173i.m7551i(eGLDisplay, eGLConfig, surface, this.f21737Z);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f21741r0;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM7551i, 12375, iArr, 0);
            int i10 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM7551i, 12374, iArr2, 0);
            Size size = new Size(i10, iArr2[0]);
            return new C7167c(eGLSurfaceM7551i, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            AbstractC8072d6.m8493j("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7210c() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f21741r0;
        EGLConfig eGLConfig = (EGLConfig) this.f21743t0;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC7173i.f22796a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC7173i.m7543a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f21744u0 = eGLSurfaceEglCreatePbufferSurface;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean mo3881d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public int m7211e(int i10) {
        int i11;
        C12981t c12981t = (C12981t) this.f21738o0;
        int i12 = c12981t.f41203b;
        if (i12 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i12 + ')');
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int iM14686c = c12981t.m14686c(i11);
                if (iM14686c >= i10) {
                    if (iM14686c <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    /* JADX INFO: renamed from: f */
    public float m7212f(int i10, int i11, boolean z6) {
        InterfaceC13798z interfaceC13798z;
        float f10;
        C12981t c12981t = (C12981t) this.f21738o0;
        if (i10 >= c12981t.f41203b - 1) {
            f10 = i11;
        } else {
            int iM14686c = c12981t.m14686c(i10);
            int iM14686c2 = c12981t.m14686c(i10 + 1);
            if (i11 == iM14686c) {
                f10 = iM14686c;
            } else {
                int i12 = iM14686c2 - iM14686c;
                C13793v0 c13793v0 = (C13793v0) ((C12982u) this.f21739p0).m14694f(iM14686c);
                if (c13793v0 == null || (interfaceC13798z = c13793v0.f43570b) == null) {
                    interfaceC13798z = (C8990d) this.f21740q0;
                }
                float f11 = i12;
                float fMo9579a = interfaceC13798z.mo9579a((i11 - iM14686c) / f11);
                if (z6) {
                    return fMo9579a;
                }
                f10 = (f11 * fMo9579a) + iM14686c;
            }
        }
        return f10 / 1000;
    }

    /* JADX INFO: renamed from: g */
    public C0311b m7213g(C3175v c3175v) {
        AbstractC7173i.m7546d((AtomicBoolean) this.f21738o0, false);
        try {
            m7208a(c3175v, null);
            m7210c();
            m7216j((EGLSurface) this.f21744u0);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f21741r0, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C0311b(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            AbstractC8072d6.m8493j("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new C0311b("", "");
        } finally {
            m7218l();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7215i(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        float[] fArr;
        float[] fArr2;
        boolean z6 = ((C18655i) this.f21748y0) != null;
        AbstractC13784r abstractC13784r4 = (AbstractC13784r) this.f21742s0;
        C12982u c12982u = (C12982u) this.f21739p0;
        C12981t c12981t = (C12981t) this.f21738o0;
        if (abstractC13784r4 == null) {
            this.f21742s0 = abstractC13784r.mo15285c();
            this.f21743t0 = abstractC13784r3.mo15285c();
            int i10 = c12981t.f41203b;
            float[] fArr3 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr3[i11] = c12981t.m14686c(i11) / 1000;
            }
            this.f21741r0 = fArr3;
            int i12 = c12981t.f41203b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                C13793v0 c13793v0 = (C13793v0) c12982u.m14694f(c12981t.m14686c(i13));
                int i14 = c13793v0 != null ? c13793v0.f43571c : 0;
                if (i14 != 0) {
                    z6 = true;
                }
                iArr[i13] = i14;
            }
            this.f21737Z = iArr;
        }
        if (z6) {
            if (((C18655i) this.f21748y0) != null) {
                AbstractC13784r abstractC13784r5 = (AbstractC13784r) this.f21744u0;
                if (abstractC13784r5 == null) {
                    AbstractC16544l.m18103p("lastInitialValue");
                    throw null;
                }
                if (abstractC13784r5.equals(abstractC13784r)) {
                    AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f21745v0;
                    if (abstractC13784r6 == null) {
                        AbstractC16544l.m18103p("lastTargetValue");
                        throw null;
                    }
                    if (abstractC13784r6.equals(abstractC13784r2)) {
                        return;
                    }
                }
            }
            this.f21744u0 = abstractC13784r;
            this.f21745v0 = abstractC13784r2;
            int iMo15284b = abstractC13784r.mo15284b() + (abstractC13784r.mo15284b() % 2);
            this.f21746w0 = new float[iMo15284b];
            this.f21747x0 = new float[iMo15284b];
            int i15 = c12981t.f41203b;
            float[][] fArr4 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int iM14686c = c12981t.m14686c(i16);
                if (iM14686c != 0) {
                    if (iM14686c != this.f21736Y) {
                        fArr = new float[iMo15284b];
                        Object objM14694f = c12982u.m14694f(iM14686c);
                        AbstractC16544l.m18091d(objM14694f);
                        C13793v0 c13793v1 = (C13793v0) objM14694f;
                        for (int i17 = 0; i17 < iMo15284b; i17++) {
                            fArr[i17] = c13793v1.f43569a.mo15283a(i17);
                        }
                    } else if (c12982u.m14690b(iM14686c)) {
                        fArr = new float[iMo15284b];
                        Object objM14694f2 = c12982u.m14694f(iM14686c);
                        AbstractC16544l.m18091d(objM14694f2);
                        C13793v0 c13793v2 = (C13793v0) objM14694f2;
                        for (int i18 = 0; i18 < iMo15284b; i18++) {
                            fArr[i18] = c13793v2.f43569a.mo15283a(i18);
                        }
                    } else {
                        fArr2 = new float[iMo15284b];
                        for (int i19 = 0; i19 < iMo15284b; i19++) {
                            fArr2[i19] = abstractC13784r2.mo15283a(i19);
                        }
                    }
                    fArr2 = fArr;
                } else if (c12982u.m14690b(iM14686c)) {
                    fArr = new float[iMo15284b];
                    Object objM14694f3 = c12982u.m14694f(iM14686c);
                    AbstractC16544l.m18091d(objM14694f3);
                    C13793v0 c13793v3 = (C13793v0) objM14694f3;
                    for (int i20 = 0; i20 < iMo15284b; i20++) {
                        fArr[i20] = c13793v3.f43569a.mo15283a(i20);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iMo15284b];
                    for (int i21 = 0; i21 < iMo15284b; i21++) {
                        fArr2[i21] = abstractC13784r.mo15283a(i21);
                    }
                }
                fArr4[i16] = fArr2;
            }
            int[] iArr2 = this.f21737Z;
            if (iArr2 == null) {
                AbstractC16544l.m18103p("modes");
                throw null;
            }
            float[] fArr5 = (float[]) this.f21741r0;
            if (fArr5 == null) {
                AbstractC16544l.m18103p("times");
                throw null;
            }
            this.f21748y0 = new C18655i(iArr2, fArr5, fArr4);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m7216j(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f21741r0).getClass();
        ((EGLContext) this.f21742s0).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f21741r0, eGLSurface, eGLSurface, (EGLContext) this.f21742s0)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7217k(Surface surface) {
        AbstractC7173i.m7546d((AtomicBoolean) this.f21738o0, true);
        AbstractC7173i.m7545c((Thread) this.f21740q0);
        HashMap map = (HashMap) this.f21739p0;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, AbstractC7173i.f22805j);
    }

    /* JADX INFO: renamed from: l */
    public void m7218l() {
        Iterator it = ((Map) this.f21746w0).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC7171g) it.next()).f22789a);
        }
        this.f21746w0 = Collections.emptyMap();
        this.f21747x0 = null;
        if (!Objects.equals((EGLDisplay) this.f21741r0, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f21741r0;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = (HashMap) this.f21739p0;
            for (C7167c c7167c : map.values()) {
                if (!Objects.equals(c7167c.f22781a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f21741r0, c7167c.f22781a)) {
                    try {
                        AbstractC7173i.m7543a("eglDestroySurface");
                    } catch (IllegalStateException e10) {
                        AbstractC8072d6.m8488e("GLUtils", e10.toString(), e10);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f21744u0, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f21741r0, (EGLSurface) this.f21744u0);
                this.f21744u0 = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f21742s0, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f21741r0, (EGLContext) this.f21742s0);
                this.f21742s0 = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f21741r0);
            this.f21741r0 = EGL14.EGL_NO_DISPLAY;
        }
        this.f21743t0 = null;
        this.f21736Y = -1;
        this.f21748y0 = EnumC7170f.f22785Y;
        this.f21745v0 = null;
        this.f21740q0 = null;
    }

    /* JADX INFO: renamed from: m */
    public void m7219m(Surface surface, boolean z6) {
        if (((Surface) this.f21745v0) == surface) {
            this.f21745v0 = null;
            m7216j((EGLSurface) this.f21744u0);
        }
        HashMap map = (HashMap) this.f21739p0;
        C7167c c7167c = z6 ? (C7167c) map.remove(surface) : (C7167c) map.put(surface, AbstractC7173i.f22805j);
        if (c7167c == null || c7167c == AbstractC7173i.f22805j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f21741r0, c7167c.f22781a);
        } catch (RuntimeException e10) {
            AbstractC8072d6.m8493j("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7220n(long j10, float[] fArr, Surface surface) {
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
            int i10 = c7167cM7209b.f22782b;
            int i11 = c7167cM7209b.f22783c;
            GLES20.glViewport(0, 0, i10, i11);
            GLES20.glScissor(0, 0, i10, i11);
        }
        AbstractC7171g abstractC7171g = (AbstractC7171g) this.f21747x0;
        abstractC7171g.getClass();
        if (abstractC7171g instanceof C7172h) {
            GLES20.glUniformMatrix4fv(((C7172h) abstractC7171g).f22794f, 1, false, fArr, 0);
            AbstractC7173i.m7544b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7173i.m7544b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f21741r0, eGLSurface, j10);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f21741r0, eGLSurface)) {
            return;
        }
        AbstractC8072d6.m8492i("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m7219m(surface, false);
    }

    /* JADX INFO: renamed from: o */
    public void m7221o(int i10) {
        AbstractC7171g abstractC7171g = (AbstractC7171g) ((Map) this.f21746w0).get((EnumC7170f) this.f21748y0);
        if (abstractC7171g == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((EnumC7170f) this.f21748y0));
        }
        if (((AbstractC7171g) this.f21747x0) != abstractC7171g) {
            this.f21747x0 = abstractC7171g;
            abstractC7171g.mo7542b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((EnumC7170f) this.f21748y0) + ": " + ((AbstractC7171g) this.f21747x0));
        }
        GLES20.glActiveTexture(33984);
        AbstractC7173i.m7544b("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        AbstractC7173i.m7544b("glBindTexture");
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((long) mo3878N()) * 1000000;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return mo3877K(mo3882q(abstractC13784r, abstractC13784r2, abstractC13784r3), abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        int length;
        AbstractC13784r abstractC13784r4 = abstractC13784r;
        AbstractC13784r abstractC13784r5 = abstractC13784r2;
        int i10 = 1;
        int i11 = 0;
        int i12 = this.f21736Y;
        int iM8922m = (int) AbstractC8301I.m8922m((j10 / 1000000) - ((long) 0), 0L, i12);
        C12982u c12982u = (C12982u) this.f21739p0;
        if (c12982u.m14690b(iM8922m)) {
            Object objM14694f = c12982u.m14694f(iM8922m);
            AbstractC16544l.m18091d(objM14694f);
            return ((C13793v0) objM14694f).f43569a;
        }
        if (iM8922m >= i12) {
            return abstractC13784r5;
        }
        if (iM8922m <= 0) {
            return abstractC13784r4;
        }
        m7215i(abstractC13784r4, abstractC13784r5, abstractC13784r3);
        if (((C18655i) this.f21748y0) == null) {
            int iM7211e = m7211e(iM8922m);
            float fM7212f = m7212f(iM7211e, iM8922m, true);
            C12981t c12981t = (C12981t) this.f21738o0;
            int iM14686c = c12981t.m14686c(iM7211e);
            if (c12982u.m14690b(iM14686c)) {
                Object objM14694f2 = c12982u.m14694f(iM14686c);
                AbstractC16544l.m18091d(objM14694f2);
                abstractC13784r4 = ((C13793v0) objM14694f2).f43569a;
            }
            int iM14686c2 = c12981t.m14686c(iM7211e + 1);
            if (c12982u.m14690b(iM14686c2)) {
                Object objM14694f3 = c12982u.m14694f(iM14686c2);
                AbstractC16544l.m18091d(objM14694f3);
                abstractC13784r5 = ((C13793v0) objM14694f3).f43569a;
            }
            AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f21742s0;
            if (abstractC13784r6 == null) {
                AbstractC16544l.m18103p("valueVector");
                throw null;
            }
            int iMo15284b = abstractC13784r6.mo15284b();
            for (int i13 = 0; i13 < iMo15284b; i13++) {
                AbstractC13784r abstractC13784r7 = (AbstractC13784r) this.f21742s0;
                if (abstractC13784r7 == null) {
                    AbstractC16544l.m18103p("valueVector");
                    throw null;
                }
                float fMo15283a = abstractC13784r4.mo15283a(i13);
                float fMo15283a2 = abstractC13784r5.mo15283a(i13);
                C13783q0 c13783q0 = AbstractC13785r0.f43528a;
                abstractC13784r7.mo15287e(i13, (fMo15283a2 * fM7212f) + ((1 - fM7212f) * fMo15283a));
            }
            AbstractC13784r abstractC13784r8 = (AbstractC13784r) this.f21742s0;
            if (abstractC13784r8 != null) {
                return abstractC13784r8;
            }
            AbstractC16544l.m18103p("valueVector");
            throw null;
        }
        float fM7212f2 = m7212f(m7211e(iM8922m), iM8922m, false);
        C18655i c18655i = (C18655i) this.f21748y0;
        if (c18655i == null) {
            AbstractC16544l.m18103p("arcSpline");
            throw null;
        }
        float[] fArr = (float[]) this.f21746w0;
        if (fArr == null) {
            AbstractC16544l.m18103p("posArray");
            throw null;
        }
        C13788t[][] c13788tArr = (C13788t[][]) c18655i.f59414Z;
        float f10 = c13788tArr[0][0].f43538a;
        if (fM7212f2 < f10 || fM7212f2 > c13788tArr[c13788tArr.length - 1][0].f43539b) {
            if (fM7212f2 > c13788tArr[c13788tArr.length - 1][0].f43539b) {
                length = c13788tArr.length - 1;
                f10 = c13788tArr[c13788tArr.length - 1][0].f43539b;
            } else {
                length = 0;
            }
            float f11 = fM7212f2 - f10;
            int i14 = 0;
            int i15 = 0;
            while (i14 < fArr.length) {
                C13788t c13788t = c13788tArr[length][i15];
                if (c13788t.f43555r) {
                    float f12 = c13788t.f43538a;
                    float f13 = c13788t.f43548k;
                    float f14 = c13788t.f43542e;
                    float f15 = c13788t.f43540c;
                    fArr[i14] = (c13788t.f43551n * f11) + AbstractC12107L1.m13818i(f14, f15, (f10 - f12) * f13, f15);
                    float f16 = (f10 - f12) * f13;
                    float f17 = c13788t.f43543f;
                    float f18 = c13788t.f43541d;
                    fArr[i14 + 1] = (c13788t.f43552o * f11) + AbstractC12107L1.m13818i(f17, f18, f16, f18);
                } else {
                    c13788t.m15294c(f10);
                    C13788t c13788t2 = c13788tArr[length][i15];
                    fArr[i14] = (c13788t2.m15292a() * f11) + (c13788t2.f43549l * c13788t2.f43545h) + c13788t2.f43551n;
                    C13788t c13788t3 = c13788tArr[length][i15];
                    fArr[i14 + 1] = (c13788t3.m15293b() * f11) + (c13788t3.f43550m * c13788t3.f43546i) + c13788t3.f43552o;
                }
                i14 += 2;
                i15++;
            }
        } else {
            int length2 = c13788tArr.length;
            int i16 = 0;
            boolean z6 = false;
            while (i16 < length2) {
                int i17 = i11;
                int i18 = i17;
                while (i17 < fArr.length) {
                    C13788t c13788t4 = c13788tArr[i16][i18];
                    if (fM7212f2 <= c13788t4.f43539b) {
                        if (c13788t4.f43555r) {
                            float f19 = c13788t4.f43538a;
                            float f20 = c13788t4.f43548k;
                            float f21 = c13788t4.f43542e;
                            float f22 = c13788t4.f43540c;
                            fArr[i17] = AbstractC12107L1.m13818i(f21, f22, (fM7212f2 - f19) * f20, f22);
                            float f23 = (fM7212f2 - f19) * f20;
                            float f24 = c13788t4.f43543f;
                            float f25 = c13788t4.f43541d;
                            fArr[i17 + 1] = AbstractC12107L1.m13818i(f24, f25, f23, f25);
                        } else {
                            c13788t4.m15294c(fM7212f2);
                            C13788t c13788t5 = c13788tArr[i16][i18];
                            fArr[i17] = (c13788t5.f43549l * c13788t5.f43545h) + c13788t5.f43551n;
                            fArr[i17 + 1] = (c13788t5.f43550m * c13788t5.f43546i) + c13788t5.f43552o;
                        }
                        z6 = true;
                    }
                    i17 += 2;
                    i10 = 1;
                    i18++;
                }
                if (z6) {
                    break;
                }
                i16 += i10;
                i11 = 0;
            }
        }
        float[] fArr2 = (float[]) this.f21746w0;
        if (fArr2 == null) {
            AbstractC16544l.m18103p("posArray");
            throw null;
        }
        int length3 = fArr2.length;
        for (int i19 = 0; i19 < length3; i19++) {
            AbstractC13784r abstractC13784r9 = (AbstractC13784r) this.f21742s0;
            if (abstractC13784r9 == null) {
                AbstractC16544l.m18103p("valueVector");
                throw null;
            }
            float[] fArr3 = (float[]) this.f21746w0;
            if (fArr3 == null) {
                AbstractC16544l.m18103p("posArray");
                throw null;
            }
            abstractC13784r9.mo15287e(i19, fArr3[i19]);
        }
        AbstractC13784r abstractC13784r10 = (AbstractC13784r) this.f21742s0;
        if (abstractC13784r10 != null) {
            return abstractC13784r10;
        }
        AbstractC16544l.m18103p("valueVector");
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public C7165a mo7214h(C3175v c3175v, Map map) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f21738o0;
        AbstractC7173i.m7546d(atomicBoolean, false);
        C2391u c2391u = new C2391u(8, false);
        c2391u.f7429Z = "0.0";
        c2391u.f7430o0 = "0.0";
        c2391u.f7431p0 = "";
        c2391u.f7432q0 = "";
        try {
            if (c3175v.m4022a()) {
                C0311b c0311bM7213g = m7213g(c3175v);
                String str = (String) c0311bM7213g.f1082a;
                String str2 = (String) c0311bM7213g.f1083b;
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC8072d6.m8492i(sRXLFOsOgS.jdlgIIYa, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c3175v = C3175v.f9575d;
                }
                this.f21737Z = AbstractC7173i.m7548f(str2, c3175v);
                c2391u.f7431p0 = str;
                c2391u.f7432q0 = str2;
            }
            m7208a(c3175v, c2391u);
            m7210c();
            m7216j((EGLSurface) this.f21744u0);
            String strM7552j = AbstractC7173i.m7552j();
            if (strM7552j == null) {
                throw new NullPointerException("Null glVersion");
            }
            c2391u.f7429Z = strM7552j;
            this.f21746w0 = AbstractC7173i.m7549g(c3175v, map);
            int iM7550h = AbstractC7173i.m7550h();
            this.f21736Y = iM7550h;
            m7221o(iM7550h);
            this.f21740q0 = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = ((String) c2391u.f7429Z) == null ? " glVersion" : "";
            if (((String) c2391u.f7430o0) == null) {
                strConcat = strConcat.concat(" eglVersion");
            }
            if (strConcat.isEmpty()) {
                return new C7165a((String) c2391u.f7429Z, (String) c2391u.f7430o0, (String) c2391u.f7431p0, (String) c2391u.f7432q0);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        } catch (IllegalArgumentException e10) {
            e = e10;
            m7218l();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            m7218l();
            throw e;
        }
    }

    public C6773g(C12981t c12981t, C12982u c12982u, int i10, C8990d c8990d) {
        this.f21738o0 = c12981t;
        this.f21739p0 = c12982u;
        this.f21736Y = i10;
        this.f21740q0 = c8990d;
    }
}
