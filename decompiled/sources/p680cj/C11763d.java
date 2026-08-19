package p680cj;

import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.C11447L;
import bj.InterfaceC11470q;
import dj.AbstractC13178c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: cj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11763d implements InterfaceC11470q {

    /* JADX INFO: renamed from: a */
    public final Class f35678a;

    /* JADX INFO: renamed from: b */
    public final String f35679b;

    /* JADX INFO: renamed from: c */
    public final List f35680c;

    /* JADX INFO: renamed from: d */
    public final List f35681d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11471r f35682e;

    public C11763d(Class cls, String str, List list, List list2, AbstractC11471r abstractC11471r) {
        this.f35678a = cls;
        this.f35679b = str;
        this.f35680c = list;
        this.f35681d = list2;
        this.f35682e = abstractC11471r;
    }

    /* JADX INFO: renamed from: a */
    public final C11763d m13055a(AbstractC11471r abstractC11471r) {
        return new C11763d(this.f35678a, this.f35679b, this.f35680c, this.f35681d, abstractC11471r);
    }

    /* JADX INFO: renamed from: b */
    public final C11763d m13056b(Class cls, String str) {
        List list = this.f35680c;
        if (list.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f35681d);
        arrayList2.add(cls);
        return new C11763d(this.f35678a, this.f35679b, arrayList, arrayList2, this.f35682e);
    }

    @Override // bj.InterfaceC11470q
    public final AbstractC11471r create(Type type, Set set, C11447L c11447l) {
        if (AbstractC11452Q.m12855d(type) != this.f35678a || !set.isEmpty()) {
            return null;
        }
        List list = this.f35681d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Type type2 = (Type) list.get(i10);
            c11447l.getClass();
            arrayList.add(c11447l.m12850b(type2, AbstractC13178c.f41820a, null));
        }
        return new C11762c(this.f35679b, this.f35680c, this.f35681d, arrayList, this.f35682e).nullSafe();
    }
}
