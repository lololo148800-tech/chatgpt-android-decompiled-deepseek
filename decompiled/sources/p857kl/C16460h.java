package p857kl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0235c;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16460h extends AbstractC0235c {

    /* JADX INFO: renamed from: f */
    public static final C16460h f51065f = new C16460h(Separators.STAR, Separators.STAR, C17689w.f56480Y);

    /* JADX INFO: renamed from: d */
    public final String f51066d;

    /* JADX INFO: renamed from: e */
    public final String f51067e;

    public C16460h(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f51066d = str;
        this.f51067e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16460h) {
            C16460h c16460h = (C16460h) obj;
            if (AbstractC21329w.m21726m(this.f51066d, c16460h.f51066d) && AbstractC21329w.m21726m(this.f51067e, c16460h.f51067e) && AbstractC16544l.m18089b((List) this.f879c, (List) c16460h.f879c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f51066d.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f51067e.toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase2, "toLowerCase(...)");
        return (((List) this.f879c).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX INFO: renamed from: p */
    public final boolean m18036p(C16460h pattern) {
        boolean zM21726m;
        AbstractC16544l.m18094g(pattern, "pattern");
        String str = pattern.f51066d;
        if (!AbstractC16544l.m18089b(str, Separators.STAR) && !AbstractC21329w.m21726m(str, this.f51066d)) {
            return false;
        }
        String str2 = pattern.f51067e;
        if (!AbstractC16544l.m18089b(str2, Separators.STAR) && !AbstractC21329w.m21726m(str2, this.f51067e)) {
            return false;
        }
        Iterator it = ((List) pattern.f879c).iterator();
        do {
            zM21726m = true;
            if (!it.hasNext()) {
                return true;
            }
            C16473u c16473u = (C16473u) it.next();
            String str3 = c16473u.f51112a;
            boolean zM18089b = AbstractC16544l.m18089b(str3, Separators.STAR);
            String str4 = c16473u.f51113b;
            if (!zM18089b) {
                String strM779m = m779m(str3);
                if (!AbstractC16544l.m18089b(str4, Separators.STAR)) {
                    zM21726m = AbstractC21329w.m21726m(strM779m, str4);
                } else if (strM779m == null) {
                    zM21726m = false;
                    break;
                    break;
                }
            } else if (!AbstractC16544l.m18089b(str4, Separators.STAR)) {
                List list = (List) this.f879c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            zM21726m = false;
                            break;
                        }
                    } while (!AbstractC21329w.m21726m(((C16473u) it2.next()).f51113b, str4));
                } else {
                    zM21726m = false;
                    break;
                    break;
                }
            }
        } while (zM21726m);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (p1113xn.AbstractC21329w.m21726m(r1.f51113b, r6) != false) goto L23;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C16460h m18037q(String str, String value) {
        AbstractC16544l.m18094g(value, "value");
        List list = (List) this.f879c;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                List<C16473u> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (C16473u c16473u : list2) {
                        if (AbstractC21329w.m21726m(c16473u.f51112a, str) && AbstractC21329w.m21726m(c16473u.f51113b, value)) {
                            return this;
                        }
                    }
                }
            } else {
                C16473u c16473u2 = (C16473u) list.get(0);
                if (AbstractC21329w.m21726m(c16473u2.f51112a, str)) {
                }
            }
        }
        ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(list, new C16473u(str, value));
        return new C16460h(this.f51066d, this.f51067e, (String) this.f878b, arrayListM19362l0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16460h(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        AbstractC16544l.m18094g(contentType, "contentType");
        AbstractC16544l.m18094g(contentSubtype, "contentSubtype");
        AbstractC16544l.m18094g(parameters, "parameters");
    }
}
