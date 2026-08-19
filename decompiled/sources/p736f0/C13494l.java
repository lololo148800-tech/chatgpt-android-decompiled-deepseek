package p736f0;

import java.util.ArrayList;
import java.util.List;
import p080D0.C1825q0;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13494l implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final C13500r f42716a;

    /* JADX INFO: renamed from: b */
    public boolean f42717b;

    public C13494l(C13500r c13500r) {
        this.f42716a = c13500r;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC21056J) list.get(0)).mo21530b(i10));
            int iM19381j = AbstractC17681o.m19381j(list);
            int i11 = 1;
            if (1 <= iM19381j) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC21056J) list.get(i11)).mo21530b(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM19381j) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC21056J) list.get(0)).mo21529G(i10));
            int iM19381j = AbstractC17681o.m19381j(list);
            int i11 = 1;
            if (1 <= iM19381j) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC21056J) list.get(i11)).mo21529G(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM19381j) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((InterfaceC21056J) list.get(i10)).mo21533p(j10));
        }
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i11 = ((AbstractC21069X) obj).f66981Y;
            int iM19381j = AbstractC17681o.m19381j(arrayList);
            if (1 <= iM19381j) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int i13 = ((AbstractC21069X) obj3).f66981Y;
                    if (i11 < i13) {
                        obj = obj3;
                        i11 = i13;
                    }
                    if (i12 == iM19381j) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            obj = null;
        }
        AbstractC21069X abstractC21069X = (AbstractC21069X) obj;
        int i14 = abstractC21069X != null ? abstractC21069X.f66981Y : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i15 = ((AbstractC21069X) obj2).f66982Z;
            int iM19381j2 = AbstractC17681o.m19381j(arrayList);
            if (1 <= iM19381j2) {
                int i16 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i16);
                    int i17 = ((AbstractC21069X) obj4).f66982Z;
                    if (i15 < i17) {
                        obj2 = obj4;
                        i15 = i17;
                    }
                    if (i16 == iM19381j2) {
                        break;
                    }
                    i16++;
                }
            }
        }
        AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj2;
        int i18 = abstractC21069X2 != null ? abstractC21069X2.f66982Z : 0;
        boolean zMo19937Z = interfaceC21059M.mo19937Z();
        C13500r c13500r = this.f42716a;
        if (zMo19937Z) {
            this.f42717b = true;
            c13500r.f42743a.setValue(new C7545j(AbstractC9113C4.m9643a(i14, i18)));
        } else if (!this.f42717b) {
            c13500r.f42743a.setValue(new C7545j(AbstractC9113C4.m9643a(i14, i18)));
        }
        return interfaceC21059M.mo19936R(i14, i18, C17690x.f56481Y, new C1825q0(7, arrayList));
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC21056J) list.get(0)).mo21532o(i10));
            int iM19381j = AbstractC17681o.m19381j(list);
            int i11 = 1;
            if (1 <= iM19381j) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC21056J) list.get(i11)).mo21532o(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM19381j) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC21056J) list.get(0)).mo21531l(i10));
            int iM19381j = AbstractC17681o.m19381j(list);
            int i11 = 1;
            if (1 <= iM19381j) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC21056J) list.get(i11)).mo21531l(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM19381j) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
