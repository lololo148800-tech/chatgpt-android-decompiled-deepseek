package p1068vo;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8152n6;

/* JADX INFO: renamed from: vo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20652b extends AbstractC8152n6 {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f65529a;

    /* JADX INFO: renamed from: b */
    public final X509TrustManagerExtensions f65530b;

    public C20652b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f65529a = x509TrustManager;
        this.f65530b = x509TrustManagerExtensions;
    }

    @Override // p523V9.AbstractC8152n6
    /* JADX INFO: renamed from: e */
    public final List mo8703e(String hostname, List chain) throws SSLPeerUnverifiedException {
        AbstractC16544l.m18094g(chain, "chain");
        AbstractC16544l.m18094g(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f65530b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC16544l.m18093f(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20652b) && ((C20652b) obj).f65529a == this.f65529a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f65529a);
    }
}
