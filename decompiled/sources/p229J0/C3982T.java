package p229J0;

import java.util.ArrayList;
import java.util.List;
import p049Bm.InterfaceC1426a;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21061O;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C3982T implements InterfaceC21061O {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3880A3 f12482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1426a f12483b;

    public C3982T(C3880A3 c3880a3, InterfaceC1426a interfaceC1426a) {
        this.f12482a = c3880a3;
        this.f12483b = interfaceC1426a;
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo4650a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21233d(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo4651b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21241l(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo4652c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i10 = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        int iM7854i = C7536a.m7854i(j10);
        int iM7853h = C7536a.m7853h(j10);
        long jM7847b = C7536a.m7847b(j10, 0, 0, 0, 0, 10);
        ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(((InterfaceC21056J) list4.get(i11)).mo21533p(jM7847b));
        }
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList3.add(((InterfaceC21056J) list2.get(i12)).mo21533p(jM7847b));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((AbstractC21069X) arrayList3.get(0)).f66982Z);
            int iM19381j = AbstractC17681o.m19381j(arrayList3);
            if (1 <= iM19381j) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((AbstractC21069X) arrayList3.get(i10)).f66982Z);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iM19381j) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jM7847b2 = C7536a.m7847b(jM7847b, 0, 0, 0, iM7853h - iIntValue, 7);
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i13 = 0; i13 < size3; i13++) {
            arrayList4.add(((InterfaceC21056J) list3.get(i13)).mo21533p(jM7847b2));
        }
        ArrayList arrayList5 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i14 = 0; i14 < size4; i14++) {
            arrayList5.add(((InterfaceC21056J) list5.get(i14)).mo21533p(jM7847b));
        }
        return interfaceC21059M.mo19936R(iM7854i, iM7853h, C17690x.f56481Y, new C3977S(arrayList2, iM7854i, arrayList5, this.f12482a, this.f12483b, iM7853h, arrayList4, arrayList3, iIntValue));
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo4653d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21237h(this, interfaceC21095p, (ArrayList) list, i10);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo4654e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21245p(this, interfaceC21095p, (ArrayList) list, i10);
    }
}
