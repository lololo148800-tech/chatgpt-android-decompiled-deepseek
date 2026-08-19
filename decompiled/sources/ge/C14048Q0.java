package ge;

import gd.C13936f1;
import gd.C14005w2;
import mm.C17296C;
import p072Ci.C1705j;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: ge.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14048Q0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44160Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f44161Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14053T0 f44162o0;

    public /* synthetic */ C14048Q0(InterfaceC2186j interfaceC2186j, C14053T0 c14053t0, int i10) {
        this.f44160Y = i10;
        this.f44161Z = interfaceC2186j;
        this.f44162o0 = c14053t0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C14046P0 c14046p0;
        C1705j c1705j;
        InterfaceC2186j interfaceC2186j;
        C14051S0 c14051s0;
        C1705j c1705j2;
        InterfaceC2186j interfaceC2186j2;
        switch (this.f44160Y) {
            case 0:
                if (interfaceC18770c instanceof C14046P0) {
                    c14046p0 = (C14046P0) interfaceC18770c;
                    int i10 = c14046p0.f44155Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c14046p0.f44155Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c14046p0 = new C14046P0(this, interfaceC18770c);
                    }
                } else {
                    c14046p0 = new C14046P0(this, interfaceC18770c);
                }
                Object objM15482b = c14046p0.f44154Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c14046p0.f44155Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c1705j = c14046p0.f44158q0;
                        interfaceC2186j = c14046p0.f44156o0;
                        AbstractC9233X.m9807c(objM15482b);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM15482b);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(objM15482b);
                c1705j = (C1705j) obj;
                interfaceC2186j = this.f44161Z;
                c14046p0.f44156o0 = interfaceC2186j;
                c14046p0.f44158q0 = c1705j;
                c14046p0.f44155Z = 1;
                C14053T0 c14053t0 = this.f44162o0;
                c14053t0.getClass();
                objM15482b = ((C14005w2) c14053t0.f44173Z).m15482b(C13936f1.f43986c, c14046p0);
                if (objM15482b == enumC19250a) {
                    return enumC19250a;
                }
                Boolean boolValueOf = Boolean.valueOf(((Boolean) objM15482b).booleanValue() && !c1705j.f4887t);
                c14046p0.f44156o0 = null;
                c14046p0.f44158q0 = null;
                c14046p0.f44155Z = 2;
                if (interfaceC2186j.mo395a(boolValueOf, c14046p0) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C14051S0) {
                    c14051s0 = (C14051S0) interfaceC18770c;
                    int i12 = c14051s0.f44168Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c14051s0.f44168Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c14051s0 = new C14051S0(this, interfaceC18770c);
                    }
                } else {
                    c14051s0 = new C14051S0(this, interfaceC18770c);
                }
                Object objM15483c = c14051s0.f44167Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c14051s0.f44168Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        c1705j2 = c14051s0.f44171q0;
                        interfaceC2186j2 = c14051s0.f44169o0;
                        AbstractC9233X.m9807c(objM15483c);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM15483c);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(objM15483c);
                c1705j2 = (C1705j) obj;
                interfaceC2186j2 = this.f44161Z;
                c14051s0.f44169o0 = interfaceC2186j2;
                c14051s0.f44171q0 = c1705j2;
                c14051s0.f44168Z = 1;
                objM15483c = C14053T0.m15483c(this.f44162o0, c14051s0);
                if (objM15483c == enumC19250a2) {
                    return enumC19250a2;
                }
                Boolean boolValueOf2 = Boolean.valueOf((!((Boolean) objM15483c).booleanValue() || c1705j2.f4888u || c1705j2.f4886s) ? false : true);
                c14051s0.f44169o0 = null;
                c14051s0.f44171q0 = null;
                c14051s0.f44168Z = 2;
                if (interfaceC2186j2.mo395a(boolValueOf2, c14051s0) == enumC19250a2) {
                    return enumC19250a2;
                }
                return C17296C.f55119a;
        }
    }
}
