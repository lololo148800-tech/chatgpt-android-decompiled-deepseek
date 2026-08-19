package p1048uo;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import p1068vo.C20652b;
import p1068vo.C20656f;
import p1068vo.C20658h;
import p1068vo.C20659i;
import p1068vo.C20661k;
import p1068vo.C20663m;
import p1068vo.C20665o;
import p1068vo.InterfaceC20664n;
import p1136yo.C21559a;
import p1136yo.InterfaceC21562d;
import p523V9.AbstractC8152n6;
import p885m4.C17152b;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: uo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C20396c extends C20407n {

    /* JADX INFO: renamed from: e */
    public static final boolean f64506e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f64507c;

    /* JADX INFO: renamed from: d */
    public final C20659i f64508d;

    static {
        boolean z6 = false;
        if (C17152b.m18912i() && Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f64506e = z6;
    }

    public C20396c() throws NoSuchMethodException {
        C20665o c20665o;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c20665o = new C20665o(cls);
        } catch (Exception e10) {
            C20407n.f64525a.getClass();
            C20407n.m21074i("unable to load android socket classes", 5, e10);
            c20665o = null;
        }
        ArrayList arrayListM19315v = AbstractC17678l.m19315v(new InterfaceC20664n[]{c20665o, new C20663m(C20656f.f65534f), new C20663m(C20661k.f65544a), new C20663m(C20658h.f65540a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM19315v) {
            if (((InterfaceC20664n) obj).mo21202b()) {
                arrayList.add(obj);
            }
        }
        this.f64507c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f64508d = new C20659i(method3, method, method2);
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: b */
    public final AbstractC8152n6 mo21050b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C20652b c20652b = x509TrustManagerExtensions != null ? new C20652b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c20652b != null ? c20652b : new C21559a(mo21055c(x509TrustManager));
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: c */
    public final InterfaceC21562d mo21055c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C20395b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo21055c(x509TrustManager);
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        AbstractC16544l.m18094g(protocols, "protocols");
        Iterator it = this.f64507c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC20664n) next).mo21201a(sSLSocket));
        InterfaceC20664n interfaceC20664n = (InterfaceC20664n) next;
        if (interfaceC20664n != null) {
            interfaceC20664n.mo21204d(sSLSocket, str, protocols);
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: e */
    public final void mo21056e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC16544l.m18094g(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f64507c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC20664n) next).mo21201a(sSLSocket));
        InterfaceC20664n interfaceC20664n = (InterfaceC20664n) next;
        if (interfaceC20664n != null) {
            return interfaceC20664n.mo21203c(sSLSocket);
        }
        return null;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: g */
    public final Object mo21057g() {
        C20659i c20659i = this.f64508d;
        c20659i.getClass();
        Method method = (Method) c20659i.f65541a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = (Method) c20659i.f65542b;
            AbstractC16544l.m18091d(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: h */
    public final boolean mo21053h(String hostname) {
        AbstractC16544l.m18094g(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: k */
    public final void mo21058k(Object obj, String message) {
        AbstractC16544l.m18094g(message, "message");
        C20659i c20659i = this.f64508d;
        c20659i.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c20659i.f65543c;
                AbstractC16544l.m18091d(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C20407n.m21075j(this, message, 5, 4);
    }
}
