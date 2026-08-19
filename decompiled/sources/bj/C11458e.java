package bj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import dj.AbstractC13178c;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: bj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11458e implements InterfaceC11470q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34654a;

    /* JADX INFO: renamed from: b */
    public final Serializable f34655b;

    /* JADX INFO: renamed from: c */
    public final Object f34656c;

    public /* synthetic */ C11458e(Serializable serializable, Object obj, int i10) {
        this.f34654a = i10;
        this.f34655b = serializable;
        this.f34656c = obj;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC11457d m12863a(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC11457d abstractC11457d = (AbstractC11457d) arrayList.get(i10);
            if (AbstractC11452Q.m12853b(abstractC11457d.f34647a, type) && abstractC11457d.f34648b.equals(set)) {
                return abstractC11457d;
            }
        }
        return null;
    }

    @Override // bj.InterfaceC11470q
    public final AbstractC11471r create(Type type, Set set, C11447L c11447l) {
        AbstractC11471r abstractC11471rM12851c = null;
        Object obj = this.f34656c;
        Serializable serializable = this.f34655b;
        switch (this.f34654a) {
            case 0:
                AbstractC11457d abstractC11457dM12863a = m12863a((ArrayList) serializable, type, set);
                AbstractC11457d abstractC11457dM12863a2 = m12863a((ArrayList) obj, type, set);
                if (abstractC11457dM12863a == null && abstractC11457dM12863a2 == null) {
                    return null;
                }
                if (abstractC11457dM12863a == null || abstractC11457dM12863a2 == null) {
                    try {
                        abstractC11471rM12851c = c11447l.m12851c(this, type, set);
                    } catch (IllegalArgumentException e10) {
                        StringBuilder sbM11058p = AbstractC10763a.m11058p("No ", abstractC11457dM12863a == null ? "@ToJson" : "@FromJson", " adapter for ");
                        sbM11058p.append(AbstractC13178c.m14836j(type, set));
                        throw new IllegalArgumentException(sbM11058p.toString(), e10);
                    }
                    break;
                }
                AbstractC11471r abstractC11471r = abstractC11471rM12851c;
                if (abstractC11457dM12863a != null) {
                    abstractC11457dM12863a.mo12861a(c11447l, this);
                }
                if (abstractC11457dM12863a2 != null) {
                    abstractC11457dM12863a2.mo12861a(c11447l, this);
                }
                return new C11454a(abstractC11457dM12863a, abstractC11471r, c11447l, abstractC11457dM12863a2, set, type);
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Set set2 = AbstractC13178c.f41820a;
                if (AbstractC11452Q.m12853b((Class) serializable, type)) {
                    return (AbstractC11471r) obj;
                }
                return null;
        }
    }
}
