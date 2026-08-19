package p909nm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1724b;

/* JADX INFO: renamed from: nm.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17686t extends AbstractC17685s {
    /* JADX INFO: renamed from: A */
    public static void m19393A(List list, InterfaceC1436k predicate) {
        int iM19381j;
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC1723a) && !(list instanceof InterfaceC1724b)) {
                AbstractC16529F.m18084h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                m19401y(list, predicate, true);
                return;
            } catch (ClassCastException e10) {
                AbstractC16544l.m18099l(e10, AbstractC16529F.class.getName());
                throw e10;
            }
        }
        int iM19381j2 = AbstractC17681o.m19381j(list);
        int i10 = 0;
        if (iM19381j2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iM19381j2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iM19381j = AbstractC17681o.m19381j(list))) {
            return;
        }
        while (true) {
            list.remove(iM19381j);
            if (iM19381j == i10) {
                return;
            } else {
                iM19381j--;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m19394B(Iterable iterable, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(iterable, "<this>");
        return m19401y(iterable, interfaceC1436k, true);
    }

    /* JADX INFO: renamed from: C */
    public static Object m19395C(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: D */
    public static Object m19396D(ArrayList arrayList) {
        AbstractC16544l.m18094g(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(0);
    }

    /* JADX INFO: renamed from: E */
    public static Object m19397E(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC17681o.m19381j(list));
    }

    /* JADX INFO: renamed from: v */
    public static void m19398v(Iterable elements, Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m19399w(List list, Object[] elements) {
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        list.addAll(AbstractC17678l.m19296c(elements));
    }

    /* JADX INFO: renamed from: x */
    public static final Collection m19400x(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC17680n.m19322C0(iterable);
        }
        return (Collection) iterable;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m19401y(Iterable iterable, InterfaceC1436k interfaceC1436k, boolean z6) {
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC1436k.invoke(it.next())).booleanValue() == z6) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: z */
    public static void m19402z(Iterable elements, Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        collection.removeAll(m19400x(elements));
    }
}
