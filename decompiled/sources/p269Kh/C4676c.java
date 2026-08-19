package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Kh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4676c {
    public static final C4675b Companion = new C4675b();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f15223c = {new C11158d(C4677d.f15226a, 0), null};

    /* JADX INFO: renamed from: a */
    public final List f15224a;

    /* JADX INFO: renamed from: b */
    public final String f15225b;

    public /* synthetic */ C4676c(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C4674a.f15222a.getDescriptor());
            throw null;
        }
        this.f15224a = list;
        this.f15225b = str;
    }

    /* JADX INFO: renamed from: a */
    public final C4688o m5394a(String slugName) {
        AbstractC16544l.m18094g(slugName, "slugName");
        Iterator it = this.f15224a.iterator();
        while (it.hasNext()) {
            for (C4688o c4688o : ((C4679f) it.next()).f15229b) {
                if (AbstractC16544l.m18089b(c4688o.f15253b, slugName)) {
                    return c4688o;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C4688o m5395b(String slug) {
        AbstractC16544l.m18094g(slug, "slug");
        Iterator it = this.f15224a.iterator();
        while (it.hasNext()) {
            for (C4688o c4688o : ((C4679f) it.next()).f15229b) {
                if (AbstractC16544l.m18089b(c4688o.f15253b, slug)) {
                    return c4688o;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C4688o m5396c(String categoryName) {
        Object next;
        AbstractC16544l.m18094g(categoryName, "categoryName");
        List list = this.f15224a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((C4679f) it.next()).f15229b, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (AbstractC16544l.m18089b(((C4688o) next).f15252a, categoryName)) {
                return (C4688o) next;
            }
        }
        next = null;
        return (C4688o) next;
    }

    /* JADX INFO: renamed from: d */
    public final C4684k m5397d(String slug) {
        AbstractC16544l.m18094g(slug, "slug");
        for (C4679f c4679f : this.f15224a) {
            Iterator it = c4679f.f15229b.iterator();
            while (it.hasNext()) {
                if (AbstractC16544l.m18089b(((C4688o) it.next()).f15253b, slug)) {
                    return c4679f.f15228a;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4676c)) {
            return false;
        }
        C4676c c4676c = (C4676c) obj;
        return AbstractC16544l.m18089b(this.f15224a, c4676c.f15224a) && AbstractC16544l.m18089b(this.f15225b, c4676c.f15225b);
    }

    public final int hashCode() {
        return this.f15225b.hashCode() + (this.f15224a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C4676c(List list, String remoteFallbackModelSlug) {
        AbstractC16544l.m18094g(remoteFallbackModelSlug, "remoteFallbackModelSlug");
        this.f15224a = list;
        this.f15225b = remoteFallbackModelSlug;
    }
}
