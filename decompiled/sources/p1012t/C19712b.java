package p1012t;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p030B2.AbstractC0761i;
import p178H.ThreadFactoryC3157m;
import p523V9.AbstractC8158o4;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19712b extends AbstractC8158o4 {

    /* JADX INFO: renamed from: a */
    public final Object f62405a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f62406b = Executors.newFixedThreadPool(4, new ThreadFactoryC3157m(3));

    /* JADX INFO: renamed from: c */
    public volatile Handler f62407c;

    /* JADX INFO: renamed from: e */
    public static Handler m20663e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0761i.m1669a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
