package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C16696N implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f53499a;

    /* JADX INFO: renamed from: b */
    public final C16693M f53500b = new C16693M(this);

    /* JADX INFO: renamed from: c */
    public final C14292k0 f53501c = new C14292k0();

    /* JADX INFO: renamed from: d */
    public final C6002f0 f53502d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f53503e;

    /* JADX INFO: renamed from: f */
    public final C6002f0 f53504f;

    /* JADX WARN: Multi-variable type inference failed */
    public C16696N(InterfaceC1436k interfaceC1436k) {
        this.f53499a = (AbstractC16546n) interfaceC1436k;
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f53502d = C5997d.m6430Q(bool, c5975s);
        this.f53503e = C5997d.m6430Q(bool, c5975s);
        this.f53504f = C5997d.m6430Q(bool, c5975s);
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return ((Boolean) this.f53502d.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        Object objM1183l = AbstractC0575H.m1183l(new C16690L(this, enumC14284g0, interfaceC1439n, null), abstractC19687c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return ((Number) this.f53499a.invoke(Float.valueOf(f10))).floatValue();
    }
}
