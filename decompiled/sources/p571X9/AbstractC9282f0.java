package p571X9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17352s;
import p003A1.AbstractC0168G;
import p027Ap.C0693a;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC8038Z3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: X9.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9282f0 {
    /* JADX INFO: renamed from: a */
    public static List m9855a(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return AbstractC9393x3.m9974d(m9856b(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(m9855a(it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m9856b(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number.doubleValue() == number.intValue()) {
                return String.valueOf(number.intValue());
            }
        }
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: c */
    public static C17352s m9857c(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        Matcher matcher = C17352s.f55296e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(AbstractC10763a.m11047e('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        AbstractC16544l.m18093f(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        String strM534w = AbstractC0168G.m534w(locale, "US", strGroup, locale, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC16544l.m18093f(strGroup2, "typeSubtype.group(2)");
        String lowerCase = strGroup2.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C17352s.f55297f.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC9306j0.m9892k(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC21329w.m21734u(strGroup4, Separators.QUOTE, false) && AbstractC21329w.m21725l(strGroup4, Separators.QUOTE, false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC16544l.m18093f(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new C17352s(str, strM534w, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public static C17352s m9858d(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        try {
            return m9857c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX INFO: renamed from: e */
    public static ArrayList m9859e(Object obj) {
        String strM9856b;
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        for (Object obj2 : c0693aM8396e.f2015Y) {
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC17686t.m19398v(m9855a(it.next()), arrayList2);
                }
                strM9856b = AbstractC17680n.m19349Y(arrayList2, Separators.COMMA, null, null, 0, null, null, 62);
                if (strM9856b == null) {
                    strM9856b = m9856b(obj2);
                }
            } else {
                strM9856b = m9856b(obj2);
            }
            arrayList.add(strM9856b);
        }
        return arrayList;
    }
}
