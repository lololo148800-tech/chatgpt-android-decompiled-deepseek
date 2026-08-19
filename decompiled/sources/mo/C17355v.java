package mo;

import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.clientreport.C15333a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p1136yo.C21561c;
import p117Eb.C2391u;
import p523V9.AbstractC8152n6;
import p604Yk.C10077b;
import p817j$.util.DesugarCollections;
import p849k7.C16349b;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: mo.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C17355v {

    /* JADX INFO: renamed from: A */
    public long f55313A;

    /* JADX INFO: renamed from: B */
    public C10077b f55314B;

    /* JADX INFO: renamed from: a */
    public C2391u f55315a = new C2391u(19);

    /* JADX INFO: renamed from: b */
    public C15333a f55316b = new C15333a(3);

    /* JADX INFO: renamed from: c */
    public final ArrayList f55317c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f55318d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public C16349b f55319e = new C16349b(12);

    /* JADX INFO: renamed from: f */
    public boolean f55320f = true;

    /* JADX INFO: renamed from: g */
    public C17335b f55321g;

    /* JADX INFO: renamed from: h */
    public boolean f55322h;

    /* JADX INFO: renamed from: i */
    public boolean f55323i;

    /* JADX INFO: renamed from: j */
    public C17335b f55324j;

    /* JADX INFO: renamed from: k */
    public InterfaceC17345l f55325k;

    /* JADX INFO: renamed from: l */
    public Proxy f55326l;

    /* JADX INFO: renamed from: m */
    public ProxySelector f55327m;

    /* JADX INFO: renamed from: n */
    public C17335b f55328n;

    /* JADX INFO: renamed from: o */
    public SocketFactory f55329o;

    /* JADX INFO: renamed from: p */
    public SSLSocketFactory f55330p;

    /* JADX INFO: renamed from: q */
    public X509TrustManager f55331q;

    /* JADX INFO: renamed from: r */
    public List f55332r;

    /* JADX INFO: renamed from: s */
    public List f55333s;

    /* JADX INFO: renamed from: t */
    public C21561c f55334t;

    /* JADX INFO: renamed from: u */
    public C17339f f55335u;

    /* JADX INFO: renamed from: v */
    public AbstractC8152n6 f55336v;

    /* JADX INFO: renamed from: w */
    public int f55337w;

    /* JADX INFO: renamed from: x */
    public int f55338x;

    /* JADX INFO: renamed from: y */
    public int f55339y;

    /* JADX INFO: renamed from: z */
    public int f55340z;

    public C17355v() {
        C17335b c17335b = C17335b.f55212b;
        this.f55321g = c17335b;
        this.f55322h = true;
        this.f55323i = true;
        this.f55324j = C17335b.f55213c;
        this.f55325k = InterfaceC17345l.f55276a;
        this.f55328n = c17335b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC16544l.m18093f(socketFactory, "getDefault()");
        this.f55329o = socketFactory;
        this.f55332r = C17356w.f55342P0;
        this.f55333s = C17356w.f55341O0;
        this.f55334t = C21561c.f68277a;
        this.f55335u = C17339f.f55229c;
        this.f55338x = ErrorBoundaryKt.SAMPLING_RATE;
        this.f55339y = ErrorBoundaryKt.SAMPLING_RATE;
        this.f55340z = ErrorBoundaryKt.SAMPLING_RATE;
        this.f55313A = 1024L;
    }

    /* JADX INFO: renamed from: a */
    public final void m19031a(long j10, TimeUnit unit) {
        AbstractC16544l.m18094g(unit, "unit");
        this.f55338x = AbstractC17708b.m19410b(j10, unit);
    }

    /* JADX INFO: renamed from: b */
    public final void m19032b(List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(protocols);
        EnumC17357x enumC17357x = EnumC17357x.H2_PRIOR_KNOWLEDGE;
        if (!arrayListM19323D0.contains(enumC17357x) && !arrayListM19323D0.contains(EnumC17357x.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListM19323D0).toString());
        }
        if (arrayListM19323D0.contains(enumC17357x) && arrayListM19323D0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListM19323D0).toString());
        }
        if (arrayListM19323D0.contains(EnumC17357x.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListM19323D0).toString());
        }
        if (arrayListM19323D0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListM19323D0.remove(EnumC17357x.SPDY_3);
        if (!arrayListM19323D0.equals(this.f55333s)) {
            this.f55314B = null;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayListM19323D0);
        AbstractC16544l.m18093f(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        this.f55333s = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: c */
    public final void m19033c(long j10, TimeUnit unit) {
        AbstractC16544l.m18094g(unit, "unit");
        this.f55339y = AbstractC17708b.m19410b(j10, unit);
    }
}
