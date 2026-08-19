package p248Jk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Jk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4479j implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final C4474e f14619c = C4474e.m5206a(Collections.emptySet());

    /* JADX INFO: renamed from: a */
    public final List f14620a;

    /* JADX INFO: renamed from: b */
    public final List f14621b;

    public C4479j(List list, List list2) {
        this.f14620a = list;
        this.f14621b = list2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        List list = this.f14620a;
        int size = list.size();
        List list2 = this.f14621b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((InterfaceC4478i) list2.get(i10)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object obj = ((InterfaceC4478i) list.get(i11)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj2 : (Collection) arrayList.get(i12)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
