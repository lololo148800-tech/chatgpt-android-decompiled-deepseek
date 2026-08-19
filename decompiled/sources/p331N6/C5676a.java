package p331N6;

import android.opengl.GLES20;
import android.opengl.Matrix;
import io.sentry.android.core.AbstractC15256t;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p375P6.InterfaceC6371h;
import p571X9.AbstractC9141H2;
import p571X9.AbstractC9162L;
import p720e6.C13287b;
import p826j6.C16137F;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: N6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5676a implements InterfaceC6371h {

    /* JADX INFO: renamed from: a */
    public int f18430a;

    /* JADX INFO: renamed from: b */
    public int f18431b;

    /* JADX INFO: renamed from: c */
    public Object f18432c;

    /* JADX INFO: renamed from: d */
    public Object f18433d;

    /* JADX INFO: renamed from: e */
    public final Object f18434e;

    /* JADX INFO: renamed from: f */
    public Object f18435f;

    /* JADX INFO: renamed from: g */
    public final Object f18436g;

    public C5676a(C16137F c16137f) {
        this.f18432c = c16137f;
        this.f18435f = new float[16];
        float[] fArr = new float[16];
        this.f18436g = fArr;
        this.f18430a = -1;
        this.f18431b = -1;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f18434e = floatBufferAsFloatBuffer;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m6107f(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String message = str + ": glError " + iGlGetError;
        AbstractC16544l.m18094g(message, "message");
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16465c("GLQuadRender", message);
        }
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: a */
    public void mo4420a() {
        C13287b c13287b = (C13287b) this.f18433d;
        if (c13287b != null) {
            c13287b.m14908q();
        }
        if (((C16137F) this.f18432c).m17692i()) {
            C16137F c16137f = (C16137F) this.f18432c;
            C5303e c5303e = (C5303e) ((InterfaceC5300b) c16137f.f50064o0);
            c5303e.getClass();
            c5303e.m5837a("uMVPMatrix", new C5299a(11, null));
            c5303e.m5837a("uSTMatrix", new C5299a(11, null));
            c16137f.f50064o0 = c5303e;
            ((C16137F) this.f18432c).m17688a(null);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(((C16137F) this.f18432c).f50063Z, "inPosition");
            m6107f("glGetAttribLocation ".concat("inPosition"));
            this.f18430a = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(((C16137F) this.f18432c).f50063Z, "inTextureCoord");
            m6107f("glGetAttribLocation ".concat("inTextureCoord"));
            this.f18431b = iGlGetAttribLocation2;
        }
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: b */
    public void mo4421b() {
        if (((C16137F) this.f18432c).m17692i()) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(((C16137F) this.f18432c).f50063Z);
            m6107f("glUseProgram");
            m6110g("inPosition", this.f18430a, 3, 0);
            m6110g("inTextureCoord", this.f18431b, 2, 3);
            float[] fArr = (float[]) this.f18435f;
            Matrix.setIdentityM(fArr, 0);
            ((C5303e) ((InterfaceC5300b) ((C16137F) this.f18432c).f50064o0)).m5839c("uMVPMatrix", fArr);
            ((C5303e) ((InterfaceC5300b) ((C16137F) this.f18432c).f50064o0)).m5839c("uSTMatrix", (float[]) this.f18436g);
            C13287b c13287b = (C13287b) this.f18433d;
            if (c13287b != null) {
                c13287b.m14907p((InterfaceC5300b) ((C16137F) this.f18432c).f50064o0);
            }
            ((C16137F) this.f18432c).m17694m();
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glDrawArrays(5, 0, 4);
            m6107f("glDrawArrays");
            GLES20.glFinish();
        }
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: c */
    public void mo4422c(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public void m6108d(C17212i c17212i) {
        if (((HashSet) this.f18433d).contains(c17212i.f54943a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f18434e).add(c17212i);
    }

    /* JADX INFO: renamed from: e */
    public C17204a m6109e() {
        if (((InterfaceC17207d) this.f18435f) != null) {
            return new C17204a((String) this.f18432c, new HashSet((HashSet) this.f18433d), new HashSet((HashSet) this.f18434e), this.f18430a, this.f18431b, (InterfaceC17207d) this.f18435f, (HashSet) this.f18436g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* JADX INFO: renamed from: g */
    public void m6110g(String str, int i10, int i11, int i12) {
        if (i10 == -1) {
            return;
        }
        ((FloatBuffer) this.f18434e).position(i12);
        GLES20.glVertexAttribPointer(i10, i11, 5126, false, 20, (Buffer) this.f18434e);
        m6107f("glVertexAttribPointer ".concat(str));
        GLES20.glEnableVertexAttribArray(i10);
        m6107f("glEnableVertexAttribArray ".concat(str));
    }

    public C5676a(Class cls, Class[] clsArr) {
        this.f18432c = null;
        HashSet hashSet = new HashSet();
        this.f18433d = hashSet;
        this.f18434e = new HashSet();
        this.f18430a = 0;
        this.f18431b = 0;
        this.f18436g = new HashSet();
        hashSet.add(C17220q.m18953a(cls));
        for (Class cls2 : clsArr) {
            AbstractC9162L.m9711a(cls2, "Null interface");
            ((HashSet) this.f18433d).add(C17220q.m18953a(cls2));
        }
    }

    public C5676a(C17220q c17220q, C17220q[] c17220qArr) {
        this.f18432c = null;
        HashSet hashSet = new HashSet();
        this.f18433d = hashSet;
        this.f18434e = new HashSet();
        this.f18430a = 0;
        this.f18431b = 0;
        this.f18436g = new HashSet();
        hashSet.add(c17220q);
        for (C17220q c17220q2 : c17220qArr) {
            AbstractC9162L.m9711a(c17220q2, "Null interface");
        }
        Collections.addAll((HashSet) this.f18433d, c17220qArr);
    }
}
