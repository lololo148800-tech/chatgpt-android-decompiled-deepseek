package p523V9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.InvocationTargetException;
import p030B2.AbstractC0761i;
import p140Fa.C2700t;

/* JADX INFO: renamed from: V9.m5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8143m5 {
    /* JADX INFO: renamed from: a */
    public static Handler m8678a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0761i.m1670b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            AbstractC15256t.m16483u("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            AbstractC15256t.m16483u("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            AbstractC15256t.m16483u("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8679c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3658b(C2700t c2700t, float f10, float f11);
}
