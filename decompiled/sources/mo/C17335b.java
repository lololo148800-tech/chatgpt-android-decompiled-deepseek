package mo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0675i;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p160G5.p161rK.TVCuK;
import p200Hm.C3506e;
import p530Vi.AbstractC8301I;
import p582Xk.HXHG.TfazcFv;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: mo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C17335b implements InterfaceC17345l {

    /* JADX INFO: renamed from: b */
    public static final C17335b f55212b = new C17335b();

    /* JADX INFO: renamed from: c */
    public static final C17335b f55213c = new C17335b();

    /* JADX INFO: renamed from: b */
    public static final C17341h m18993b(C17335b c17335b, String str) {
        C17341h c17341h = new C17341h(str);
        C17341h.f55234d.put(str, c17341h);
        return c17341h;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18995e(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && AbstractC17708b.m19427s(str.charAt(i10 + 1)) != -1 && AbstractC17708b.m19427s(str.charAt(i12)) != -1;
    }

    /* JADX INFO: renamed from: f */
    public static String m18996f(String str, int i10, int i11, boolean z6, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z6 = false;
        }
        AbstractC16544l.m18094g(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                C0675i c0675i = new C0675i();
                c0675i.m1443k1(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iM19427s = AbstractC17708b.m19427s(str.charAt(iCharCount + 1));
                        int iM19427s2 = AbstractC17708b.m19427s(str.charAt(i13));
                        if (iM19427s == -1 || iM19427s2 == -1) {
                            c0675i.m1445m1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0675i.m1436f1((iM19427s << 4) + iM19427s2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z6) {
                        c0675i.m1436f1(32);
                        iCharCount++;
                    } else {
                        c0675i.m1445m1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0675i.m1428Z0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m18997g(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iM21678L = AbstractC21322p.m21678L(str, '&', i10, false, 4);
            if (iM21678L == -1) {
                iM21678L = str.length();
            }
            int iM21678L2 = AbstractC21322p.m21678L(str, '=', i10, false, 4);
            if (iM21678L2 == -1 || iM21678L2 > iM21678L) {
                String strSubstring = str.substring(i10, iM21678L);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iM21678L2);
                AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM21678L2 + 1, iM21678L);
                AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i10 = iM21678L + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static void m18998h(ArrayList arrayList, StringBuilder sb2) {
        AbstractC16544l.m18094g(arrayList, "<this>");
        C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, arrayList.size()), 2);
        int i10 = c3506eM8928s.f10591Y;
        int i11 = c3506eM8928s.f10592Z;
        int i12 = c3506eM8928s.f10593o0;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i10);
            String str2 = (String) arrayList.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized C17341h m18999d(String javaName) {
        C17341h c17341h;
        String strConcat;
        try {
            AbstractC16544l.m18094g(javaName, "javaName");
            LinkedHashMap linkedHashMap = C17341h.f55234d;
            c17341h = (C17341h) linkedHashMap.get(javaName);
            if (c17341h == null) {
                boolean zM21734u = AbstractC21329w.m21734u(javaName, "TLS_", false);
                String str = TVCuK.LOZXpfVuVotNdtr;
                if (zM21734u) {
                    String strSubstring = javaName.substring(4);
                    AbstractC16544l.m18093f(strSubstring, str);
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC21329w.m21734u(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    AbstractC16544l.m18093f(strSubstring2, str);
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                c17341h = (C17341h) linkedHashMap.get(strConcat);
                if (c17341h == null) {
                    c17341h = new C17341h(javaName);
                }
                linkedHashMap.put(javaName, c17341h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c17341h;
    }

    /* JADX INFO: renamed from: c */
    public static String m18994c(String str, int i10, int i11, String str2, boolean z6, boolean z10, boolean z11, boolean z12, int i12) {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z13 = (i12 & 8) != 0 ? false : z6;
        boolean z14 = (i12 & 16) != 0 ? false : z10;
        boolean z15 = (i12 & 32) != 0 ? false : z11;
        boolean z16 = (i12 & 64) == 0 ? z12 : false;
        AbstractC16544l.m18094g(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            int i15 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z16) || AbstractC21322p.m21668B(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z13 || (z14 && !m18995e(iCharCount, length, str)))) || (iCodePointAt == 43 && z15)))) {
                C0675i c0675i = new C0675i();
                c0675i.m1443k1(i13, iCharCount, str);
                C0675i c0675i2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z13 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z15) {
                            c0675i.m1444l1(z13 ? TfazcFv.YCZjHJEnm : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i15 && !z16) || AbstractC21322p.m21668B(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z13 || (z14 && !m18995e(iCharCount, length, str)))))) {
                            if (c0675i2 == null) {
                                c0675i2 = new C0675i();
                            }
                            c0675i2.m1445m1(iCodePointAt2);
                            while (!c0675i2.mo1356g()) {
                                byte b = c0675i2.readByte();
                                c0675i.m1436f1(37);
                                char[] cArr = C17349p.f55285k;
                                c0675i.m1436f1(cArr[((b & 255) >> 4) & 15]);
                                c0675i.m1436f1(cArr[b & 15]);
                            }
                        } else {
                            c0675i.m1445m1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                    i15 = 128;
                }
                return c0675i.m1428Z0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // mo.InterfaceC17345l
    /* JADX INFO: renamed from: a */
    public List mo18927a(String hostname) throws UnknownHostException {
        AbstractC16544l.m18094g(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            AbstractC16544l.m18093f(allByName, "getAllByName(hostname)");
            return AbstractC17678l.m19291N(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(tpXhEMGxfXFVSh.WfeiqEyXiBVQmTU.concat(hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
