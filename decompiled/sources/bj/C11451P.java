package bj;

import dj.AbstractC13178c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: bj.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11451P extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11447L f34619a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f34620b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f34621c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11471r f34622d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11471r f34623e;

    /* JADX INFO: renamed from: f */
    public final AbstractC11471r f34624f;

    public C11451P(C11447L c11447l) {
        this.f34619a = c11447l;
        c11447l.getClass();
        Set set = AbstractC13178c.f41820a;
        this.f34620b = c11447l.m12849a(List.class, set);
        this.f34621c = c11447l.m12849a(Map.class, set);
        this.f34622d = c11447l.m12849a(String.class, set);
        this.f34623e = c11447l.m12849a(Double.class, set);
        this.f34624f = c11447l.m12849a(Boolean.class, set);
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        int iOrdinal = abstractC11477x.mo12805S().ordinal();
        if (iOrdinal == 0) {
            return this.f34620b.fromJson(abstractC11477x);
        }
        if (iOrdinal == 2) {
            return this.f34621c.fromJson(abstractC11477x);
        }
        if (iOrdinal == 5) {
            return this.f34622d.fromJson(abstractC11477x);
        }
        if (iOrdinal == 6) {
            return this.f34623e.fromJson(abstractC11477x);
        }
        if (iOrdinal == 7) {
            return this.f34624f.fromJson(abstractC11477x);
        }
        if (iOrdinal == 8) {
            abstractC11477x.mo12815e0();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + abstractC11477x.mo12805S() + " at path " + abstractC11477x.m12867E());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017 A[PHI: r1
      0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:6:0x0015, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            abstractC11440E.mo12833e();
            abstractC11440E.mo12823E();
            return;
        }
        Class<?> cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = Collection.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            }
        }
        this.f34619a.m12850b(cls, AbstractC13178c.f41820a, null).toJson(abstractC11440E, obj);
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
