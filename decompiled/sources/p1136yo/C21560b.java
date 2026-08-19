package p1136yo;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C21560b implements InterfaceC21562d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f68276a;

    public C21560b(X509Certificate... caCerts) {
        AbstractC16544l.m18094g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC16544l.m18093f(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f68276a = linkedHashMap;
    }

    @Override // p1136yo.InterfaceC21562d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo21054a(X509Certificate x509Certificate) {
        Set set = (Set) this.f68276a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C21560b) && AbstractC16544l.m18089b(((C21560b) obj).f68276a, this.f68276a));
    }

    public final int hashCode() {
        return this.f68276a.hashCode();
    }
}
