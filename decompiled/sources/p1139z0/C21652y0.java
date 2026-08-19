package p1139z0;

import java.util.LinkedHashMap;
import java.util.Map;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1439n;
import p054C0.C1501n;
import p1071w0.AbstractC20734X;
import p1071w0.AbstractC20740b0;
import p1071w0.C20714I0;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21710p;
import p1140z1.InterfaceC21718w;
import p204I1.C3578I;
import p328N1.InterfaceC5598n;
import p492U1.C7540e;
import p492U1.EnumC7546k;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: z0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21652y0 extends AbstractC10458p implements InterfaceC21718w, InterfaceC21710p, InterfaceC21702l {

    /* JADX INFO: renamed from: A0 */
    public boolean f68619A0;

    /* JADX INFO: renamed from: B0 */
    public Map f68620B0;

    /* JADX INFO: renamed from: z0 */
    public C21574A0 f68621z0;

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        this.f68621z0.f68316d.setValue(abstractC21678Y);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        C21574A0 c21574a0 = this.f68621z0;
        EnumC7546k layoutDirection = interfaceC21059M.getLayoutDirection();
        InterfaceC5598n interfaceC5598n = (InterfaceC5598n) AbstractC21690f.m22204i(this, AbstractC0187M0.f707i);
        C21650x0 c21650x0 = c21574a0.f68313a;
        c21650x0.getClass();
        C21646v0 c21646v0 = new C21646v0(interfaceC21059M, layoutDirection, interfaceC5598n, j10);
        c21650x0.f68604Z.setValue(c21646v0);
        C21648w0 c21648w0 = (C21648w0) c21650x0.f68603Y.getValue();
        if (c21648w0 == null) {
            throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        }
        C3578I c3578iM21996c = c21650x0.m21996c(c21648w0, c21646v0);
        InterfaceC1439n interfaceC1439n = c21574a0.f68314b;
        if (interfaceC1439n != null) {
            interfaceC1439n.invoke(interfaceC21059M, new C20714I0(c21574a0, 8));
        }
        long j11 = c3578iM21996c.f10894c;
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        int iMin = Math.min(i10, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iMin, iMin2, Math.min(iM9960c, i11), i11 != Integer.MAX_VALUE ? Math.min(iM9960c, i11) : Integer.MAX_VALUE));
        this.f68621z0.f68319g.setValue(new C7540e(this.f68619A0 ? interfaceC21059M.mo7861O(AbstractC20740b0.m21275p(c3578iM21996c.f10893b.m4310b(0))) : 0));
        Map linkedHashMap = this.f68620B0;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(AbstractC21076c.f66994a, Integer.valueOf(Math.round(c3578iM21996c.f10895d)));
        linkedHashMap.put(AbstractC21076c.f66995b, Integer.valueOf(Math.round(c3578iM21996c.f10896e)));
        this.f68620B0 = linkedHashMap;
        return interfaceC21059M.mo19936R(i10, i11, linkedHashMap, new C1501n(abstractC21069XMo21533p, 17));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }
}
