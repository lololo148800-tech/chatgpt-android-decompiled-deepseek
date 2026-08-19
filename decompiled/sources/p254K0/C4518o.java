package p254K0;

import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1000s0.AbstractC19397F;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p1139z0.C21585H;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p594Y9.AbstractC9828W3;
import p773h0.EnumC14284g0;
import p860l0.InterfaceC16736e1;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: K0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4518o implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: c */
    public static final C21585H f14759c = AbstractC9828W3.m10471b(C4517n.f14758Y, C4512i.f14731o0);

    /* JADX INFO: renamed from: a */
    public final C6002f0 f14760a;

    /* JADX INFO: renamed from: b */
    public final C19408d f14761b;

    public C4518o(int i10, float f10, InterfaceC1426a interfaceC1426a) {
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(interfaceC1426a, C5975S.f19448r0);
        this.f14760a = c6002f0M6430Q;
        InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) c6002f0M6430Q.getValue();
        float f11 = AbstractC19402K.f61474a;
        this.f14761b = new C19408d(i10, f10, interfaceC1426a2);
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return this.f14761b.f61447j.mo5255a();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C19408d c19408d = this.f14761b;
        c19408d.getClass();
        Object objM20493r = AbstractC19397F.m20493r(c19408d, enumC14284g0, interfaceC1439n, abstractC19687c);
        return objM20493r == EnumC19250a.f61036Y ? objM20493r : C17296C.f55119a;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean mo5257c() {
        return true;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean mo5258d() {
        return true;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return this.f14761b.f61447j.mo5259e(f10);
    }
}
