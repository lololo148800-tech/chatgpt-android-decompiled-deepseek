package p1048uo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC16544l;
import p1136yo.InterfaceC21562d;

/* JADX INFO: renamed from: uo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20395b implements InterfaceC21562d {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f64504a;

    /* JADX INFO: renamed from: b */
    public final Method f64505b;

    public C20395b(X509TrustManager x509TrustManager, Method method) {
        this.f64504a = x509TrustManager;
        this.f64505b = method;
    }

    @Override // p1136yo.InterfaceC21562d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo21054a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f64505b.invoke(this.f64504a, x509Certificate);
            AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20395b)) {
            return false;
        }
        C20395b c20395b = (C20395b) obj;
        return AbstractC16544l.m18089b(this.f64504a, c20395b.f64504a) && AbstractC16544l.m18089b(this.f64505b, c20395b.f64505b);
    }

    public final int hashCode() {
        return this.f64505b.hashCode() + (this.f64504a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f64504a + ", findByIssuerAndSignatureMethod=" + this.f64505b + ')';
    }
}
