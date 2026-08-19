package p341Ni;

import android.gov.nist.core.Separators;
import gd.C13843C;
import gd.C13866J1;
import gd.C14005w2;
import java.util.ArrayList;
import java.util.Map;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1081wc.C20860F;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p148Fi.C2770J;
import p148Fi.EnumC2779N0;
import p172Gi.EnumC3068a;
import p175Gl.EnumC3105d;
import p199Hl.AbstractC3469E;
import p199Hl.C3465A;
import p199Hl.C3466B;
import p199Hl.C3467C;
import p199Hl.C3468D;
import p199Hl.C3490o;
import p199Hl.C3491p;
import p199Hl.C3492q;
import p199Hl.C3493r;
import p199Hl.C3494s;
import p199Hl.C3496u;
import p199Hl.C3497v;
import p199Hl.C3498w;
import p199Hl.C3499x;
import p199Hl.C3500y;
import p199Hl.C3501z;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p344Nl.C5849u;
import p344Nl.EnumC5835g;
import p387Pl.AbstractC6468O;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8681n4;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5746C extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18699Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18700Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5784h0 f18701o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5746C(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18701o0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5746C c5746c = new C5746C(this.f18701o0, interfaceC18770c);
        c5746c.f18700Z = obj;
        return c5746c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5746C) create((AbstractC3469E) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2153Q0 c2153q0;
        Object value;
        Object c5789k;
        C2153Q0 c2153q1;
        Object value2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18699Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC3469E abstractC3469E = (AbstractC3469E) this.f18700Z;
            boolean z6 = abstractC3469E instanceof C3490o;
            C5784h0 c5784h0 = this.f18701o0;
            if (z6) {
                AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Connected", null, 6);
                C5788j0 c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
                if (c5788j0 != null && c5788j0.f18903g == null) {
                    c5788j0.m6189b(C20860F.f66388y, C17690x.f56481Y);
                    C5551u.Companion.getClass();
                    C5551u c5551u = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                    c5788j0.f18903g = c5551u;
                    long jM5946b = c5551u.m5946b(c5788j0.f18902f);
                    c5788j0.m6189b(C20860F.f66378o, AbstractC17660E.m19258c(new C17309l("latency", Long.valueOf(C21555b.m21835e(jM5946b)))));
                    long jM21835e = C21555b.m21835e(jM5946b);
                    do {
                        c2153q1 = c5788j0.f18908l;
                        value2 = c2153q1.getValue();
                    } while (!c2153q1.m3250k(value2, AbstractC17659D.m19249k((Map) value2, new C17309l("Connection Latency", Long.valueOf(jM21835e)))));
                }
                C5789k c5789k2 = new C5789k(false);
                C2153Q0 c2153q2 = c5784h0.f18832F;
                c2153q2.getClass();
                c2153q2.m3251l(null, c5789k2);
            } else if (abstractC3469E instanceof C3493r) {
                AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Disconnected", null, 6);
                C2153Q0 c2153q3 = c5784h0.f18832F;
                InterfaceC5798r interfaceC5798r = (InterfaceC5798r) c2153q3.getValue();
                if (!(interfaceC5798r instanceof C5791l ? true : interfaceC5798r instanceof C5795o)) {
                    C5793m c5793m = C5793m.f18928a;
                    c2153q3.getClass();
                    c2153q3.m3251l(null, c5793m);
                }
            } else if (abstractC3469E instanceof C3499x) {
                AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Reconnecting", null, 6);
                C5791l c5791l = C5791l.f18914a;
                C2153Q0 c2153q4 = c5784h0.f18832F;
                c2153q4.getClass();
                c2153q4.m3251l(null, c5791l);
            } else if (abstractC3469E instanceof C3492q) {
                byte[] bArr = ((C3492q) abstractC3469E).f10576c;
                this.f18699Y = 1;
                c5784h0.f18854f.getClass();
                C3516e c3516e = AbstractC0593T.f1824a;
                Object objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C5762T(bArr, c5784h0, null), this);
                if (objM1168P != enumC19250a) {
                    objM1168P = c17296c;
                }
                if (objM1168P == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC3469E instanceof C3491p) {
                C3491p c3491p = (C3491p) abstractC3469E;
                AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Connection quality changed: " + c3491p.f10575d, null, 6);
                c5784h0.f18830D.setValue(c3491p.f10575d.name());
                do {
                    c2153q0 = c5784h0.f18832F;
                    value = c2153q0.getValue();
                    c5789k = (InterfaceC5798r) value;
                    if ((c5789k instanceof C5789k) && c3491p.f10574c.equals(abstractC3469E.f10533b.f15400y)) {
                        C5789k c5789k3 = (C5789k) c5789k;
                        boolean z10 = c3491p.f10575d == EnumC5835g.f19061o0;
                        c5789k3.getClass();
                        c5789k = new C5789k(z10);
                    }
                } while (!c2153q0.m3250k(value, c5789k));
            } else if (abstractC3469E instanceof C3497v) {
                AbstractC8160o6.m8726a(c5784h0.f18872x, "Remote participant disconnected: " + C5849u.m6256a(((C3497v) abstractC3469E).f10578c.f18994a), null, 6);
                if (((InterfaceC5798r) c5784h0.f18832F.getValue()) instanceof C5789k) {
                    EnumC3068a enumC3068a = EnumC3068a.ModelHangUp;
                    this.f18699Y = 2;
                    if (c5784h0.m6176i(enumC3068a, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else if (abstractC3469E instanceof C3500y) {
                if (((C2770J) c5784h0.f18874z.getValue()).f8478a == EnumC2779N0.Idle && ((C3500y) abstractC3469E).f10581e == EnumC3105d.f9340Z) {
                    C5784h0.m6172f(c5784h0, new C2770J(EnumC2779N0.Listening));
                }
                ArrayList arrayListM9373b = AbstractC8681n4.m9373b(c5784h0.f18871w);
                C2153Q0 c2153q5 = c5784h0.f18838L;
                c2153q5.getClass();
                c2153q5.m3251l(null, arrayListM9373b);
                C3500y c3500y = (C3500y) abstractC3469E;
                AbstractC8160o6.m8726a(c5784h0.f18872x, "E2EE state changed: " + c3500y.f10581e + Separators.f31991SP + c3500y.f10580d + Separators.f31991SP + c3500y.f10579c, null, 6);
            } else {
                if (abstractC3469E instanceof C3501z ? true : abstractC3469E instanceof C3467C ? true : abstractC3469E instanceof C3465A ? true : abstractC3469E instanceof C3468D) {
                    C2153Q0 c2153q6 = c5784h0.f18838L;
                    ArrayList arrayListM9373b2 = AbstractC8681n4.m9373b(c5784h0.f18871w);
                    c2153q6.getClass();
                    c2153q6.m3251l(null, arrayListM9373b2);
                } else if (abstractC3469E instanceof C3466B) {
                    AbstractC6468O abstractC6468O = ((C3466B) abstractC3469E).f10532c;
                    boolean z11 = C5784h0.f18826W;
                    c5784h0.getClass();
                    if (((C14005w2) c5784h0.f18856h).m15481a(C13866J1.f43904c)) {
                        C21554a c21554a = C21555b.f68260Z;
                        AbstractC0575H.m1156D(c5784h0.f18849a, c5784h0.f18847U, null, new C5767Y(abstractC6468O, AbstractC8128k6.m8644j(((Number) c5784h0.f18857i.m15477a(C13843C.f43879d)).intValue(), EnumC21557d.SECONDS), c5784h0, null), 2);
                    }
                } else if (abstractC3469E instanceof C3494s) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Failed to connect", null, 6);
                } else if (abstractC3469E instanceof C3498w) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "LiveKit Reconnected", null, 6);
                } else if (abstractC3469E instanceof C3496u) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "Remote participant connected: " + C5849u.m6256a(((C3496u) abstractC3469E).f10577c.f18994a), null, 6);
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
