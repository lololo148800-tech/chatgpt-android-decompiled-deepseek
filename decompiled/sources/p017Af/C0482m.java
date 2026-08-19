package p017Af;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: Af.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C0482m implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f1565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f1566b;

    public C0482m(float f10, float f11) {
        this.f1565a = f10;
        this.f1566b = f11;
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
        int iMo7866k0 = Layout.mo7866k0(this.f1565a);
        long jM7847b = C7536a.m7847b(j10, 0, C7536a.m7854i(j10) + iMo7866k0 + Layout.mo7866k0(this.f1566b), 0, 0, 13);
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19343S(measurables);
        C17690x c17690x = C17690x.f56481Y;
        if (interfaceC21056J == null) {
            return Layout.mo19936R(0, 0, c17690x, C0481l.f1560Z);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(jM7847b);
        return Layout.mo19936R(Math.min(C7536a.m7854i(j10), abstractC21069XMo21533p.f66981Y), abstractC21069XMo21533p.f66982Z, c17690x, new C0480k(iMo7866k0, 0, abstractC21069XMo21533p));
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
