package p887m7;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import mo.C17326C;
import mo.C17327D;
import mo.C17328E;
import mo.C17330G;
import mo.C17334a;
import mo.C17335b;
import mo.C17339f;
import mo.C17348o;
import mo.C17349p;
import mo.C17352s;
import mo.C17354u;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import no.AbstractC17708b;
import p005A3.C0326m;
import p026Ao.AbstractC0668b;
import p026Ao.C0688v;
import p1136yo.C21561c;
import p178H.C3179x;
import p185H6.C3246b;
import p185H6.C3256l;
import p228J.C3847l0;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8162p0;
import p571X9.AbstractC9221V;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p712dp.C13187c;
import p791hj.C14522e;
import p888m8.C17198c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p974qo.C18788d;
import p974qo.C18792h;
import p974qo.C18795k;
import p974qo.C18796l;
import ro.AbstractC19260d;
import ro.C19261e;
import to.C20010a;

/* JADX INFO: renamed from: m7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17180f implements InterfaceC17351r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54881a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f54882b;

    public C17180f(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f54882b = internalLogger;
    }

    /* JADX INFO: renamed from: c */
    public static int m18923c(C17327D c17327d, int i10) {
        String strM19012f = c17327d.f55178r0.m19012f(SIPHeaderNames.RETRY_AFTER);
        if (strM19012f == null) {
            strM19012f = null;
        }
        if (strM19012f == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strM19012f).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM19012f);
        AbstractC16544l.m18093f(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: a */
    public C17358y m18924a(C17327D c17327d, C0326m c0326m) throws ProtocolException {
        C18795k c18795k;
        C17330G c17330g = (c0326m == null || (c18795k = (C18795k) c0326m.f1143e) == null) ? null : c18795k.f59739b;
        int i10 = c17327d.f55176p0;
        C17358y c17358y = c17327d.f55173Y;
        String str = c17358y.f55380b;
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                ((C17356w) this.f54882b).f55363s0.getClass();
                return null;
            }
            if (i10 == 421) {
                AbstractC17325B abstractC17325B = c17358y.f55382d;
                if ((abstractC17325B != null && abstractC17325B.mo4144c()) || c0326m == null || AbstractC16544l.m18089b(((C18788d) c0326m.f1141c).f59705b.f55209i.f55289d, ((C18795k) c0326m.f1143e).f59739b.f55191a.f55209i.f55289d)) {
                    return null;
                }
                C18795k c18795k2 = (C18795k) c0326m.f1143e;
                synchronized (c18795k2) {
                    c18795k2.f59748k = true;
                }
                return c17327d.f55173Y;
            }
            if (i10 == 503) {
                C17327D c17327d2 = c17327d.f55182v0;
                if ((c17327d2 == null || c17327d2.f55176p0 != 503) && m18923c(c17327d, Integer.MAX_VALUE) == 0) {
                    return c17327d.f55173Y;
                }
                return null;
            }
            if (i10 == 407) {
                AbstractC16544l.m18091d(c17330g);
                if (c17330g.f55192b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((C17356w) this.f54882b).f55370z0.getClass();
                return null;
            }
            if (i10 == 408) {
                if (!((C17356w) this.f54882b).f55362r0) {
                    return null;
                }
                AbstractC17325B abstractC17325B2 = c17358y.f55382d;
                if (abstractC17325B2 != null && abstractC17325B2.mo4144c()) {
                    return null;
                }
                C17327D c17327d3 = c17327d.f55182v0;
                if ((c17327d3 == null || c17327d3.f55176p0 != 408) && m18923c(c17327d, 0) <= 0) {
                    return c17327d.f55173Y;
                }
                return null;
            }
            switch (i10) {
                case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C17356w c17356w = (C17356w) this.f54882b;
        if (!c17356w.f55364t0) {
            return null;
        }
        String strM19012f = c17327d.f55178r0.m19012f("Location");
        if (strM19012f == null) {
            strM19012f = null;
        }
        if (strM19012f == null) {
            return null;
        }
        C17358y c17358y2 = c17327d.f55173Y;
        C17349p c17349p = c17358y2.f55379a;
        c17349p.getClass();
        C13187c c13187cM19026g = c17349p.m19026g(strM19012f);
        C17349p c17349pM14841c = c13187cM19026g != null ? c13187cM19026g.m14841c() : null;
        if (c17349pM14841c == null) {
            return null;
        }
        if (!AbstractC16544l.m18089b(c17349pM14841c.f55286a, c17358y2.f55379a.f55286a) && !c17356w.f55365u0) {
            return null;
        }
        C14522e c14522eM19038b = c17358y2.m19038b();
        if (AbstractC8162p0.m8732d(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i11 = c17327d.f55176p0;
            boolean z6 = zEquals || i11 == 308 || i11 == 307;
            if (str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                c14522eM19038b.m16028v(str, z6 ? c17358y2.f55382d : null);
            } else {
                c14522eM19038b.m16028v("GET", null);
            }
            if (!z6) {
                c14522eM19038b.m16030x("Transfer-Encoding");
                c14522eM19038b.m16030x(SIPHeaderNames.CONTENT_LENGTH);
                c14522eM19038b.m16030x(SIPHeaderNames.CONTENT_TYPE);
            }
        }
        if (!AbstractC17708b.m19409a(c17358y2.f55379a, c17349pM14841c)) {
            c14522eM19038b.m16030x(SIPHeaderNames.AUTHORIZATION);
        }
        c14522eM19038b.f45762Z = c17349pM14841c;
        return c14522eM19038b.m16017i();
    }

    /* JADX INFO: renamed from: b */
    public boolean m18925b(IOException iOException, C18792h c18792h, C17358y c17358y, boolean z6) {
        C17198c c17198c;
        boolean zM18936i;
        C18795k c18795k;
        AbstractC17325B abstractC17325B;
        if (!((C17356w) this.f54882b).f55362r0) {
            return false;
        }
        if ((z6 && (((abstractC17325B = c17358y.f55382d) != null && abstractC17325B.mo4144c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z6)) {
            return false;
        }
        C18788d c18788d = c18792h.f59728t0;
        AbstractC16544l.m18091d(c18788d);
        int i10 = c18788d.f59709f;
        if (i10 == 0 && c18788d.f59710g == 0 && c18788d.f59711h == 0) {
            zM18936i = false;
        } else if (c18788d.f59712i != null) {
            zM18936i = true;
        } else {
            C17330G c17330g = null;
            if (i10 <= 1 && c18788d.f59710g <= 1 && c18788d.f59711h <= 0 && (c18795k = c18788d.f59706c.f59729u0) != null) {
                synchronized (c18795k) {
                    if (c18795k.f59749l == 0 && AbstractC17708b.m19409a(c18795k.f59739b.f55191a.f55209i, c18788d.f59705b.f55209i)) {
                        c17330g = c18795k.f59739b;
                    }
                }
            }
            if (c17330g != null) {
                c18788d.f59712i = c17330g;
            } else {
                C3246b c3246b = c18788d.f59707d;
                if ((c3246b == null || !c3246b.m4135b()) && (c17198c = c18788d.f59708e) != null) {
                    zM18936i = c17198c.m18936i();
                }
            }
            zM18936i = true;
        }
        return zM18936i;
    }

    @Override // mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) throws Throwable {
        boolean z6;
        AbstractC17329F abstractC17329F;
        C17327D c17327dM20335b;
        boolean z10;
        SSLSocketFactory sSLSocketFactory;
        C21561c c21561c;
        C17339f c17339f;
        switch (this.f54881a) {
            case 0:
                C19261e c19261e = (C19261e) interfaceC17350q;
                C17358y c17358yM16017i = c19261e.f61057e;
                AbstractC17325B abstractC17325B = c17358yM16017i.f55382d;
                if (abstractC17325B == null || c17358yM16017i.f55381c.m19012f(SIPHeaderNames.CONTENT_ENCODING) != null || (abstractC17325B instanceof C17354u)) {
                    return c19261e.m20335b(c17358yM16017i);
                }
                try {
                    C14522e c14522eM19038b = c17358yM16017i.m19038b();
                    c14522eM19038b.m16024r(SIPHeaderNames.CONTENT_ENCODING, "gzip");
                    c14522eM19038b.m16028v(c17358yM16017i.f55380b, new C3256l(abstractC17325B, 1));
                    c17358yM16017i = c14522eM19038b.m16017i();
                    break;
                } catch (Exception e10) {
                    AbstractC7889G0.m8185c((InterfaceC11256c) this.f54882b, 4, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C17175a.f54863r0, e10, 48);
                }
                return c19261e.m20335b(c17358yM16017i);
            case 1:
                C19261e c19261e2 = (C19261e) interfaceC17350q;
                C17358y c17358y = c19261e2.f61057e;
                C14522e c14522eM19038b2 = c17358y.m19038b();
                long j10 = -1;
                AbstractC17325B abstractC17325B2 = c17358y.f55382d;
                if (abstractC17325B2 != null) {
                    C17352s c17352sMo4143b = abstractC17325B2.mo4143b();
                    if (c17352sMo4143b != null) {
                        c14522eM19038b2.m16024r(SIPHeaderNames.CONTENT_TYPE, c17352sMo4143b.f55298a);
                    }
                    long jMo4142a = abstractC17325B2.mo4142a();
                    if (jMo4142a != -1) {
                        c14522eM19038b2.m16024r(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(jMo4142a));
                        c14522eM19038b2.m16030x("Transfer-Encoding");
                    } else {
                        c14522eM19038b2.m16024r("Transfer-Encoding", "chunked");
                        c14522eM19038b2.m16030x(SIPHeaderNames.CONTENT_LENGTH);
                    }
                }
                C17348o c17348o = c17358y.f55381c;
                String strM19012f = c17348o.m19012f("Host");
                C17349p url = c17358y.f55379a;
                if (strM19012f == null) {
                    c14522eM19038b2.m16024r("Host", AbstractC17708b.m19432x(url, false));
                }
                if (c17348o.m19012f("Connection") == null) {
                    c14522eM19038b2.m16024r("Connection", "Keep-Alive");
                }
                if (c17348o.m19012f(SIPHeaderNames.ACCEPT_ENCODING) == null && c17348o.m19012f("Range") == null) {
                    c14522eM19038b2.m16024r(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                    z6 = true;
                } else {
                    z6 = false;
                }
                C17335b c17335b = (C17335b) this.f54882b;
                c17335b.getClass();
                AbstractC16544l.m18094g(url, "url");
                if (c17348o.m19012f(SIPHeaderNames.USER_AGENT) == null) {
                    c14522eM19038b2.m16024r(SIPHeaderNames.USER_AGENT, "okhttp/4.12.0");
                }
                C17327D c17327dM20335b2 = c19261e2.m20335b(c14522eM19038b2.m16017i());
                C17348o c17348o2 = c17327dM20335b2.f55178r0;
                AbstractC19260d.m20333b(c17335b, url, c17348o2);
                C17326C c17326cM18986e = c17327dM20335b2.m18986e();
                c17326cM18986e.f55160a = c17358y;
                if (z6) {
                    String strM19012f2 = c17348o2.m19012f(SIPHeaderNames.CONTENT_ENCODING);
                    if (strM19012f2 == null) {
                        strM19012f2 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM19012f2) && AbstractC19260d.m20332a(c17327dM20335b2) && (abstractC17329F = c17327dM20335b2.f55179s0) != null) {
                        C0688v c0688v = new C0688v(abstractC17329F.mo18988O0());
                        C3847l0 c3847l0M19016q = c17348o2.m19016q();
                        c3847l0M19016q.m4582i(SIPHeaderNames.CONTENT_ENCODING);
                        c3847l0M19016q.m4582i(SIPHeaderNames.CONTENT_LENGTH);
                        c17326cM18986e.f55165f = c3847l0M19016q.m4577d().m19016q();
                        String strM19012f3 = c17348o2.m19012f(SIPHeaderNames.CONTENT_TYPE);
                        c17326cM18986e.f55166g = new C17328E(strM19012f3 == null ? null : strM19012f3, j10, AbstractC0668b.m1403c(c0688v), 1);
                    }
                }
                return c17326cM18986e.m18984a();
            default:
                C19261e c19261e3 = (C19261e) interfaceC17350q;
                C17358y c17358y2 = c19261e3.f61057e;
                C18792h c18792h = c19261e3.f61053a;
                Collection collectionM19362l0 = C17689w.f56480Y;
                C17327D c17327d = null;
                int i10 = 0;
                C17358y request = c17358y2;
                while (true) {
                    boolean z11 = true;
                    while (true) {
                        c18792h.getClass();
                        AbstractC16544l.m18094g(request, "request");
                        if (c18792h.f59731w0 != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (c18792h) {
                            try {
                                if (c18792h.f59733y0) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c18792h.f59732x0) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z11) {
                            C3179x c3179x = c18792h.f59724p0;
                            C17349p c17349p = request.f55379a;
                            boolean z12 = c17349p.f55295j;
                            C17356w c17356w = c18792h.f59721Y;
                            if (z12) {
                                SSLSocketFactory sSLSocketFactory2 = c17356w.f55344B0;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                C21561c c21561c2 = c17356w.f55348F0;
                                c17339f = c17356w.f55349G0;
                                sSLSocketFactory = sSLSocketFactory2;
                                c21561c = c21561c2;
                            } else {
                                sSLSocketFactory = null;
                                c21561c = null;
                                c17339f = null;
                            }
                            c18792h.f59728t0 = new C18788d(c3179x, new C17334a(c17349p.f55289d, c17349p.f55290e, c17356w.f55367w0, c17356w.f55343A0, sSLSocketFactory, c21561c, c17339f, c17356w.f55370z0, c17356w.f55368x0, c17356w.f55347E0, c17356w.f55346D0, c17356w.f55369y0), c18792h);
                        }
                        try {
                            if (c18792h.f59718A0) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    try {
                                        c17327dM20335b = c19261e3.m20335b(request);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (C18796l e11) {
                                    if (!m18925b(e11.f59756Z, c18792h, request, false)) {
                                        IOException iOException = e11.f59755Y;
                                        AbstractC16544l.m18094g(iOException, "<this>");
                                        Iterator it = collectionM19362l0.iterator();
                                        while (it.hasNext()) {
                                            AbstractC9221V.m9789a(iOException, (Exception) it.next());
                                        }
                                        throw iOException;
                                    }
                                    collectionM19362l0 = AbstractC17680n.m19362l0(collectionM19362l0, e11.f59755Y);
                                    c18792h.m20064f(true);
                                    i10 = i10;
                                    z11 = false;
                                }
                            } catch (IOException e12) {
                                if (!m18925b(e12, c18792h, request, !(e12 instanceof C20010a))) {
                                    Iterator it2 = collectionM19362l0.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC9221V.m9789a(e12, (Exception) it2.next());
                                    }
                                    throw e12;
                                }
                                collectionM19362l0 = AbstractC17680n.m19362l0(collectionM19362l0, e12);
                                c18792h.m20064f(true);
                                i10 = i10;
                                z11 = false;
                            }
                            break;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        c18792h.m20064f(true);
                        throw th;
                        i10 = i10;
                        z11 = false;
                    }
                    if (c17327d != null) {
                        C17326C c17326cM18986e2 = c17327dM20335b.m18986e();
                        C17326C c17326cM18986e3 = c17327d.m18986e();
                        c17326cM18986e3.f55166g = null;
                        C17327D c17327dM18984a = c17326cM18986e3.m18984a();
                        if (c17327dM18984a.f55179s0 != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        c17326cM18986e2.f55169j = c17327dM18984a;
                        c17327dM20335b = c17326cM18986e2.m18984a();
                    }
                    c17327d = c17327dM20335b;
                    try {
                        request = m18924a(c17327d, c18792h.f59731w0);
                        if (request == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                            AbstractC17325B abstractC17325B3 = request.f55382d;
                            if (abstractC17325B3 == null || !abstractC17325B3.mo4144c()) {
                                AbstractC17329F abstractC17329F2 = c17327d.f55179s0;
                                if (abstractC17329F2 != null) {
                                    AbstractC17708b.m19412d(abstractC17329F2);
                                }
                                i10++;
                                if (i10 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i10);
                                }
                                c18792h.m20064f(true);
                                collectionM19362l0 = collectionM19362l0;
                            }
                        }
                        c18792h.m20064f(z10);
                        return c17327d;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                break;
        }
    }

    public C17180f(C17335b cookieJar) {
        AbstractC16544l.m18094g(cookieJar, "cookieJar");
        this.f54882b = cookieJar;
    }

    public C17180f(C17356w client) {
        AbstractC16544l.m18094g(client, "client");
        this.f54882b = client;
    }
}
