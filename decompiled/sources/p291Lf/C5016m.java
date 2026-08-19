package p291Lf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p911o0.C17786u;

/* JADX INFO: renamed from: Lf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5016m implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C17786u f16371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f16372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f16373c;

    public C5016m(C17786u c17786u, int i10, int i11) {
        this.f16371a = c17786u;
        this.f16372b = i10;
        this.f16373c = i11;
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
        int size = measurables.size();
        int i10 = 2;
        if (size != 2 && size != 4) {
            i10 = 3;
        }
        int i11 = i10 - 1;
        int size2 = (measurables.size() + i11) / i10;
        C17786u c17786u = this.f16371a;
        int iM7854i = C7536a.m7854i(c17786u.f56763b);
        int i12 = this.f16372b;
        int iMin = Math.min((iM7854i - (i11 * i12)) / i10, this.f16373c);
        long j11 = c17786u.f56763b;
        int iM8921l = AbstractC8301I.m8921l(iMin, 0, C7536a.m7854i(j11) / i10);
        List<InterfaceC21056J> list = measurables;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (InterfaceC21056J interfaceC21056J : list) {
            if (iM8921l < 0 || iM8921l < 0) {
                AbstractC9406z4.m9983b("width(" + iM8921l + ") and height(" + iM8921l + ") must be >= 0");
                throw null;
            }
            arrayList.add(interfaceC21056J.mo21533p(AbstractC9388w4.m9966i(iM8921l, iM8921l, iM8921l, iM8921l)));
        }
        return Layout.mo19936R((AbstractC8301I.m8921l(i11, C7536a.m7856k(j11), C7536a.m7854i(j11)) * i12) + (iM8921l * i10), (AbstractC8301I.m8921l(size2 - 1, C7536a.m7855j(j11), C7536a.m7853h(j11)) * i12) + (iM8921l * size2), C17690x.f56481Y, new C5015l(arrayList, i10, iM8921l, i12));
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
