package p680cj;

import android.gov.nist.core.Separators;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11473t;
import bj.C11475v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: cj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11762c extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final String f35671a;

    /* JADX INFO: renamed from: b */
    public final List f35672b;

    /* JADX INFO: renamed from: c */
    public final List f35673c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f35674d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11471r f35675e;

    /* JADX INFO: renamed from: f */
    public final C11475v f35676f;

    /* JADX INFO: renamed from: g */
    public final C11475v f35677g;

    public C11762c(String str, List list, List list2, ArrayList arrayList, AbstractC11471r abstractC11471r) {
        this.f35671a = str;
        this.f35672b = list;
        this.f35673c = list2;
        this.f35674d = arrayList;
        this.f35675e = abstractC11471r;
        this.f35676f = C11475v.m12866a(str);
        this.f35677g = C11475v.m12866a((String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: a */
    public final int m13054a(AbstractC11477x abstractC11477x) {
        abstractC11477x.mo12814e();
        while (true) {
            boolean zHasNext = abstractC11477x.hasNext();
            String str = this.f35671a;
            if (!zHasNext) {
                throw new C11473t("Missing label for ".concat(str));
            }
            if (abstractC11477x.mo12819v0(this.f35676f) != -1) {
                int iMo12799C0 = abstractC11477x.mo12799C0(this.f35677g);
                if (iMo12799C0 != -1 || this.f35675e != null) {
                    return iMo12799C0;
                }
                throw new C11473t("Expected one of " + this.f35672b + " for key '" + str + "' but found '" + abstractC11477x.mo12820x() + "'. Register a subtype for this label.");
            }
            abstractC11477x.mo12802H0();
            abstractC11477x.mo12800D();
        }
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) throws IOException {
        AbstractC11477x abstractC11477xMo12807T = abstractC11477x.mo12807T();
        abstractC11477xMo12807T.f34702r0 = false;
        try {
            int iM13054a = m13054a(abstractC11477xMo12807T);
            abstractC11477xMo12807T.close();
            return iM13054a == -1 ? this.f35675e.fromJson(abstractC11477x) : ((AbstractC11471r) this.f35674d.get(iM13054a)).fromJson(abstractC11477x);
        } catch (Throwable th2) {
            abstractC11477xMo12807T.close();
            throw th2;
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        AbstractC11471r abstractC11471r;
        Class<?> cls = obj.getClass();
        List list = this.f35673c;
        int iIndexOf = list.indexOf(cls);
        AbstractC11471r abstractC11471r2 = this.f35675e;
        if (iIndexOf != -1) {
            abstractC11471r = (AbstractC11471r) this.f35674d.get(iIndexOf);
        } else {
            if (abstractC11471r2 == null) {
                throw new IllegalArgumentException("Expected one of " + list + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
            }
            abstractC11471r = abstractC11471r2;
        }
        abstractC11440E.mo12833e();
        if (abstractC11471r != abstractC11471r2) {
            abstractC11440E.mo12827T(this.f35671a).mo12828V0((String) this.f35672b.get(iIndexOf));
        }
        int iM12837j0 = abstractC11440E.m12837j0();
        if (iM12837j0 != 5 && iM12837j0 != 3 && iM12837j0 != 2 && iM12837j0 != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = abstractC11440E.f34579u0;
        abstractC11440E.f34579u0 = abstractC11440E.f34571Y;
        abstractC11471r.toJson(abstractC11440E, obj);
        abstractC11440E.f34579u0 = i10;
        abstractC11440E.mo12823E();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f35671a, Separators.RPAREN, new StringBuilder("PolymorphicJsonAdapter("));
    }
}
