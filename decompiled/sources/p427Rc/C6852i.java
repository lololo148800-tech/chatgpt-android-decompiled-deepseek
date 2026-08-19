package p427Rc;

import p002A0.C0132i;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Rc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6852i implements InterfaceC2149O0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1436k f21991Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2149O0 f21992Z;

    public C6852i(InterfaceC1436k interfaceC1436k, InterfaceC2149O0 interfaceC2149O0) {
        this.f21991Y = interfaceC1436k;
        this.f21992Z = interfaceC2149O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        C6851h c6851h;
        if (interfaceC18770c instanceof C6851h) {
            c6851h = (C6851h) interfaceC18770c;
            int i10 = c6851h.f21990o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6851h.f21990o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6851h = new C6851h(this, interfaceC18770c);
            }
        } else {
            c6851h = new C6851h(this, interfaceC18770c);
        }
        Object obj = c6851h.f21988Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6851h.f21990o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C0132i c0132i = new C0132i(interfaceC2186j, 23, this.f21991Y);
            c6851h.f21990o0 = 1;
            if (this.f21992Z.mo3141d(c0132i, c6851h) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        return this.f21991Y.invoke(this.f21992Z.getValue());
    }
}
