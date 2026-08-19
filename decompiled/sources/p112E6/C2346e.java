package p112E6;

import mm.C17296C;
import p059C5.C1592j;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: E6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2346e implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1592j f7284Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f7285Z;

    public C2346e(C1592j c1592j, InterfaceC2186j interfaceC2186j) {
        this.f7284Y = c1592j;
        this.f7285Z = interfaceC2186j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2345d c2345d;
        C2346e c2346e;
        if (interfaceC18770c instanceof C2345d) {
            c2345d = (C2345d) interfaceC18770c;
            int i10 = c2345d.f7282o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2345d.f7282o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2345d = new C2345d(this, interfaceC18770c);
            }
        } else {
            c2345d = new C2345d(this, interfaceC18770c);
        }
        Object objInvoke = c2345d.f7281Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2345d.f7282o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            c2345d.f7280Y = this;
            c2345d.f7282o0 = 1;
            objInvoke = this.f7284Y.invoke(this.f7285Z, obj, c2345d);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            c2346e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2346e = c2345d.f7280Y;
            AbstractC9233X.m9807c(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return C17296C.f55119a;
        }
        throw new C2342a(c2346e);
    }
}
