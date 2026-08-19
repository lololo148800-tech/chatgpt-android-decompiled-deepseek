package p1046um;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: um.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20391a {

    /* JADX INFO: renamed from: a */
    public static final Method f64489a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC16544l.m18091d(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (AbstractC16544l.m18089b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
                if (AbstractC16544l.m18089b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f64489a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !AbstractC16544l.m18089b(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
