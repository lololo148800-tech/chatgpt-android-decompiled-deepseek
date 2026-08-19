package sm;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fo.C13711h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: sm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19685a implements InterfaceC18770c, InterfaceC19688d, Serializable {
    private final InterfaceC18770c<Object> completion;

    public AbstractC19685a(InterfaceC18770c interfaceC18770c) {
        this.completion = interfaceC18770c;
    }

    public InterfaceC18770c<C17296C> create(InterfaceC18770c<?> completion) {
        AbstractC16544l.m18094g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC19688d getCallerFrame() {
        InterfaceC18770c<Object> interfaceC18770c = this.completion;
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    public final InterfaceC18770c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM20655c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC19689e interfaceC19689e = (InterfaceC19689e) getClass().getAnnotation(InterfaceC19689e.class);
        String str = null;
        if (interfaceC19689e == null) {
            return null;
        }
        int iM20659v = interfaceC19689e.m20659v();
        if (iM20659v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM20659v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? interfaceC19689e.m20657l()[iIntValue] : -1;
        C13711h c13711h = AbstractC19690f.f62379b;
        C13711h c13711h2 = AbstractC19690f.f62378a;
        if (c13711h == null) {
            try {
                C13711h c13711h3 = new C13711h(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(DiagnosticsEntry.NAME_KEY, null), 27);
                AbstractC19690f.f62379b = c13711h3;
                c13711h = c13711h3;
            } catch (Exception unused2) {
                AbstractC19690f.f62379b = c13711h2;
                c13711h = c13711h2;
            }
        }
        if (c13711h != c13711h2 && (method = (Method) c13711h.f43259Z) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c13711h.f43260o0) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c13711h.f43261p0;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM20655c = interfaceC19689e.m20655c();
        } else {
            strM20655c = str + '/' + interfaceC19689e.m20655c();
        }
        return new StackTraceElement(strM20655c, interfaceC19689e.m20658m(), interfaceC19689e.m20656f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        InterfaceC18770c<Object> interfaceC18770c = this;
        while (true) {
            AbstractC19685a abstractC19685a = (AbstractC19685a) interfaceC18770c;
            InterfaceC18770c<Object> interfaceC18770c2 = abstractC19685a.completion;
            AbstractC16544l.m18091d(interfaceC18770c2);
            try {
                obj = abstractC19685a.invokeSuspend(obj);
                if (obj == EnumC19250a.f61036Y) {
                    return;
                }
            } catch (Throwable th2) {
                obj = AbstractC9233X.m9806b(th2);
            }
            abstractC19685a.releaseIntercepted();
            if (!(interfaceC18770c2 instanceof AbstractC19685a)) {
                interfaceC18770c2.resumeWith(obj);
                return;
            }
            interfaceC18770c = interfaceC18770c2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> completion) {
        AbstractC16544l.m18094g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
