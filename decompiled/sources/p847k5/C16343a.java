package p847k5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p025An.C0644w;
import p027Ap.C0693a;
import p042Bf.C1267i;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p544W9.AbstractC8603a4;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16343a implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C16343a f50715b = new C16343a(0);

    /* JADX INFO: renamed from: c */
    public static final C16343a f50716c = new C16343a(1);

    /* JADX INFO: renamed from: d */
    public static final C16343a f50717d = new C16343a(2);

    /* JADX INFO: renamed from: e */
    public static final C16343a f50718e = new C16343a(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50719a;

    public /* synthetic */ C16343a(int i10) {
        this.f50719a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static Object m17945a(AbstractC8603a4 abstractC8603a4, C1267i c1267i, C1267i c1267i2) {
        if (abstractC8603a4.equals(C16346d.f50728b)) {
            return c1267i2.invoke();
        }
        if (abstractC8603a4.equals(C16346d.f50727a)) {
            return c1267i.invoke();
        }
        if (abstractC8603a4.equals(C16346d.f50729c)) {
            return null;
        }
        throw new C0644w();
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        Object objM9806b;
        switch (this.f50719a) {
            case 0:
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    return AbstractC17680n.m19335K(list);
                }
                return null;
            case 1:
                List list2 = AbstractC8038Z3.m8396e(obj).f2015Y;
                try {
                    Object obj3 = list2.get(4);
                    AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Number");
                    Number number = (Number) obj3;
                    if (number.doubleValue() != number.intValue()) {
                        number = null;
                    }
                    Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(list2.get(0));
                        Object obj4 = list2.get(1);
                        AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj4;
                        Object obj5 = list2.get(2);
                        AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) obj5;
                        Object obj6 = list2.get(3);
                        AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list2.get(5);
                        AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type kotlin.String");
                        objM9806b = new C16345c(c0693aM8396e, str, str2, (String) obj6, iIntValue, (String) obj7);
                    } else {
                        objM9806b = null;
                    }
                    break;
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                C16345c c16345c = C17312o.m18979a(objM9806b) == null ? (C16345c) objM9806b : null;
                if (c16345c != null) {
                    return AbstractC17680n.m19349Y(c16345c.f50721a, c16345c.f50722b, c16345c.f50723c, c16345c.f50724d, c16345c.f50725e, c16345c.f50726f, null, 32);
                }
                return null;
            case 2:
                List list3 = obj instanceof List ? (List) obj : null;
                if (list3 != null) {
                    return Integer.valueOf(list3.size());
                }
                return null;
            default:
                C0693a c0693aM8396e2 = AbstractC8038Z3.m8396e(obj);
                Object objM19343S = AbstractC17680n.m19343S(c0693aM8396e2);
                List list4 = objM19343S instanceof List ? (List) objM19343S : null;
                if (list4 == null) {
                    return null;
                }
                Object objM19344T = AbstractC17680n.m19344T(1, c0693aM8396e2);
                String str3 = objM19344T instanceof String ? (String) objM19344T : null;
                C16346d c16346d = AbstractC16544l.m18089b(str3, "desc") ? C16346d.f50728b : AbstractC16544l.m18089b(str3, "asc") ? C16346d.f50727a : C16346d.f50729c;
                List list5 = list4;
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : list5) {
                    if (obj8 instanceof String) {
                        arrayList.add(obj8);
                    }
                }
                if (Integer.valueOf(arrayList.size()).equals(Integer.valueOf(list4.size()))) {
                    if (!(list4 instanceof List)) {
                        list4 = null;
                    }
                    if (list4 != null) {
                        return m17945a(c16346d, new C1267i(4, list4), new C1267i(5, list4));
                    }
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj9 : list5) {
                    if (obj9 instanceof Boolean) {
                        arrayList2.add(obj9);
                    }
                }
                if (Integer.valueOf(arrayList2.size()).equals(Integer.valueOf(list4.size()))) {
                    if (!(list4 instanceof List)) {
                        list4 = null;
                    }
                    if (list4 != null) {
                        return m17945a(c16346d, new C1267i(4, list4), new C1267i(5, list4));
                    }
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj10 : list5) {
                    if (obj10 instanceof Number) {
                        arrayList3.add(obj10);
                    }
                }
                if (!Integer.valueOf(arrayList3.size()).equals(Integer.valueOf(list4.size()))) {
                    return null;
                }
                ArrayList arrayListM19339O = AbstractC17680n.m19339O(AbstractC8038Z3.m8395d(list4));
                return m17945a(c16346d, new C1267i(4, arrayListM19339O), new C1267i(5, arrayListM19339O));
        }
    }
}
