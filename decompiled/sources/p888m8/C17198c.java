package p888m8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mo.C17326C;
import mo.C17327D;
import mo.C17330G;
import mo.C17334a;
import mo.C17348o;
import mo.C17349p;
import mo.C17356w;
import mo.C17358y;
import mo.EnumC17357x;
import no.AbstractC17708b;
import p013Ab.C0420b;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0679m;
import p026Ao.InterfaceC0661J;
import p026Ao.InterfaceC0663L;
import p084D4.C1918i;
import p1148zb.C21830a;
import p185H6.C3246b;
import p482Tg.C7443a0;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9393x3;
import p604Yk.C10077b;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p804i8.InterfaceC14942a;
import p849k7.C16360m;
import p861l1.xapn.suYVq;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;
import p974qo.C18792h;
import p974qo.C18795k;
import ro.AbstractC19260d;
import ro.InterfaceC19259c;
import so.C19697b;
import so.C19698c;
import so.C19699d;
import so.C19700e;

/* JADX INFO: renamed from: m8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17198c implements InterfaceC19259c {

    /* JADX INFO: renamed from: a */
    public int f54900a;

    /* JADX INFO: renamed from: b */
    public Object f54901b;

    /* JADX INFO: renamed from: c */
    public Object f54902c;

    /* JADX INFO: renamed from: d */
    public Object f54903d;

    /* JADX INFO: renamed from: e */
    public Object f54904e;

    /* JADX INFO: renamed from: f */
    public Object f54905f;

    /* JADX INFO: renamed from: g */
    public Object f54906g;

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: a */
    public void mo18928a() {
        ((C0656E) this.f54904e).flush();
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: b */
    public long mo18929b(C17327D c17327d) {
        if (!AbstractC19260d.m20332a(c17327d)) {
            return 0L;
        }
        String strM19012f = c17327d.f55178r0.m19012f("Transfer-Encoding");
        if (strM19012f == null) {
            strM19012f = null;
        }
        if ("chunked".equalsIgnoreCase(strM19012f)) {
            return -1L;
        }
        return AbstractC17708b.m19420l(c17327d);
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: c */
    public InterfaceC0661J mo18930c(C17358y request, long j10) {
        AbstractC16544l.m18094g(request, "request");
        if ("chunked".equalsIgnoreCase(request.f55381c.m19012f("Transfer-Encoding"))) {
            if (this.f54900a == 1) {
                this.f54900a = 2;
                return new C19697b(this);
            }
            throw new IllegalStateException(("state: " + this.f54900a).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f54900a == 1) {
            this.f54900a = 2;
            return new C0679m(this);
        }
        throw new IllegalStateException(("state: " + this.f54900a).toString());
    }

    @Override // ro.InterfaceC19259c
    public void cancel() {
        Socket socket = ((C18795k) this.f54902c).f59740c;
        if (socket != null) {
            AbstractC17708b.m19413e(socket);
        }
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: d */
    public InterfaceC0663L mo18931d(C17327D c17327d) {
        if (!AbstractC19260d.m20332a(c17327d)) {
            return m18937j(0L);
        }
        String strM19012f = c17327d.f55178r0.m19012f("Transfer-Encoding");
        if (strM19012f == null) {
            strM19012f = null;
        }
        if ("chunked".equalsIgnoreCase(strM19012f)) {
            C17349p c17349p = c17327d.f55173Y.f55379a;
            if (this.f54900a == 4) {
                this.f54900a = 5;
                return new C19698c(this, c17349p);
            }
            throw new IllegalStateException(("state: " + this.f54900a).toString());
        }
        long jM19420l = AbstractC17708b.m19420l(c17327d);
        if (jM19420l != -1) {
            return m18937j(jM19420l);
        }
        if (this.f54900a == 4) {
            this.f54900a = 5;
            ((C18795k) this.f54902c).m20080l();
            return new C19700e(this);
        }
        throw new IllegalStateException(("state: " + this.f54900a).toString());
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: e */
    public C17326C mo18932e(boolean z6) throws IOException {
        C1918i c1918i = (C1918i) this.f54905f;
        int i10 = this.f54900a;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f54900a).toString());
        }
        try {
            String strM1350W = ((C0657F) c1918i.f5613o0).m1350W(c1918i.f5612Z);
            c1918i.f5612Z -= (long) strM1350W.length();
            C0420b c0420bM8753b = AbstractC8170q0.m8753b(strM1350W);
            int i11 = c0420bM8753b.f1381Z;
            C17326C c17326c = new C17326C();
            c17326c.f55161b = (EnumC17357x) c0420bM8753b.f1383p0;
            c17326c.f55162c = i11;
            c17326c.f55163d = (String) c0420bM8753b.f1382o0;
            c17326c.f55165f = c1918i.m3060r().m19016q();
            if (z6 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f54900a = 3;
                return c17326c;
            }
            if (102 > i11 || i11 >= 200) {
                this.f54900a = 4;
                return c17326c;
            }
            this.f54900a = 3;
            return c17326c;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on ".concat(((C18795k) this.f54902c).f59739b.f55191a.f55209i.m19027h()), e10);
        }
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: f */
    public void mo18933f() {
        ((C0656E) this.f54904e).flush();
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: g */
    public void mo18934g(C17358y request) {
        AbstractC16544l.m18094g(request, "request");
        Proxy.Type type = ((C18795k) this.f54902c).f59739b.f55192b.type();
        AbstractC16544l.m18093f(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f55380b);
        sb2.append(' ');
        C17349p c17349p = request.f55379a;
        if (c17349p.f55295j || type != Proxy.Type.HTTP) {
            String strM19021b = c17349p.m19021b();
            String strM19023d = c17349p.m19023d();
            if (strM19023d != null) {
                strM19021b = strM19021b + '?' + strM19023d;
            }
            sb2.append(strM19021b);
        } else {
            sb2.append(c17349p);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        m18941n(request.f55381c, string);
    }

    @Override // ro.InterfaceC19259c
    public C18795k getConnection() {
        return (C18795k) this.f54902c;
    }

    /* JADX INFO: renamed from: h */
    public C21830a m18935h() {
        String strM11052j = this.f54900a == 0 ? " registrationStatus" : "";
        if (((Long) this.f54904e) == null) {
            strM11052j = strM11052j.concat(" expiresInSecs");
        }
        if (((Long) this.f54905f) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " tokenCreationEpochInSecs");
        }
        if (strM11052j.isEmpty()) {
            return new C21830a((String) this.f54901b, this.f54900a, (String) this.f54902c, (String) this.f54903d, ((Long) this.f54904e).longValue(), ((Long) this.f54905f).longValue(), (String) this.f54906g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM11052j));
    }

    /* JADX INFO: renamed from: i */
    public boolean m18936i() {
        return this.f54900a < ((List) this.f54904e).size() || !((ArrayList) this.f54906g).isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public C19699d m18937j(long j10) {
        if (this.f54900a == 4) {
            this.f54900a = 5;
            return new C19699d(this, j10);
        }
        throw new IllegalStateException(("state: " + this.f54900a).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public C3246b m18938k() throws SocketException, UnknownHostException {
        String hostName;
        int port;
        List listM9974d;
        boolean zContains;
        if (!m18936i()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f54900a < ((List) this.f54904e).size()) {
            boolean z6 = this.f54900a < ((List) this.f54904e).size();
            C17334a c17334a = (C17334a) this.f54901b;
            if (!z6) {
                throw new SocketException("No route to " + c17334a.f55209i.f55289d + "; exhausted proxy configurations: " + ((List) this.f54904e));
            }
            List list = (List) this.f54904e;
            int i10 = this.f54900a;
            this.f54900a = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            ArrayList arrayList2 = new ArrayList();
            this.f54905f = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C17349p c17349p = c17334a.f55209i;
                hostName = c17349p.f55289d;
                port = c17349p.f55290e;
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                }
                AbstractC16544l.m18093f(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                AbstractC16544l.m18094g(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostName = inetSocketAddress.getHostName();
                    AbstractC16544l.m18093f(hostName, "hostName");
                } else {
                    hostName = address.getHostAddress();
                    AbstractC16544l.m18093f(hostName, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                byte[] bArr = AbstractC17708b.f56536a;
                AbstractC16544l.m18094g(hostName, "<this>");
                if (AbstractC17708b.f56541f.m21664d(hostName)) {
                    listM9974d = AbstractC9393x3.m9974d(InetAddress.getByName(hostName));
                } else {
                    C18792h call = (C18792h) this.f54903d;
                    AbstractC16544l.m18094g(call, "call");
                    List listMo18927a = c17334a.f55201a.mo18927a(hostName);
                    if (listMo18927a.isEmpty()) {
                        throw new UnknownHostException(c17334a.f55201a + " returned no addresses for " + hostName);
                    }
                    listM9974d = listMo18927a;
                }
                Iterator it = listM9974d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f54905f.iterator();
            while (it2.hasNext()) {
                C17330G c17330g = new C17330G((C17334a) this.f54901b, proxy, (InetSocketAddress) it2.next());
                C10077b c10077b = (C10077b) this.f54902c;
                synchronized (c10077b) {
                    zContains = ((LinkedHashSet) c10077b.f29833Z).contains(c17330g);
                }
                if (zContains) {
                    ((ArrayList) this.f54906g).add(c17330g);
                } else {
                    arrayList.add(c17330g);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC17686t.m19398v((ArrayList) this.f54906g, arrayList);
            ((ArrayList) this.f54906g).clear();
        }
        return new C3246b(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: l */
    public void m18939l(Exception exc) {
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(EnumC11255b.f34098Y);
        if (exc != null) {
            arrayListM19384m.add(EnumC11255b.f34100o0);
        }
        InterfaceC13823a interfaceC13823a = (InterfaceC13823a) this.f54901b;
        AbstractC7889G0.m8185c(interfaceC13823a.mo15463s(), 5, arrayListM19384m, C17196a.f54895o0, exc, 48);
        InterfaceC14942a interfaceC14942a = (InterfaceC14942a) this.f54906g;
        if (interfaceC14942a != null) {
            if (AbstractC16544l.m18089b((AbstractC16546n) this.f54904e, C17197b.f54899Y)) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, EnumC11255b.f34099Z, C17196a.f54896p0, null, false, 56);
            }
            ((AbstractC16546n) this.f54904e).invoke(interfaceC14942a);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m18940m() {
        C16360m c16360mMo15458n = ((InterfaceC13823a) this.f54901b).mo15458n("rum");
        if (c16360mMo15458n != null) {
            AbstractC7933L4.m8226d(c16360mMo15458n, new C7443a0(this, 19));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m18941n(C17348o c17348o, String requestLine) {
        AbstractC16544l.m18094g(requestLine, "requestLine");
        if (this.f54900a != 0) {
            throw new IllegalStateException(("state: " + this.f54900a).toString());
        }
        C0656E c0656e = (C0656E) this.f54904e;
        c0656e.mo1333c0(requestLine);
        c0656e.mo1333c0(Separators.NEWLINE);
        int size = c17348o.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0656e.mo1333c0(c17348o.m19014m(i10));
            c0656e.mo1333c0(": ");
            c0656e.mo1333c0(c17348o.m19018s(i10));
            c0656e.mo1333c0(Separators.NEWLINE);
        }
        c0656e.mo1333c0(Separators.NEWLINE);
        this.f54900a = 1;
    }

    public C17198c(C17356w c17356w, C18795k c18795k, C0657F source, C0656E sink) {
        AbstractC16544l.m18094g(c18795k, suYVq.cEezDvex);
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(sink, "sink");
        this.f54901b = c17356w;
        this.f54902c = c18795k;
        this.f54903d = source;
        this.f54904e = sink;
        this.f54905f = new C1918i(source);
    }
}
