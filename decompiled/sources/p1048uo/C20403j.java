package p1048uo;

import cn.UfGr.EhBykzn;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16544l;
import mo.EnumC17357x;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: uo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C20403j extends C20407n {

    /* JADX INFO: renamed from: c */
    public final Method f64517c;

    /* JADX INFO: renamed from: d */
    public final Method f64518d;

    /* JADX INFO: renamed from: e */
    public final Method f64519e;

    /* JADX INFO: renamed from: f */
    public final Class f64520f;

    /* JADX INFO: renamed from: g */
    public final Class f64521g;

    public C20403j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f64517c = method;
        this.f64518d = method2;
        this.f64519e = method3;
        this.f64520f = cls;
        this.f64521g = cls2;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: a */
    public final void mo21069a(SSLSocket sSLSocket) {
        try {
            this.f64519e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC17357x) obj) != EnumC17357x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC17357x) it.next()).f55378Y);
        }
        try {
            this.f64517c.invoke(null, sSLSocket, Proxy.newProxyInstance(C20407n.class.getClassLoader(), new Class[]{this.f64520f, this.f64521g}, new C20402i(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f64518d.invoke(null, sSLSocket));
            AbstractC16544l.m18092e(invocationHandler, EhBykzn.FHsD);
            C20402i c20402i = (C20402i) invocationHandler;
            boolean z6 = c20402i.f64515b;
            if (!z6 && c20402i.f64516c == null) {
                C20407n.m21075j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z6) {
                return null;
            }
            return c20402i.f64516c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
