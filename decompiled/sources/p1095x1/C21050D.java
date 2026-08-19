package p1095x1;

import java.util.List;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21656B;
import p492U1.C7536a;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: x1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C21050D extends AbstractC21656B {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C21053G f66949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1439n f66950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21050D(C21053G c21053g, InterfaceC1439n interfaceC1439n, String str) {
        super(str);
        this.f66949b = c21053g;
        this.f66950c = interfaceC1439n;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        C21053G c21053g = this.f66949b;
        EnumC7546k layoutDirection = interfaceC21059M.getLayoutDirection();
        C21048B c21048b = c21053g.f66962t0;
        c21048b.f66940Y = layoutDirection;
        c21048b.f66941Z = interfaceC21059M.getDensity();
        c21048b.f66942o0 = interfaceC21059M.mo7863X();
        boolean zMo19937Z = interfaceC21059M.mo19937Z();
        InterfaceC1439n interfaceC1439n = this.f66950c;
        if (zMo19937Z || c21053g.f66955Y.f68652o0 == null) {
            c21053g.f66958p0 = 0;
            InterfaceC21058L interfaceC21058L = (InterfaceC21058L) interfaceC1439n.invoke(c21048b, new C7536a(j10));
            return new C21049C(interfaceC21058L, c21053g, c21053g.f66958p0, interfaceC21058L, 1);
        }
        c21053g.f66959q0 = 0;
        InterfaceC21058L interfaceC21058L2 = (InterfaceC21058L) interfaceC1439n.invoke(c21053g.f66963u0, new C7536a(j10));
        return new C21049C(interfaceC21058L2, c21053g, c21053g.f66959q0, interfaceC21058L2, 0);
    }
}
