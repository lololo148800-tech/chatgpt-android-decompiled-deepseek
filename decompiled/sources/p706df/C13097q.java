package p706df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p204I1.C3598n;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: renamed from: df.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13097q implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f41591a;

    public C13097q(float f10) {
        this.f41591a = f10;
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
        AbstractC16544l.m18094g(Layout, "$this$Layout");
        AbstractC16544l.m18094g(measurables, "measurables");
        List list = measurables;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC21056J) it.next()).mo21533p(j10));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        C17690x c17690x = C17690x.f56481Y;
        if (zIsEmpty) {
            Layout.mo19936R(0, 0, c17690x, C13082b.f41565q0);
            return Layout.mo19936R(0, 0, c17690x, C13082b.f41566r0);
        }
        int i10 = ((AbstractC21069X) AbstractC17680n.m19341Q(arrayList)).f66981Y;
        int i11 = (int) (i10 * this.f41591a);
        return Layout.mo19936R(((i10 - i11) * (arrayList.size() - 1)) + i10, ((AbstractC21069X) AbstractC17680n.m19341Q(arrayList)).f66982Z, c17690x, new C3598n(arrayList, i10, i11, 3));
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
