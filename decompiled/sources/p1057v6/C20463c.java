package p1057v6;

import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p060C6.C1608e;
import p571X9.AbstractC9306j0;
import p784hb.C14438g;
import p909nm.AbstractC17682p;
import p917o6.C17859l;

/* JADX INFO: renamed from: v6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20463c {

    /* JADX INFO: renamed from: a */
    public static final C20463c f64957a = new C20463c();

    /* JADX INFO: renamed from: b */
    public static final C20463c f64958b = new C20463c();

    /* JADX INFO: renamed from: a */
    public Object m21110a(C17859l c17859l, C14438g c14438g, Map parent, String parentId) {
        AbstractC16544l.m18094g(parent, "parent");
        AbstractC16544l.m18094g(parentId, "parentId");
        Collection collectionValues = c17859l.m19599a(c14438g, new C15058c(16)).values();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        if (arrayList.isEmpty()) {
            String strM19600b = c17859l.m19600b(c14438g);
            if (parent.containsKey(strM19600b)) {
                return parent.get(strM19600b);
            }
            throw new C1608e(parentId, strM19600b, false);
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(c17859l.f56948b.mo9703b().f56956a, ":");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sbM9895n.append((String) it2.next());
        }
        String string = sbM9895n.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return new C20462b(string);
    }
}
