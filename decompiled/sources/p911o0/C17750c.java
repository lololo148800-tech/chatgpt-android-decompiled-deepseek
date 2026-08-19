package p911o0;

import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p492U1.C7536a;
import p492U1.C7540e;
import p530Vi.AbstractC8301I;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17750c extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public float f56680A0;

    /* JADX INFO: renamed from: B0 */
    public float f56681B0;

    /* JADX INFO: renamed from: z0 */
    public C21094o f56682z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        C21094o c21094o = this.f56682z0;
        float f10 = this.f56680A0;
        float f11 = this.f56681B0;
        boolean z6 = c21094o instanceof C21094o;
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(z6 ? C7536a.m7847b(j10, 0, 0, 0, 0, 11) : C7536a.m7847b(j10, 0, 0, 0, 0, 14));
        int iMo21547H = abstractC21069XMo21533p.mo21547H(c21094o);
        if (iMo21547H == Integer.MIN_VALUE) {
            iMo21547H = 0;
        }
        int i10 = z6 ? abstractC21069XMo21533p.f66982Z : abstractC21069XMo21533p.f66981Y;
        int iM7853h = (z6 ? C7536a.m7853h(j10) : C7536a.m7854i(j10)) - i10;
        int iM8921l = AbstractC8301I.m8921l((!C7540e.m7873a(f10, Float.NaN) ? interfaceC21059M.mo7866k0(f10) : 0) - iMo21547H, 0, iM7853h);
        int iM8921l2 = AbstractC8301I.m8921l(((!C7540e.m7873a(f11, Float.NaN) ? interfaceC21059M.mo7866k0(f11) : 0) - i10) + iMo21547H, 0, iM7853h - iM8921l);
        int iMax = z6 ? abstractC21069XMo21533p.f66981Y : Math.max(abstractC21069XMo21533p.f66981Y + iM8921l + iM8921l2, C7536a.m7856k(j10));
        int iMax2 = z6 ? Math.max(abstractC21069XMo21533p.f66982Z + iM8921l + iM8921l2, C7536a.m7855j(j10)) : abstractC21069XMo21533p.f66982Z;
        return interfaceC21059M.mo19936R(iMax, iMax2, C17690x.f56481Y, new C17748b(c21094o, f10, iM8921l, iMax, iM8921l2, abstractC21069XMo21533p, iMax2));
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
