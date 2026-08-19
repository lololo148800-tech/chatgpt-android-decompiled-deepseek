package mo;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p049Bm.InterfaceC1426a;
import p417R2.C6793e;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: mo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C17347n {

    /* JADX INFO: renamed from: a */
    public final EnumC17331H f55280a;

    /* JADX INFO: renamed from: b */
    public final C17341h f55281b;

    /* JADX INFO: renamed from: c */
    public final List f55282c;

    /* JADX INFO: renamed from: d */
    public final C17314q f55283d;

    public C17347n(EnumC17331H enumC17331H, C17341h c17341h, List list, InterfaceC1426a interfaceC1426a) {
        this.f55280a = enumC17331H;
        this.f55281b = c17341h;
        this.f55282c = list;
        this.f55283d = AbstractC9227W.m9800c(new C6793e(1, interfaceC1426a));
    }

    /* JADX INFO: renamed from: a */
    public final List m19011a() {
        return (List) this.f55283d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17347n) {
            C17347n c17347n = (C17347n) obj;
            if (c17347n.f55280a == this.f55280a && AbstractC16544l.m18089b(c17347n.f55281b, this.f55281b) && AbstractC16544l.m18089b(c17347n.m19011a(), m19011a()) && AbstractC16544l.m18089b(c17347n.f55282c, this.f55282c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55282c.hashCode() + ((m19011a().hashCode() + ((this.f55281b.hashCode() + ((this.f55280a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM19011a = m19011a();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19011a, 10));
        for (Certificate certificate : listM19011a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC16544l.m18093f(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f55280a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f55281b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f55282c;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC16544l.m18093f(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
