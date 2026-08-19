package p1048uo;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import org.conscrypt.Conscrypt;
import p885m4.C17152b;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: uo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C20401h extends C20407n {

    /* JADX INFO: renamed from: d */
    public static final boolean f64512d;

    /* JADX INFO: renamed from: c */
    public final Provider f64513c;

    static {
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC20399f.class.getClassLoader());
            if (Conscrypt.isAvailable() && AbstractC20399f.m21066a()) {
                z6 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f64512d = z6;
    }

    public C20401h() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC16544l.m18093f(providerNewProvider, "newProvider()");
        this.f64513c = providerNewProvider;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo21051d(sSLSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C17152b.m18910g(protocols).toArray(new String[0]));
        }
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory mo21068m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextMo21064l = mo21064l();
        sSLContextMo21064l.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo21064l.getSocketFactory();
        AbstractC16544l.m18093f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo21065n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC16544l.m18091d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC16544l.m18092e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C20400g.f64511a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC16544l.m18093f(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: l */
    public final SSLContext mo21064l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f64513c);
        AbstractC16544l.m18093f(sSLContext, sVDIzpC.sNRAOFZhUtCoN);
        return sSLContext;
    }
}
