package p1048uo;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: renamed from: uo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C20406m extends C20407n {

    /* JADX INFO: renamed from: d */
    public static final boolean f64523d;

    /* JADX INFO: renamed from: c */
    public final Provider f64524c = new OpenJSSE();

    static {
        boolean z6 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, AbstractC20405l.class.getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f64523d = z6;
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f64524c);
        AbstractC16544l.m18093f(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p1048uo.C20407n
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo21065n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f64524c);
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
