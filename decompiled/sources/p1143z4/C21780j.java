package p1143z4;

import android.util.Log;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.AbstractC11122c;
import androidx.navigation.NavControllerViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0102A;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2213w0;
import p1139z0.C21638r0;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.C17677k;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: renamed from: z4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21780j {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f69089a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f69090b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f69091c;

    /* JADX INFO: renamed from: d */
    public boolean f69092d;

    /* JADX INFO: renamed from: e */
    public final C2217y0 f69093e;

    /* JADX INFO: renamed from: f */
    public final C2217y0 f69094f;

    /* JADX INFO: renamed from: g */
    public final AbstractC21769K f69095g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C21795y f69096h;

    public C21780j(C21795y c21795y, AbstractC21769K navigator) {
        AbstractC16544l.m18094g(navigator, "navigator");
        this.f69096h = c21795y;
        this.f69089a = new ReentrantLock(true);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f69090b = c2153q0M3204c;
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(C17691y.f56482Y);
        this.f69091c = c2153q0M3204c2;
        this.f69093e = new C2217y0(c2153q0M3204c);
        this.f69094f = new C2217y0(c2153q0M3204c2);
        this.f69095g = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m22267a(C21778h backStackEntry) {
        AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f69089a;
        reentrantLock.lock();
        try {
            C2153Q0 c2153q0 = this.f69090b;
            ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0((Collection) c2153q0.getValue(), backStackEntry);
            c2153q0.getClass();
            c2153q0.m3251l(null, arrayListM19362l0);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX INFO: renamed from: b */
    public final void m22268b(C21778h entry) {
        NavControllerViewModel navControllerViewModel;
        ViewModelStore viewModelStore;
        AbstractC16544l.m18094g(entry, "entry");
        C21795y c21795y = this.f69096h;
        boolean zM18089b = AbstractC16544l.m18089b(c21795y.f33525A.get(entry), Boolean.TRUE);
        C2153Q0 c2153q0 = this.f69091c;
        c2153q0.m3251l(null, AbstractC17665J.m19263c((Set) c2153q0.getValue(), entry));
        c21795y.f33525A.remove(entry);
        C17677k c17677k = c21795y.f33535g;
        boolean zContains = c17677k.contains(entry);
        C2153Q0 c2153q1 = c21795y.f33538j;
        if (zContains) {
            if (this.f69092d) {
                return;
            }
            c21795y.m12202x();
            ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(c17677k);
            C2153Q0 c2153q2 = c21795y.f33536h;
            c2153q2.getClass();
            c2153q2.m3251l(null, arrayListM19323D0);
            ArrayList arrayListM12199u = c21795y.m12199u();
            c2153q1.getClass();
            c2153q1.m3251l(null, arrayListM12199u);
            return;
        }
        c21795y.m12201w(entry);
        if (entry.f69080t0.f33504d.compareTo(EnumC11104m.f33476o0) >= 0) {
            entry.m22264f(EnumC11104m.f33474Y);
        }
        boolean z6 = c17677k instanceof Collection;
        String backStackEntryId = entry.f69078r0;
        if (!z6 || !c17677k.isEmpty()) {
            Iterator it = c17677k.iterator();
            while (it.hasNext()) {
                if (AbstractC16544l.m18089b(((C21778h) it.next()).f69078r0, backStackEntryId)) {
                }
            }
            if (!zM18089b && (navControllerViewModel = c21795y.f33545q) != null) {
                AbstractC16544l.m18094g(backStackEntryId, "backStackEntryId");
                viewModelStore = (ViewModelStore) navControllerViewModel.f33522b.remove(backStackEntryId);
                if (viewModelStore != null) {
                    viewModelStore.m12146a();
                }
            }
        } else if (!zM18089b) {
            AbstractC16544l.m18094g(backStackEntryId, "backStackEntryId");
            viewModelStore = (ViewModelStore) navControllerViewModel.f33522b.remove(backStackEntryId);
            if (viewModelStore != null) {
                viewModelStore.m12146a();
            }
        }
        c21795y.m12202x();
        ArrayList arrayListM12199u2 = c21795y.m12199u();
        c2153q1.getClass();
        c2153q1.m3251l(null, arrayListM12199u2);
    }

    /* JADX INFO: renamed from: c */
    public final void m22269c(C21778h popUpTo, boolean z6) {
        AbstractC16544l.m18094g(popUpTo, "popUpTo");
        C21795y c21795y = this.f69096h;
        AbstractC21769K abstractC21769KM22262b = c21795y.f33551w.m22262b(popUpTo.f69074Z.f69130Y);
        if (!abstractC21769KM22262b.equals(this.f69095g)) {
            Object obj = c21795y.f33552x.get(abstractC21769KM22262b);
            AbstractC16544l.m18091d(obj);
            ((C21780j) obj).m22269c(popUpTo, z6);
            return;
        }
        C0102A c0102a = c21795y.f33554z;
        if (c0102a != null) {
            c0102a.invoke(popUpTo);
            m22270d(popUpTo);
            return;
        }
        C21638r0 c21638r0 = new C21638r0(this, popUpTo, z6);
        C17677k c17677k = c21795y.f33535g;
        int iIndexOf = c17677k.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != c17677k.f56476o0) {
            c21795y.m12197r(((C21778h) c17677k.get(i10)).f69074Z.f69135r0, true, false);
        }
        AbstractC11122c.m12181t(c21795y, popUpTo);
        c21638r0.invoke();
        c21795y.m12203y();
        c21795y.m12184c();
    }

    /* JADX INFO: renamed from: d */
    public final void m22270d(C21778h popUpTo) {
        AbstractC16544l.m18094g(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f69089a;
        reentrantLock.lock();
        try {
            C2153Q0 c2153q0 = this.f69090b;
            Iterable iterable = (Iterable) c2153q0.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (AbstractC16544l.m18089b((C21778h) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c2153q0.getClass();
            c2153q0.m3251l(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[EDGE_INSN: B:39:0x00a2->B:31:0x00a2 BREAK  A[LOOP:0: B:23:0x0075->B:40:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m22271e(C21778h popUpTo, boolean z6) {
        ListIterator listIterator;
        Object objPrevious;
        C21778h c21778h;
        C21778h c21778h2;
        InterfaceC2213w0 interfaceC2213w0;
        AbstractC16544l.m18094g(popUpTo, "popUpTo");
        C2153Q0 c2153q0 = this.f69091c;
        Iterable iterable = (Iterable) c2153q0.getValue();
        boolean z10 = iterable instanceof Collection;
        C2217y0 c2217y0 = this.f69093e;
        if (z10 && ((Collection) iterable).isEmpty()) {
            c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), popUpTo));
            List list = (List) c2217y0.f6797Y.getValue();
            listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                c21778h2 = (C21778h) objPrevious;
                if (!AbstractC16544l.m18089b(c21778h2, popUpTo)) {
                    interfaceC2213w0 = c2217y0.f6797Y;
                    if (((List) interfaceC2213w0.getValue()).lastIndexOf(c21778h2) < ((List) interfaceC2213w0.getValue()).lastIndexOf(popUpTo)) {
                        break;
                        break;
                    }
                }
            }
            c21778h = (C21778h) objPrevious;
            if (c21778h != null) {
                c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), c21778h));
            }
            m22269c(popUpTo, z6);
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C21778h) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) c2217y0.f6797Y.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        do {
                            if (it2.hasNext()) {
                            }
                        } while (((C21778h) it2.next()) != popUpTo);
                    }
                }
            }
            c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), popUpTo));
            List list2 = (List) c2217y0.f6797Y.getValue();
            listIterator = list2.listIterator(list2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                c21778h2 = (C21778h) objPrevious;
                if (!AbstractC16544l.m18089b(c21778h2, popUpTo)) {
                    interfaceC2213w0 = c2217y0.f6797Y;
                    if (((List) interfaceC2213w0.getValue()).lastIndexOf(c21778h2) < ((List) interfaceC2213w0.getValue()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            }
            c21778h = (C21778h) objPrevious;
            if (c21778h != null) {
                c2153q0.m3251l(null, AbstractC17665J.m19267g((Set) c2153q0.getValue(), c21778h));
            }
            m22269c(popUpTo, z6);
        }
        this.f69096h.f33525A.put(popUpTo, Boolean.valueOf(z6));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: f */
    public final void m22272f(C21778h backStackEntry) {
        AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
        C21795y c21795y = this.f69096h;
        AbstractC21769K abstractC21769KM22262b = c21795y.f33551w.m22262b(backStackEntry.f69074Z.f69130Y);
        if (!abstractC21769KM22262b.equals(this.f69095g)) {
            Object obj = c21795y.f33552x.get(abstractC21769KM22262b);
            if (obj != null) {
                ((C21780j) obj).m22272f(backStackEntry);
                return;
            } else {
                throw new IllegalStateException(AbstractC9306j0.m9891j(backStackEntry.f69074Z.f69130Y, " should already be created", new StringBuilder("NavigatorBackStack for ")).toString());
            }
        }
        ?? r6 = c21795y.f33553y;
        if (r6 != 0) {
            r6.invoke(backStackEntry);
            m22267a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f69074Z + " outside of the call to navigate(). ");
        }
    }
}
