package p1048uo;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: renamed from: uo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C20398e extends C20407n {

    /* JADX INFO: renamed from: d */
    public static final boolean f64509d;

    /* JADX INFO: renamed from: c */
    public final Provider f64510c = new BouncyCastleJsseProvider();

    static {
        boolean z6 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC20397d.class.getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f64509d = z6;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: d */
    public final void mo21051d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        super.mo21051d(sSLSocket, str, protocols);
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: f */
    public final String mo21052f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: l */
    public final SSLContext mo21064l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f64510c);
        AbstractC16544l.m18093f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo21065n() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC16544l.m18091d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC16544l.m18092e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC16544l.m18093f(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
