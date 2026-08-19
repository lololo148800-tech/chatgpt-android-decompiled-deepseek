package p544W9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p842k0.C16302k;
import p842k0.C16305n;

/* JADX INFO: renamed from: W9.Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8590Y3 {

    /* JADX INFO: renamed from: a */
    public static Constructor f26413a;

    /* JADX INFO: renamed from: b */
    public static Method f26414b;

    /* JADX INFO: renamed from: c */
    public static Method f26415c;

    /* JADX INFO: renamed from: a */
    public static final void m9254a(C16305n c16305n) {
        c16305n.f50513a.setValue(C16302k.f50511a);
    }

    /* JADX INFO: renamed from: b */
    public static void m9255b() throws ClassNotFoundException {
        if (f26413a == null || f26414b == null || f26415c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f26413a = cls.getConstructor(null);
            f26414b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f26415c = cls.getMethod("build", null);
        }
    }
}
