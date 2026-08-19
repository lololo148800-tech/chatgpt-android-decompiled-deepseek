package p909nm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1436k;
import p165G9.AbstractC3021g;
import p200Hm.C3508g;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: nm.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17681o extends AbstractC9393x3 {
    /* JADX INFO: renamed from: f */
    public static ArrayList m19377f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C17676j(objArr, true));
    }

    /* JADX INFO: renamed from: g */
    public static int m19378g(List list, int i10, int i11, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(list, "<this>");
        m19386o(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) interfaceC1436k.invoke(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: i */
    public static C3508g m19380i(Collection collection) {
        AbstractC16544l.m18094g(collection, "<this>");
        return new C3508g(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: j */
    public static int m19381j(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: k */
    public static List m19382k(Object... elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return elements.length > 0 ? AbstractC17678l.m19296c(elements) : C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: l */
    public static List m19383l(Object obj) {
        return obj != null ? AbstractC9393x3.m9974d(obj) : C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m19384m(Object... elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C17676j(elements, true));
    }

    /* JADX INFO: renamed from: n */
    public static final List m19385n(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : AbstractC9393x3.m9974d(list.get(0));
        }
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: o */
    public static final void m19386o(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("fromIndex (", i11, ") is greater than toIndex (", i12, ")."));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i11, "fromIndex (", ") is less than zero."));
        }
        if (i12 > i10) {
            throw new IndexOutOfBoundsException(AbstractC0168G.m532u("toIndex (", i12, ") is greater than size (", i10, ")."));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m19387p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: q */
    public static void m19388q() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: h */
    public static int m19379h(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC16544l.m18094g(arrayList, MpoABj.WDumeDr);
        int i10 = 0;
        m19386o(arrayList.size(), 0, size);
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int iM3873a = AbstractC3021g.m3873a((Comparable) arrayList.get(i12), comparable);
            if (iM3873a < 0) {
                i10 = i12 + 1;
            } else if (iM3873a > 0) {
                i11 = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i10 + 1);
    }
}
