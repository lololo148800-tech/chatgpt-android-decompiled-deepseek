package p714e0;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21329w;
import p712dp.C13187c;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13254b {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f41868a;

    public C13254b(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            linkedHashMap.put(AbstractC0168G.m534w(locale, "US", str, locale, "toLowerCase(...)"), entry.getValue());
        }
        this.f41868a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public Set m14851a(C17349p url) {
        AbstractC16544l.m18094g(url, "url");
        LinkedHashMap linkedHashMap = this.f41868a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!AbstractC16544l.m18089b(entry.getKey(), Separators.STAR)) {
                Object key = entry.getKey();
                String str = url.f55289d;
                if (!AbstractC16544l.m18089b(key, str)) {
                    if (AbstractC21329w.m21725l(str, Separators.DOT + entry.getKey(), false)) {
                    }
                }
            }
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        return AbstractC17680n.m19328G0(AbstractC17682p.m19390s(linkedHashMap2.values()));
    }

    /* JADX INFO: renamed from: b */
    public boolean m14852b(String str) {
        C17349p c17349pM14841c = null;
        try {
            C13187c c13187c = new C13187c(1);
            c13187c.m14844f(null, str);
            c17349pM14841c = c13187c.m14841c();
        } catch (IllegalArgumentException unused) {
        }
        if (c17349pM14841c == null) {
            return false;
        }
        return m14853c(c17349pM14841c);
    }

    /* JADX INFO: renamed from: c */
    public boolean m14853c(C17349p url) {
        AbstractC16544l.m18094g(url, "url");
        Set<String> setKeySet = this.f41868a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        for (String str : setKeySet) {
            if (!AbstractC16544l.m18089b(str, Separators.STAR)) {
                String str2 = url.f55289d;
                if (!AbstractC16544l.m18089b(str2, str)) {
                    if (AbstractC21329w.m21725l(str2, Separators.DOT + str, false)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
