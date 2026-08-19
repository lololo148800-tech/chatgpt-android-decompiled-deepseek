package p974qo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import co.C11801B;
import io.sentry.android.replay.capture.C15272c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17326C;
import mo.C17327D;
import mo.C17330G;
import mo.C17334a;
import mo.C17339f;
import mo.C17343j;
import mo.C17347n;
import mo.C17349p;
import mo.C17356w;
import mo.C17358y;
import mo.EnumC17357x;
import no.AbstractC17708b;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0665N;
import p026Ao.C0678l;
import p1048uo.C20407n;
import p1113xn.AbstractC21323q;
import p1136yo.C21561c;
import p178H.C3179x;
import p228J.C3847l0;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9264c0;
import p571X9.AbstractC9276e0;
import p571X9.AbstractC9300i0;
import p604Yk.C10077b;
import p615Z6.C10252z0;
import p791hj.C14522e;
import p887m7.C17176b;
import p888m8.C17198c;
import p909nm.AbstractC17680n;
import p950po.C18528b;
import p950po.C18530d;
import p959q8.C18639a;
import ro.C19261e;
import ro.InterfaceC19259c;
import so.C19699d;
import to.AbstractC20014e;
import to.AbstractC20016g;
import to.C20022m;
import to.C20023n;
import to.C20030u;
import to.C20031v;
import to.C20034y;

