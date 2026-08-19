package af;

import bf.C11363S;
import bf.C11364T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: af.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10573b0 implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final List f31397a;

    /* JADX INFO: renamed from: b */
    public final C11364T f31398b;

    /* JADX INFO: renamed from: c */
    public final C10575c0 f31399c;

    /* JADX INFO: renamed from: d */
    public final C10571a0 f31400d;

    /* JADX INFO: renamed from: e */
    public final C10575c0 f31401e;

    public C10573b0(List categories, C11364T c11364t, C10575c0 userGizmosCategory, C10571a0 c10571a0) {
        C10575c0 c10575c0;
        Object next;
        C11363S c11363s;
        AbstractC16544l.m18094g(categories, "categories");
        AbstractC16544l.m18094g(userGizmosCategory, "userGizmosCategory");
        this.f31397a = categories;
        this.f31398b = c11364t;
        this.f31399c = userGizmosCategory;
        this.f31400d = c10571a0;
        Iterator it = categories.iterator();
        do {
            c10575c0 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                c11363s = ((C10575c0) next).f31411c;
            }
        } while (!AbstractC16544l.m18089b(c11363s != null ? c11363s.f34359a : null, this.f31398b));
        C10575c0 c10575c1 = (C10575c0) next;
        if (c10575c1 == null) {
            C10575c0 c10575c2 = this.f31399c;
            C11363S c11363s2 = c10575c2.f31411c;
            if (AbstractC16544l.m18089b(c11363s2 != null ? c11363s2.f34359a : null, this.f31398b)) {
                c10575c0 = c10575c2;
            }
        } else {
            c10575c0 = c10575c1;
        }
        this.f31401e = c10575c0;
    }

    /* JADX INFO: renamed from: e */
    public static C10573b0 m10982e(C10573b0 c10573b0, ArrayList arrayList, C11364T c11364t, C10575c0 userGizmosCategory, C10571a0 c10571a0, int i10) {
        List categories = arrayList;
        if ((i10 & 1) != 0) {
            categories = c10573b0.f31397a;
        }
        if ((i10 & 2) != 0) {
            c11364t = c10573b0.f31398b;
        }
        if ((i10 & 4) != 0) {
            userGizmosCategory = c10573b0.f31399c;
        }
        if ((i10 & 8) != 0) {
            c10571a0 = c10573b0.f31400d;
        }
        c10573b0.getClass();
        AbstractC16544l.m18094g(categories, "categories");
        AbstractC16544l.m18094g(userGizmosCategory, "userGizmosCategory");
        return new C10573b0(categories, c11364t, userGizmosCategory, c10571a0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10573b0)) {
            return false;
        }
        C10573b0 c10573b0 = (C10573b0) obj;
        return AbstractC16544l.m18089b(this.f31397a, c10573b0.f31397a) && AbstractC16544l.m18089b(this.f31398b, c10573b0.f31398b) && AbstractC16544l.m18089b(this.f31399c, c10573b0.f31399c) && AbstractC16544l.m18089b(this.f31400d, c10573b0.f31400d);
    }

    public final int hashCode() {
        int iHashCode = this.f31397a.hashCode() * 31;
        C11364T c11364t = this.f31398b;
        int iHashCode2 = (this.f31399c.hashCode() + ((iHashCode + (c11364t == null ? 0 : c11364t.hashCode())) * 31)) * 31;
        C10571a0 c10571a0 = this.f31400d;
        return iHashCode2 + (c10571a0 != null ? c10571a0.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
