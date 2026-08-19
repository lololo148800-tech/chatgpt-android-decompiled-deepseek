package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p586Y0.C9572x;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p990rg.C18984k;
import pg.C18412b;

/* JADX INFO: renamed from: Y9.y4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10003y4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: a */
    public static List m10642a(C18412b c18412b, String userInput, String suggestion) {
        ?? M9974d;
        c18412b.getClass();
        AbstractC16544l.m18094g(userInput, "userInput");
        AbstractC16544l.m18094g(suggestion, "suggestion");
        Locale locale = c18412b.f58748c;
        String lowerCase = userInput.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        String lowerCase2 = suggestion.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase2, "toLowerCase(...)");
        int length = lowerCase2.length();
        C17689w c17689w = C17689w.f56480Y;
        int length2 = 0;
        if (length == 0) {
            M9974d = c17689w;
        } else if (length != 1) {
            M9974d = new ArrayList(lowerCase2.length());
            for (int i10 = 0; i10 < lowerCase2.length(); i10++) {
                M9974d.add(Character.valueOf(lowerCase2.charAt(i10)));
            }
        } else {
            M9974d = AbstractC9393x3.m9974d(Character.valueOf(lowerCase2.charAt(0)));
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        for (Object obj : (Iterable) M9974d) {
            int i13 = i11 + 1;
            Integer numValueOf = null;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            char cCharValue = ((Character) obj).charValue();
            if (i12 < lowerCase.length() && cCharValue == lowerCase.charAt(i12)) {
                i12++;
                numValueOf = Integer.valueOf(i11);
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i11 = i13;
        }
        if (arrayList.isEmpty()) {
            return c17689w;
        }
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue > i14) {
                String strSubstring = suggestion.substring(i14, iIntValue);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                c18235bM9972b.add(new C18984k(strSubstring, false));
            }
            c18235bM9972b.add(new C18984k(String.valueOf(suggestion.charAt(iIntValue)), true));
            i14 = iIntValue + 1;
        }
        if (i14 < suggestion.length()) {
            String strSubstring2 = suggestion.substring(i14);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            c18235bM9972b.add(new C18984k(strSubstring2, false));
        }
        C18235b c18235bM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
        if (c18235bM9971a.isEmpty()) {
            return c18235bM9971a;
        }
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator = c18235bM9971a.listIterator(0);
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                break;
            }
            C18984k c18984k = (C18984k) c9572x.next();
            if (arrayList2.isEmpty() || ((C18984k) AbstractC17680n.m19351a0(arrayList2)).f60552b != c18984k.f60552b) {
                arrayList2.add(c18984k);
            } else {
                C18984k c18984k2 = (C18984k) arrayList2.remove(AbstractC17681o.m19381j(arrayList2));
                StringBuilder sbM9893l = AbstractC9306j0.m9893l(c18984k2.f60551a);
                sbM9893l.append(c18984k.f60551a);
                String text = sbM9893l.toString();
                AbstractC16544l.m18094g(text, "text");
                arrayList2.add(new C18984k(text, c18984k2.f60552b));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((C18984k) obj2).f60552b) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            length2 += AbstractC21322p.m21711s0(((C18984k) it2.next()).f60551a).toString().length();
        }
        return (arrayList2.size() > 4 || length2 < 2) ? c17689w : arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static void m10643b(int i10, int i11) {
        String strM10650c;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10650c = AbstractC10009z4.m10650c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10650c = AbstractC10009z4.m10650c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10650c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10644c(int i10, int i11, int i12) {
        String strM10645d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10645d = m10645d(i10, i12, "start index");
            } else {
                strM10645d = (i11 < 0 || i11 > i12) ? m10645d(i11, i12, "end index") : AbstractC10009z4.m10650c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10645d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m10645d(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC10009z4.m10650c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC10009z4.m10650c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
