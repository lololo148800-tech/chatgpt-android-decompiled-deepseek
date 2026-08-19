package ro;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17335b;
import mo.C17344k;
import mo.C17348o;
import mo.C17349p;
import no.AbstractC17708b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p026Ao.C0678l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9100A3;
import p571X9.AbstractC9258b0;
import p817j$.util.DesugarCollections;
import p909nm.C17689w;
import p959q8.C18639a;

/* JADX INFO: renamed from: ro.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19260d {
    static {
        C0678l c0678l = C0678l.f1971p0;
        C18639a.m19996n("\"\\");
        C18639a.m19996n("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m20332a(C17327D c17327d) {
        if (AbstractC16544l.m18089b(c17327d.f55173Y.f55380b, "HEAD")) {
            return false;
        }
        int i10 = c17327d.f55176p0;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && AbstractC17708b.m19420l(c17327d) == -1) {
            String strM19012f = c17327d.f55178r0.m19012f("Transfer-Encoding");
            if (strM19012f == null) {
                strM19012f = null;
            }
            if (!"chunked".equalsIgnoreCase(strM19012f)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004c  */
    /* JADX INFO: renamed from: b */
    public static final void m20333b(C17335b c17335b, C17349p url, C17348o headers) {
        List listUnmodifiableList;
        String str;
        C17344k c17344k;
        AbstractC16544l.m18094g(c17335b, "<this>");
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(headers, "headers");
        if (c17335b == C17335b.f55213c) {
            return;
        }
        Pattern pattern = C17344k.f55263j;
        List listM19019t = headers.m19019t("Set-Cookie");
        int size = listM19019t.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            String setCookie = (String) listM19019t.get(i10);
            AbstractC16544l.m18094g(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c9 = ';';
            int iM19416h = AbstractC17708b.m19416h(setCookie, ';', 0, 0, 6);
            char c10 = '=';
            int iM19416h2 = AbstractC17708b.m19416h(setCookie, '=', 0, iM19416h, 2);
            if (iM19416h2 == iM19416h) {
                c17344k = null;
                break;
            }
            String strM19408A = AbstractC17708b.m19408A(0, iM19416h2, setCookie);
            if (strM19408A.length() == 0 || AbstractC17708b.m19422n(strM19408A) != -1) {
                c17344k = null;
                break;
            }
            String strM19408A2 = AbstractC17708b.m19408A(iM19416h2 + 1, iM19416h, setCookie);
            if (AbstractC17708b.m19422n(strM19408A2) != -1) {
                c17344k = null;
                break;
            }
            int i11 = iM19416h + 1;
            int length = setCookie.length();
            long j10 = 253402300799999L;
            boolean z6 = true;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            long jM9834d = 253402300799999L;
            long j11 = -1;
            String str2 = null;
            String str3 = null;
            while (true) {
                if (i11 >= length) {
                    if (j11 == Long.MIN_VALUE) {
                        j10 = Long.MIN_VALUE;
                    } else if (j11 != -1) {
                        long j12 = jCurrentTimeMillis + (j11 <= 9223372036854775L ? j11 * ((long) 1000) : Long.MAX_VALUE);
                        if (j12 >= jCurrentTimeMillis && j12 <= 253402300799999L) {
                            j10 = j12;
                        }
                    } else {
                        j10 = jM9834d;
                    }
                    String str4 = url.f55289d;
                    String str5 = str2;
                    if (str5 == null) {
                        str5 = str4;
                    } else if (!AbstractC16544l.m18089b(str4, str5) && (!AbstractC21329w.m21725l(str4, str5, false) || str4.charAt((str4.length() - str5.length()) - 1) != '.' || AbstractC17708b.f56541f.m21664d(str4))) {
                        c17344k = null;
                        break;
                    }
                    if (str4.length() != str5.length() && PublicSuffixDatabase.f58092g.m19735a(str5) == null) {
                        c17344k = null;
                        break;
                    }
                    String strSubstring = Separators.SLASH;
                    String str6 = str3;
                    if (str6 == null || !AbstractC21329w.m21734u(str6, Separators.SLASH, false)) {
                        String strM19021b = url.m19021b();
                        int iM21683Q = AbstractC21322p.m21683Q(strM19021b, '/', 0, 6);
                        if (iM21683Q != 0) {
                            strSubstring = strM19021b.substring(0, iM21683Q);
                            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        str = strSubstring;
                    } else {
                        str = str6;
                    }
                    c17344k = new C17344k(strM19408A, strM19408A2, j10, str5, str, z10, z11, z12, z6);
                    break;
                }
                int iM19414f = AbstractC17708b.m19414f(setCookie, c9, i11, length);
                int iM19414f2 = AbstractC17708b.m19414f(setCookie, c10, i11, iM19414f);
                String strM19408A3 = AbstractC17708b.m19408A(i11, iM19414f2, setCookie);
                String strM19408A4 = iM19414f2 < iM19414f ? AbstractC17708b.m19408A(iM19414f2 + 1, iM19414f, setCookie) : "";
                if (strM19408A3.equalsIgnoreCase("expires")) {
                    try {
                        jM9834d = AbstractC9258b0.m9834d(strM19408A4.length(), strM19408A4);
                        z12 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (strM19408A3.equalsIgnoreCase("max-age")) {
                    try {
                        long j13 = Long.parseLong(strM19408A4);
                        j11 = j13 > 0 ? j13 : Long.MIN_VALUE;
                    } catch (NumberFormatException e10) {
                        Pattern patternCompile = Pattern.compile("-?\\d+");
                        AbstractC16544l.m18093f(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(strM19408A4).matches()) {
                            throw e10;
                        }
                        j11 = AbstractC21329w.m21734u(strM19408A4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                    }
                    z12 = true;
                } else if (strM19408A3.equalsIgnoreCase("domain")) {
                    if (AbstractC21329w.m21725l(strM19408A4, Separators.DOT, false)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String strM9630d = AbstractC9100A3.m9630d(AbstractC21322p.m21688V(strM19408A4, Separators.DOT));
                    if (strM9630d == null) {
                        throw new IllegalArgumentException();
                    }
                    str2 = strM9630d;
                    z6 = false;
                } else if (strM19408A3.equalsIgnoreCase("path")) {
                    str3 = strM19408A4;
                } else if (strM19408A3.equalsIgnoreCase("secure")) {
                    z10 = true;
                } else if (strM19408A3.equalsIgnoreCase("httponly")) {
                    z11 = true;
                }
                i11 = iM19414f + 1;
                c9 = ';';
                c10 = '=';
            }
            if (c17344k != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c17344k);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            AbstractC16544l.m18093f(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = C17689w.f56480Y;
        }
        listUnmodifiableList.isEmpty();
    }
}
