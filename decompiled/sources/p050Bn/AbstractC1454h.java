package p050Bn;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p1063vf.C20601i;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Bn.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1454h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3824a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM9806b;
        try {
            objM9806b = new C1451e(m2056b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (objM9806b instanceof C17311n) {
            objM9806b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2055a(C0624m c0624m) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            AbstractC16544l.m18091d(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new ChoreographerFrameCallbackC1452f(c0624m, 0));
    }

    /* JADX INFO: renamed from: b */
    public static final Handler m2056b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m2057c(C20601i c20601i) {
        int i10 = 0;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c20601i));
            c0624m.m1262r();
            choreographer2.postFrameCallback(new ChoreographerFrameCallbackC1452f(c0624m, 0));
            Object objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            return objM1261q;
        }
        C0624m c0624m2 = new C0624m(1, AbstractC8154o0.m8714e(c20601i));
        c0624m2.m1262r();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m2055a(c0624m2);
        } else {
            C3516e c3516e = AbstractC0593T.f1824a;
            AbstractC2935m.f8797a.mo872V0(c0624m2.f1874q0, new RunnableC1453g(c0624m2, i10));
        }
        Object objM1261q2 = c0624m2.m1261q();
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        return objM1261q2;
    }
}
