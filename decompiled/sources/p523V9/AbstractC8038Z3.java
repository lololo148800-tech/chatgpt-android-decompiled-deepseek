package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p027Ap.C0693a;
import p1008s8.C19494w;
import p1113xn.AbstractC21328v;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7542g;
import p571X9.AbstractC9393x3;
import p571X9.AbstractC9400y4;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: V9.Z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8038Z3 {
    /* JADX INFO: renamed from: a */
    public static final String m8392a(int i10) {
        return AbstractC10763a.m11048f(i10, "appWidget-");
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m8393b(Bundle bundle) {
        int i10 = bundle.getInt("appWidgetMinHeight", 0);
        int i11 = bundle.getInt("appWidgetMaxWidth", 0);
        C7542g c7542g = null;
        C7542g c7542g2 = (i10 == 0 || i11 == 0) ? null : new C7542g(AbstractC9400y4.m9979b(i11, i10));
        int i12 = bundle.getInt("appWidgetMaxHeight", 0);
        int i13 = bundle.getInt("appWidgetMinWidth", 0);
        if (i12 != 0 && i13 != 0) {
            c7542g = new C7542g(AbstractC9400y4.m9979b(i13, i12));
        }
        return AbstractC17678l.m19315v(new C7542g[]{c7542g2, c7542g});
    }

    /* JADX INFO: renamed from: c */
    public static C19494w m8394c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("build");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("version");
            return new C19494w(strMo4384r, strMo4384r2, abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Os", e12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final ArrayList m8395d(Object obj) {
        C0693a c0693aM8396e = m8396e(obj);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        for (Object obj2 : c0693aM8396e.f2015Y) {
            arrayList.add(obj2 instanceof Number ? Double.valueOf(((Number) obj2).doubleValue()) : obj2 instanceof String ? AbstractC21328v.m21719f((String) obj2) : null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final C0693a m8396e(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        return list != null ? new C0693a(list) : new C0693a(AbstractC9393x3.m9974d(obj));
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m8397f(List list) {
        C0693a c0693aM8396e = m8396e(list);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        for (Object obj : c0693aM8396e.f2015Y) {
            arrayList.add(obj instanceof Comparable ? (Comparable) obj : obj instanceof List ? new C0693a((List) obj) : null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m8398g(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null || map.isEmpty()) {
            return false;
        }
        Set setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    return false;
                }
            }
        }
        return true;
    }
}
