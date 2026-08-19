package fo;

import android.app.Service;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17316s;
import p482Tg.C7443a0;

/* JADX INFO: renamed from: fo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C13717n implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7443a0 f43272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43273b;

    public C13717n(C7443a0 c7443a0, Object obj) {
        this.f43272a = c7443a0;
        this.f43273b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Service service;
        AbstractC16544l.m18090c(method, "method");
        if ("serviceDoneExecuting".equals(method.getName())) {
            if (objArr == null) {
                AbstractC16544l.m18101n();
                throw null;
            }
            Object obj2 = objArr[0];
            if (obj2 == null) {
                throw new C17316s("null cannot be cast to non-null type android.os.IBinder");
            }
            IBinder iBinder = (IBinder) obj2;
            C7443a0 c7443a0 = this.f43272a;
            if (((C13718o) c7443a0.f23559Z).f43274a.containsKey(iBinder)) {
                C13718o c13718o = (C13718o) c7443a0.f23559Z;
                WeakReference weakReference = (WeakReference) c13718o.f43274a.remove(iBinder);
                if (weakReference != null && (service = (Service) weakReference.get()) != null) {
                    c13718o.f43280g.m15194i(service, service.getClass().getName().concat(" received Service#onDestroy() callback"));
                }
            }
        }
        Object obj3 = this.f43273b;
        try {
            return objArr == null ? method.invoke(obj3, null) : method.invoke(obj3, Arrays.copyOf(objArr, objArr.length));
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            AbstractC16544l.m18090c(targetException, "invocationException.targetException");
            throw targetException;
        }
    }
}
