package p050Bn;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p025An.C0565C;
import p025An.InterfaceC0567D;
import p972qm.AbstractC18768a;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Bn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1448b extends AbstractC18768a implements InterfaceC0567D {
    private volatile Object _preHandler;

    public C1448b() {
        super(C0565C.f1783Y);
        this._preHandler = this;
    }

    @Override // p025An.InterfaceC0567D
    public void handleException(InterfaceC18776i interfaceC18776i, Throwable th2) {
        Method declaredMethod;
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
    }
}
