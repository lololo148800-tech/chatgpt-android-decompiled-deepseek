package p1122y6;

import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p008A6.C0384d;
import p008A6.C0386f;
import p008A6.C0387g;
import p008A6.C0388h;
import p008A6.C0390j;
import p1057v6.C20461a;
import p1057v6.C20468h;
import p1099x6.C21144l;
import p228J.AbstractC3812N;
import p523V9.AbstractC8167p5;
import p593Y8.C9683j;
import p825j5.C16127d;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: renamed from: y6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21390a extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final C15333a f67899o0;

    public C21390a(C15333a c15333a) {
        super((char) 0, 12);
        this.f67899o0 = c15333a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: G */
    public final C20468h mo4516G(String key, C20461a cacheHeaders) {
        C20468h c20468hM16556g;
        C15333a c15333a = this.f67899o0;
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        try {
            c20468hM16556g = c15333a.m16556g(key);
        } catch (Exception e10) {
            Exception exc = new Exception("Unable to read a record from the database", e10);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
            c20468hM16556g = null;
        }
        if (c20468hM16556g != null) {
            if (cacheHeaders.f64953a.containsKey("evict-after-read")) {
                c15333a.m16552c(key);
            }
            return c20468hM16556g;
        }
        AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
        if (abstractC3812N != null) {
            return abstractC3812N.mo4516G(key, cacheHeaders);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: H */
    public final Collection mo4517H(Collection keys, C20461a cacheHeaders) {
        Collection collectionM21772Q;
        AbstractC3812N abstractC3812N;
        Collection collection = C17689w.f56480Y;
        AbstractC16544l.m18094g(keys, "keys");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        try {
            collectionM21772Q = m21772Q(keys);
        } catch (Exception e10) {
            Exception exc = new Exception("Unable to read records from the database", e10);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
            collectionM21772Q = collection;
        }
        if (cacheHeaders.f64953a.containsKey("evict-after-read")) {
            Iterator it = collectionM21772Q.iterator();
            while (it.hasNext()) {
                this.f67899o0.m16552c(((C20468h) it.next()).f64972Y);
            }
        }
        Collection collection2 = keys;
        Collection collection3 = collectionM21772Q;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection3, 10));
        Iterator it2 = collection3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C20468h) it2.next()).f64972Y);
        }
        List listM19358h0 = AbstractC17680n.m19358h0(AbstractC17680n.m19328G0(arrayList), collection2);
        Collection collectionMo4517H = null;
        if (listM19358h0.isEmpty()) {
            listM19358h0 = null;
        }
        List list = listM19358h0;
        if (list != null && (abstractC3812N = (AbstractC3812N) this.f11539Z) != null) {
            collectionMo4517H = abstractC3812N.mo4517H(list, cacheHeaders);
        }
        if (collectionMo4517H != null) {
            collection = collectionMo4517H;
        }
        return AbstractC17680n.m19361k0(collection, collectionM21772Q);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: I */
    public final Set mo4518I(Collection records, C20461a cacheHeaders) throws Throwable {
        AbstractC16544l.m18094g(records, "records");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        ?? r6 = cacheHeaders.f64953a;
        boolean zContainsKey = r6.containsKey("do-not-store");
        C17691y c17691y = C17691y.f56482Y;
        if (zContainsKey) {
            return c17691y;
        }
        try {
            String str = (String) r6.get("apollo-date");
            Set setM21773R = m21773R(records, str != null ? Long.valueOf(Long.parseLong(str)) : null);
            AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
            Set setMo4518I = abstractC3812N != null ? abstractC3812N.mo4518I(records, cacheHeaders) : null;
            if (setMo4518I == null) {
                setMo4518I = c17691y;
            }
            return AbstractC17665J.m19266f(setM21773R, setMo4518I);
        } catch (Exception e10) {
            Exception exc = new Exception("Unable to merge records from the database", e10);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
            return c17691y;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final ArrayList m21772Q(Collection collection) {
        Collection collection2 = collection;
        AbstractC16544l.m18094g(collection2, "<this>");
        ArrayList<List> arrayListM19330H0 = AbstractC17680n.m19330H0(collection2, 999, 999);
        ArrayList arrayList = new ArrayList();
        for (List keys : arrayListM19330H0) {
            C15333a c15333a = this.f67899o0;
            AbstractC16544l.m18094g(keys, "keys");
            List<C0390j> listM784i = new C0387g((C0388h) c15333a.f47885Y, keys, new C0386f(new C0384d(0), 1)).m784i();
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM784i, 10));
            for (C0390j c0390j : listM784i) {
                arrayList2.add(AbstractC8167p5.m8744d(c0390j.f1302a, c0390j.f1303b));
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public final Set m21773R(Collection collection, Long l4) throws Throwable {
        C17296C c17296c;
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = C17691y.f56482Y;
        C21144l c21144l = new C21144l(this, collection, c16525b, l4, 1);
        C0388h c0388h = (C0388h) this.f67899o0.f47885Y;
        C16127d c16127d = (C16127d) ((C9683j) c0388h.f11539Z).m10273S().f46522b;
        C16127d c16127d2 = c16127d.f50048h;
        Throwable th2 = null;
        try {
            c21144l.invoke();
            c17296c = C17296C.f55119a;
            try {
                c16127d.f50046f = true;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            c17296c = null;
            th2 = th4;
        }
        c16127d.m17683a();
        c0388h.m4520K(c16127d, c16127d2, th2, c17296c);
        return (Set) c16525b.f51262Y;
    }
}
