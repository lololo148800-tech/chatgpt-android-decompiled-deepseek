package p1113xn;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC7989S5;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: xn.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21323q extends AbstractC7989S5 {
    /* JADX INFO: renamed from: d */
    public static String m21717d(String str) {
        int length;
        Comparable comparable;
        AbstractC16544l.m18094g(str, "<this>");
        List listM21685S = AbstractC21322p.m21685S(str);
        List list = listM21685S;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC21322p.m21681O((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC7966P5.m8258f(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM21685S.size();
        int iM19381j = AbstractC17681o.m19381j(listM21685S);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i10 = length + 1;
            if (length < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            String str3 = (String) obj2;
            String strM21669C = ((length == 0 || length == iM19381j) && AbstractC21322p.m21681O(str3)) ? null : AbstractC21322p.m21669C(iIntValue, str3);
            if (strM21669C != null) {
                arrayList3.add(strM21669C);
            }
            length = i10;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        AbstractC17680n.m19347W(arrayList3, sb2, Separators.RETURN, (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : null);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m21718e(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (AbstractC21322p.m21681O("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM21685S = AbstractC21322p.m21685S(str);
        int length = str.length();
        listM21685S.size();
        int iM19381j = AbstractC17681o.m19381j(listM21685S);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM21685S) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iM19381j) || !AbstractC21322p.m21681O(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!AbstractC7966P5.m8258f(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && AbstractC21329w.m21733t(i12, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb2 = new StringBuilder(length);
        AbstractC17680n.m19347W(arrayList, sb2, Separators.RETURN, (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : null);
        return sb2.toString();
    }
}
