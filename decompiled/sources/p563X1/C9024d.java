package p563X1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p1071w0.AbstractC20734X;
import p1071w0.AbstractC20740b0;
import p1071w0.C20720L0;
import p1071w0.C20722M0;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p1140z1.C21658D;
import p492U1.C7536a;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9388w4;
import p587Y1.C9576b;
import p587Y1.C9592r;
import p759g1.C13801c;
import p909nm.C17690x;

/* JADX INFO: renamed from: X1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9024d implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27529a;

    /* JADX INFO: renamed from: b */
    public final Object f27530b;

    /* JADX INFO: renamed from: c */
    public final Object f27531c;

    public /* synthetic */ C9024d(Object obj, int i10, Object obj2) {
        this.f27529a = i10;
        this.f27530b = obj;
        this.f27531c = obj2;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        switch (this.f27529a) {
            case 0:
                C9037q c9037q = (C9037q) this.f27530b;
                ViewGroup.LayoutParams layoutParams = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams);
                c9037q.measure(AbstractC9029i.m9598k(c9037q, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c9037q.getMeasuredHeight();
            case 1:
                return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
            default:
                return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        switch (this.f27529a) {
            case 0:
                C9037q c9037q = (C9037q) this.f27530b;
                ViewGroup.LayoutParams layoutParams = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams);
                c9037q.measure(AbstractC9029i.m9598k(c9037q, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c9037q.getMeasuredHeight();
            case 1:
                return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
            default:
                return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        switch (this.f27529a) {
            case 0:
                C9037q c9037q = (C9037q) this.f27530b;
                int childCount = c9037q.getChildCount();
                C17690x c17690x = C17690x.f56481Y;
                if (childCount == 0) {
                    return interfaceC21059M.mo19936R(C7536a.m7856k(j10), C7536a.m7855j(j10), c17690x, C9021a.f27520o0);
                }
                if (C7536a.m7856k(j10) != 0) {
                    c9037q.getChildAt(0).setMinimumWidth(C7536a.m7856k(j10));
                }
                if (C7536a.m7855j(j10) != 0) {
                    c9037q.getChildAt(0).setMinimumHeight(C7536a.m7855j(j10));
                }
                int iM7856k = C7536a.m7856k(j10);
                int iM7854i = C7536a.m7854i(j10);
                ViewGroup.LayoutParams layoutParams = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams);
                int iM9598k = AbstractC9029i.m9598k(c9037q, iM7856k, iM7854i, layoutParams.width);
                int iM7855j = C7536a.m7855j(j10);
                int iM7853h = C7536a.m7853h(j10);
                ViewGroup.LayoutParams layoutParams2 = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams2);
                c9037q.measure(iM9598k, AbstractC9029i.m9598k(c9037q, iM7855j, iM7853h, layoutParams2.height));
                return interfaceC21059M.mo19936R(c9037q.getMeasuredWidth(), c9037q.getMeasuredHeight(), c17690x, new C9022b(c9037q, (C21658D) this.f27531c, 1));
            case 1:
                ((C9592r) this.f27530b).setParentLayoutDirection((EnumC7546k) this.f27531c);
                return interfaceC21059M.mo19936R(0, 0, C17690x.f56481Y, C9576b.f28822p0);
            default:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (!(((InterfaceC21056J) obj).mo21534t() instanceof C20722M0)) {
                        arrayList.add(obj);
                    }
                }
                List list2 = (List) ((InterfaceC1426a) this.f27531c).invoke();
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        C13801c c13801c = (C13801c) list2.get(i11);
                        C17309l c17309l = c13801c != null ? new C17309l(((InterfaceC21056J) arrayList.get(i11)).mo21533p(AbstractC9388w4.m9959b((int) Math.floor(c13801c.m15321h()), (int) Math.floor(c13801c.m15318e()), 5)), new C7543h(AbstractC9101A4.m9631a(Math.round(c13801c.f43586a), Math.round(c13801c.f43587b)))) : null;
                        if (c17309l != null) {
                            arrayList3.add(c17309l);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj2 = list.get(i12);
                    if (((InterfaceC21056J) obj2).mo21534t() instanceof C20722M0) {
                        arrayList4.add(obj2);
                    }
                }
                return interfaceC21059M.mo19936R(C7536a.m7854i(j10), C7536a.m7853h(j10), C17690x.f56481Y, new C20720L0(arrayList2, 0, AbstractC20740b0.m21273n(arrayList4, (InterfaceC1426a) this.f27530b)));
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        switch (this.f27529a) {
            case 0:
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                C9037q c9037q = (C9037q) this.f27530b;
                ViewGroup.LayoutParams layoutParams = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams);
                c9037q.measure(iMakeMeasureSpec, AbstractC9029i.m9598k(c9037q, 0, i10, layoutParams.height));
                return c9037q.getMeasuredWidth();
            case 1:
                return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
            default:
                return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        switch (this.f27529a) {
            case 0:
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                C9037q c9037q = (C9037q) this.f27530b;
                ViewGroup.LayoutParams layoutParams = c9037q.getLayoutParams();
                AbstractC16544l.m18091d(layoutParams);
                c9037q.measure(iMakeMeasureSpec, AbstractC9029i.m9598k(c9037q, 0, i10, layoutParams.height));
                return c9037q.getMeasuredWidth();
            case 1:
                return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
            default:
                return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
        }
    }
}
