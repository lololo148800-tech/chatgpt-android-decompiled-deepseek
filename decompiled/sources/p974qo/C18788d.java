package p974qo;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17330G;
import mo.C17334a;
import mo.C17349p;
import no.AbstractC17708b;
import p178H.C3179x;
import p185H6.C3246b;
import p571X9.AbstractC9393x3;
import p604Yk.C10077b;
import p888m8.C17198c;
import p909nm.C17689w;
import p950po.C18528b;
import p950po.C18529c;
import to.C20010a;
import to.C20035z;

/* JADX INFO: renamed from: qo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C18788d {

    /* JADX INFO: renamed from: a */
    public final C3179x f59704a;

    /* JADX INFO: renamed from: b */
    public final C17334a f59705b;

    /* JADX INFO: renamed from: c */
    public final C18792h f59706c;

    /* JADX INFO: renamed from: d */
    public C3246b f59707d;

    /* JADX INFO: renamed from: e */
    public C17198c f59708e;

    /* JADX INFO: renamed from: f */
    public int f59709f;

    /* JADX INFO: renamed from: g */
    public int f59710g;

    /* JADX INFO: renamed from: h */
    public int f59711h;

    /* JADX INFO: renamed from: i */
    public C17330G f59712i;

    public C18788d(C3179x connectionPool, C17334a c17334a, C18792h call) {
        AbstractC16544l.m18094g(connectionPool, "connectionPool");
        AbstractC16544l.m18094g(call, "call");
        this.f59704a = connectionPool;
        this.f59705b = c17334a;
        this.f59706c = call;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX INFO: renamed from: a */
    public final C18795k m20056a(int i10, int i11, int i12, boolean z6, boolean z10) throws IOException {
        C17330G c17330g;
        C3246b c3246b;
        C17198c c17198c;
        C3246b c3246bM18938k;
        ArrayList arrayList;
        C17334a c17334a;
        C17349p url;
        Proxy proxy;
        URI uriM19028i;
        List<Proxy> list;
        List listM19421m;
        C18795k c18795k;
        Socket socketM20068j;
        while (!this.f59706c.f59718A0) {
            C18795k c18795k2 = this.f59706c.f59729u0;
            if (c18795k2 != null) {
                synchronized (c18795k2) {
                    try {
                        socketM20068j = (c18795k2.f59747j || !m20057b(c18795k2.f59739b.f55191a.f55209i)) ? this.f59706c.m20068j() : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f59706c.f59729u0 == null) {
                    if (socketM20068j != null) {
                        AbstractC17708b.m19413e(socketM20068j);
                    }
                    AbstractC16544l.m18094g(this.f59706c, "call");
                    this.f59709f = 0;
                    this.f59710g = 0;
                    this.f59711h = 0;
                    if (this.f59704a.m4024b(this.f59705b, this.f59706c, null, false)) {
                        c18795k2 = this.f59706c.f59729u0;
                        AbstractC16544l.m18091d(c18795k2);
                        AbstractC16544l.m18094g(this.f59706c, "call");
                    } else {
                        c17330g = this.f59712i;
                        try {
                            if (c17330g != null) {
                                this.f59712i = null;
                            } else {
                                c3246b = this.f59707d;
                                if (c3246b == null && c3246b.m4135b()) {
                                    C3246b c3246b2 = this.f59707d;
                                    AbstractC16544l.m18091d(c3246b2);
                                    if (!c3246b2.m4135b()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i13 = c3246b2.f9890b;
                                    c3246b2.f9890b = i13 + 1;
                                    c17330g = (C17330G) c3246b2.f9889a.get(i13);
                                } else {
                                    c17198c = this.f59708e;
                                    if (c17198c == null) {
                                        c17334a = this.f59705b;
                                        C18792h call = this.f59706c;
                                        C10077b routeDatabase = call.f59721Y.f55356N0;
                                        AbstractC16544l.m18094g(routeDatabase, "routeDatabase");
                                        AbstractC16544l.m18094g(call, "call");
                                        c17198c = new C17198c();
                                        c17198c.f54901b = c17334a;
                                        c17198c.f54902c = routeDatabase;
                                        c17198c.f54903d = call;
                                        C17689w c17689w = C17689w.f56480Y;
                                        c17198c.f54904e = c17689w;
                                        c17198c.f54905f = c17689w;
                                        c17198c.f54906g = new ArrayList();
                                        url = c17334a.f55209i;
                                        AbstractC16544l.m18094g(url, "url");
                                        proxy = c17334a.f55207g;
                                        if (proxy != null) {
                                            listM19421m = AbstractC9393x3.m9974d(proxy);
                                        } else {
                                            uriM19028i = url.m19028i();
                                            if (uriM19028i.getHost() == null) {
                                                listM19421m = AbstractC17708b.m19421m(Proxy.NO_PROXY);
                                            } else {
                                                List<Proxy> proxiesOrNull = c17334a.f55208h.select(uriM19028i);
                                                list = proxiesOrNull;
                                                if (list != null || list.isEmpty()) {
                                                    listM19421m = AbstractC17708b.m19421m(Proxy.NO_PROXY);
                                                } else {
                                                    AbstractC16544l.m18093f(proxiesOrNull, "proxiesOrNull");
                                                    listM19421m = AbstractC17708b.m19433y(proxiesOrNull);
                                                }
                                            }
                                        }
                                        c17198c.f54904e = listM19421m;
                                        c17198c.f54900a = 0;
                                        this.f59708e = c17198c;
                                    }
                                    c3246bM18938k = c17198c.m18938k();
                                    this.f59707d = c3246bM18938k;
                                    arrayList = c3246bM18938k.f9889a;
                                    if (!this.f59706c.f59718A0) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, false)) {
                                        c18795k2 = this.f59706c.f59729u0;
                                        AbstractC16544l.m18091d(c18795k2);
                                        AbstractC16544l.m18094g(this.f59706c, "call");
                                    } else {
                                        if (c3246bM18938k.m4135b()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i14 = c3246bM18938k.f9890b;
                                        c3246bM18938k.f9890b = i14 + 1;
                                        c17330g = (C17330G) c3246bM18938k.f9889a.get(i14);
                                        c18795k = new C18795k(this.f59704a, c17330g);
                                        this.f59706c.f59720C0 = c18795k;
                                        c18795k.m20072c(i10, i11, i12, z6, this.f59706c);
                                        this.f59706c.f59720C0 = null;
                                        this.f59706c.f59721Y.f55356N0.m10656A(c17330g);
                                        if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, true)) {
                                            C18795k c18795k3 = this.f59706c.f59729u0;
                                            AbstractC16544l.m18091d(c18795k3);
                                            this.f59712i = c17330g;
                                            Socket socket = c18795k.f59741d;
                                            AbstractC16544l.m18091d(socket);
                                            AbstractC17708b.m19413e(socket);
                                            AbstractC16544l.m18094g(this.f59706c, "call");
                                            c18795k2 = c18795k3;
                                        } else {
                                            synchronized (c18795k) {
                                                C3179x c3179x = this.f59704a;
                                                c3179x.getClass();
                                                byte[] bArr = AbstractC17708b.f56536a;
                                                ((ConcurrentLinkedQueue) c3179x.f9589p0).add(c18795k);
                                                ((C18529c) c3179x.f9587Z).m19890c((C18528b) c3179x.f9588o0, 0L);
                                                this.f59706c.m20060b(c18795k);
                                            }
                                            AbstractC16544l.m18094g(this.f59706c, "call");
                                            c18795k2 = c18795k;
                                        }
                                    }
                                }
                            }
                            c18795k.m20072c(i10, i11, i12, z6, this.f59706c);
                            this.f59706c.f59720C0 = null;
                            this.f59706c.f59721Y.f55356N0.m10656A(c17330g);
                            if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, true)) {
                                C18795k c18795k4 = this.f59706c.f59729u0;
                                AbstractC16544l.m18091d(c18795k4);
                                this.f59712i = c17330g;
                                Socket socket2 = c18795k.f59741d;
                                AbstractC16544l.m18091d(socket2);
                                AbstractC17708b.m19413e(socket2);
                                AbstractC16544l.m18094g(this.f59706c, "call");
                                c18795k2 = c18795k4;
                            } else {
                                synchronized (c18795k) {
                                    C3179x c3179x2 = this.f59704a;
                                    c3179x2.getClass();
                                    byte[] bArr2 = AbstractC17708b.f56536a;
                                    ((ConcurrentLinkedQueue) c3179x2.f9589p0).add(c18795k);
                                    ((C18529c) c3179x2.f9587Z).m19890c((C18528b) c3179x2.f9588o0, 0L);
                                    this.f59706c.m20060b(c18795k);
                                    AbstractC16544l.m18094g(this.f59706c, "call");
                                    c18795k2 = c18795k;
                                }
                            }
                        } catch (Throwable th3) {
                            this.f59706c.f59720C0 = null;
                            throw th3;
                        }
                        arrayList = null;
                        c18795k = new C18795k(this.f59704a, c17330g);
                        this.f59706c.f59720C0 = c18795k;
                    }
                } else if (socketM20068j != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f59709f = 0;
                this.f59710g = 0;
                this.f59711h = 0;
                if (this.f59704a.m4024b(this.f59705b, this.f59706c, null, false)) {
                    c18795k2 = this.f59706c.f59729u0;
                    AbstractC16544l.m18091d(c18795k2);
                    AbstractC16544l.m18094g(this.f59706c, "call");
                } else {
                    c17330g = this.f59712i;
                    if (c17330g != null) {
                        this.f59712i = null;
                    } else {
                        c3246b = this.f59707d;
                        if (c3246b == null) {
                        }
                        c17198c = this.f59708e;
                        if (c17198c == null) {
                            c17334a = this.f59705b;
                            C18792h call2 = this.f59706c;
                            C10077b routeDatabase2 = call2.f59721Y.f55356N0;
                            AbstractC16544l.m18094g(routeDatabase2, "routeDatabase");
                            AbstractC16544l.m18094g(call2, "call");
                            c17198c = new C17198c();
                            c17198c.f54901b = c17334a;
                            c17198c.f54902c = routeDatabase2;
                            c17198c.f54903d = call2;
                            C17689w c17689w2 = C17689w.f56480Y;
                            c17198c.f54904e = c17689w2;
                            c17198c.f54905f = c17689w2;
                            c17198c.f54906g = new ArrayList();
                            url = c17334a.f55209i;
                            AbstractC16544l.m18094g(url, "url");
                            proxy = c17334a.f55207g;
                            if (proxy != null) {
                                listM19421m = AbstractC9393x3.m9974d(proxy);
                            } else {
                                uriM19028i = url.m19028i();
                                if (uriM19028i.getHost() == null) {
                                    listM19421m = AbstractC17708b.m19421m(Proxy.NO_PROXY);
                                } else {
                                    List<Proxy> proxiesOrNull2 = c17334a.f55208h.select(uriM19028i);
                                    list = proxiesOrNull2;
                                    if (list != null) {
                                        listM19421m = AbstractC17708b.m19421m(Proxy.NO_PROXY);
                                    } else {
                                        listM19421m = AbstractC17708b.m19421m(Proxy.NO_PROXY);
                                    }
                                }
                            }
                            c17198c.f54904e = listM19421m;
                            c17198c.f54900a = 0;
                            this.f59708e = c17198c;
                        }
                        c3246bM18938k = c17198c.m18938k();
                        this.f59707d = c3246bM18938k;
                        arrayList = c3246bM18938k.f9889a;
                        if (!this.f59706c.f59718A0) {
                            throw new IOException("Canceled");
                        }
                        if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, false)) {
                            c18795k2 = this.f59706c.f59729u0;
                            AbstractC16544l.m18091d(c18795k2);
                            AbstractC16544l.m18094g(this.f59706c, "call");
                        } else {
                            if (c3246bM18938k.m4135b()) {
                                throw new NoSuchElementException();
                            }
                            int i15 = c3246bM18938k.f9890b;
                            c3246bM18938k.f9890b = i15 + 1;
                            c17330g = (C17330G) c3246bM18938k.f9889a.get(i15);
                            c18795k = new C18795k(this.f59704a, c17330g);
                            this.f59706c.f59720C0 = c18795k;
                            c18795k.m20072c(i10, i11, i12, z6, this.f59706c);
                            this.f59706c.f59720C0 = null;
                            this.f59706c.f59721Y.f55356N0.m10656A(c17330g);
                            if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, true)) {
                                C18795k c18795k5 = this.f59706c.f59729u0;
                                AbstractC16544l.m18091d(c18795k5);
                                this.f59712i = c17330g;
                                Socket socket3 = c18795k.f59741d;
                                AbstractC16544l.m18091d(socket3);
                                AbstractC17708b.m19413e(socket3);
                                AbstractC16544l.m18094g(this.f59706c, "call");
                                c18795k2 = c18795k5;
                            } else {
                                synchronized (c18795k) {
                                    C3179x c3179x3 = this.f59704a;
                                    c3179x3.getClass();
                                    byte[] bArr3 = AbstractC17708b.f56536a;
                                    ((ConcurrentLinkedQueue) c3179x3.f9589p0).add(c18795k);
                                    ((C18529c) c3179x3.f9587Z).m19890c((C18528b) c3179x3.f9588o0, 0L);
                                    this.f59706c.m20060b(c18795k);
                                    AbstractC16544l.m18094g(this.f59706c, "call");
                                    c18795k2 = c18795k;
                                }
                            }
                        }
                    }
                    arrayList = null;
                    c18795k = new C18795k(this.f59704a, c17330g);
                    this.f59706c.f59720C0 = c18795k;
                    c18795k.m20072c(i10, i11, i12, z6, this.f59706c);
                    this.f59706c.f59720C0 = null;
                    this.f59706c.f59721Y.f55356N0.m10656A(c17330g);
                    if (this.f59704a.m4024b(this.f59705b, this.f59706c, arrayList, true)) {
                        C18795k c18795k6 = this.f59706c.f59729u0;
                        AbstractC16544l.m18091d(c18795k6);
                        this.f59712i = c17330g;
                        Socket socket4 = c18795k.f59741d;
                        AbstractC16544l.m18091d(socket4);
                        AbstractC17708b.m19413e(socket4);
                        AbstractC16544l.m18094g(this.f59706c, "call");
                        c18795k2 = c18795k6;
                    } else {
                        synchronized (c18795k) {
                            C3179x c3179x4 = this.f59704a;
                            c3179x4.getClass();
                            byte[] bArr4 = AbstractC17708b.f56536a;
                            ((ConcurrentLinkedQueue) c3179x4.f9589p0).add(c18795k);
                            ((C18529c) c3179x4.f9587Z).m19890c((C18528b) c3179x4.f9588o0, 0L);
                            this.f59706c.m20060b(c18795k);
                            AbstractC16544l.m18094g(this.f59706c, "call");
                            c18795k2 = c18795k;
                        }
                    }
                }
            }
            if (c18795k2.m20078j(z10)) {
                return c18795k2;
            }
            c18795k2.m20080l();
            if (this.f59712i == null) {
                C3246b c3246b3 = this.f59707d;
                if (c3246b3 != null ? c3246b3.m4135b() : true) {
                    continue;
                } else {
                    C17198c c17198c2 = this.f59708e;
                    if (!(c17198c2 != null ? c17198c2.m18936i() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20057b(C17349p url) {
        AbstractC16544l.m18094g(url, "url");
        C17349p c17349p = this.f59705b.f55209i;
        return url.f55290e == c17349p.f55290e && AbstractC16544l.m18089b(url.f55289d, c17349p.f55289d);
    }

    /* JADX INFO: renamed from: c */
    public final void m20058c(IOException e10) {
        AbstractC16544l.m18094g(e10, "e");
        this.f59712i = null;
        if ((e10 instanceof C20035z) && ((C20035z) e10).f63454Y == 8) {
            this.f59709f++;
        } else if (e10 instanceof C20010a) {
            this.f59710g++;
        } else {
            this.f59711h++;
        }
    }
}
