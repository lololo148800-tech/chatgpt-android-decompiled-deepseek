package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(Throwable th2) {
        AbstractC16544l.m18094g(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!AbstractC16544l.m18089b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException rethrow(Throwable e10) throws Throwable {
        AbstractC16544l.m18094g(e10, "e");
        throw e10;
    }
}
