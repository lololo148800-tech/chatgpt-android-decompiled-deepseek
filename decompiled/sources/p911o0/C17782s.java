package p911o0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p228J.AbstractC3794B0;
import p229J0.C4063h3;
import p229J0.C4144v0;
import p492U1.C7536a;
import p635a1.InterfaceC10446d;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C17782s implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10446d f56759a;

    /* JADX INFO: renamed from: b */
    public final boolean f56760b;

    public C17782s(InterfaceC10446d interfaceC10446d, boolean z6) {
        this.f56759a = interfaceC10446d;
        this.f56760b = z6;
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
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        boolean zIsEmpty = list.isEmpty();
        C17690x c17690x = C17690x.f56481Y;
        if (zIsEmpty) {
            return interfaceC21059M.mo19936R(C7536a.m7856k(j10), C7536a.m7855j(j10), c17690x, C17776p.f56738o0);
        }
        long jM7847b = this.f56760b ? j10 : C7536a.m7847b(j10, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(0);
            boolean z6 = interfaceC21056J.mo21534t() instanceof C17774o;
            AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(jM7847b);
            int iMax = Math.max(C7536a.m7856k(j10), abstractC21069XMo21533p.f66981Y);
            int iMax2 = Math.max(C7536a.m7855j(j10), abstractC21069XMo21533p.f66982Z);
            return interfaceC21059M.mo19936R(iMax, iMax2, c17690x, new C4063h3(abstractC21069XMo21533p, interfaceC21056J, interfaceC21059M, iMax, iMax2, this));
        }
        AbstractC21069X[] abstractC21069XArr = new AbstractC21069X[list.size()];
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = C7536a.m7856k(j10);
        C16558z c16558z2 = new C16558z();
        c16558z2.f51287Y = C7536a.m7855j(j10);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i10);
            boolean z10 = interfaceC21056J2.mo21534t() instanceof C17774o;
            AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J2.mo21533p(jM7847b);
            abstractC21069XArr[i10] = abstractC21069XMo21533p2;
            c16558z.f51287Y = Math.max(c16558z.f51287Y, abstractC21069XMo21533p2.f66981Y);
            c16558z2.f51287Y = Math.max(c16558z2.f51287Y, abstractC21069XMo21533p2.f66982Z);
        }
        return interfaceC21059M.mo19936R(c16558z.f51287Y, c16558z2.f51287Y, c17690x, new C4144v0(abstractC21069XArr, list, interfaceC21059M, c16558z, c16558z2, this, 5));
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17782s)) {
            return false;
        }
        C17782s c17782s = (C17782s) obj;
        return AbstractC16544l.m18089b(this.f56759a, c17782s.f56759a) && this.f56760b == c17782s.f56760b;
    }

    public final int hashCode() {
        return (this.f56759a.hashCode() * 31) + (this.f56760b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f56759a);
        sb2.append(", propagateMinConstraints=");
        return AbstractC3794B0.m4499x(sb2, this.f56760b, ')');
    }
}
