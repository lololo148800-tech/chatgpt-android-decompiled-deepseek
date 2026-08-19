package bj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: bj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C11466m extends AbstractC11471r {

    /* JADX INFO: renamed from: c */
    public static final C11459f f34679c = new C11459f(2);

    /* JADX INFO: renamed from: a */
    public final AbstractC11471r f34680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34681b;

    public C11466m(AbstractC11471r abstractC11471r, int i10) {
        this.f34681b = i10;
        this.f34680a = abstractC11471r;
    }

    /* JADX INFO: renamed from: a */
    public final Collection m12865a() {
        switch (this.f34681b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        switch (this.f34681b) {
            case 0:
                Collection collectionM12865a = m12865a();
                abstractC11477x.mo12812a();
                while (abstractC11477x.hasNext()) {
                    ((ArrayList) collectionM12865a).add(this.f34680a.fromJson(abstractC11477x));
                }
                abstractC11477x.mo12817k();
                return collectionM12865a;
            default:
                Collection collectionM12865a2 = m12865a();
                abstractC11477x.mo12812a();
                while (abstractC11477x.hasNext()) {
                    collectionM12865a2.add(this.f34680a.fromJson(abstractC11477x));
                }
                abstractC11477x.mo12817k();
                return collectionM12865a2;
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        switch (this.f34681b) {
            case 0:
                abstractC11440E.mo12832a();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.f34680a.toJson(abstractC11440E, it.next());
                }
                abstractC11440E.mo12834m();
                break;
            default:
                abstractC11440E.mo12832a();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.f34680a.toJson(abstractC11440E, it2.next());
                }
                abstractC11440E.mo12834m();
                break;
        }
    }

    public final String toString() {
        return this.f34680a + ".collection()";
    }
}
