package p298Lm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p109E3.C2292p;
import p544W9.AbstractC8513L3;
import p544W9.AbstractC8559T2;

/* JADX INFO: renamed from: Lm.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5173e0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16853Y;

    /* JADX INFO: renamed from: Z */
    public final C5177g0 f16854Z;

    public /* synthetic */ C5173e0(C5177g0 c5177g0, int i10) {
        this.f16853Y = i10;
        this.f16854Z = c5177g0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws C2292p {
        C5177g0 c5177g0 = this.f16854Z;
        switch (this.f16853Y) {
            case 0:
                return new C5175f0(c5177g0);
            default:
                Object objM5756q = c5177g0.m5756q();
                try {
                    Object obj = AbstractC5203t0.f16909y0;
                    Object objM9174b = c5177g0.mo5739p() ? AbstractC8513L3.m9174b(c5177g0.f16913v0, c5177g0.mo5738m()) : null;
                    if (objM9174b == obj) {
                        objM9174b = null;
                    }
                    c5177g0.mo5739p();
                    AccessibleObject accessibleObject = objM5756q instanceof AccessibleObject ? (AccessibleObject) objM5756q : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(AbstractC8559T2.m9218a(c5177g0));
                    }
                    if (objM5756q == null) {
                        return null;
                    }
                    if (objM5756q instanceof Field) {
                        return ((Field) objM5756q).get(objM9174b);
                    }
                    if (!(objM5756q instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objM5756q + " neither field nor method");
                    }
                    int length = ((Method) objM5756q).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objM5756q).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objM5756q;
                        if (objM9174b == null) {
                            Class<?> cls = ((Method) objM5756q).getParameterTypes()[0];
                            AbstractC16544l.m18093f(cls, "get(...)");
                            objM9174b = AbstractC5147J0.m5717e(cls);
                        }
                        return method.invoke(null, objM9174b);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objM5756q;
                        Class<?> cls2 = ((Method) objM5756q).getParameterTypes()[1];
                        AbstractC16544l.m18093f(cls2, "get(...)");
                        return method2.invoke(null, objM9174b, AbstractC5147J0.m5717e(cls2));
                    }
                    throw new AssertionError("delegate method " + objM5756q + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e10) {
                    throw new C2292p("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e10);
                }
        }
    }
}