/* JADX INFO: renamed from: qo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C18795k extends AbstractC20016g {

    /* JADX INFO: renamed from: b */
    public final C17330G f59739b;

    /* JADX INFO: renamed from: c */
    public Socket f59740c;

    /* JADX INFO: renamed from: d */
    public Socket f59741d;

    /* JADX INFO: renamed from: e */
    public C17347n f59742e;

    /* JADX INFO: renamed from: f */
    public EnumC17357x f59743f;

    /* JADX INFO: renamed from: g */
    public C20022m f59744g;

    /* JADX INFO: renamed from: h */
    public C0657F f59745h;

    /* JADX INFO: renamed from: i */
    public C0656E f59746i;

    /* JADX INFO: renamed from: j */
    public boolean f59747j;

    /* JADX INFO: renamed from: k */
    public boolean f59748k;

    /* JADX INFO: renamed from: l */
    public int f59749l;

    /* JADX INFO: renamed from: m */
    public int f59750m;

    /* JADX INFO: renamed from: n */
    public int f59751n;

    /* JADX INFO: renamed from: o */
    public int f59752o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f59753p;

    /* JADX INFO: renamed from: q */
    public long f59754q;

    public C18795k(C3179x connectionPool, C17330G route) {
        AbstractC16544l.m18094g(connectionPool, "connectionPool");
        AbstractC16544l.m18094g(route, "route");
        this.f59739b = route;
        this.f59752o = 1;
        this.f59753p = new ArrayList();
        this.f59754q = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static void m20069d(C17356w client, C17330G failedRoute, IOException failure) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(failedRoute, "failedRoute");
        AbstractC16544l.m18094g(failure, "failure");
        if (failedRoute.f55192b.type() != Proxy.Type.DIRECT) {
            C17334a c17334a = failedRoute.f55191a;
            c17334a.f55208h.connectFailed(c17334a.f55209i.m19028i(), failedRoute.f55192b.address(), failure);
        }
        C10077b c10077b = client.f55356N0;
        synchronized (c10077b) {
            ((LinkedHashSet) c10077b.f29833Z).add(failedRoute);
        }
    }

    @Override // to.AbstractC20016g
    /* JADX INFO: renamed from: a */
    public final synchronized void mo20070a(C20022m connection, C20034y settings) {
        AbstractC16544l.m18094g(connection, "connection");
        AbstractC16544l.m18094g(settings, "settings");
        this.f59752o = (settings.f63452a & 16) != 0 ? settings.f63453b[4] : Integer.MAX_VALUE;
    }

    @Override // to.AbstractC20016g
    /* JADX INFO: renamed from: b */
    public final void mo20071b(C20030u c20030u) {
        c20030u.m20836c(8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m20072c(int i10, int i11, int i12, boolean z6, C18792h call) throws Throwable {
        AbstractC16544l.m18094g(call, "call");
        if (this.f59743f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f59739b.f55191a.f55211k;
        C11801B c11801b = new C11801B(list);
        C17334a c17334a = this.f59739b.f55191a;
        if (c17334a.f55203c == null) {
            if (!list.contains(C17343j.f55258g)) {
                throw new C18796l(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f59739b.f55191a.f55209i.f55289d;
            C20407n c20407n = C20407n.f64525a;
            if (!C20407n.f64525a.mo21053h(str)) {
                throw new C18796l(new UnknownServiceException(AbstractC10763a.m11054l("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c17334a.f55210j.contains(EnumC17357x.H2_PRIOR_KNOWLEDGE)) {
            throw new C18796l(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C18796l c18796l = null;
        while (true) {
            try {
                C17330G c17330g = this.f59739b;
                if (c17330g.f55191a.f55203c != null && c17330g.f55192b.type() == Proxy.Type.HTTP) {
                    m20074f(i10, i11, i12, call);
                    if (this.f59740c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m20073e(i10, i11, call);
                m20075g(c11801b, call);
                InetSocketAddress inetSocketAddress = this.f59739b.f55193c;
                AbstractC16544l.m18094g(inetSocketAddress, "inetSocketAddress");
                break;
            } catch (IOException e10) {
                Socket socket = this.f59741d;
                if (socket != null) {
                    AbstractC17708b.m19413e(socket);
                }
                Socket socket2 = this.f59740c;
                if (socket2 != null) {
                    AbstractC17708b.m19413e(socket2);
                }
                this.f59741d = null;
                this.f59740c = null;
                this.f59745h = null;
                this.f59746i = null;
                this.f59742e = null;
                this.f59743f = null;
                this.f59744g = null;
                this.f59752o = 1;
                InetSocketAddress inetSocketAddress2 = this.f59739b.f55193c;
                AbstractC16544l.m18094g(inetSocketAddress2, "inetSocketAddress");
                if (c18796l == null) {
                    c18796l = new C18796l(e10);
                } else {
                    AbstractC9221V.m9789a(c18796l.f59755Y, e10);
                    c18796l.f59756Z = e10;
                }
                if (!z6) {
                    throw c18796l;
                }
                c11801b.f35772c = true;
                if (!c11801b.f35771b) {
                    throw c18796l;
                }
                if (e10 instanceof ProtocolException) {
                    throw c18796l;
                }
                if (e10 instanceof InterruptedIOException) {
                    throw c18796l;
                }
                if ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                    throw c18796l;
                }
                if (e10 instanceof SSLPeerUnverifiedException) {
                    throw c18796l;
                }
                if (!(e10 instanceof SSLException)) {
                    throw c18796l;
                }
            }
        }
        C17330G c17330g2 = this.f59739b;
        if (c17330g2.f55191a.f55203c != null && c17330g2.f55192b.type() == Proxy.Type.HTTP && this.f59740c == null) {
            throw new C18796l(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f59754q = System.nanoTime();
    }

    /* JADX INFO: renamed from: e */
    public final void m20073e(int i10, int i11, C18792h call) throws IOException {
        Socket socketCreateSocket;
        C17330G c17330g = this.f59739b;
        Proxy proxy = c17330g.f55192b;
        C17334a c17334a = c17330g.f55191a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : AbstractC18793i.f59735a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c17334a.f55202b.createSocket();
            AbstractC16544l.m18091d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f59740c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f59739b.f55193c;
        AbstractC16544l.m18094g(call, "call");
        AbstractC16544l.m18094g(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            C20407n c20407n = C20407n.f64525a;
            C20407n.f64525a.mo21056e(socketCreateSocket, this.f59739b.f55193c, i10);
            try {
                this.f59745h = AbstractC0668b.m1403c(AbstractC0668b.m1411k(socketCreateSocket));
                this.f59746i = AbstractC0668b.m1402b(AbstractC0668b.m1409i(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC16544l.m18089b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f59739b.f55193c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20074f(int i10, int i11, int i12, C18792h c18792h) throws IOException {
        C14522e c14522e = new C14522e(3);
        C17330G c17330g = this.f59739b;
        C17349p url = c17330g.f55191a.f55209i;
        AbstractC16544l.m18094g(url, "url");
        c14522e.f45762Z = url;
        c14522e.m16028v("CONNECT", null);
        C17334a c17334a = c17330g.f55191a;
        c14522e.m16024r("Host", AbstractC17708b.m19432x(c17334a.f55209i, true));
        c14522e.m16024r("Proxy-Connection", "Keep-Alive");
        c14522e.m16024r(SIPHeaderNames.USER_AGENT, "okhttp/4.12.0");
        C17358y c17358yM16017i = c14522e.m16017i();
        C3847l0 c3847l0 = new C3847l0(3);
        AbstractC9276e0.m9845b(SIPHeaderNames.PROXY_AUTHENTICATE);
        AbstractC9276e0.m9846c("OkHttp-Preemptive", SIPHeaderNames.PROXY_AUTHENTICATE);
        c3847l0.m4582i(SIPHeaderNames.PROXY_AUTHENTICATE);
        c3847l0.m4575b(SIPHeaderNames.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
        c3847l0.m4577d();
        c17334a.f55206f.getClass();
        m20073e(i10, i11, c18792h);
        String str = "CONNECT " + AbstractC17708b.m19432x(c17358yM16017i.f55379a, true) + " HTTP/1.1";
        C0657F c0657f = this.f59745h;
        AbstractC16544l.m18091d(c0657f);
        C0656E c0656e = this.f59746i;
        AbstractC16544l.m18091d(c0656e);
        C17198c c17198c = new C17198c(null, this, c0657f, c0656e);
        C0665N c0665nMo1326h = c0657f.f1921Y.mo1326h();
        long j10 = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0665nMo1326h.mo1389g(j10, timeUnit);
        c0656e.f1918Y.mo1335h().mo1389g(i12, timeUnit);
        c17198c.m18941n(c17358yM16017i.f55381c, str);
        c17198c.mo18928a();
        C17326C c17326cMo18932e = c17198c.mo18932e(false);
        AbstractC16544l.m18091d(c17326cMo18932e);
        c17326cMo18932e.f55160a = c17358yM16017i;
        C17327D c17327dM18984a = c17326cMo18932e.m18984a();
        long jM19420l = AbstractC17708b.m19420l(c17327dM18984a);
        if (jM19420l != -1) {
            C19699d c19699dM18937j = c17198c.m18937j(jM19420l);
            AbstractC17708b.m19430v(c19699dM18937j, Integer.MAX_VALUE, timeUnit);
            c19699dM18937j.close();
        }
        int i13 = c17327dM18984a.f55176p0;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(AbstractC10763a.m11048f(i13, "Unexpected response code for CONNECT: "));
            }
            c17334a.f55206f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c0657f.f1922Z.mo1356g() || !c0656e.f1919Z.mo1356g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public final void m20075g(C11801B c11801b, C18792h call) throws Throwable {
        C17334a c17334a = this.f59739b.f55191a;
        SSLSocketFactory sSLSocketFactory = c17334a.f55203c;
        EnumC17357x enumC17357xM9878a = EnumC17357x.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c17334a.f55210j;
            EnumC17357x enumC17357x = EnumC17357x.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC17357x)) {
                this.f59741d = this.f59740c;
                this.f59743f = enumC17357xM9878a;
                return;
            } else {
                this.f59741d = this.f59740c;
                this.f59743f = enumC17357x;
                m20081m();
                return;
            }
        }
        AbstractC16544l.m18094g(call, "call");
        C17334a c17334a2 = this.f59739b.f55191a;
        SSLSocketFactory sSLSocketFactory2 = c17334a2.f55203c;
        SSLSocket sSLSocket = null;
        String strMo21052f = null;
        try {
            AbstractC16544l.m18091d(sSLSocketFactory2);
            Socket socket = this.f59740c;
            C17349p c17349p = c17334a2.f55209i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c17349p.f55289d, c17349p.f55290e, true);
            AbstractC16544l.m18092e(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C17343j c17343jM13064b = c11801b.m13064b(sSLSocket2);
                if (c17343jM13064b.f55260b) {
                    C20407n c20407n = C20407n.f64525a;
                    C20407n.f64525a.mo21051d(sSLSocket2, c17334a2.f55209i.f55289d, c17334a2.f55210j);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                AbstractC16544l.m18093f(sslSocketSession, "sslSocketSession");
                C17347n c17347nM9839b = AbstractC9264c0.m9839b(sslSocketSession);
                HostnameVerifier hostnameVerifier = c17334a2.f55204d;
                AbstractC16544l.m18091d(hostnameVerifier);
                if (hostnameVerifier.verify(c17334a2.f55209i.f55289d, sslSocketSession)) {
                    C17339f c17339f = c17334a2.f55205e;
                    AbstractC16544l.m18091d(c17339f);
                    this.f59742e = new C17347n(c17347nM9839b.f55280a, c17347nM9839b.f55281b, c17347nM9839b.f55282c, new C15272c(c17339f, c17347nM9839b, c17334a2, 18));
                    c17339f.m19000a(c17334a2.f55209i.f55289d, new C17176b(this, 11));
                    if (c17343jM13064b.f55260b) {
                        C20407n c20407n2 = C20407n.f64525a;
                        strMo21052f = C20407n.f64525a.mo21052f(sSLSocket2);
                    }
                    this.f59741d = sSLSocket2;
                    this.f59745h = AbstractC0668b.m1403c(AbstractC0668b.m1411k(sSLSocket2));
                    this.f59746i = AbstractC0668b.m1402b(AbstractC0668b.m1409i(sSLSocket2));
                    if (strMo21052f != null) {
                        enumC17357xM9878a = AbstractC9300i0.m9878a(strMo21052f);
                    }
                    this.f59743f = enumC17357xM9878a;
                    C20407n c20407n3 = C20407n.f64525a;
                    C20407n.f64525a.mo21069a(sSLSocket2);
                    if (this.f59743f == EnumC17357x.HTTP_2) {
                        m20081m();
                        return;
                    }
                    return;
                }
                List listM19011a = c17347nM9839b.m19011a();
                if (listM19011a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c17334a2.f55209i.f55289d + " not verified (no certificates)");
                }
                Object obj = listM19011a.get(0);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(c17334a2.f55209i.f55289d);
                sb2.append(" not verified:\n              |    certificate: ");
                C17339f c17339f2 = C17339f.f55229c;
                StringBuilder sb3 = new StringBuilder("sha256/");
                C0678l c0678l = C0678l.f1971p0;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                AbstractC16544l.m18093f(encoded, "publicKey.encoded");
                sb3.append(C18639a.m19998t(encoded, 0, -1234567890).mo1371c("SHA-256").mo1370a());
                sb2.append(sb3.toString());
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(AbstractC17680n.m19361k0(C21561c.m21844a(x509Certificate, 2), C21561c.m21844a(x509Certificate, 7)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC21323q.m21718e(sb2.toString()));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C20407n c20407n4 = C20407n.f64525a;
                    C20407n.f64525a.mo21069a(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC17708b.m19413e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m20076h() {
        this.f59750m++;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m20077i(C17334a c17334a, List list) {
        C17347n c17347n;
        byte[] bArr = AbstractC17708b.f56536a;
        if (this.f59753p.size() < this.f59752o && !this.f59747j) {
            C17330G c17330g = this.f59739b;
            if (!c17330g.f55191a.m18992a(c17334a)) {
                return false;
            }
            C17349p c17349p = c17334a.f55209i;
            String str = c17349p.f55289d;
            C17334a c17334a2 = c17330g.f55191a;
            if (AbstractC16544l.m18089b(str, c17334a2.f55209i.f55289d)) {
                return true;
            }
            if (this.f59744g != null && list != null) {
                List<C17330G> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (C17330G c17330g2 : list2) {
                        Proxy.Type type = c17330g2.f55192b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c17330g.f55192b.type() == type2) {
                            if (AbstractC16544l.m18089b(c17330g.f55193c, c17330g2.f55193c)) {
                                if (c17334a.f55204d == C21561c.f68277a) {
                                    byte[] bArr2 = AbstractC17708b.f56536a;
                                    C17349p c17349p2 = c17334a2.f55209i;
                                    if (c17349p.f55290e != c17349p2.f55290e) {
                                        break;
                                    }
                                    String str2 = c17349p2.f55289d;
                                    String hostname = c17349p.f55289d;
                                    if (!AbstractC16544l.m18089b(hostname, str2)) {
                                        if (!this.f59748k && (c17347n = this.f59742e) != null) {
                                            List listM19011a = c17347n.m19011a();
                                            if (listM19011a.isEmpty()) {
                                                break;
                                            }
                                            Object obj = listM19011a.get(0);
                                            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!C21561c.m21846c(hostname, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    try {
                                        C17339f c17339f = c17334a.f55205e;
                                        AbstractC16544l.m18091d(c17339f);
                                        C17347n c17347n2 = this.f59742e;
                                        AbstractC16544l.m18091d(c17347n2);
                                        List peerCertificates = c17347n2.m19011a();
                                        AbstractC16544l.m18094g(hostname, "hostname");
                                        AbstractC16544l.m18094g(peerCertificates, "peerCertificates");
                                        c17339f.m19000a(hostname, new C15272c(c17339f, peerCertificates, hostname, 12));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                        break;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m20078j(boolean z6) {
        long j10;
        byte[] bArr = AbstractC17708b.f56536a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f59740c;
        AbstractC16544l.m18091d(socket);
        Socket socket2 = this.f59741d;
        AbstractC16544l.m18091d(socket2);
        C0657F c0657f = this.f59745h;
        AbstractC16544l.m18091d(c0657f);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C20022m c20022m = this.f59744g;
        if (c20022m != null) {
            return c20022m.m20822k(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f59754q;
        }
        if (j10 < 10000000000L || !z6) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !c0657f.mo1356g();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC19259c m20079k(C17356w client, C19261e c19261e) {
        AbstractC16544l.m18094g(client, "client");
        Socket socket = this.f59741d;
        AbstractC16544l.m18091d(socket);
        C0657F c0657f = this.f59745h;
        AbstractC16544l.m18091d(c0657f);
        C0656E c0656e = this.f59746i;
        AbstractC16544l.m18091d(c0656e);
        C20022m c20022m = this.f59744g;
        if (c20022m != null) {
            return new C20023n(client, this, c19261e, c20022m);
        }
        int i10 = c19261e.f61059g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0657f.f1921Y.mo1326h().mo1389g(i10, timeUnit);
        c0656e.f1918Y.mo1335h().mo1389g(c19261e.f61060h, timeUnit);
        return new C17198c(client, this, c0657f, c0656e);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m20080l() {
        this.f59747j = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m20081m() throws SocketException {
        Socket socket = this.f59741d;
        AbstractC16544l.m18091d(socket);
        C0657F c0657f = this.f59745h;
        AbstractC16544l.m18091d(c0657f);
        C0656E c0656e = this.f59746i;
        AbstractC16544l.m18091d(c0656e);
        socket.setSoTimeout(0);
        C18530d taskRunner = C18530d.f59039h;
        AbstractC16544l.m18094g(taskRunner, "taskRunner");
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30454Y = taskRunner;
        c10252z0.f30459r0 = AbstractC20016g.f63354a;
        String peerName = this.f59739b.f55191a.f55209i.f55289d;
        AbstractC16544l.m18094g(peerName, "peerName");
        c10252z0.f30455Z = socket;
        String str = AbstractC17708b.f56542g + ' ' + peerName;
        AbstractC16544l.m18094g(str, "<set-?>");
        c10252z0.f30456o0 = str;
        c10252z0.f30457p0 = c0657f;
        c10252z0.f30458q0 = c0656e;
        c10252z0.f30459r0 = this;
        C20022m c20022m = new C20022m(c10252z0);
        this.f59744g = c20022m;
        C20034y c20034y = C20022m.f63373L0;
        this.f59752o = (c20034y.f63452a & 16) != 0 ? c20034y.f63453b[4] : Integer.MAX_VALUE;
        C20031v c20031v = c20022m.f63382I0;
        synchronized (c20031v) {
            try {
                if (c20031v.f63446p0) {
                    throw new IOException("closed");
                }
                Logger logger = C20031v.f63442r0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC17708b.m19418j(">> CONNECTION " + AbstractC20014e.f63350a.mo1373e(), new Object[0]));
                }
                c20031v.f63443Y.mo1332b0(AbstractC20014e.f63350a);
                c20031v.f63443Y.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c20022m.f63382I0.m20849T(c20022m.f63375B0);
        int iM20855a = c20022m.f63375B0.m20855a();
        if (iM20855a != 65535) {
            c20022m.f63382I0.m20850W(0, iM20855a - 65535);
        }
        taskRunner.m19897e().m19890c(new C18528b(c20022m.f63387o0, 0, c20022m.f63383J0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        C17330G c17330g = this.f59739b;
        sb2.append(c17330g.f55191a.f55209i.f55289d);
        sb2.append(':');
        sb2.append(c17330g.f55191a.f55209i.f55290e);
        sb2.append(", proxy=");
        sb2.append(c17330g.f55192b);
        sb2.append(" hostAddress=");
        sb2.append(c17330g.f55193c);
        sb2.append(" cipherSuite=");
        C17347n c17347n = this.f59742e;
        if (c17347n == null || (obj = c17347n.f55281b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f59743f);
        sb2.append('}');
        return sb2.toString();
    }
}
