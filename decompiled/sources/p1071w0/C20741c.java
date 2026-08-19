package p1071w0;

import java.util.ArrayList;
import java.util.List;
import p080D0.C1825q0;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.C17690x;

/* JADX INFO: renamed from: w0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20741c implements InterfaceC21057K {

    /* JADX INFO: renamed from: b */
    public static final C20741c f65749b = new C20741c(0);

    /* JADX INFO: renamed from: c */
    public static final C20741c f65750c = new C20741c(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65751a;

    public /* synthetic */ C20741c(int i10) {
        this.f65751a = i10;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f65751a;
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f65751a;
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        switch (this.f65751a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((InterfaceC21056J) list.get(i10)).mo21533p(j10));
                }
                return interfaceC21059M.mo19936R(C7536a.m7854i(j10), C7536a.m7853h(j10), C17690x.f56481Y, new C1825q0(13, arrayList));
            default:
                return interfaceC21059M.mo19936R(C7536a.m7854i(j10), C7536a.m7853h(j10), C17690x.f56481Y, C20745e.f65762r0);
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f65751a;
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f65751a;
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }
}
