package p1091wn;

import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p030B2.C0740V;
import p033B5.C0819c;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC7989S5;
import p571X9.AbstractC9393x3;
import p729ej.C13432w;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import tl.C20001a;

/* JADX INFO: renamed from: wn.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21031l extends AbstractC21032m {
    /* JADX INFO: renamed from: g */
    public static InterfaceC21029j m21483g(Iterator it) {
        AbstractC16544l.m18094g(it, "<this>");
        return m21484h(new C0740V(it, 5));
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC21029j m21484h(InterfaceC21029j interfaceC21029j) {
        return interfaceC21029j instanceof C21020a ? interfaceC21029j : new C21020a(interfaceC21029j);
    }

    /* JADX INFO: renamed from: i */
    public static int m21485i(InterfaceC21029j interfaceC21029j) {
        Iterator it = interfaceC21029j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC17681o.m19387p();
                throw null;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC21029j m21486j(InterfaceC21029j interfaceC21029j, int i10) {
        AbstractC16544l.m18094g(interfaceC21029j, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return interfaceC21029j;
        }
        return interfaceC21029j instanceof InterfaceC21024e ? ((InterfaceC21024e) interfaceC21029j).mo21476b(i10) : new C21023d(interfaceC21029j, i10, 0);
    }

    /* JADX INFO: renamed from: k */
    public static C21027h m21487k(InterfaceC21029j interfaceC21029j, InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(predicate, "predicate");
        return new C21027h(interfaceC21029j, true, predicate);
    }

    /* JADX INFO: renamed from: l */
    public static C21027h m21488l(InterfaceC21029j interfaceC21029j) {
        return new C21027h(interfaceC21029j, false, new C15058c(19));
    }

    /* JADX INFO: renamed from: m */
    public static Object m21489m(InterfaceC21029j interfaceC21029j) {
        Iterator it = interfaceC21029j.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final C21028i m21490n(InterfaceC21029j interfaceC21029j) {
        C15058c c15058c = new C15058c(17);
        if (!(interfaceC21029j instanceof C21036q)) {
            return new C21028i(interfaceC21029j, new C15058c(18), c15058c);
        }
        C21036q c21036q = (C21036q) interfaceC21029j;
        return new C21028i(c21036q.f66917a, c21036q.f66918b, c15058c);
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC21029j m21491o(InterfaceC1426a interfaceC1426a) {
        return m21484h(new C21022c(interfaceC1426a, new C20001a(1, interfaceC1426a)));
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC21029j m21492p(InterfaceC1436k nextFunction, Object obj) {
        AbstractC16544l.m18094g(nextFunction, "nextFunction");
        return obj == null ? C21026g.f66901a : new C21022c(new C0819c(obj, 21), nextFunction);
    }

    /* JADX INFO: renamed from: q */
    public static String m21493q(InterfaceC21029j interfaceC21029j, String separator, C13432w c13432w, int i10) {
        if ((i10 & 1) != 0) {
            separator = ", ";
        }
        if ((i10 & 32) != 0) {
            c13432w = null;
        }
        AbstractC16544l.m18094g(interfaceC21029j, "<this>");
        AbstractC16544l.m18094g(separator, "separator");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i11 = 0;
        for (Object obj : interfaceC21029j) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) separator);
            }
            AbstractC7989S5.m8294c(sb2, obj, c13432w);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static Object m21494r(InterfaceC21029j interfaceC21029j) {
        Iterator it = interfaceC21029j.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: s */
    public static C21036q m21495s(InterfaceC21029j interfaceC21029j, InterfaceC1436k transform) {
        AbstractC16544l.m18094g(interfaceC21029j, "<this>");
        AbstractC16544l.m18094g(transform, "transform");
        return new C21036q(interfaceC21029j, transform);
    }

    /* JADX INFO: renamed from: t */
    public static C21027h m21496t(InterfaceC21029j interfaceC21029j, InterfaceC1436k transform) {
        AbstractC16544l.m18094g(transform, "transform");
        return m21488l(new C21036q(interfaceC21029j, transform));
    }

    /* JADX INFO: renamed from: u */
    public static InterfaceC21029j m21497u(InterfaceC21029j interfaceC21029j, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C21026g.f66901a;
        }
        return interfaceC21029j instanceof InterfaceC21024e ? ((InterfaceC21024e) interfaceC21029j).mo21475a(i10) : new C21023d(interfaceC21029j, i10, 1);
    }

    /* JADX INFO: renamed from: v */
    public static C21022c m21498v(InterfaceC21029j interfaceC21029j, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC21029j, "<this>");
        return new C21022c(interfaceC21029j, interfaceC1436k);
    }

    /* JADX INFO: renamed from: w */
    public static List m21499w(InterfaceC21029j interfaceC21029j) {
        AbstractC16544l.m18094g(interfaceC21029j, "<this>");
        Iterator it = interfaceC21029j.iterator();
        if (!it.hasNext()) {
            return C17689w.f56480Y;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC9393x3.m9974d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
