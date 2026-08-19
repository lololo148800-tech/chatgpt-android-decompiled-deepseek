package livekit.org.webrtc;

import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: livekit.org.webrtc.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17039i {
    static {
        Object obj = EglBase.lock;
    }

    /* JADX INFO: renamed from: a */
    public static EglBase.ConfigBuilder m18860a() {
        return new EglBase.ConfigBuilder();
    }

    /* JADX INFO: renamed from: b */
    public static EglBase m18861b() {
        return m18863d(null, EglBase.CONFIG_PLAIN);
    }

    /* JADX INFO: renamed from: c */
    public static EglBase m18862c(EglBase.Context context) {
        return m18863d(context, EglBase.CONFIG_PLAIN);
    }

    /* JADX INFO: renamed from: d */
    public static EglBase m18863d(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return m18870k(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return m18869j((EglBase14.Context) context, iArr);
        }
        if (context instanceof EglBase10.Context) {
            return m18866g((EglBase10.Context) context, iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    /* JADX INFO: renamed from: e */
    public static EglBase m18864e(EglBase.EglConnection eglConnection) {
        if (eglConnection == null) {
            return m18861b();
        }
        if (eglConnection instanceof EglBase14Impl.EglConnection) {
            return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
        }
        if (eglConnection instanceof EglBase10Impl.EglConnection) {
            return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
        }
        throw new IllegalArgumentException("Unrecognized EglConnection");
    }

    /* JADX INFO: renamed from: f */
    public static EglBase10 m18865f(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static EglBase10 m18866g(EglBase10.Context context, int[] iArr) {
        return new EglBase10Impl(context == null ? null : context.getRawContext(), iArr);
    }

    /* JADX INFO: renamed from: h */
    public static EglBase10 m18867h(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    /* JADX INFO: renamed from: i */
    public static EglBase14 m18868i(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    /* JADX INFO: renamed from: j */
    public static EglBase14 m18869j(EglBase14.Context context, int[] iArr) {
        return new EglBase14Impl(context == null ? null : context.getRawContext(), iArr);
    }

    /* JADX INFO: renamed from: k */
    public static EglBase14 m18870k(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    /* JADX INFO: renamed from: l */
    public static int m18871l(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length - 1; i10++) {
            if (iArr[i10] == 12352) {
                int i11 = iArr[i10 + 1];
                if (i11 != 4) {
                    return i11 != 64 ? 1 : 3;
                }
                return 2;
            }
        }
        return 1;
    }
}
