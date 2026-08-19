package p1048uo;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import p1068vo.C20651a;
import p1068vo.C20652b;
import p1068vo.C20656f;
import p1068vo.C20658h;
import p1068vo.C20661k;
import p1068vo.C20663m;
import p1068vo.InterfaceC20664n;
import p1136yo.C21559a;
import p523V9.AbstractC8152n6;
import p885m4.C17152b;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: uo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20394a extends C20407n {

    /* JADX INFO: renamed from: d */
    public static final boolean f64502d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f64503c;

    static {
        f64502d = C17152b.m18912i() && Build.VERSION.SDK_INT >= 29;
    }

    public C20394a() {
        ArrayList arrayListM19315v = AbstractC17678l.m19315v(new InterfaceC20664n[]{(!C17152b.m18912i() || Build.VERSION.SDK_INT < 29) ? null : new C20651a(), new C20663m(C20656f.f65534f), new C20663m(C20661k.f65544a), new C20663m(C20658h.f65540a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM19315v) {
            if (((InterfaceC20664n) obj).mo21202b()) {
                arrayList.add(obj);
            }
        }
        this.f64503c = arrayList;
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
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        AbstractC16544l.m18094g(protocols, "protocols");
        Iterator it = this.f64503c.iterator();
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
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f64503c.iterator();
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
    /* JADX INFO: renamed from: h */
    public final boolean mo21053h(String hostname) {
        AbstractC16544l.m18094g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
