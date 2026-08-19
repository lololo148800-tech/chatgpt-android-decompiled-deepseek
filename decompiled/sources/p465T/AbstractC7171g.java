package p465T;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: renamed from: T.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7171g {

    /* JADX INFO: renamed from: a */
    public final int f22789a;

    /* JADX INFO: renamed from: b */
    public int f22790b = -1;

    /* JADX INFO: renamed from: c */
    public int f22791c = -1;

    /* JADX INFO: renamed from: d */
    public int f22792d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public AbstractC7171g(String str, String str2) throws Throwable {
        int iM7553k;
        int iM7553k2;
        int iGlCreateProgram;
        try {
            iM7553k = AbstractC7173i.m7553k(35633, str);
            try {
                iM7553k2 = AbstractC7173i.m7553k(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        AbstractC7173i.m7544b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iM7553k);
                        AbstractC7173i.m7544b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iM7553k2);
                        AbstractC7173i.m7544b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f22789a = iGlCreateProgram;
                            m7541a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (iM7553k != -1) {
                            GLES20.glDeleteShader(iM7553k);
                        }
                        if (iM7553k2 != -1) {
                            GLES20.glDeleteShader(iM7553k2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e11) {
                        e = e11;
                        if (iM7553k != -1) {
                            GLES20.glDeleteShader(iM7553k);
                        }
                        if (iM7553k2 != -1) {
                            GLES20.glDeleteShader(iM7553k2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e12) {
                    e = e12;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e13) {
                e = e13;
                iM7553k2 = -1;
                iGlCreateProgram = iM7553k2;
                if (iM7553k != -1) {
                    GLES20.glDeleteShader(iM7553k);
                }
                if (iM7553k2 != -1) {
                    GLES20.glDeleteShader(iM7553k2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e14) {
            e = e14;
            iM7553k = -1;
            iM7553k2 = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7541a() {
        int i10 = this.f22789a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i10, "aPosition");
        this.f22792d = iGlGetAttribLocation;
        AbstractC7173i.m7547e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i10, "uTransMatrix");
        this.f22790b = iGlGetUniformLocation;
        AbstractC7173i.m7547e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i10, "uAlphaScale");
        this.f22791c = iGlGetUniformLocation2;
        AbstractC7173i.m7547e(iGlGetUniformLocation2, "uAlphaScale");
    }

    /* JADX INFO: renamed from: b */
    public void mo7542b() {
        GLES20.glUseProgram(this.f22789a);
        AbstractC7173i.m7544b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f22792d);
        AbstractC7173i.m7544b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f22792d, 2, 5126, false, 0, (Buffer) AbstractC7173i.f22803h);
        AbstractC7173i.m7544b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f22790b, 1, false, fArr, 0);
        AbstractC7173i.m7544b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f22791c, 1.0f);
        AbstractC7173i.m7544b("glUniform1f");
    }
}
