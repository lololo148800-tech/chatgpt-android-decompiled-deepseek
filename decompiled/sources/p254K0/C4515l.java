package p254K0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p291Lf.C5017n;
import p349O0.C6021p;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p658b5.AbstractC11235f;
import p774h1.InterfaceC14339Q;
import p860l0.EnumC16673F0;
import p909nm.C17690x;
import p946pc.AbstractC18322G;
import p946pc.C18320E;
import p946pc.C18321F;
import p946pc.C18357w;

/* JADX INFO: renamed from: K0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4515l extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14748Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f14749Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f14750o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f14751p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f14752q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f14753r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4515l(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        super(3);
        this.f14748Y = i11;
        this.f14750o0 = obj;
        this.f14751p0 = obj2;
        this.f14749Z = i10;
        this.f14752q0 = obj3;
        this.f14753r0 = obj4;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14748Y) {
            case 0:
                InterfaceC21059M interfaceC21059M = (InterfaceC21059M) obj;
                InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj2;
                long j10 = ((C7536a) obj3).f23888a;
                C4525v c4525v = (C4525v) ((InterfaceC1426a) this.f14750o0).invoke();
                boolean z6 = c4525v.f14800l;
                C17690x c17690x = C17690x.f56481Y;
                if (!z6) {
                    return interfaceC21059M.mo19936R(0, 0, c17690x, C4512i.f14730Z);
                }
                boolean z10 = ((C4518o) this.f14751p0).f14761b.m20499k().f61601e == EnumC16673F0.f53401Y;
                boolean z11 = interfaceC21059M.getLayoutDirection() == EnumC7546k.f23905Z;
                float fM5266a = c4525v.m5266a();
                AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(z10 ? C7536a.m7846a(C7536a.m7856k(j10), C7536a.m7854i(j10), AbstractC2119a.m3195i(fM5266a), AbstractC2119a.m3195i(fM5266a)) : C7536a.m7846a(AbstractC2119a.m3195i(fM5266a), AbstractC2119a.m3195i(fM5266a), C7536a.m7855j(j10), C7536a.m7853h(j10)));
                return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, c17690x, new C4514k(abstractC21069XMo21533p, (C4518o) this.f14751p0, c4525v, this.f14749Z, z10, (C4506c) this.f14752q0, (InterfaceC14339Q) this.f14753r0, z11));
            default:
                int iIntValue = ((Number) obj).intValue();
                C6021p c6021p = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c6021p.m6538d(iIntValue) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC11235f.m12525a(null, C18321F.m19847a(AbstractC18322G.m19849b((C18320E) this.f14750o0, c6021p), ((C18357w) this.f14751p0).f58614c, null, 254), AbstractC8411c.m8968b(932227418, c6021p, new C5017n(this.f14749Z, (C8410b) this.f14752q0, (List) this.f14753r0, iIntValue)), c6021p, 384, 1);
                }
                return C17296C.f55119a;
        }
    }
}
