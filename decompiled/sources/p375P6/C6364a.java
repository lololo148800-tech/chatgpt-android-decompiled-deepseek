package p375P6;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: P6.a */
/* JADX INFO: loaded from: classes.dex */
public class C6364a implements InterfaceC6365b {

    /* JADX INFO: renamed from: a */
    public final int[] f20714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractTextureViewSurfaceTextureListenerC6373j f20715b;

    /* JADX INFO: renamed from: c */
    public final int[] f20716c;

    /* JADX INFO: renamed from: d */
    public final int f20717d;

    /* JADX INFO: renamed from: e */
    public final int f20718e;

    /* JADX INFO: renamed from: f */
    public final int f20719f;

    /* JADX INFO: renamed from: g */
    public final int f20720g;

    /* JADX INFO: renamed from: h */
    public final int f20721h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractTextureViewSurfaceTextureListenerC6373j f20722i;

    public C6364a(AbstractTextureViewSurfaceTextureListenerC6373j this$0, int i10, int i11) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this.f20722i = this$0;
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, i10, 12325, i11, 12326, 0, 12344};
        this.f20715b = this$0;
        int i12 = this$0.f20751G0;
        if (i12 == 2 || i12 == 3) {
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            if (this$0.f20751G0 == 2) {
                iArr2[13] = 4;
            } else {
                iArr2[13] = 64;
            }
            iArr2[14] = 12344;
            iArr = iArr2;
        }
        this.f20714a = iArr;
        this.f20716c = new int[1];
        this.f20717d = 8;
        this.f20718e = 8;
        this.f20719f = 8;
        this.f20720g = i10;
        this.f20721h = i11;
    }

    /* JADX INFO: renamed from: a */
    public final int m6976a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        if (egl10 == null) {
            return 0;
        }
        int[] iArr = this.f20716c;
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
