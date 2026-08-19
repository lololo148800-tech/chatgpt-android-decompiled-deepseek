package p587Y1;

import java.util.ArrayList;
import java.util.List;
import p054C0.C1501n;
import p080D0.C1825q0;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: Y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9578d implements InterfaceC21057K {

    /* JADX INFO: renamed from: b */
    public static final C9578d f28831b = new C9578d(0);

    /* JADX INFO: renamed from: c */
    public static final C9578d f28832c = new C9578d(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28833a;

    public /* synthetic */ C9578d(int i10) {
        this.f28833a = i10;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f28833a;
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f28833a;
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Object obj;
        int iMax;
        switch (this.f28833a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((InterfaceC21056J) list.get(i10)).mo21533p(j10));
                }
                int i11 = 1;
                Object obj2 = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i12 = ((AbstractC21069X) obj).f66981Y;
                    int iM19381j = AbstractC17681o.m19381j(arrayList);
                    if (1 <= iM19381j) {
                        int i13 = 1;
                        while (true) {
                            Object obj3 = arrayList.get(i13);
                            int i14 = ((AbstractC21069X) obj3).f66981Y;
                            if (i12 < i14) {
                                obj = obj3;
                                i12 = i14;
                            }
                            if (i13 != iM19381j) {
                                i13++;
                            }
                        }
                    }
                }
                AbstractC21069X abstractC21069X = (AbstractC21069X) obj;
                int iM7856k = abstractC21069X != null ? abstractC21069X.f66981Y : C7536a.m7856k(j10);
                if (!arrayList.isEmpty()) {
                    Object obj4 = arrayList.get(0);
                    int i15 = ((AbstractC21069X) obj4).f66982Z;
                    int iM19381j2 = AbstractC17681o.m19381j(arrayList);
                    if (1 <= iM19381j2) {
                        while (true) {
                            Object obj5 = arrayList.get(i11);
                            int i16 = ((AbstractC21069X) obj5).f66982Z;
                            if (i15 < i16) {
                                obj4 = obj5;
                                i15 = i16;
                            }
                            if (i11 != iM19381j2) {
                                i11++;
                            }
                        }
                    }
                    obj2 = obj4;
                }
                AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj2;
                return interfaceC21059M.mo19936R(iM7856k, abstractC21069X2 != null ? abstractC21069X2.f66982Z : C7536a.m7855j(j10), C17690x.f56481Y, new C1825q0(3, arrayList));
            default:
                int size2 = list.size();
                C17690x c17690x = C17690x.f56481Y;
                int i17 = 0;
                if (size2 == 0) {
                    return interfaceC21059M.mo19936R(0, 0, c17690x, C9576b.f28824r0);
                }
                if (size2 == 1) {
                    AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) list.get(0)).mo21533p(j10);
                    return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, c17690x, new C1501n(abstractC21069XMo21533p, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    arrayList2.add(((InterfaceC21056J) list.get(i18)).mo21533p(j10));
                }
                int iM19381j3 = AbstractC17681o.m19381j(arrayList2);
                if (iM19381j3 >= 0) {
                    int iMax2 = 0;
                    iMax = 0;
                    while (true) {
                        AbstractC21069X abstractC21069X3 = (AbstractC21069X) arrayList2.get(i17);
                        iMax2 = Math.max(iMax2, abstractC21069X3.f66981Y);
                        iMax = Math.max(iMax, abstractC21069X3.f66982Z);
                        if (i17 != iM19381j3) {
                            i17++;
                        } else {
                            i17 = iMax2;
                        }
                    }
                } else {
                    iMax = 0;
                }
                return interfaceC21059M.mo19936R(i17, iMax, c17690x, new C1825q0(4, arrayList2));
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f28833a;
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f28833a;
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }
}
