package p330N4;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import p117Eb.C2391u;
import p692d0.C12966e;
import p692d0.C12977p;

/* JADX INFO: renamed from: N4.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC5635A implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public AbstractC5673x f18304Y;

    /* JADX INFO: renamed from: Z */
    public ViewGroup f18305Z;

    /* JADX WARN: Code duplicated, block: B:103:0x020c  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0227  */
    /* JADX WARN: Code duplicated, block: B:111:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e6 A[EDGE_INSN: B:138:0x01e6->B:93:0x01e6 BREAK  A[LOOP:1: B:19:0x0087->B:92:0x01de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC5673x abstractC5673x;
        int i10;
        C2391u c2391u;
        C2391u c2391u2;
        C12966e c12966e;
        C12966e c12966e2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        C12966e c12966eM6095p;
        int i14;
        Animator animator;
        C5671v c5671v;
        View view;
        C5640F c5640f;
        C5640F c5640f2;
        int i15;
        C2391u c2391u3;
        int i16;
        View view2;
        C5640F c5640f3;
        int i17;
        C12966e c12966e3;
        int i18;
        int i19;
        View view3;
        SparseArray sparseArray;
        int size;
        int i20;
        View view4;
        int i21;
        View view5;
        C12977p c12977p;
        int iM14670j;
        int i22;
        View view6;
        C2391u c2391u4;
        Iterator it;
        int i23 = 1;
        ViewGroup viewGroup = this.f18305Z;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC5636B.f18308c;
        ViewGroup viewGroup2 = this.f18305Z;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C12966e c12966eM6043c = AbstractC5636B.m6043c();
        ArrayList arrayList3 = (ArrayList) c12966eM6043c.get(viewGroup2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            abstractC5673x = this.f18304Y;
            arrayList3.add(abstractC5673x);
            abstractC5673x.m6098a(new C5675z(this, c12966eM6043c));
            i10 = 0;
            abstractC5673x.m6100g(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC5673x) it.next()).mo6063x(viewGroup2);
                }
            }
            abstractC5673x.f18424w0 = new ArrayList();
            abstractC5673x.f18425x0 = new ArrayList();
            c2391u = abstractC5673x.f18420s0;
            c2391u2 = abstractC5673x.f18421t0;
            c12966e = new C12966e((C12966e) c2391u.f7429Z);
            c12966e2 = new C12966e((C12966e) c2391u2.f7429Z);
            i11 = 0;
            while (true) {
                iArr = abstractC5673x.f18423v0;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != i23) {
                    if (i15 != 2) {
                        c2391u3 = c2391u;
                        c12966e3 = (C12966e) c2391u3.f7432q0;
                        i18 = c12966e3.f41154o0;
                        for (i19 = 0; i19 < i18; i19++) {
                            view3 = (View) c12966e3.m14649j(i19);
                            if (view3 == null && abstractC5673x.m6105t(view3)) {
                                View view7 = (View) ((C12966e) c2391u2.f7432q0).get(c12966e3.m14646f(i19));
                                if (view7 != null && abstractC5673x.m6105t(view7)) {
                                    C5640F c5640f4 = (C5640F) c12966e.get(view3);
                                    C5640F c5640f5 = (C5640F) c12966e2.get(view7);
                                    if (c5640f4 != null && c5640f5 != null) {
                                        abstractC5673x.f18424w0.add(c5640f4);
                                        abstractC5673x.f18425x0.add(c5640f5);
                                        c12966e.remove(view3);
                                        c12966e2.remove(view7);
                                    }
                                }
                            }
                        }
                    } else if (i15 != 3) {
                        if (i15 == 4) {
                            c12977p = (C12977p) c2391u.f7431p0;
                            iM14670j = c12977p.m14670j();
                            i22 = i10;
                            while (i22 < iM14670j) {
                                view6 = (View) c12977p.m14671k(i22);
                                if (view6 == null && abstractC5673x.m6105t(view6)) {
                                    c2391u4 = c2391u;
                                    View view8 = (View) ((C12977p) c2391u2.f7431p0).m14664d(c12977p.m14667g(i22));
                                    if (view8 != null && abstractC5673x.m6105t(view8)) {
                                        C5640F c5640f6 = (C5640F) c12966e.get(view6);
                                        C5640F c5640f7 = (C5640F) c12966e2.get(view8);
                                        if (c5640f6 != null && c5640f7 != null) {
                                            abstractC5673x.f18424w0.add(c5640f6);
                                            abstractC5673x.f18425x0.add(c5640f7);
                                            c12966e.remove(view6);
                                            c12966e2.remove(view8);
                                        }
                                    }
                                } else {
                                    c2391u4 = c2391u;
                                }
                                i22 += i23;
                                c2391u = c2391u4;
                            }
                        }
                        i17 = i23;
                        c2391u3 = c2391u;
                    } else {
                        c2391u3 = c2391u;
                        sparseArray = (SparseArray) c2391u3.f7430o0;
                        SparseArray sparseArray2 = (SparseArray) c2391u2.f7430o0;
                        size = sparseArray.size();
                        i20 = 0;
                        while (i20 < size) {
                            view4 = (View) sparseArray.valueAt(i20);
                            if (view4 == null && abstractC5673x.m6105t(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i20))) != null && abstractC5673x.m6105t(view5)) {
                                C5640F c5640f8 = (C5640F) c12966e.get(view4);
                                C5640F c5640f9 = (C5640F) c12966e2.get(view5);
                                if (c5640f8 != null && c5640f9 != null) {
                                    abstractC5673x.f18424w0.add(c5640f8);
                                    abstractC5673x.f18425x0.add(c5640f9);
                                    c12966e.remove(view4);
                                    c12966e2.remove(view5);
                                }
                                i21 = 1;
                            } else {
                                i21 = i23;
                            }
                            i20 += i21;
                            i23 = i21;
                        }
                        i17 = i23;
                    }
                    i11 += i17;
                    i23 = i17;
                    c2391u = c2391u3;
                    i10 = 0;
                } else {
                    c2391u3 = c2391u;
                    for (i16 = c12966e.f41154o0 - i23; i16 >= 0; i16--) {
                        view2 = (View) c12966e.m14646f(i16);
                        if (view2 == null && abstractC5673x.m6105t(view2) && (c5640f3 = (C5640F) c12966e2.remove(view2)) != null && abstractC5673x.m6105t(c5640f3.f18321b)) {
                            abstractC5673x.f18424w0.add((C5640F) c12966e.m14647g(i16));
                            abstractC5673x.f18425x0.add(c5640f3);
                        }
                    }
                }
                i17 = 1;
                i11 += i17;
                i23 = i17;
                c2391u = c2391u3;
                i10 = 0;
            }
            for (i12 = 0; i12 < c12966e.f41154o0; i12++) {
                c5640f2 = (C5640F) c12966e.m14649j(i12);
                if (abstractC5673x.m6105t(c5640f2.f18321b)) {
                    abstractC5673x.f18424w0.add(c5640f2);
                    abstractC5673x.f18425x0.add(null);
                }
            }
            for (i13 = 0; i13 < c12966e2.f41154o0; i13++) {
                c5640f = (C5640F) c12966e2.m14649j(i13);
                if (abstractC5673x.m6105t(c5640f.f18321b)) {
                    abstractC5673x.f18425x0.add(c5640f);
                    abstractC5673x.f18424w0.add(null);
                }
            }
            c12966eM6095p = AbstractC5673x.m6095p();
            int i24 = c12966eM6095p.f41154o0;
            C5643I c5643i = AbstractC5642H.f18332a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i14 = i24 - 1; i14 >= 0; i14--) {
                animator = (Animator) c12966eM6095p.m14646f(i14);
                if (animator == null && (c5671v = (C5671v) c12966eM6095p.get(animator)) != null && (view = c5671v.f18400a) != null && c5671v.f18403d.f18357a.equals(windowId)) {
                    C5640F c5640fM6104r = abstractC5673x.m6104r(view, true);
                    C5640F c5640fM6103o = abstractC5673x.m6103o(view, true);
                    if (c5640fM6104r == null && c5640fM6103o == null) {
                        c5640fM6103o = (C5640F) ((C12966e) abstractC5673x.f18421t0.f7429Z).get(view);
                    }
                    if ((c5640fM6104r != null || c5640fM6103o != null) && c5671v.f18404e.mo6085s(c5671v.f18402c, c5640fM6103o)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c12966eM6095p.remove(animator);
                        }
                    }
                }
            }
            abstractC5673x.mo6060k(viewGroup2, abstractC5673x.f18420s0, abstractC5673x.f18421t0, abstractC5673x.f18424w0, abstractC5673x.f18425x0);
            abstractC5673x.mo6064y();
            return true;
        }
        arrayList3 = new ArrayList();
        c12966eM6043c.put(viewGroup2, arrayList3);
        abstractC5673x = this.f18304Y;
        arrayList3.add(abstractC5673x);
        abstractC5673x.m6098a(new C5675z(this, c12966eM6043c));
        i10 = 0;
        abstractC5673x.m6100g(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC5673x) it.next()).mo6063x(viewGroup2);
            }
        }
        abstractC5673x.f18424w0 = new ArrayList();
        abstractC5673x.f18425x0 = new ArrayList();
        c2391u = abstractC5673x.f18420s0;
        c2391u2 = abstractC5673x.f18421t0;
        c12966e = new C12966e((C12966e) c2391u.f7429Z);
        c12966e2 = new C12966e((C12966e) c2391u2.f7429Z);
        i11 = 0;
        while (true) {
            iArr = abstractC5673x.f18423v0;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != i23) {
                if (i15 != 2) {
                    c2391u3 = c2391u;
                    c12966e3 = (C12966e) c2391u3.f7432q0;
                    i18 = c12966e3.f41154o0;
                    while (i19 < i18) {
                        view3 = (View) c12966e3.m14649j(i19);
                        if (view3 == null) {
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        c12977p = (C12977p) c2391u.f7431p0;
                        iM14670j = c12977p.m14670j();
                        i22 = i10;
                        while (i22 < iM14670j) {
                            view6 = (View) c12977p.m14671k(i22);
                            if (view6 == null) {
                                c2391u4 = c2391u;
                            } else {
                                c2391u4 = c2391u;
                            }
                            i22 += i23;
                            c2391u = c2391u4;
                        }
                    }
                    i17 = i23;
                    c2391u3 = c2391u;
                } else {
                    c2391u3 = c2391u;
                    sparseArray = (SparseArray) c2391u3.f7430o0;
                    SparseArray sparseArray3 = (SparseArray) c2391u2.f7430o0;
                    size = sparseArray.size();
                    i20 = 0;
                    while (i20 < size) {
                        view4 = (View) sparseArray.valueAt(i20);
                        if (view4 == null) {
                            i21 = i23;
                        } else {
                            i21 = i23;
                        }
                        i20 += i21;
                        i23 = i21;
                    }
                    i17 = i23;
                }
                i11 += i17;
                i23 = i17;
                c2391u = c2391u3;
                i10 = 0;
            } else {
                c2391u3 = c2391u;
                while (i16 >= 0) {
                    view2 = (View) c12966e.m14646f(i16);
                    if (view2 == null) {
                    }
                }
            }
            i17 = 1;
            i11 += i17;
            i23 = i17;
            c2391u = c2391u3;
            i10 = 0;
        }
        while (i12 < c12966e.f41154o0) {
            c5640f2 = (C5640F) c12966e.m14649j(i12);
            if (abstractC5673x.m6105t(c5640f2.f18321b)) {
                abstractC5673x.f18424w0.add(c5640f2);
                abstractC5673x.f18425x0.add(null);
            }
        }
        while (i13 < c12966e2.f41154o0) {
            c5640f = (C5640F) c12966e2.m14649j(i13);
            if (abstractC5673x.m6105t(c5640f.f18321b)) {
                abstractC5673x.f18425x0.add(c5640f);
                abstractC5673x.f18424w0.add(null);
            }
        }
        c12966eM6095p = AbstractC5673x.m6095p();
        int i25 = c12966eM6095p.f41154o0;
        C5643I c5643i2 = AbstractC5642H.f18332a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i14 >= 0) {
            animator = (Animator) c12966eM6095p.m14646f(i14);
            if (animator == null) {
            }
        }
        abstractC5673x.mo6060k(viewGroup2, abstractC5673x.f18420s0, abstractC5673x.f18421t0, abstractC5673x.f18424w0, abstractC5673x.f18425x0);
        abstractC5673x.mo6064y();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f18305Z;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC5636B.f18308c;
        ViewGroup viewGroup2 = this.f18305Z;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC5636B.m6043c().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC5673x) it.next()).mo6063x(viewGroup2);
            }
        }
        this.f18304Y.m6101h(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
