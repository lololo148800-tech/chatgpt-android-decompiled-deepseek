package fo;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import mm.C17316s;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p482Tg.C7443a0;
import p523V9.AbstractC7854B5;
import p547Wc.C8816z;
import p571X9.AbstractC9227W;
import p749fd.C13628m;
import p771go.AbstractC14204c;

/* JADX INFO: renamed from: fo.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C13718o implements InterfaceC13708e {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f43274a;

    /* JADX INFO: renamed from: b */
    public final C17314q f43275b;

    /* JADX INFO: renamed from: c */
    public final C17314q f43276c;

    /* JADX INFO: renamed from: d */
    public final C17314q f43277d;

    /* JADX INFO: renamed from: e */
    public C8816z f43278e;

    /* JADX INFO: renamed from: f */
    public C8816z f43279f;

    /* JADX INFO: renamed from: g */
    public final C13711h f43280g;

    public C13718o(C13711h reachabilityWatcher) {
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        this.f43280g = reachabilityWatcher;
        this.f43274a = new WeakHashMap();
        this.f43275b = AbstractC9227W.m9800c(C13715l.f43269Y);
        this.f43276c = AbstractC9227W.m9800c(new C13716m(this, 0));
        this.f43277d = AbstractC9227W.m9800c(new C13716m(this, 1));
    }

    /* JADX INFO: renamed from: b */
    public static void m15205b(InterfaceC1439n interfaceC1439n) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("android.util.Singleton");
        Field declaredField = cls.getDeclaredField("mInstance");
        declaredField.setAccessible(true);
        Method declaredMethod = cls.getDeclaredMethod("get", null);
        C17309l c17309l = Build.VERSION.SDK_INT >= 26 ? new C17309l("android.app.ActivityManager", "IActivityManagerSingleton") : new C17309l("android.app.ActivityManagerNative", "gDefault");
        String str = (String) c17309l.f55136Y;
        String str2 = (String) c17309l.f55137Z;
        Class<?> cls2 = Class.forName(str);
        Field declaredField2 = cls2.getDeclaredField(str2);
        declaredField2.setAccessible(true);
        Object obj = declaredField2.get(cls2);
        Object objInvoke = declaredMethod.invoke(obj, null);
        Class<?> cls3 = Class.forName("android.app.IActivityManager");
        if (objInvoke != null) {
            declaredField.set(obj, interfaceC1439n.invoke(cls3, objInvoke));
        } else {
            AbstractC16544l.m18101n();
            throw null;
        }
    }

    @Override // fo.InterfaceC13708e
    /* JADX INFO: renamed from: a */
    public final void mo15175a() {
        AbstractC14204c.m15511a();
        if (!(this.f43278e == null)) {
            throw new IllegalStateException("ServiceWatcher already installed");
        }
        if (this.f43279f != null) {
            throw new IllegalStateException("ServiceWatcher already installed");
        }
        try {
            m15206c(new C13628m(this, 3));
            m15205b(new C7443a0(this, 14));
        } catch (Throwable th2) {
            C13710g c13710g = AbstractC7854B5.f24748b;
            if (c13710g != null) {
                c13710g.m15176a("Could not watch destroyed services\n" + Log.getStackTraceString(th2));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15206c(InterfaceC1436k interfaceC1436k) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = ((Class) this.f43275b.getValue()).getDeclaredField("mH");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.f43276c.getValue());
        if (obj == null) {
            throw new C17316s("null cannot be cast to non-null type android.os.Handler");
        }
        Handler handler = (Handler) obj;
        Field declaredField2 = Handler.class.getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, interfaceC1436k.invoke((Handler.Callback) declaredField2.get(handler)));
    }
}
