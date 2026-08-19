package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.InterfaceC17306i;
import p049Bm.InterfaceC1426a;
import p204I1.C3578I;
import p204I1.C3581L;

/* JADX INFO: renamed from: D0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1830t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1820o f5277Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f5278Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f5279o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1784S f5280p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f5281q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830t(C1820o c1820o, int i10, int i11, InterfaceC1784S interfaceC1784S, InterfaceC17306i interfaceC17306i) {
        super(0);
        this.f5277Y = c1820o;
        this.f5278Z = i10;
        this.f5279o0 = i11;
        this.f5280p0 = interfaceC1784S;
        this.f5281q0 = interfaceC17306i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int iIntValue = ((Number) this.f5281q0.getValue()).intValue();
        InterfaceC1784S interfaceC1784S = this.f5280p0;
        boolean zMo2573a = interfaceC1784S.mo2573a();
        boolean z6 = interfaceC1784S.mo2582j() == 1;
        C1820o c1820o = this.f5277Y;
        C3578I c3578i = c1820o.f5240f;
        int i10 = this.f5278Z;
        long jM4263m = c3578i.m4263m(i10);
        int i11 = C3581L.f10907c;
        int iM4260j = (int) (jM4263m >> 32);
        C3578I c3578i2 = c1820o.f5240f;
        int iM4257g = c3578i2.m4257g(iM4260j);
        int i12 = c3578i2.f10893b.f10963f;
        if (iM4257g != iIntValue) {
            iM4260j = iIntValue >= i12 ? c3578i2.m4260j(i12 - 1) : c3578i2.m4260j(iIntValue);
        }
        int iM4256f = (int) (jM4263m & 4294967295L);
        if (c3578i2.m4257g(iM4256f) != iIntValue) {
            iM4256f = iIntValue >= i12 ? c3578i2.m4256f(i12 - 1, false) : c3578i2.m4256f(iIntValue, false);
        }
        int i13 = this.f5279o0;
        if (iM4260j == i13) {
            return c1820o.m2646a(iM4256f);
        }
        if (iM4256f == i13) {
            return c1820o.m2646a(iM4260j);
        }
        if (!(zMo2573a ^ z6) ? i10 >= iM4260j : i10 > iM4256f) {
            iM4260j = iM4256f;
        }
        return c1820o.m2646a(iM4260j);
    }
}
