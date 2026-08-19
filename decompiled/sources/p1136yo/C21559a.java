package p1136yo;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8152n6;

/* JADX INFO: renamed from: yo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21559a extends AbstractC8152n6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21562d f68275a;

    public C21559a(InterfaceC21562d trustRootIndex) {
        AbstractC16544l.m18094g(trustRootIndex, "trustRootIndex");
        this.f68275a = trustRootIndex;
    }

    @Override // p523V9.AbstractC8152n6
    /* JADX INFO: renamed from: e */
    public final List mo8703e(String hostname, List chain) throws SSLPeerUnverifiedException {
        AbstractC16544l.m18094g(chain, "chain");
        AbstractC16544l.m18094g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC16544l.m18093f(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z6 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo21054a = this.f68275a.mo21054a(x509Certificate);
            if (x509CertificateMo21054a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo21054a)) {
                    arrayList.add(x509CertificateMo21054a);
                }
                if (AbstractC16544l.m18089b(x509CertificateMo21054a.getIssuerDN(), x509CertificateMo21054a.getSubjectDN())) {
                    try {
                        x509CertificateMo21054a.verify(x509CertificateMo21054a.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z6 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC16544l.m18093f(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (z6) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                    }
                    Object next = it.next();
                    AbstractC16544l.m18092e(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC16544l.m18089b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C21559a) && AbstractC16544l.m18089b(((C21559a) obj).f68275a, this.f68275a);
    }

    public final int hashCode() {
        return this.f68275a.hashCode();
    }
}
