package p1136yo;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p174Gk.uSfJ.HpucjswO;
import p571X9.AbstractC9100A3;
import p909nm.C17689w;

/* JADX INFO: renamed from: yo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C21561c implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C21561c f68277a = new C21561c();

    /* JADX INFO: renamed from: a */
    public static List m21844a(X509Certificate x509Certificate, int i10) {
        Object obj;
        C17689w c17689w = C17689w.f56480Y;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c17689w;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC16544l.m18089b(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c17689w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX INFO: renamed from: c */
    public static boolean m21846c(String host, X509Certificate x509Certificate) {
        boolean zM18089b;
        int length;
        AbstractC16544l.m18094g(host, "host");
        byte[] bArr = AbstractC17708b.f56536a;
        if (AbstractC17708b.f56541f.m21664d(host)) {
            String strM9630d = AbstractC9100A3.m9630d(host);
            List listM21844a = m21844a(x509Certificate, 7);
            if (!(listM21844a instanceof Collection) || !listM21844a.isEmpty()) {
                Iterator it = listM21844a.iterator();
                while (it.hasNext()) {
                    if (AbstractC16544l.m18089b(strM9630d, AbstractC9100A3.m9630d((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (m21845b(host)) {
                Locale locale = Locale.US;
                host = AbstractC0168G.m534w(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listM21844a2 = m21844a(x509Certificate, 2);
            if (!(listM21844a2 instanceof Collection) || !listM21844a2.isEmpty()) {
                for (String strM534w : listM21844a2) {
                    if (host.length() == 0 || AbstractC21329w.m21734u(host, Separators.DOT, false) || AbstractC21329w.m21725l(host, "..", false) || strM534w == null || strM534w.length() == 0 || AbstractC21329w.m21734u(strM534w, Separators.DOT, false) || AbstractC21329w.m21725l(strM534w, "..", false)) {
                        zM18089b = false;
                    } else {
                        String strConcat = !AbstractC21329w.m21725l(host, Separators.DOT, false) ? host.concat(Separators.DOT) : host;
                        if (!AbstractC21329w.m21725l(strM534w, Separators.DOT, false)) {
                            strM534w = strM534w.concat(Separators.DOT);
                        }
                        if (m21845b(strM534w)) {
                            Locale locale2 = Locale.US;
                            strM534w = AbstractC0168G.m534w(locale2, "US", strM534w, locale2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!AbstractC21322p.m21667A(strM534w, Separators.STAR, false)) {
                            zM18089b = AbstractC16544l.m18089b(strConcat, strM534w);
                        } else if (!AbstractC21329w.m21734u(strM534w, "*.", false) || AbstractC21322p.m21678L(strM534w, '*', 1, false, 4) != -1 || strConcat.length() < strM534w.length() || "*.".equals(strM534w)) {
                            zM18089b = false;
                        } else {
                            String strSubstring = strM534w.substring(1);
                            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (AbstractC21329w.m21725l(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC21322p.m21683Q(strConcat, '.', length - 1, 4) == -1)) {
                                zM18089b = true;
                            } else {
                                zM18089b = false;
                            }
                        }
                    }
                    if (zM18089b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        AbstractC16544l.m18094g(host, "host");
        AbstractC16544l.m18094g(session, "session");
        if (!m21845b(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC16544l.m18092e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m21846c(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21845b(String str) {
        int i10;
        char cCharAt;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j10 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 128) {
                        j10++;
                    } else {
                        if (cCharAt2 < 2048) {
                            i10 = 2;
                        } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                cCharAt = str.charAt(i12);
                            } else {
                                cCharAt = 0;
                            }
                            if (cCharAt2 <= 56319 && cCharAt >= 56320 && cCharAt <= 57343) {
                                j10 += (long) 4;
                                i11 += 2;
                            } else {
                                j10++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j10 += (long) i10;
                    }
                    i11++;
                }
                if (length != ((int) j10)) {
                    return false;
                }
                return true;
            }
            StringBuilder sbM11057o = AbstractC10763a.m11057o(length2, "endIndex > string.length: ", HpucjswO.lJbcYQgHyn);
            sbM11057o.append(str.length());
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(length2, "endIndex < beginIndex: ", " < 0").toString());
    }
}
