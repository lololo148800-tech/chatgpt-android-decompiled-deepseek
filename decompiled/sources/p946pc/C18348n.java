package p946pc;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0478i;
import p1071w0.AbstractC20734X;
import p1091wn.AbstractC21031l;
import p1091wn.InterfaceC21029j;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: pc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18348n implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f58581b;

    public C18348n(int i10, float f10) {
        this.f58580a = i10;
        this.f58581b = f10;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M Layout, List measurables, long j10) {
        Object next;
        AbstractC16544l.m18094g(Layout, "$this$Layout");
        AbstractC16544l.m18094g(measurables, "measurables");
        int size = measurables.size();
        int i10 = this.f58580a;
        if (size != i10 * 2) {
            throw new IllegalStateException("Check failed.");
        }
        List list = measurables;
        InterfaceC21029j interfaceC21029jM21497u = AbstractC21031l.m21497u(AbstractC17680n.m19329H(list), i10);
        InterfaceC21029j interfaceC21029jM21486j = AbstractC21031l.m21486j(AbstractC17680n.m19329H(list), i10);
        List listM21499w = AbstractC21031l.m21499w(AbstractC21031l.m21495s(interfaceC21029jM21497u, C18335a.f58532u0));
        Iterator it = listM21499w.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i11 = ((AbstractC21069X) next).f66981Y;
                do {
                    Object next3 = it.next();
                    int i12 = ((AbstractC21069X) next3).f66981Y;
                    if (i11 < i12) {
                        next = next3;
                        i11 = i12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbstractC16544l.m18091d(next);
        AbstractC21069X abstractC21069X = (AbstractC21069X) next;
        int iM7854i = C7536a.m7854i(j10) - abstractC21069X.f66981Y;
        int i13 = 0;
        List listM21499w2 = AbstractC21031l.m21499w(AbstractC21031l.m21495s(interfaceC21029jM21486j, new C0478i(C7536a.m7847b(j10, 0, iM7854i < 0 ? 0 : iM7854i, 0, 0, 13), 5)));
        List list2 = listM21499w2;
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i14 = ((AbstractC21069X) next2).f66981Y;
                do {
                    Object next4 = it2.next();
                    int i15 = ((AbstractC21069X) next4).f66981Y;
                    if (i14 < i15) {
                        next2 = next4;
                        i14 = i15;
                    }
                } while (it2.hasNext());
            }
        }
        AbstractC16544l.m18091d(next2);
        int i16 = abstractC21069X.f66981Y + ((AbstractC21069X) next2).f66981Y;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            i13 += ((AbstractC21069X) it3.next()).f66982Z;
        }
        return Layout.mo19936R(i16, i13 + (Layout.mo7866k0(this.f58581b) * (listM21499w2.size() - 1)), C17690x.f56481Y, new C18347m(this.f58580a, listM21499w, listM21499w2, Layout, this.f58581b, abstractC21069X));
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }
}
