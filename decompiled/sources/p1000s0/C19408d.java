package p1000s0;

import p049Bm.InterfaceC1426a;
import p1139z0.C21585H;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p594Y9.AbstractC9828W3;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19408d extends AbstractC19397F {

    /* JADX INFO: renamed from: H */
    public static final C21585H f61488H = AbstractC9828W3.m10471b(C19406b.f61484Y, C19407c.f61485Z);

    /* JADX INFO: renamed from: G */
    public final C6002f0 f61489G;

    public C19408d(int i10, float f10, InterfaceC1426a interfaceC1426a) {
        super(i10, f10);
        this.f61489G = C5997d.m6430Q(interfaceC1426a, C5975S.f19448r0);
    }

    @Override // p1000s0.AbstractC19397F
    /* JADX INFO: renamed from: l */
    public final int mo20500l() {
        return ((Number) ((InterfaceC1426a) this.f61489G.getValue()).invoke()).intValue();
    }
}
