package p914o3;

import androidx.lifecycle.InterfaceC11112u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import mm.InterfaceC17300c;
import p349O0.AbstractC6012k0;
import p349O0.C5984W0;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: o3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17814e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6012k0 f56807a;

    static {
        Object objM9806b;
        try {
            ClassLoader classLoader = InterfaceC11112u.class.getClassLoader();
            AbstractC16544l.m18091d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC6012k0) {
                        objM9806b = (AbstractC6012k0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof InterfaceC17300c)) {
                    i10++;
                }
                objM9806b = null;
                break;
            }
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        AbstractC6012k0 c5984w0 = (AbstractC6012k0) (objM9806b instanceof C17311n ? null : objM9806b);
        if (c5984w0 == null) {
            c5984w0 = new C5984W0(C17813d.f56806Y);
        }
        f56807a = c5984w0;
    }
}
