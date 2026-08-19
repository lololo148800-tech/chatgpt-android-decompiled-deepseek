package bb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import p499U9.AbstractC7589s;
import p588Y2.C9642z;
import p594Y9.C9968t;
import p594Y9.C9974u;
import p644ab.C10534g;
import p644ab.InterfaceC10532e;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: bb.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11320m {
    /* JADX INFO: renamed from: b */
    public static void m12723b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i11, "at index "));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12724c(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    /* JADX INFO: renamed from: e */
    public static Object m12725e(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12726f(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12727g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static C11308d0 m12728h(Set set, InterfaceC10533f interfaceC10533f) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C11308d0)) {
                set.getClass();
                return new C11308d0(set, interfaceC10533f);
            }
            C11308d0 c11308d0 = (C11308d0) set;
            InterfaceC10533f interfaceC10533f2 = c11308d0.f34225Z;
            interfaceC10533f2.getClass();
            return new C11308d0(c11308d0.f34224Y, new C10534g(Arrays.asList(interfaceC10533f2, interfaceC10533f)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C11308d0)) {
            set2.getClass();
            return new C11310e0(set2, interfaceC10533f);
        }
        C11308d0 c11308d1 = (C11308d0) set2;
        InterfaceC10533f interfaceC10533f3 = c11308d1.f34225Z;
        interfaceC10533f3.getClass();
        return new C11310e0((SortedSet) c11308d1.f34224Y, new C10534g(Arrays.asList(interfaceC10533f3, interfaceC10533f)));
    }

    /* JADX INFO: renamed from: i */
    public static Object m12729i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: j */
    public static int m12730j(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX INFO: renamed from: k */
    public static C11306c0 m12731k(AbstractC11281F abstractC11281F, AbstractC11281F abstractC11281F2) {
        if (abstractC11281F == null) {
            throw new NullPointerException("set1");
        }
        if (abstractC11281F2 != null) {
            return new C11306c0(abstractC11281F, abstractC11281F2);
        }
        throw new NullPointerException("set2");
    }

    /* JADX INFO: renamed from: l */
    public static int m12732l(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m12733m(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static int m12734n(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM12737q = m12737q(obj);
        int i11 = iM12737q & i10;
        int iM12738r = m12738r(i11, obj3);
        if (iM12738r == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = iM12737q & i12;
        int i14 = -1;
        while (true) {
            int i15 = iM12738r - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) == i13 && AbstractC7589s.m7931f(obj, objArr[i15]) && (objArr2 == null || AbstractC7589s.m7931f(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i14 == -1) {
                    m12739s(i11, obj3, i17);
                } else {
                    iArr[i14] = m12732l(iArr[i14], i17, i10);
                }
                return i15;
            }
            int i18 = i16 & i10;
            if (i18 == 0) {
                return -1;
            }
            i14 = i15;
            iM12738r = i18;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m12735o(List list, InterfaceC10533f interfaceC10533f, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (interfaceC10533f.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m12736p(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: q */
    public static int m12737q(Object obj) {
        return m12736p(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: r */
    public static int m12738r(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: s */
    public static void m12739s(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* JADX INFO: renamed from: t */
    public static AbstractList m12740t(List list, InterfaceC10532e interfaceC10532e) {
        return list instanceof RandomAccess ? new C9968t(list, interfaceC10532e) : new C9974u(list, interfaceC10532e);
    }

    /* JADX INFO: renamed from: a */
    public C9642z m12741a() {
        m12724c(2, "expectedValuesPerKey");
        return new C9642z(this, 4);
    }

    /* JADX INFO: renamed from: d */
    public abstract Map mo12708d();
}
