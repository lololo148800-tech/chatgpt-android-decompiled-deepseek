package p103Dn;

import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2162V0 implements InterfaceC2121A0 {

    /* JADX INFO: renamed from: Y */
    public final C2215x0 f6627Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC19694j f6628Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2162V0(C2215x0 c2215x0, InterfaceC1439n interfaceC1439n) {
        this.f6627Y = c2215x0;
        this.f6628Z = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        C2160U0 c2160u0;
        if (interfaceC18770c instanceof C2160U0) {
            c2160u0 = (C2160U0) interfaceC18770c;
            int i10 = c2160u0.f6621o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2160u0.f6621o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2160u0 = new C2160U0(this, interfaceC18770c);
            }
        } else {
            c2160u0 = new C2160U0(this, interfaceC18770c);
        }
        Object obj = c2160u0.f6619Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2160u0.f6621o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C2158T0 c2158t0 = new C2158T0(interfaceC2186j, this.f6628Z);
            c2160u0.f6621o0 = 1;
            if (this.f6627Y.f6793Y.mo3141d(c2158t0, c2160u0) == enumC19250a) {
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
}
