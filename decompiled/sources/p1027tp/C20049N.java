package p1027tp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p025An.C0624m;
import p132F2.C2643g;
import p299Ln.C5217b;
import p523V9.AbstractC8154o0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: tp.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C20049N implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final C20044I f63528a = C20044I.f63473c;

    /* JADX INFO: renamed from: b */
    public final Object[] f63529b = new Object[0];

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f63530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C20050O f63531d;

    public C20049N(C20050O c20050o, Class cls) {
        this.f63531d = c20050o;
        this.f63530c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C20071o c20071oM20912a;
        int i10 = 1;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f63529b;
        }
        C20044I c20044i = this.f63528a;
        if (c20044i.f63474a && method.isDefault()) {
            return c20044i.mo20860b(method, this.f63530c, obj, objArr);
        }
        C20050O c20050o = this.f63531d;
        C20071o c20071o = (C20071o) c20050o.f63532a.get(method);
        if (c20071o == null) {
            synchronized (c20050o.f63532a) {
                try {
                    c20071oM20912a = (C20071o) c20050o.f63532a.get(method);
                    if (c20071oM20912a == null) {
                        c20071oM20912a = C20071o.m20912a(c20050o, method);
                        c20050o.f63532a.put(method, c20071oM20912a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c20071o = c20071oM20912a;
        }
        C20077u c20077u = new C20077u(c20071o.f63563a, objArr, c20071o.f63564b, c20071o.f63565c);
        switch (c20071o.f63566d) {
            case 0:
                return c20071o.f63567e.mo10193C(c20077u);
            case 1:
                InterfaceC20059c interfaceC20059c = (InterfaceC20059c) c20071o.f63567e.mo10193C(c20077u);
                InterfaceC18770c interfaceC18770c = (InterfaceC18770c) objArr[objArr.length - 1];
                try {
                    C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
                    c0624m.m1264u(new C20073q(interfaceC20059c, 0));
                    interfaceC20059c.mo20893E(new C2643g(c0624m));
                    Object objM1261q = c0624m.m1261q();
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    return objM1261q;
                } catch (Exception e10) {
                    return AbstractC20056V.m20888n(e10, interfaceC18770c);
                }
            default:
                InterfaceC20059c interfaceC20059c2 = (InterfaceC20059c) c20071o.f63567e.mo10193C(c20077u);
                InterfaceC18770c interfaceC18770c2 = (InterfaceC18770c) objArr[objArr.length - 1];
                try {
                    C0624m c0624m2 = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c2));
                    c0624m2.m1264u(new C20073q(interfaceC20059c2, i10));
                    interfaceC20059c2.mo20893E(new C5217b(c0624m2));
                    Object objM1261q2 = c0624m2.m1261q();
                    EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                    return objM1261q2;
                } catch (Exception e11) {
                    return AbstractC20056V.m20888n(e11, interfaceC18770c2);
                }
        }
    }
}
