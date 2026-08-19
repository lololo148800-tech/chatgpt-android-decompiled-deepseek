package p059C5;

import p025An.AbstractC0563B;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p085D5.AbstractC1956c;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21102w;
import p1140z1.AbstractC21668N;
import p397Q5.C6572a;
import p397Q5.C6573b;
import p397Q5.C6579h;
import p397Q5.InterfaceC6574c;
import p397Q5.InterfaceC6580i;
import p492U1.C7536a;
import p571X9.AbstractC9129F2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: C5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1600r implements InterfaceC6580i, InterfaceC21102w {

    /* JADX INFO: renamed from: Y */
    public final C2127D0 f4481Y = AbstractC2124C.m3203b(1, 0, EnumC1733a.f4962Z, 2);

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p397Q5.InterfaceC6580i
    /* JADX INFO: renamed from: a */
    public final Object mo2445a(InterfaceC18770c interfaceC18770c) {
        C1598p c1598p;
        InterfaceC6574c c6572a;
        if (interfaceC18770c instanceof C1598p) {
            c1598p = (C1598p) interfaceC18770c;
            int i10 = c1598p.f4479o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1598p.f4479o0 = i10 - Integer.MIN_VALUE;
            } else {
                c1598p = new C1598p(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c1598p = new C1598p(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM3220s = c1598p.f4477Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1598p.f4479o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3220s);
            C2127D0 c2127d0 = this.f4481Y;
            C1599q c1599q = new C1599q(2, null);
            c1598p.f4479o0 = 1;
            objM3220s = AbstractC2124C.m3220s(c2127d0, c1599q, c1598p);
            if (objM3220s == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3220s);
        }
        long j10 = ((C7536a) objM3220s).f23888a;
        AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
        int iM7854i = C7536a.m7854i(j10);
        InterfaceC6574c c6572a2 = C6573b.f21257a;
        if (iM7854i != Integer.MAX_VALUE) {
            AbstractC9129F2.m9667a(iM7854i);
            c6572a = new C6572a(iM7854i);
        } else {
            c6572a = c6572a2;
        }
        int iM7853h = C7536a.m7853h(j10);
        if (iM7853h != Integer.MAX_VALUE) {
            AbstractC9129F2.m9667a(iM7853h);
            c6572a2 = new C6572a(iM7853h);
        }
        return new C6579h(c6572a, c6572a2);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2446d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21235f(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2447f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        this.f4481Y.mo3231f(new C7536a(j10));
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1597o(abstractC21069XMo21533p, 0));
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2448g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21231b(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2449h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21239j(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2450k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21243n(this, abstractC21668N, interfaceC21056J, i10);
    }
}
