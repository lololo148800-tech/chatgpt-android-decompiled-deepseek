package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionsKt {
    public static final <T> void addIfNotNull(Collection<T> collection, T t10) {
        AbstractC16544l.m18094g(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        AbstractC16544l.m18094g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C17689w.f56480Y;
        }
        if (size == 1) {
            return AbstractC9393x3.m9974d(AbstractC17680n.m19341Q(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(i10 >= 3 ? (i10 / 3) + i10 + 1 : 3);
    }
}
