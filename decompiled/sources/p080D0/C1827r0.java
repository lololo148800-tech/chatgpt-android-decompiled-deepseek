package p080D0;

import java.util.ArrayList;
import java.util.List;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p909nm.C17690x;

/* JADX INFO: renamed from: D0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1827r0 implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public static final C1827r0 f5263a = new C1827r0();

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
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((InterfaceC21056J) list.get(i10)).mo21533p(j10));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((AbstractC21069X) arrayList.get(i11)).f66981Y));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((AbstractC21069X) arrayList.get(i12)).f66982Z));
        }
        return interfaceC21059M.mo19936R(iIntValue, numValueOf.intValue(), C17690x.f56481Y, new C1825q0(0, arrayList));
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
