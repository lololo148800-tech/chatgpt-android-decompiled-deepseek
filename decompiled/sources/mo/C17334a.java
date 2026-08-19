package mo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9100A3;
import p571X9.AbstractC9306j0;
import p712dp.C13187c;
import p775h2.AbstractC14376f;
import p817j$.util.Objects;

/* JADX INFO: renamed from: mo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17334a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17345l f55201a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f55202b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f55203c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f55204d;

    /* JADX INFO: renamed from: e */
    public final C17339f f55205e;

    /* JADX INFO: renamed from: f */
    public final C17335b f55206f;

    /* JADX INFO: renamed from: g */
    public final Proxy f55207g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f55208h;

    /* JADX INFO: renamed from: i */
    public final C17349p f55209i;

    /* JADX INFO: renamed from: j */
    public final List f55210j;

    /* JADX INFO: renamed from: k */
    public final List f55211k;

    public C17334a(String uriHost, int i10, InterfaceC17345l dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C17339f c17339f, C17335b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC16544l.m18094g(uriHost, "uriHost");
        AbstractC16544l.m18094g(dns, "dns");
        AbstractC16544l.m18094g(socketFactory, "socketFactory");
        AbstractC16544l.m18094g(proxyAuthenticator, "proxyAuthenticator");
        AbstractC16544l.m18094g(protocols, "protocols");
        AbstractC16544l.m18094g(connectionSpecs, "connectionSpecs");
        AbstractC16544l.m18094g(proxySelector, "proxySelector");
        this.f55201a = dns;
        this.f55202b = socketFactory;
        this.f55203c = sSLSocketFactory;
        this.f55204d = hostnameVerifier;
        this.f55205e = c17339f;
        this.f55206f = proxyAuthenticator;
        this.f55207g = proxy;
        this.f55208h = proxySelector;
        C13187c c13187c = new C13187c(1);
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            c13187c.f41847e = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            c13187c.f41847e = "https";
        }
        String strM9630d = AbstractC9100A3.m9630d(C17335b.m18996f(uriHost, 0, 0, false, 7));
        if (strM9630d == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        c13187c.f41850h = strM9630d;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "unexpected port: ").toString());
        }
        c13187c.f41844b = i10;
        this.f55209i = c13187c.m14841c();
        this.f55210j = AbstractC17708b.m19433y(protocols);
        this.f55211k = AbstractC17708b.m19433y(connectionSpecs);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18992a(C17334a that) {
        AbstractC16544l.m18094g(that, "that");
        return AbstractC16544l.m18089b(this.f55201a, that.f55201a) && AbstractC16544l.m18089b(this.f55206f, that.f55206f) && AbstractC16544l.m18089b(this.f55210j, that.f55210j) && AbstractC16544l.m18089b(this.f55211k, that.f55211k) && AbstractC16544l.m18089b(this.f55208h, that.f55208h) && AbstractC16544l.m18089b(this.f55207g, that.f55207g) && AbstractC16544l.m18089b(this.f55203c, that.f55203c) && AbstractC16544l.m18089b(this.f55204d, that.f55204d) && AbstractC16544l.m18089b(this.f55205e, that.f55205e) && this.f55209i.f55290e == that.f55209i.f55290e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17334a) {
            C17334a c17334a = (C17334a) obj;
            if (AbstractC16544l.m18089b(this.f55209i, c17334a.f55209i) && m18992a(c17334a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f55205e) + ((Objects.hashCode(this.f55204d) + ((Objects.hashCode(this.f55203c) + ((Objects.hashCode(this.f55207g) + ((this.f55208h.hashCode() + AbstractC14376f.m15858x(this.f55211k, AbstractC14376f.m15858x(this.f55210j, (this.f55206f.hashCode() + ((this.f55201a.hashCode() + AbstractC0168G.m527p(527, 31, this.f55209i.f55294i)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        C17349p c17349p = this.f55209i;
        sb2.append(c17349p.f55289d);
        sb2.append(':');
        sb2.append(c17349p.f55290e);
        sb2.append(", ");
        Proxy proxy = this.f55207g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f55208h;
        }
        return AbstractC9306j0.m9892k(sb2, str, '}');
    }
}
