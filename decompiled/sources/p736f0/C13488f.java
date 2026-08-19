package p736f0;

import java.util.List;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13488f implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final C13493k f42702a;

    public C13488f(C13493k c13493k) {
        this.f42702a = c13493k;
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
        AbstractC21069X abstractC21069X;
        AbstractC21069X abstractC21069X2;
        int i10;
        int size = list.size();
        AbstractC21069X[] abstractC21069XArr = new AbstractC21069X[size];
        int size2 = list.size();
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            abstractC21069X = null;
            if (i12 >= size2) {
                break;
            }
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i12);
            Object objMo21534t = interfaceC21056J.mo21534t();
            C13490h c13490h = objMo21534t instanceof C13490h ? (C13490h) objMo21534t : null;
            if (c13490h != null && ((Boolean) c13490h.f42703Y.getValue()).booleanValue()) {
                AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
                long jM9643a = AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z);
                abstractC21069XArr[i12] = abstractC21069XMo21533p;
                j11 = jM9643a;
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i13);
            if (abstractC21069XArr[i13] == null) {
                abstractC21069XArr[i13] = interfaceC21056J2.mo21533p(j10);
            }
        }
        if (interfaceC21059M.mo19937Z()) {
            i10 = (int) (j11 >> 32);
        } else {
            if (size == 0) {
                abstractC21069X2 = null;
            } else {
                abstractC21069X2 = abstractC21069XArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = abstractC21069X2 != null ? abstractC21069X2.f66981Y : 0;
                    C3507f it = new C3508g(1, i14, 1).iterator();
                    while (it.f10596o0) {
                        AbstractC21069X abstractC21069X3 = abstractC21069XArr[it.mo4199a()];
                        int i16 = abstractC21069X3 != null ? abstractC21069X3.f66981Y : 0;
                        if (i15 < i16) {
                            abstractC21069X2 = abstractC21069X3;
                            i15 = i16;
                        }
                    }
                }
            }
            i10 = abstractC21069X2 != null ? abstractC21069X2.f66981Y : 0;
        }
        if (interfaceC21059M.mo19937Z()) {
            i11 = (int) (4294967295L & j11);
        } else {
            if (size != 0) {
                abstractC21069X = abstractC21069XArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = abstractC21069X != null ? abstractC21069X.f66982Z : 0;
                    C3507f it2 = new C3508g(1, i17, 1).iterator();
                    while (it2.f10596o0) {
                        AbstractC21069X abstractC21069X4 = abstractC21069XArr[it2.mo4199a()];
                        int i19 = abstractC21069X4 != null ? abstractC21069X4.f66982Z : 0;
                        if (i18 < i19) {
                            abstractC21069X = abstractC21069X4;
                            i18 = i19;
                        }
                    }
                }
            }
            if (abstractC21069X != null) {
                i11 = abstractC21069X.f66982Z;
            }
        }
        if (!interfaceC21059M.mo19937Z()) {
            this.f42702a.f42713d.setValue(new C7545j(AbstractC9113C4.m9643a(i10, i11)));
        }
        return interfaceC21059M.mo19936R(i10, i11, C17690x.f56481Y, new C13487e(abstractC21069XArr, this, i10, i11));
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
