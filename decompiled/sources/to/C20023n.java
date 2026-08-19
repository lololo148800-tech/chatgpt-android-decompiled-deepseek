package to;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17326C;
import mo.C17327D;
import mo.C17348o;
import mo.C17349p;
import mo.C17356w;
import mo.C17358y;
import mo.EnumC17357x;
import no.AbstractC17708b;
import p003A1.AbstractC0168G;
import p013Ab.C0420b;
import p026Ao.C0678l;
import p026Ao.InterfaceC0661J;
import p026Ao.InterfaceC0663L;
import p1113xn.AbstractC21322p;
import p228J.C3847l0;
import p523V9.AbstractC8170q0;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17686t;
import p974qo.C18795k;
import ro.AbstractC19260d;
import ro.C19261e;
import ro.InterfaceC19259c;

/* JADX INFO: renamed from: to.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C20023n implements InterfaceC19259c {

    /* JADX INFO: renamed from: g */
    public static final List f63399g = AbstractC17708b.m19421m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List f63400h = AbstractC17708b.m19421m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    public final C18795k f63401a;

    /* JADX INFO: renamed from: b */
    public final C19261e f63402b;

    /* JADX INFO: renamed from: c */
    public final C20022m f63403c;

    /* JADX INFO: renamed from: d */
    public volatile C20030u f63404d;

    /* JADX INFO: renamed from: e */
    public final EnumC17357x f63405e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f63406f;

    public C20023n(C17356w client, C18795k connection, C19261e c19261e, C20022m http2Connection) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(connection, "connection");
        AbstractC16544l.m18094g(http2Connection, "http2Connection");
        this.f63401a = connection;
        this.f63402b = c19261e;
        this.f63403c = http2Connection;
        EnumC17357x enumC17357x = EnumC17357x.H2_PRIOR_KNOWLEDGE;
        this.f63405e = client.f55347E0.contains(enumC17357x) ? enumC17357x : EnumC17357x.HTTP_2;
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: a */
    public final void mo18928a() {
        C20030u c20030u = this.f63404d;
        AbstractC16544l.m18091d(c20030u);
        c20030u.m20840g().close();
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: b */
    public final long mo18929b(C17327D c17327d) {
        if (AbstractC19260d.m20332a(c17327d)) {
            return AbstractC17708b.m19420l(c17327d);
        }
        return 0L;
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: c */
    public final InterfaceC0661J mo18930c(C17358y request, long j10) {
        AbstractC16544l.m18094g(request, "request");
        C20030u c20030u = this.f63404d;
        AbstractC16544l.m18091d(c20030u);
        return c20030u.m20840g();
    }

    @Override // ro.InterfaceC19259c
    public final void cancel() {
        this.f63406f = true;
        C20030u c20030u = this.f63404d;
        if (c20030u != null) {
            c20030u.m20838e(9);
        }
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: d */
    public final InterfaceC0663L mo18931d(C17327D c17327d) {
        C20030u c20030u = this.f63404d;
        AbstractC16544l.m18091d(c20030u);
        return c20030u.f63436i;
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: e */
    public final C17326C mo18932e(boolean z6) throws IOException {
        C17348o c17348o;
        C20030u c20030u = this.f63404d;
        if (c20030u == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c20030u) {
            c20030u.f63438k.m1413i();
            while (c20030u.f63434g.isEmpty() && c20030u.f63440m == 0) {
                try {
                    c20030u.m20845l();
                } catch (Throwable th2) {
                    c20030u.f63438k.m20833l();
                    throw th2;
                }
            }
            c20030u.f63438k.m20833l();
            if (c20030u.f63434g.isEmpty()) {
                IOException iOException = c20030u.f63441n;
                if (iOException != null) {
                    throw iOException;
                }
                int i10 = c20030u.f63440m;
                AbstractC14376f.m15824C(i10);
                throw new C20035z(i10);
            }
            Object objRemoveFirst = c20030u.f63434g.removeFirst();
            AbstractC16544l.m18093f(objRemoveFirst, "headersQueue.removeFirst()");
            c17348o = (C17348o) objRemoveFirst;
        }
        EnumC17357x protocol = this.f63405e;
        AbstractC16544l.m18094g(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c17348o.size();
        C0420b c0420bM8753b = null;
        for (int i11 = 0; i11 < size; i11++) {
            String name = c17348o.m19014m(i11);
            String value = c17348o.m19018s(i11);
            if (AbstractC16544l.m18089b(name, ":status")) {
                c0420bM8753b = AbstractC8170q0.m8753b("HTTP/1.1 " + value);
            } else if (!f63400h.contains(name)) {
                AbstractC16544l.m18094g(name, "name");
                AbstractC16544l.m18094g(value, "value");
                arrayList.add(name);
                arrayList.add(AbstractC21322p.m21711s0(value).toString());
            }
        }
        if (c0420bM8753b == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C17326C c17326c = new C17326C();
        c17326c.f55161b = protocol;
        c17326c.f55162c = c0420bM8753b.f1381Z;
        c17326c.f55163d = (String) c0420bM8753b.f1382o0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C3847l0 c3847l0 = new C3847l0(3);
        AbstractC17686t.m19399w(c3847l0.f11629a, strArr);
        c17326c.f55165f = c3847l0;
        if (z6 && c17326c.f55162c == 100) {
            return null;
        }
        return c17326c;
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: f */
    public final void mo18933f() {
        this.f63403c.flush();
    }

    @Override // ro.InterfaceC19259c
    /* JADX INFO: renamed from: g */
    public final void mo18934g(C17358y request) throws IOException {
        int i10;
        C20030u c20030u;
        AbstractC16544l.m18094g(request, "request");
        if (this.f63404d != null) {
            return;
        }
        boolean z6 = true;
        boolean z10 = request.f55382d != null;
        C17348o c17348o = request.f55381c;
        ArrayList arrayList = new ArrayList(c17348o.size() + 4);
        arrayList.add(new C20011b(C20011b.f63332f, request.f55380b));
        C0678l c0678l = C20011b.f63333g;
        C17349p url = request.f55379a;
        AbstractC16544l.m18094g(url, "url");
        String strM19021b = url.m19021b();
        String strM19023d = url.m19023d();
        if (strM19023d != null) {
            strM19021b = strM19021b + '?' + strM19023d;
        }
        arrayList.add(new C20011b(c0678l, strM19021b));
        String strM19012f = request.f55381c.m19012f("Host");
        if (strM19012f != null) {
            arrayList.add(new C20011b(C20011b.f63335i, strM19012f));
        }
        arrayList.add(new C20011b(C20011b.f63334h, url.f55286a));
        int size = c17348o.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strM19014m = c17348o.m19014m(i11);
            Locale locale = Locale.US;
            String strM534w = AbstractC0168G.m534w(locale, "US", strM19014m, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f63399g.contains(strM534w) || (strM534w.equals("te") && AbstractC16544l.m18089b(c17348o.m19018s(i11), "trailers"))) {
                arrayList.add(new C20011b(strM534w, c17348o.m19018s(i11)));
            }
        }
        C20022m c20022m = this.f63403c;
        c20022m.getClass();
        boolean z11 = !z10;
        synchronized (c20022m.f63382I0) {
            synchronized (c20022m) {
                try {
                    if (c20022m.f63389q0 > 1073741823) {
                        c20022m.m20815E(8);
                    }
                    if (c20022m.f63390r0) {
                        throw new C20010a();
                    }
                    i10 = c20022m.f63389q0;
                    c20022m.f63389q0 = i10 + 2;
                    c20030u = new C20030u(i10, c20022m, z11, false, null);
                    if (z10 && c20022m.f63379F0 < c20022m.f63380G0 && c20030u.f63432e < c20030u.f63433f) {
                        z6 = false;
                    }
                    if (c20030u.m20842i()) {
                        c20022m.f63386Z.put(Integer.valueOf(i10), c20030u);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c20022m.f63382I0.m20846E(z11, i10, arrayList);
        }
        if (z6) {
            c20022m.f63382I0.flush();
        }
        this.f63404d = c20030u;
        if (this.f63406f) {
            C20030u c20030u2 = this.f63404d;
            AbstractC16544l.m18091d(c20030u2);
            c20030u2.m20838e(9);
            throw new IOException("Canceled");
        }
        C20030u c20030u3 = this.f63404d;
        AbstractC16544l.m18091d(c20030u3);
        C20029t c20029t = c20030u3.f63438k;
        long j10 = this.f63402b.f61059g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c20029t.mo1389g(j10, timeUnit);
        C20030u c20030u4 = this.f63404d;
        AbstractC16544l.m18091d(c20030u4);
        c20030u4.f63439l.mo1389g(this.f63402b.f61060h, timeUnit);
    }

    @Override // ro.InterfaceC19259c
    public final C18795k getConnection() {
        return this.f63401a;
    }
}
