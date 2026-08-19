package p988rc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p229J0.C3974R1;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: rc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18915c implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f60356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5985X f60357b;

    public C18915c(long j10, InterfaceC5985X interfaceC5985X) {
        this.f60356a = j10;
        this.f60357b = interfaceC5985X;
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
        C7545j c7545j;
        AbstractC16544l.m18094g(Layout, "$this$Layout");
        AbstractC16544l.m18094g(measurables, "measurables");
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19367q0(measurables);
        C17690x c17690x = C17690x.f56481Y;
        if (interfaceC21056J == null) {
            return Layout.mo19936R(0, 0, c17690x, C18914b.f60352Z);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(this.f60356a);
        int i10 = abstractC21069XMo21533p.f66981Y;
        InterfaceC5985X interfaceC5985X = this.f60357b;
        C7545j c7545j2 = (C7545j) interfaceC5985X.getValue();
        int i11 = i10 - (c7545j2 != null ? (int) (c7545j2.f23903a >> 32) : abstractC21069XMo21533p.f66981Y);
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = abstractC21069XMo21533p.f66982Z;
        C7545j c7545j3 = (C7545j) interfaceC5985X.getValue();
        int i13 = i12 - (c7545j3 != null ? (int) (c7545j3.f23903a & 4294967295L) : abstractC21069XMo21533p.f66982Z);
        int i14 = i13 >= 0 ? i13 : 0;
        C7545j c7545j4 = (C7545j) interfaceC5985X.getValue();
        if (c7545j4 == null || abstractC21069XMo21533p.f66981Y != ((int) (c7545j4.f23903a >> 32)) || (c7545j = (C7545j) interfaceC5985X.getValue()) == null || abstractC21069XMo21533p.f66982Z != ((int) (c7545j.f23903a & 4294967295L))) {
            interfaceC5985X.setValue(new C7545j(AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z)));
        }
        return Layout.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, c17690x, new C3974R1(abstractC21069XMo21533p, i11, i14, 3));
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
