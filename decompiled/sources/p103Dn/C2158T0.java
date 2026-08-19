package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p129En.C2582B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2158T0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC2186j f6613Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC19694j f6614Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2158T0(InterfaceC2186j interfaceC2186j, InterfaceC1439n interfaceC1439n) {
        this.f6613Y = interfaceC2186j;
        this.f6614Z = (AbstractC19694j) interfaceC1439n;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        return this.f6613Y.mo395a(obj, interfaceC18770c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [sm.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [Bm.n, sm.j] */
    /* JADX INFO: renamed from: b */
    public final Object m3252b(AbstractC19687c abstractC19687c) {
        C2156S0 c2156s0;
        C2582B c2582b;
        C2158T0 c2158t0;
        if (abstractC19687c instanceof C2156S0) {
            c2156s0 = (C2156S0) abstractC19687c;
            int i10 = c2156s0.f6609q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2156s0.f6609q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2156s0 = new C2156S0(this, abstractC19687c);
            }
        } else {
            c2156s0 = new C2156S0(this, abstractC19687c);
        }
        Object obj = c2156s0.f6607o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = c2156s0.f6609q0;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    c2582b = c2156s0.f6606Z;
                    c2158t0 = c2156s0.f6605Y;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (r6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            c2582b = new C2582B(this.f6613Y, c2156s0.getContext());
            ?? r10 = this.f6614Z;
            c2156s0.f6605Y = this;
            c2156s0.f6606Z = c2582b;
            c2156s0.f6609q0 = 1;
            if (r10.invoke(c2582b, c2156s0) == enumC19250a) {
                return enumC19250a;
            }
            c2158t0 = this;
            c2582b.releaseIntercepted();
            InterfaceC2186j interfaceC2186j = c2158t0.f6613Y;
            r6 = interfaceC2186j instanceof C2158T0;
            if (r6 != 0) {
                c2156s0.f6605Y = null;
                c2156s0.f6606Z = null;
                c2156s0.f6609q0 = 2;
                if (((C2158T0) interfaceC2186j).m3252b(c2156s0) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        } catch (Throwable th2) {
            r6.releaseIntercepted();
            throw th2;
        }
    }
}
