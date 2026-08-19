package p544W9;

import io.C15045a;
import io.C15055k;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p328N1.C5576C;
import p328N1.C5608x;
import p328N1.C5609y;
import p328N1.InterfaceC5607w;
import p523V9.AbstractC8128k6;
import p547Wc.C8805o;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13784r;
import p758g0.AbstractC13785r0;
import p758g0.C13746W;
import p758g0.C13755c0;
import p758g0.C13783q0;
import p758g0.InterfaceC13787s0;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: W9.T3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8560T3 {
    /* JADX INFO: renamed from: a */
    public static C5576C m9222a(int i10) {
        return new C5576C(i10, C5609y.f18155r0, 0, new C5608x(new InterfaceC5607w[0]), 0);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m9223b(float f10, float f11, float f12, C13746W c13746w, C15045a c15045a, C8805o c8805o, C15055k c15055k) {
        C13783q0 c13783q0 = AbstractC13785r0.f43528a;
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        AbstractC13784r abstractC13784r = (AbstractC13784r) C13755c0.f43401t0.invoke(new Float(f12));
        InterfaceC13787s0 interfaceC13787s0Mo15214a = c13746w.mo15214a(c13783q0);
        InterfaceC1436k interfaceC1436k = c13783q0.f43526a;
        AbstractC13784r abstractC13784r2 = (AbstractC13784r) interfaceC1436k.invoke(f13);
        AbstractC13784r abstractC13784r3 = (AbstractC13784r) interfaceC1436k.invoke(f14);
        AbstractC13784r abstractC13784rM15247l = abstractC13784r != null ? AbstractC13758e.m15247l(abstractC13784r) : ((AbstractC13784r) interfaceC1436k.invoke(f13)).mo15285c();
        C21554a c21554a = C21555b.f68260Z;
        c15045a.invoke(new C21555b(AbstractC8128k6.m8645k(-1 < 0 ? interfaceC13787s0Mo15214a.mo3882q(abstractC13784r2, abstractC13784r3, abstractC13784rM15247l) : -1L, EnumC21557d.NANOSECONDS)));
        Object objM15238c = AbstractC13758e.m15238c(f10, f11, f12, c13746w, c8805o, c15055k);
        return objM15238c == EnumC19250a.f61036Y ? objM15238c : C17296C.f55119a;
    }
}
