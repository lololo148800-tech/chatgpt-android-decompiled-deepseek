package p857kl;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.ktor.client.plugins.auth.C15058c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1045ul.C20387d;
import p1045ul.C20388e;
import p1091wn.AbstractC21031l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p265Kb.C4613f;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC8150n4;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8633f4;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import sl.AbstractC19667b;

/* JADX INFO: renamed from: kl.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16467o {

    /* JADX INFO: renamed from: a */
    public static final Set f51084a = AbstractC17678l.m19293P(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});

    /* JADX INFO: renamed from: b */
    public static final C21319m f51085b = new C21319m("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* JADX INFO: renamed from: c */
    public static final Set f51086c = AbstractC17678l.m19293P(new Character[]{';', ',', '\"'});

    /* JADX INFO: renamed from: a */
    public static final void m18039a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (m18044f(str.charAt(i10))) {
                throw new IllegalArgumentException("Cookie name is not valid: ".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m18040b(String value, EnumC16465m encoding) {
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(encoding, "encoding");
        int iOrdinal = encoding.ordinal();
        if (iOrdinal == 0) {
            return value;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return AbstractC16455c.m18032e(value, true);
            }
            if (iOrdinal == 3) {
                return AbstractC19667b.m20646b(value);
            }
            throw new C0644w();
        }
        if (AbstractC21322p.m21668B(value, '\"')) {
            throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        for (int i10 = 0; i10 < value.length(); i10++) {
            if (m18044f(value.charAt(i10))) {
                return AbstractC10763a.m11047e('\"', Separators.DOUBLE_QUOTE, value);
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: c */
    public static final Map m18041c(String cookiesHeader, final boolean z6) {
        AbstractC16544l.m18094g(cookiesHeader, "cookiesHeader");
        return AbstractC17659D.m19255q(AbstractC21031l.m21495s(AbstractC21031l.m21487k(AbstractC21031l.m21495s(C21319m.m21661b(cookiesHeader, f51085b), new C15058c(5)), new InterfaceC1436k() { // from class: kl.n
            /* JADX WARN: Code duplicated, block: B:6:0x0018  */
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                boolean z10;
                C17309l it = (C17309l) obj;
                AbstractC16544l.m18094g(it, "it");
                if (z6) {
                    z10 = AbstractC21329w.m21734u((String) it.f55136Y, "$", false) ? false : true;
                }
                return Boolean.valueOf(z10);
            }
        }), new C15058c(6)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x019e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final C16464l m18042d(String cookiesHeader) {
        EnumC16465m enumC16465mValueOf;
        String str;
        CharSequence charSequenceSubSequence;
        String strM21691Y;
        String str2;
        Integer numValueOf;
        String str3;
        C20387d c20387d;
        String str4;
        String string;
        C20387d c20387dM5359b;
        AbstractC16544l.m18094g(cookiesHeader, "cookiesHeader");
        Map mapM18041c = m18041c(cookiesHeader, false);
        for (Map.Entry entry : mapM18041c.entrySet()) {
            if (!AbstractC21329w.m21734u((String) entry.getKey(), "$", false)) {
                String str5 = (String) mapM18041c.get("$x-enc");
                if (str5 == null || (enumC16465mValueOf = EnumC16465m.valueOf(str5)) == null) {
                    enumC16465mValueOf = EnumC16465m.f51080Y;
                }
                EnumC16465m enumC16465m = enumC16465mValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(mapM18041c.size()));
                for (Map.Entry entry2 : mapM18041c.entrySet()) {
                    linkedHashMap.put(AbstractC8150n4.m8692e((String) entry2.getKey()), entry2.getValue());
                }
                String str6 = (String) entry.getKey();
                String encodedValue = (String) entry.getValue();
                AbstractC16544l.m18094g(encodedValue, "encodedValue");
                int iOrdinal = enumC16465m.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    if (AbstractC21329w.m21734u(AbstractC21322p.m21714v0(encodedValue).toString(), Separators.DOUBLE_QUOTE, false)) {
                        int length = encodedValue.length() - 1;
                        if (length < 0) {
                            charSequenceSubSequence = "";
                            break;
                        }
                        while (true) {
                            int i10 = length - 1;
                            if (!AbstractC7966P5.m8258f(encodedValue.charAt(length))) {
                                charSequenceSubSequence = encodedValue.subSequence(0, length + 1);
                                break;
                            }
                            if (i10 < 0) {
                                charSequenceSubSequence = "";
                                break;
                            }
                            length = i10;
                        }
                        if (AbstractC21329w.m21725l(charSequenceSubSequence.toString(), Separators.DOUBLE_QUOTE, false)) {
                            strM21691Y = AbstractC21322p.m21691Y(AbstractC21322p.m21711s0(encodedValue).toString());
                        }
                        str2 = (String) linkedHashMap.get("max-age");
                        if (str2 != null) {
                            numValueOf = Integer.valueOf((int) AbstractC8301I.m8922m(Long.parseLong(str2), 0L, 2147483647L));
                        } else {
                            numValueOf = null;
                        }
                        str3 = (String) linkedHashMap.get("expires");
                        if (str3 != null) {
                            List list = AbstractC16469q.f51106a;
                            string = AbstractC21322p.m21711s0(str3).toString();
                            try {
                                c20387dM5359b = AbstractC8633f4.m9286f(string);
                            } catch (C16441H unused) {
                                AbstractC16544l.m18094g(string, "<this>");
                                String string2 = AbstractC21322p.m21711s0(string).toString();
                                Iterator it = AbstractC16469q.f51106a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        throw new IllegalStateException(("Failed to parse date: " + string2).toString());
                                    }
                                    try {
                                        c20387dM5359b = new C4613f((String) it.next(), 4).m5359b(string);
                                        break;
                                    } catch (C20388e unused2) {
                                    }
                                }
                            }
                            c20387d = c20387dM5359b;
                        } else {
                            c20387d = null;
                        }
                        String str7 = (String) linkedHashMap.get("domain");
                        String str8 = (String) linkedHashMap.get("path");
                        boolean zContainsKey = linkedHashMap.containsKey("secure");
                        boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry3 : mapM18041c.entrySet()) {
                            str4 = (String) entry3.getKey();
                            if (f51084a.contains(AbstractC8150n4.m8692e(str4)) && !str4.equals(entry.getKey())) {
                                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        return new C16464l(str6, str, enumC16465m, numValueOf, c20387d, str7, str8, zContainsKey, zContainsKey2, linkedHashMap2);
                    }
                    str = encodedValue;
                    str2 = (String) linkedHashMap.get("max-age");
                    if (str2 != null) {
                        numValueOf = Integer.valueOf((int) AbstractC8301I.m8922m(Long.parseLong(str2), 0L, 2147483647L));
                    } else {
                        numValueOf = null;
                    }
                    str3 = (String) linkedHashMap.get("expires");
                    if (str3 != null) {
                        List list2 = AbstractC16469q.f51106a;
                        string = AbstractC21322p.m21711s0(str3).toString();
                        c20387dM5359b = AbstractC8633f4.m9286f(string);
                        c20387d = c20387dM5359b;
                    } else {
                        c20387d = null;
                    }
                    String str9 = (String) linkedHashMap.get("domain");
                    String str10 = (String) linkedHashMap.get("path");
                    boolean zContainsKey3 = linkedHashMap.containsKey("secure");
                    boolean zContainsKey4 = linkedHashMap.containsKey("httponly");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    while (r15.hasNext()) {
                        str4 = (String) entry3.getKey();
                        if (f51084a.contains(AbstractC8150n4.m8692e(str4))) {
                        }
                    }
                    return new C16464l(str6, str, enumC16465m, numValueOf, c20387d, str9, str10, zContainsKey3, zContainsKey4, linkedHashMap3);
                }
                if (iOrdinal == 2) {
                    strM21691Y = AbstractC16455c.m18031d(encodedValue, 0, 0, true, 11);
                } else {
                    if (iOrdinal != 3) {
                        throw new C0644w();
                    }
                    strM21691Y = AbstractC19667b.m20645a(encodedValue);
                }
                str = strM21691Y;
                str2 = (String) linkedHashMap.get("max-age");
                if (str2 != null) {
                    numValueOf = Integer.valueOf((int) AbstractC8301I.m8922m(Long.parseLong(str2), 0L, 2147483647L));
                } else {
                    numValueOf = null;
                }
                str3 = (String) linkedHashMap.get("expires");
                if (str3 != null) {
                    List list3 = AbstractC16469q.f51106a;
                    string = AbstractC21322p.m21711s0(str3).toString();
                    c20387dM5359b = AbstractC8633f4.m9286f(string);
                    c20387d = c20387dM5359b;
                } else {
                    c20387d = null;
                }
                String str11 = (String) linkedHashMap.get("domain");
                String str12 = (String) linkedHashMap.get("path");
                boolean zContainsKey5 = linkedHashMap.containsKey("secure");
                boolean zContainsKey6 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                while (r15.hasNext()) {
                    str4 = (String) entry3.getKey();
                    if (f51084a.contains(AbstractC8150n4.m8692e(str4))) {
                    }
                }
                return new C16464l(str6, str, enumC16465m, numValueOf, c20387d, str11, str12, zContainsKey5, zContainsKey6, linkedHashMap4);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: e */
    public static final String m18043e(C16464l cookie) {
        AbstractC16544l.m18094g(cookie, "cookie");
        return cookie.f51070a + '=' + m18040b(cookie.f51071b, cookie.f51072c);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m18044f(char c9) {
        if (!AbstractC7966P5.m8258f(c9) && AbstractC16544l.m18096i(c9, 32) >= 0) {
            if (!f51086c.contains(Character.valueOf(c9))) {
                return false;
            }
        }
        return true;
    }
}
