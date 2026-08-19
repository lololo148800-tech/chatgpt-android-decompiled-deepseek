package p946pc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p349O0.C6016m0;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p909nm.C17690x;

/* JADX INFO: renamed from: pc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18337c implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public static final C18337c f58539a = new C18337c();

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
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) measurables.get(0);
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) measurables.get(1);
        int iMo21531l = interfaceC21056J.mo21531l(C7536a.m7853h(j10));
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J2.mo21533p(AbstractC9388w4.m9970m(-iMo21531l, 0, 2, j10));
        int i10 = abstractC21069XMo21533p.f66981Y + iMo21531l;
        int i11 = abstractC21069XMo21533p.f66982Z;
        return Layout.mo19936R(i10, i11, C17690x.f56481Y, new C6016m0(interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, iMo21531l, i11, i11, 1)), abstractC21069XMo21533p, iMo21531l));
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
