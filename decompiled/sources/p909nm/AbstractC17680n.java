package p909nm;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p030B2.C0740V;
import p033B5.C0819c;
import p049Bm.InterfaceC1436k;
import p200Hm.C3508g;
import p523V9.AbstractC7846A5;
import p523V9.AbstractC7989S5;
import p571X9.AbstractC9393x3;
import p606Yn.C10107h;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: nm.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17680n extends AbstractC17686t {
    /* JADX INFO: renamed from: A0 */
    public static float[] m19320A0(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: B0 */
    public static int[] m19321B0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: C0 */
    public static List m19322C0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC17681o.m19385n(m19324E0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C17689w.f56480Y;
        }
        if (size != 1) {
            return m19323D0(collection);
        }
        return AbstractC9393x3.m9974d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: D0 */
    public static ArrayList m19323D0(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: E0 */
    public static final List m19324E0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m19323D0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m19376z0(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static final int m19325F(int i10, List list) {
        if (i10 >= 0 && i10 <= AbstractC17681o.m19381j(list)) {
            return AbstractC17681o.m19381j(list) - i10;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Element index ", " must be in range [");
        sbM11057o.append(new C3508g(0, AbstractC17681o.m19381j(list), 1));
        sbM11057o.append("].");
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: F0 */
    public static Set m19326F0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m19376z0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: G */
    public static final int m19327G(int i10, List list) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Position index ", " must be in range [");
        sbM11057o.append(new C3508g(0, list.size(), 1));
        sbM11057o.append("].");
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: G0 */
    public static Set m19328G0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        C17691y c17691y = C17691y.f56482Y;
        if (!z6) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m19376z0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : AbstractC17665J.m19268h(linkedHashSet.iterator().next());
            }
            return c17691y;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c17691y;
        }
        if (size2 == 1) {
            return AbstractC17665J.m19268h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC17660E.m19257b(collection.size()));
        m19376z0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: H */
    public static C0740V m19329H(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        return new C0740V(iterable, 3);
    }

    /* JADX INFO: renamed from: H0 */
    public static ArrayList m19330H0(Iterable iterable, int i10, int i11) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? AbstractC0168G.m532u("Both size ", i10, " and step ", i11, " must be greater than zero.") : AbstractC0010F.m19c(i10, "size ", " must be greater than zero.")).toString());
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            AbstractC16544l.m18094g(iterator, "iterator");
            Iterator itM8098a = !iterator.hasNext() ? C17688v.f56479Y : AbstractC7846A5.m8098a(new C17666K(i10, i11, iterator, null));
            while (itM8098a.hasNext()) {
                arrayList.add((List) itM8098a.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int i13 = size - i12;
            if (i10 <= i13) {
                i13 = i10;
            }
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(list.get(i14 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I */
    public static double m19331I(Iterable iterable) {
        Iterator it = iterable.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i10++;
            if (i10 < 0) {
                AbstractC17681o.m19387p();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    /* JADX INFO: renamed from: I0 */
    public static C10107h m19332I0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        return new C10107h(new C0819c(iterable, 19), 2);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m19333J(Iterable iterable, Object obj) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m19345U(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: J0 */
    public static ArrayList m19334J0(Iterable iterable, Iterable other) {
        AbstractC16544l.m18094g(iterable, "<this>");
        AbstractC16544l.m18094g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC17682p.m19389r(iterable, 10), AbstractC17682p.m19389r(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C17309l(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static List m19335K(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        return m19322C0(m19326F0(iterable));
    }

    /* JADX INFO: renamed from: L */
    public static List m19336L(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC16544l.m18094g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return m19322C0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return C17689w.f56480Y;
            }
            if (size == 1) {
                return AbstractC9393x3.m9974d(m19350Z(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC17681o.m19385n(arrayList);
    }

    /* JADX INFO: renamed from: M */
    public static List m19337M(int i10, List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i10;
        if (size < 0) {
            size = 0;
        }
        return m19373w0(list2, size);
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList m19338N(Iterable iterable, Class cls) {
        AbstractC16544l.m18094g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public static ArrayList m19339O(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static Object m19340P(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            return m19341Q((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: Q */
    public static Object m19341Q(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: R */
    public static Object m19342R(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public static Object m19343S(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: T */
    public static Object m19344T(int i10, List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* JADX INFO: renamed from: U */
    public static int m19345U(Iterable iterable, Object obj) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            if (AbstractC16544l.m18089b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: V */
    public static Set m19346V(Iterable iterable, Iterable other) {
        AbstractC16544l.m18094g(iterable, "<this>");
        AbstractC16544l.m18094g(other, "other");
        Set setM19326F0 = m19326F0(iterable);
        setM19326F0.retainAll(AbstractC17686t.m19400x(other));
        return setM19326F0;
    }

    /* JADX INFO: renamed from: W */
    public static final void m19347W(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(iterable, "<this>");
        AbstractC16544l.m18094g(buffer, "buffer");
        AbstractC16544l.m18094g(separator, "separator");
        AbstractC16544l.m18094g(prefix, "prefix");
        AbstractC16544l.m18094g(postfix, "postfix");
        AbstractC16544l.m18094g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                AbstractC7989S5.m8294c(buffer, obj, interfaceC1436k);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    /* JADX INFO: renamed from: Y */
    public static String m19349Y(Iterable iterable, CharSequence charSequence, String str, String str2, int i10, String str3, InterfaceC1436k interfaceC1436k, int i11) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i11 & 2) != 0 ? "" : str;
        String postfix = (i11 & 4) != 0 ? "" : str2;
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str3 = "...";
        }
        String truncated = str3;
        if ((i11 & 32) != 0) {
            interfaceC1436k = null;
        }
        AbstractC16544l.m18094g(iterable, "<this>");
        AbstractC16544l.m18094g(separator, "separator");
        AbstractC16544l.m18094g(prefix, "prefix");
        AbstractC16544l.m18094g(postfix, "postfix");
        AbstractC16544l.m18094g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        m19347W(iterable, sb2, separator, prefix, postfix, i12, truncated, interfaceC1436k);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: Z */
    public static Object m19350Z(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            return m19351a0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: a0 */
    public static Object m19351a0(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC17681o.m19381j(list));
    }

    /* JADX INFO: renamed from: b0 */
    public static Object m19352b0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: c0 */
    public static Object m19353c0(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: d0 */
    public static Comparable m19354d0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: e0 */
    public static Float m19355e0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: f0 */
    public static Comparable m19356f0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: g0 */
    public static ArrayList m19357g0(Iterable iterable, Object obj) {
        AbstractC16544l.m18094g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        boolean z6 = false;
        for (Object obj2 : iterable) {
            boolean z10 = true;
            if (!z6 && AbstractC16544l.m18089b(obj2, obj)) {
                z6 = true;
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public static List m19358h0(Iterable iterable, Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        Collection collectionM19400x = AbstractC17686t.m19400x(iterable);
        if (collectionM19400x.isEmpty()) {
            return m19322C0(collection);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!collectionM19400x.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public static ArrayList m19359i0(Iterable iterable, Iterable elements) {
        AbstractC16544l.m18094g(iterable, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        if (iterable instanceof Collection) {
            return m19361k0(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17686t.m19398v(iterable, arrayList);
        AbstractC17686t.m19398v(elements, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public static ArrayList m19360j0(Iterable iterable, Object obj) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m19362l0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17686t.m19398v(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static ArrayList m19361k0(Iterable elements, Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC17686t.m19398v(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: l0 */
    public static ArrayList m19362l0(Collection collection, Object obj) {
        AbstractC16544l.m18094g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static List m19363m0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m19322C0(iterable);
        }
        List listM19324E0 = m19324E0(iterable);
        Collections.reverse(listM19324E0);
        return listM19324E0;
    }

    /* JADX INFO: renamed from: n0 */
    public static Object m19364n0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            return m19365o0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: o0 */
    public static Object m19365o0(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: p0 */
    public static Object m19366p0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m19367q0(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m19368r0(List list, C3508g indices) {
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(indices, "indices");
        if (indices.isEmpty()) {
            return C17689w.f56480Y;
        }
        return m19322C0(list.subList(indices.f10591Y, indices.f10592Z + 1));
    }

    /* JADX INFO: renamed from: s0 */
    public static List m19369s0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM19324E0 = m19324E0(iterable);
            AbstractC17685s.m19391t(listM19324E0);
            return listM19324E0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m19322C0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC16544l.m18094g(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC17678l.m19296c(array);
    }

    /* JADX INFO: renamed from: t0 */
    public static List m19370t0(Iterable iterable, Comparator comparator) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM19324E0 = m19324E0(iterable);
            AbstractC17685s.m19392u(listM19324E0, comparator);
            return listM19324E0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m19322C0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC16544l.m18094g(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC17678l.m19296c(array);
    }

    /* JADX INFO: renamed from: u0 */
    public static float m19371u0(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        Iterator it = list.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: v0 */
    public static int m19372v0(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: x0 */
    public static List m19374x0(int i10, List list) {
        AbstractC16544l.m18094g(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C17689w.f56480Y;
        }
        int size = list.size();
        if (i10 >= size) {
            return m19322C0(list);
        }
        if (i10 == 1) {
            return AbstractC9393x3.m9974d(m19351a0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static char[] m19375y0(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr[i10] = ((Character) it.next()).charValue();
            i10++;
        }
        return cArr;
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m19376z0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC16544l.m18094g(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static List m19373w0(Iterable iterable, int i10) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", suYVq.wCGTrXOsDBKkus).toString());
        }
        if (i10 == 0) {
            return C17689w.f56480Y;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m19322C0(iterable);
            }
            if (i10 == 1) {
                return AbstractC9393x3.m9974d(m19340P(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC17681o.m19385n(arrayList);
    }
}
