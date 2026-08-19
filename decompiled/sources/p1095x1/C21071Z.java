package p1095x1;

import java.util.ArrayList;
import java.util.List;
import p054C0.C1501n;
import p080D0.C1825q0;
import p1140z1.AbstractC21656B;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p909nm.C17690x;

/* JADX INFO: renamed from: x1.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C21071Z extends AbstractC21656B {

    /* JADX INFO: renamed from: b */
    public static final C21071Z f66988b = new C21071Z("Undefined intrinsics block and it is required");

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        boolean zIsEmpty = list.isEmpty();
        C17690x c17690x = C17690x.f56481Y;
        if (zIsEmpty) {
            return interfaceC21059M.mo19936R(C7536a.m7856k(j10), C7536a.m7855j(j10), c17690x, C21101v.f67031p0);
        }
        if (list.size() == 1) {
            AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) list.get(0)).mo21533p(j10);
            return interfaceC21059M.mo19936R(AbstractC9388w4.m9965h(abstractC21069XMo21533p.f66981Y, j10), AbstractC9388w4.m9964g(abstractC21069XMo21533p.f66982Z, j10), c17690x, new C1501n(abstractC21069XMo21533p, 15));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((InterfaceC21056J) list.get(i10)).mo21533p(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) arrayList.get(i11);
            iMax = Math.max(abstractC21069X.f66981Y, iMax);
            iMax2 = Math.max(abstractC21069X.f66982Z, iMax2);
        }
        return interfaceC21059M.mo19936R(AbstractC9388w4.m9965h(iMax, j10), AbstractC9388w4.m9964g(iMax2, j10), c17690x, new C1825q0(14, arrayList));
    }
}
