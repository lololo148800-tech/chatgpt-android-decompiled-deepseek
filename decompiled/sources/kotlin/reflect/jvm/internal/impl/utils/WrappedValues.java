package kotlin.reflect.jvm.internal.impl.utils;

import vn.C20649f;
import vn.C20650g;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a */
    public static final C20649f f53314a = new C20649f();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18452a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static <V> Object escapeNull(V v2) {
        return v2 == null ? f53314a : v2;
    }

    public static Object escapeThrowable(Throwable th2) {
        if (th2 != null) {
            return new C20650g(th2);
        }
        m18452a(3);
        throw null;
    }

    public static <V> V unescapeExceptionOrNull(Object obj) {
        if (obj != null) {
            return (V) unescapeNull(unescapeThrowable(obj));
        }
        m18452a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(Object obj) {
        if (obj == 0) {
            m18452a(0);
            throw null;
        }
        if (obj == f53314a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(Object obj) {
        if (!(obj instanceof C20650g)) {
            return obj;
        }
        Throwable th2 = ((C20650g) obj).f65528a;
        if (th2 == null) {
            C20650g.m21200a(1);
            throw null;
        }
        if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(th2)) {
            throw new WrappedProcessCanceledException(th2);
        }
        throw ExceptionUtilsKt.rethrow(th2);
    }
}
