package p465T;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;
import p178H.C3175v;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: T.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7172h extends AbstractC7171g {

    /* JADX INFO: renamed from: e */
    public final int f22793e;

    /* JADX INFO: renamed from: f */
    public final int f22794f;

    /* JADX INFO: renamed from: g */
    public final int f22795g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7172h(C3175v c3175v, C7168d c7168d) {
        String str;
        String str2 = c3175v.m4022a() ? AbstractC7173i.f22799d : AbstractC7173i.f22798c;
        try {
            switch (c7168d.f22784a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.f22793e = -1;
            this.f22794f = -1;
            this.f22795g = -1;
            m7541a();
            int i10 = this.f22789a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i10, "sTexture");
            this.f22793e = iGlGetUniformLocation;
            AbstractC7173i.m7547e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i10, "aTextureCoord");
            this.f22795g = iGlGetAttribLocation;
            AbstractC7173i.m7547e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i10, "uTexMatrix");
            this.f22794f = iGlGetUniformLocation2;
            AbstractC7173i.m7547e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th2) {
            if (!(th2 instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
            }
            throw th2;
        }
    }

    @Override // p465T.AbstractC7171g
    /* JADX INFO: renamed from: b */
    public final void mo7542b() {
        super.mo7542b();
        GLES20.glUniform1i(this.f22793e, 0);
        GLES20.glEnableVertexAttribArray(this.f22795g);
        AbstractC7173i.m7544b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f22795g, 2, 5126, false, 0, (Buffer) AbstractC7173i.f22804i);
        AbstractC7173i.m7544b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7172h(C3175v c3175v, EnumC7170f enumC7170f) {
        C7168d c7168d;
        if (c3175v.m4022a()) {
            AbstractC4941g.m5554M("No default sampler shader available for" + enumC7170f, enumC7170f != EnumC7170f.f22785Y);
            if (enumC7170f == EnumC7170f.f22787o0) {
                c7168d = AbstractC7173i.f22802g;
            } else {
                c7168d = AbstractC7173i.f22801f;
            }
        } else {
            c7168d = AbstractC7173i.f22800e;
        }
        this(c3175v, c7168d);
    }
}
