package p215Ic;

import gd.C13912Z0;
import gd.C13932e1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import li.C16962a;
import li.C16963b;
import mm.C17296C;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p1081wc.C20879Z;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p1155zi.EnumC22026l;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p406Qg.C6711g;
import p406Qg.C6712h;
import p523V9.AbstractC8152n6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p708dh.C13133K;
import p708dh.C13136N;
import p811ih.C15000g;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3690g implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11202Y;

    /* JADX INFO: renamed from: Z */
    public final Object f11203Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f11204o0;

    public /* synthetic */ C3690g(Object obj, C15000g c15000g, int i10) {
        this.f11202Y = i10;
        this.f11203Z = obj;
        this.f11204o0 = c15000g;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C3689f c3689f;
        C20879Z c20879z;
        C6711g c6711g;
        C3690g c3690g;
        Set set;
        C13136N c13136n;
        C3690g c3690g2;
        C16962a c16962a;
        C3690g c3690g3;
        switch (this.f11202Y) {
            case 0:
                if (interfaceC18770c instanceof C3689f) {
                    c3689f = (C3689f) interfaceC18770c;
                    int i10 = c3689f.f11201p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c3689f.f11201p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c3689f = new C3689f(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c3689f = new C3689f(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM15482b = c3689f.f11199Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c3689f.f11201p0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM15482b);
                    C13912Z0 c13912z0 = C13912Z0.f43961c;
                    C20879Z c20879z2 = (C20879Z) this.f11204o0;
                    c3689f.f11198Y = c20879z2;
                    c3689f.f11201p0 = 1;
                    objM15482b = ((C14005w2) ((InterfaceC13849E) this.f11203Z)).m15482b(c13912z0, c3689f);
                    if (objM15482b == enumC19250a) {
                        return enumC19250a;
                    }
                    c20879z = c20879z2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c20879z = c3689f.f11198Y;
                    AbstractC9233X.m9807c(objM15482b);
                }
                c20879z.m21450c(((Boolean) objM15482b).booleanValue());
                return C17296C.f55119a;
            case 1:
                if (interfaceC18770c instanceof C6711g) {
                    c6711g = (C6711g) interfaceC18770c;
                    int i12 = c6711g.f21572p0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c6711g.f21572p0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c6711g = new C6711g(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c6711g = new C6711g(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM3221t = c6711g.f21570Z;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c6711g.f21572p0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objM3221t);
                    C15000g c15000g = (C15000g) this.f11204o0;
                    c6711g.f21569Y = this;
                    c6711g.f21572p0 = 1;
                    objM3221t = AbstractC2124C.m3221t(c15000g.f46691b, c6711g);
                    if (objM3221t == enumC19250a2) {
                        return enumC19250a2;
                    }
                    c3690g = this;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3690g = c6711g.f21569Y;
                    AbstractC9233X.m9807c(objM3221t);
                }
                C22038o c22038o = ((C21891A) objM3221t).f69415a;
                if (AbstractC16544l.m18089b((c22038o == null || (set = c22038o.f69717g) == null) ? null : Boolean.valueOf(set.contains(EnumC22026l.MemoryAvailable)), Boolean.FALSE)) {
                    ((C13133K) c3690g.f11203Z).m14817a(C6712h.f21573Z);
                }
                return C17296C.f55119a;
            case 2:
                if (interfaceC18770c instanceof C13136N) {
                    c13136n = (C13136N) interfaceC18770c;
                    int i14 = c13136n.f41705p0;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c13136n.f41705p0 = i14 - Integer.MIN_VALUE;
                    } else {
                        c13136n = new C13136N(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c13136n = new C13136N(this, (AbstractC19687c) interfaceC18770c);
                }
                Object obj = c13136n.f41703Z;
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i15 = c13136n.f41705p0;
                if (i15 == 0) {
                    AbstractC9233X.m9807c(obj);
                    c13136n.f41702Y = this;
                    c13136n.f41705p0 = 1;
                    if (AbstractC8152n6.m8700d((InterfaceC13849E) this.f11203Z, c13136n) == enumC19250a3) {
                        return enumC19250a3;
                    }
                    c3690g2 = this;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3690g2 = c13136n.f41702Y;
                    AbstractC9233X.m9807c(obj);
                }
                boolean zM15481a = ((C14005w2) ((InterfaceC13849E) c3690g2.f11203Z)).m15481a(C13932e1.f43982c);
                AbstractC8160o6.m8731f((C3430e) c3690g2.f11204o0, "Statsig sanity check 50/50 experiment value: " + zM15481a, null, null, 6);
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C16962a) {
                    c16962a = (C16962a) interfaceC18770c;
                    int i16 = c16962a.f54446p0;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c16962a.f54446p0 = i16 - Integer.MIN_VALUE;
                    } else {
                        c16962a = new C16962a(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c16962a = new C16962a(this, (AbstractC19687c) interfaceC18770c);
                }
                Object obj2 = c16962a.f54444Z;
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i17 = c16962a.f54446p0;
                if (i17 != 0) {
                    if (i17 == 1) {
                        c3690g3 = c16962a.f54443Y;
                        AbstractC9233X.m9807c(obj2);
                    } else {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj2);
                c16962a.f54443Y = this;
                c16962a.f54446p0 = 1;
                if (AbstractC8152n6.m8700d((InterfaceC13849E) this.f11203Z, c16962a) == enumC19250a4) {
                    return enumC19250a4;
                }
                c3690g3 = this;
                C15000g c15000g2 = (C15000g) c3690g3.f11204o0;
                C16963b c16963b = new C16963b(2, null);
                c16962a.f54443Y = null;
                c16962a.f54446p0 = 2;
                if (AbstractC2124C.m3212k(c15000g2.f46691b, c16963b, c16962a) == enumC19250a4) {
                    return enumC19250a4;
                }
                return C17296C.f55119a;
        }
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        switch (this.f11202Y) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC0593T.f1824a;
    }

    public C3690g(InterfaceC13849E experimentManager, C20879Z segmentAnalyticsService) {
        this.f11202Y = 0;
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(segmentAnalyticsService, "segmentAnalyticsService");
        this.f11203Z = experimentManager;
        this.f11204o0 = segmentAnalyticsService;
    }

    public C3690g(InterfaceC13849E interfaceC13849E) {
        this.f11202Y = 2;
        this.f11203Z = interfaceC13849E;
        this.f11204o0 = AbstractC8168p6.m8749b("StatsigSanityCheckInitializer", null);
    }
}
