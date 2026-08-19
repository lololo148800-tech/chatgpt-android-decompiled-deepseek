package p221Ii;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p195Hh.C3430e;
import p211I8.lPE.sRXLFOsOgS;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p375P6.InterfaceC6371h;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p548Wd.p549VF.zakks;
import p720e6.C13287b;
import p826j6.C16137F;

/* JADX INFO: renamed from: Ii.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3723b implements InterfaceC6371h {

    /* JADX INFO: renamed from: a */
    public C16137F f11282a;

    /* JADX INFO: renamed from: b */
    public C16137F f11283b;

    /* JADX INFO: renamed from: c */
    public C13287b f11284c;

    /* JADX INFO: renamed from: e */
    public final FloatBuffer f11286e;

    /* JADX INFO: renamed from: g */
    public final float[] f11288g;

    /* JADX INFO: renamed from: h */
    public int f11289h;

    /* JADX INFO: renamed from: i */
    public int f11290i;

    /* JADX INFO: renamed from: j */
    public int f11291j;

    /* JADX INFO: renamed from: k */
    public int f11292k;

    /* JADX INFO: renamed from: d */
    public final C3430e f11285d = AbstractC8168p6.m8749b("GLQuadRender", null);

    /* JADX INFO: renamed from: f */
    public final float[] f11287f = new float[16];

    public C3723b(C16137F c16137f, C16137F c16137f2) {
        this.f11282a = c16137f;
        this.f11283b = c16137f2;
        float[] fArr = new float[16];
        this.f11288g = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f11286e = floatBufferAsFloatBuffer;
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: c */
    public final void mo4422c(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        this.f11289h = i10;
        this.f11290i = i11;
        m4424e();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f11291j = iArr[0];
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i12 = iArr2[0];
        this.f11292k = i12;
        GLES20.glBindTexture(3553, i12);
        GLES20.glTexImage2D(3553, 0, 32856, this.f11289h, this.f11290i, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33648);
        GLES20.glTexParameteri(3553, 10243, 33648);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, this.f11291j);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f11292k, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            GLES20.glBindFramebuffer(36160, 0);
        } else {
            throw new IllegalStateException(("Framebuffer is not complete: " + iGlCheckFramebufferStatus).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4423d(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        AbstractC8160o6.m8727b(this.f11285d, str + ": glError " + iGlGetError, null, 6);
        throw new IllegalStateException((str + ": glError " + iGlGetError).toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m4424e() {
        int i10 = this.f11291j;
        if (i10 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
            this.f11291j = 0;
        }
        int i11 = this.f11292k;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.f11292k = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4425f(String str, int i10, int i11, int i12) {
        if (i10 == -1) {
            return;
        }
        this.f11286e.position(i12);
        GLES20.glVertexAttribPointer(i10, i11, 5126, false, 20, (Buffer) this.f11286e);
        m4423d("glVertexAttribPointer ".concat(str));
        GLES20.glEnableVertexAttribArray(i10);
        m4423d("glEnableVertexAttribArray ".concat(str));
    }

    /* JADX INFO: renamed from: g */
    public final void m4426g(C16137F c16137f) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(c16137f.f50063Z, "inPosition");
        m4423d("glGetAttribLocation ".concat("inPosition"));
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(c16137f.f50063Z, "inTextureCoord");
        m4423d("glGetAttribLocation ".concat("inTextureCoord"));
        m4425f("inPosition", iGlGetAttribLocation, 3, 0);
        m4425f("inTextureCoord", iGlGetAttribLocation2, 2, 3);
        float[] fArr = this.f11287f;
        Matrix.setIdentityM(fArr, 0);
        ((C5303e) ((InterfaceC5300b) c16137f.f50064o0)).m5839c("uMVPMatrix", fArr);
        ((C5303e) ((InterfaceC5300b) c16137f.f50064o0)).m5839c("uSTMatrix", this.f11288g);
        C13287b c13287b = this.f11284c;
        if (c13287b != null) {
            c13287b.m14907p((InterfaceC5300b) c16137f.f50064o0);
        }
        c16137f.m17694m();
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: a */
    public final void mo4420a() {
        C13287b c13287b = this.f11284c;
        if (c13287b != null) {
            c13287b.m14908q();
        }
        if (this.f11282a.m17692i() && this.f11283b.m17692i()) {
            C16137F c16137f = this.f11282a;
            C5303e c5303e = (C5303e) ((InterfaceC5300b) c16137f.f50064o0);
            c5303e.getClass();
            C5299a c5299a = new C5299a(11, null);
            String str = sRXLFOsOgS.cXiDG;
            c5303e.m5837a(str, c5299a);
            c5303e.m5837a("uSTMatrix", new C5299a(11, null));
            c16137f.f50064o0 = c5303e;
            this.f11282a.m17688a(null);
            C16137F c16137f2 = this.f11283b;
            C5303e c5303e2 = (C5303e) ((InterfaceC5300b) c16137f2.f50064o0);
            c5303e2.getClass();
            c5303e2.m5837a(str, new C5299a(11, null));
            c5303e2.m5837a("uSTMatrix", new C5299a(11, null));
            c16137f2.f50064o0 = c5303e2;
            this.f11283b.m17688a(null);
        }
    }

    @Override // p375P6.InterfaceC6371h
    /* JADX INFO: renamed from: b */
    public final void mo4421b() {
        if (this.f11282a.m17692i() && this.f11283b.m17692i()) {
            GLES20.glBindFramebuffer(36160, this.f11291j);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f11283b.f50063Z);
            m4423d("glUseProgram - Prepass");
            m4426g(this.f11283b);
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glDrawArrays(5, 0, 4);
            m4423d(zakks.hcfVXEAgBiER);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f11282a.f50063Z);
            m4423d("glUseProgram - Main");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f11292k);
            m4426g(this.f11282a);
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glDrawArrays(5, 0, 4);
            m4423d("glDrawArrays - Main");
            GLES20.glFinish();
        }
    }
}
