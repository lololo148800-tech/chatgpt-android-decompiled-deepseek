package bj;

import dj.AbstractC13178c;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p185H6.C3246b;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: bj.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11447L {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f34609d;

    /* JADX INFO: renamed from: a */
    public final List f34610a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f34611b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f34612c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f34609d = arrayList;
        arrayList.add(AbstractC11452Q.f34625a);
        arrayList.add(C11466m.f34679c);
        arrayList.add(C11460g.f34659e);
        arrayList.add(C11460g.f34658d);
        arrayList.add(AbstractC11448M.f34613a);
        arrayList.add(C11465l.f34675d);
    }

    public C11447L(C3246b c3246b) {
        ArrayList arrayList = c3246b.f9889a;
        int size = arrayList.size();
        ArrayList arrayList2 = f34609d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f34610a = DesugarCollections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11471r m12849a(Type type, Set set) {
        return m12850b(type, set, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r m12850b(Type type, Set set, String str) {
        AbstractC11471r abstractC11471r;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM14833g = AbstractC13178c.m14833g(AbstractC13178c.m14827a(type));
        Object objAsList = set.isEmpty() ? typeM14833g : Arrays.asList(typeM14833g, set);
        synchronized (this.f34612c) {
            try {
                AbstractC11471r abstractC11471r2 = (AbstractC11471r) this.f34612c.get(objAsList);
                if (abstractC11471r2 != null) {
                    return abstractC11471r2;
                }
                C11446K c11446k = (C11446K) this.f34611b.get();
                if (c11446k == null) {
                    c11446k = new C11446K(this);
                    this.f34611b.set(c11446k);
                }
                ArrayList arrayList = c11446k.f34605a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    ArrayDeque arrayDeque = c11446k.f34606b;
                    if (i10 >= size) {
                        C11445J c11445j = new C11445J(typeM14833g, str, objAsList);
                        arrayList.add(c11445j);
                        arrayDeque.add(c11445j);
                        abstractC11471r = null;
                        break;
                    }
                    C11445J c11445j2 = (C11445J) arrayList.get(i10);
                    if (c11445j2.f34603c.equals(objAsList)) {
                        arrayDeque.add(c11445j2);
                        AbstractC11471r abstractC11471r3 = c11445j2.f34604d;
                        abstractC11471r = c11445j2;
                        if (abstractC11471r3 == null) {
                            break;
                        }
                        abstractC11471r = abstractC11471r3;
                        break;
                    }
                    i10++;
                }
                try {
                    if (abstractC11471r != null) {
                        c11446k.m12848b(false);
                        return abstractC11471r;
                    }
                    try {
                        int size2 = this.f34610a.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            AbstractC11471r abstractC11471rCreate = ((InterfaceC11470q) this.f34610a.get(i11)).create(typeM14833g, set, this);
                            if (abstractC11471rCreate != null) {
                                ((C11445J) c11446k.f34606b.getLast()).f34604d = abstractC11471rCreate;
                                c11446k.m12848b(true);
                                return abstractC11471rCreate;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC13178c.m14836j(typeM14833g, set));
                    } catch (IllegalArgumentException e10) {
                        throw c11446k.m12847a(e10);
                    }
                } catch (Throwable th2) {
                    c11446k.m12848b(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r m12851c(C11458e c11458e, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM14833g = AbstractC13178c.m14833g(AbstractC13178c.m14827a(type));
        List list = this.f34610a;
        int iIndexOf = list.indexOf(c11458e);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + c11458e);
        }
        int size = list.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            AbstractC11471r abstractC11471rCreate = ((InterfaceC11470q) list.get(i10)).create(typeM14833g, set, this);
            if (abstractC11471rCreate != null) {
                return abstractC11471rCreate;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + AbstractC13178c.m14836j(typeM14833g, set));
    }
}
