package mo;

import io.sentry.clientreport.C15333a;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p1036u9.C20168n;
import p1048uo.C20407n;
import p1092wo.C21037a;
import p1136yo.C21561c;
import p1159zo.C22221g;
import p117Eb.C2391u;
import p523V9.AbstractC8152n6;
import p571X9.AbstractC9147I2;
import p604Yk.C10077b;
import p791hj.C14522e;
import p849k7.C16349b;
import p909nm.AbstractC17686t;
import p950po.C18530d;
import p974qo.C18792h;

/* JADX INFO: renamed from: mo.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C17356w implements Cloneable, InterfaceC17337d, InterfaceC17332I {

    /* JADX INFO: renamed from: O0 */
    public static final List f55341O0 = AbstractC17708b.m19421m(EnumC17357x.HTTP_2, EnumC17357x.HTTP_1_1);

    /* JADX INFO: renamed from: P0 */
    public static final List f55342P0 = AbstractC17708b.m19421m(C17343j.f55257f, C17343j.f55258g);

    /* JADX INFO: renamed from: A0 */
    public final SocketFactory f55343A0;

    /* JADX INFO: renamed from: B0 */
    public final SSLSocketFactory f55344B0;

    /* JADX INFO: renamed from: C0 */
    public final X509TrustManager f55345C0;

    /* JADX INFO: renamed from: D0 */
    public final List f55346D0;

    /* JADX INFO: renamed from: E0 */
    public final List f55347E0;

    /* JADX INFO: renamed from: F0 */
    public final C21561c f55348F0;

    /* JADX INFO: renamed from: G0 */
    public final C17339f f55349G0;

    /* JADX INFO: renamed from: H0 */
    public final AbstractC8152n6 f55350H0;

    /* JADX INFO: renamed from: I0 */
    public final int f55351I0;

    /* JADX INFO: renamed from: J0 */
    public final int f55352J0;

    /* JADX INFO: renamed from: K0 */
    public final int f55353K0;

    /* JADX INFO: renamed from: L0 */
    public final int f55354L0;

    /* JADX INFO: renamed from: M0 */
    public final long f55355M0;

    /* JADX INFO: renamed from: N0 */
    public final C10077b f55356N0;

    /* JADX INFO: renamed from: Y */
    public final C2391u f55357Y;

    /* JADX INFO: renamed from: Z */
    public final C15333a f55358Z;

    /* JADX INFO: renamed from: o0 */
    public final List f55359o0;

    /* JADX INFO: renamed from: p0 */
    public final List f55360p0;

    /* JADX INFO: renamed from: q0 */
    public final C16349b f55361q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f55362r0;

    /* JADX INFO: renamed from: s0 */
    public final C17335b f55363s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f55364t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f55365u0;

    /* JADX INFO: renamed from: v0 */
    public final C17335b f55366v0;

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC17345l f55367w0;

    /* JADX INFO: renamed from: x0 */
    public final Proxy f55368x0;

    /* JADX INFO: renamed from: y0 */
    public final ProxySelector f55369y0;

    /* JADX INFO: renamed from: z0 */
    public final C17335b f55370z0;

    public C17356w(C17355v c17355v) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f55357Y = c17355v.f55315a;
        this.f55358Z = c17355v.f55316b;
        this.f55359o0 = AbstractC17708b.m19433y(c17355v.f55317c);
        this.f55360p0 = AbstractC17708b.m19433y(c17355v.f55318d);
        this.f55361q0 = c17355v.f55319e;
        this.f55362r0 = c17355v.f55320f;
        this.f55363s0 = c17355v.f55321g;
        this.f55364t0 = c17355v.f55322h;
        this.f55365u0 = c17355v.f55323i;
        this.f55366v0 = c17355v.f55324j;
        this.f55367w0 = c17355v.f55325k;
        Proxy proxy = c17355v.f55326l;
        this.f55368x0 = proxy;
        if (proxy != null) {
            proxySelector = C21037a.f66919a;
        } else {
            proxySelector = c17355v.f55327m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C21037a.f66919a;
            }
        }
        this.f55369y0 = proxySelector;
        this.f55370z0 = c17355v.f55328n;
        this.f55343A0 = c17355v.f55329o;
        List list = c17355v.f55332r;
        this.f55346D0 = list;
        this.f55347E0 = c17355v.f55333s;
        this.f55348F0 = c17355v.f55334t;
        this.f55351I0 = c17355v.f55337w;
        this.f55352J0 = c17355v.f55338x;
        this.f55353K0 = c17355v.f55339y;
        this.f55354L0 = c17355v.f55340z;
        this.f55355M0 = c17355v.f55313A;
        C10077b c10077b = c17355v.f55314B;
        this.f55356N0 = c10077b == null ? new C10077b(18) : c10077b;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f55344B0 = null;
                    this.f55350H0 = null;
                    this.f55345C0 = null;
                    this.f55349G0 = C17339f.f55229c;
                    break;
                }
                if (((C17343j) it.next()).f55259a) {
                    SSLSocketFactory sSLSocketFactory = c17355v.f55330p;
                    if (sSLSocketFactory == null) {
                        C20407n c20407n = C20407n.f64525a;
                        X509TrustManager x509TrustManagerMo21065n = C20407n.f64525a.mo21065n();
                        this.f55345C0 = x509TrustManagerMo21065n;
                        this.f55344B0 = C20407n.f64525a.mo21068m(x509TrustManagerMo21065n);
                        AbstractC8152n6 abstractC8152n6Mo21050b = C20407n.f64525a.mo21050b(x509TrustManagerMo21065n);
                        this.f55350H0 = abstractC8152n6Mo21050b;
                        C17339f c17339f = c17355v.f55335u;
                        c17339f.getClass();
                        this.f55349G0 = AbstractC16544l.m18089b(c17339f.f55231b, abstractC8152n6Mo21050b) ? c17339f : new C17339f(c17339f.f55230a, abstractC8152n6Mo21050b);
                        break;
                    }
                    this.f55344B0 = sSLSocketFactory;
                    AbstractC8152n6 abstractC8152n6 = c17355v.f55336v;
                    AbstractC16544l.m18091d(abstractC8152n6);
                    this.f55350H0 = abstractC8152n6;
                    X509TrustManager x509TrustManager = c17355v.f55331q;
                    AbstractC16544l.m18091d(x509TrustManager);
                    this.f55345C0 = x509TrustManager;
                    C17339f c17339f2 = c17355v.f55335u;
                    c17339f2.getClass();
                    this.f55349G0 = AbstractC16544l.m18089b(c17339f2.f55231b, abstractC8152n6) ? c17339f2 : new C17339f(c17339f2.f55230a, abstractC8152n6);
                    break;
                }
            }
        } else {
            this.f55344B0 = null;
            this.f55350H0 = null;
            this.f55345C0 = null;
            this.f55349G0 = C17339f.f55229c;
            break;
        }
        List list3 = this.f55359o0;
        AbstractC16544l.m18092e(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List list4 = this.f55360p0;
        AbstractC16544l.m18092e(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list5 = this.f55346D0;
        boolean z6 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f55345C0;
        AbstractC8152n6 abstractC8152n7 = this.f55350H0;
        SSLSocketFactory sSLSocketFactory2 = this.f55344B0;
        if (!z6 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C17343j) it2.next()).f55259a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC8152n7 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC8152n7 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC16544l.m18089b(this.f55349G0, C17339f.f55229c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C17355v m19034a() {
        C17355v c17355v = new C17355v();
        c17355v.f55315a = this.f55357Y;
        c17355v.f55316b = this.f55358Z;
        AbstractC17686t.m19398v(this.f55359o0, c17355v.f55317c);
        AbstractC17686t.m19398v(this.f55360p0, c17355v.f55318d);
        c17355v.f55319e = this.f55361q0;
        c17355v.f55320f = this.f55362r0;
        c17355v.f55321g = this.f55363s0;
        c17355v.f55322h = this.f55364t0;
        c17355v.f55323i = this.f55365u0;
        c17355v.f55324j = this.f55366v0;
        c17355v.f55325k = this.f55367w0;
        c17355v.f55326l = this.f55368x0;
        c17355v.f55327m = this.f55369y0;
        c17355v.f55328n = this.f55370z0;
        c17355v.f55329o = this.f55343A0;
        c17355v.f55330p = this.f55344B0;
        c17355v.f55331q = this.f55345C0;
        c17355v.f55332r = this.f55346D0;
        c17355v.f55333s = this.f55347E0;
        c17355v.f55334t = this.f55348F0;
        c17355v.f55335u = this.f55349G0;
        c17355v.f55336v = this.f55350H0;
        c17355v.f55337w = this.f55351I0;
        c17355v.f55338x = this.f55352J0;
        c17355v.f55339y = this.f55353K0;
        c17355v.f55340z = this.f55354L0;
        c17355v.f55313A = this.f55355M0;
        c17355v.f55314B = this.f55356N0;
        return c17355v;
    }

    /* JADX INFO: renamed from: b */
    public final C18792h m19035b(C17358y request) {
        AbstractC16544l.m18094g(request, "request");
        return new C18792h(this, request, false);
    }

    /* JADX INFO: renamed from: c */
    public final C22221g m19036c(C17358y request, AbstractC9147I2 listener) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(listener, "listener");
        C22221g c22221g = new C22221g(C18530d.f59039h, request, listener, new Random(), 0, this.f55355M0);
        if (request.f55381c.m19012f("Sec-WebSocket-Extensions") != null) {
            c22221g.m22407c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            C17355v c17355vM19034a = m19034a();
            byte[] bArr = AbstractC17708b.f56536a;
            c17355vM19034a.f55319e = new C16349b(12);
            c17355vM19034a.m19032b(C22221g.f70416w);
            C17356w c17356w = new C17356w(c17355vM19034a);
            C14522e c14522eM19038b = request.m19038b();
            c14522eM19038b.m16024r("Upgrade", "websocket");
            c14522eM19038b.m16024r("Connection", "Upgrade");
            c14522eM19038b.m16024r("Sec-WebSocket-Key", c22221g.f70422f);
            c14522eM19038b.m16024r("Sec-WebSocket-Version", "13");
            c14522eM19038b.m16024r("Sec-WebSocket-Extensions", "permessage-deflate");
            C17358y c17358yM16017i = c14522eM19038b.m16017i();
            C18792h c18792h = new C18792h(c17356w, c17358yM16017i, true);
            c22221g.f70423g = c18792h;
            c18792h.m20062d(new C20168n(c22221g, 6, c17358yM16017i));
        }
        return c22221g;
    }

    public final Object clone() {
        return super.clone();
    }

    public C17356w() {
        this(new C17355v());
    }
}
