package p1076w6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1057v6.C20461a;
import p1057v6.C20468h;
import p228J.AbstractC3812N;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p909nm.C17691y;

/* JADX INFO: renamed from: w6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C20848f extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final LinkedHashMap f66291o0;

    public C20848f() {
        super((char) 0, 12);
        this.f66291o0 = new LinkedHashMap();
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: G */
    public final C20468h mo4516G(String key, C20461a cacheHeaders) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        try {
            AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
            C20468h c20468hMo4516G = abstractC3812N != null ? abstractC3812N.mo4516G(key, cacheHeaders) : null;
            return c20468hMo4516G;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: H */
    public final Collection mo4517H(Collection keys, C20461a cacheHeaders) {
        Map linkedHashMap;
        Collection collectionMo4517H;
        AbstractC16544l.m18094g(keys, "keys");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
        if (abstractC3812N == null || (collectionMo4517H = abstractC3812N.mo4517H(keys, cacheHeaders)) == null) {
            linkedHashMap = C17690x.f56481Y;
        } else {
            Collection collection = collectionMo4517H;
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(collection, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM19257b);
            for (Object obj : collection) {
                linkedHashMap.put(((C20468h) obj).f64972Y, obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C20468h c20468h = (C20468h) linkedHashMap.get(str);
            if (c20468h != null) {
                arrayList.add(c20468h);
            }
        }
        return arrayList;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: I */
    public final Set mo4518I(Collection records, C20461a cacheHeaders) {
        AbstractC16544l.m18094g(records, "records");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
        return abstractC3812N != null ? abstractC3812N.mo4518I(records, cacheHeaders) : C17691y.f56482Y;
    }
}
