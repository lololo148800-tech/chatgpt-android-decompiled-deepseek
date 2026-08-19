package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p129En.C2582B;
import p129En.C2612w;
import p129En.C2613x;
import p523V9.AbstractC8056b6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2219z0 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6801Y = 0;

    /* JADX INFO: renamed from: Z */
    public final AbstractC19694j f6802Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2219z0(InterfaceC1440o interfaceC1440o) {
        this.f6802Z = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r7v3, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        C2168a c2168a;
        Throwable th2;
        C2582B c2582b;
        switch (this.f6801Y) {
            case 0:
                if (interfaceC18770c instanceof C2168a) {
                    c2168a = (C2168a) interfaceC18770c;
                    int i10 = c2168a.f6646p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2168a.f6646p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2168a = new C2168a(this, interfaceC18770c);
                    }
                } else {
                    c2168a = new C2168a(this, interfaceC18770c);
                }
                Object obj = c2168a.f6644Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2168a.f6646p0;
                C17296C c17296c = C17296C.f55119a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2582b = c2168a.f6643Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        c2582b.releaseIntercepted();
                        return c17296c;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c2582b.releaseIntercepted();
                        throw th2;
                    }
                }
                AbstractC9233X.m9807c(obj);
                C2582B c2582b2 = new C2582B(interfaceC2186j, c2168a.getContext());
                try {
                    c2168a.f6643Y = c2582b2;
                    c2168a.f6646p0 = 1;
                    Object objInvoke = this.f6802Z.invoke(c2582b2, c2168a);
                    if (objInvoke != enumC19250a) {
                        objInvoke = c17296c;
                    }
                    if (objInvoke == enumC19250a) {
                        return enumC19250a;
                    }
                    c2582b = c2582b2;
                    c2582b.releaseIntercepted();
                    return c17296c;
                } catch (Throwable th4) {
                    th2 = th4;
                    c2582b = c2582b2;
                    c2582b.releaseIntercepted();
                    throw th2;
                }
            default:
                C2613x c2613x = new C2613x(this.f6802Z, interfaceC2186j, null);
                C2612w c2612w = new C2612w(interfaceC18770c, interfaceC18770c.getContext());
                Object objM8453d = AbstractC8056b6.m8453d(c2612w, c2612w, c2613x);
                return objM8453d == EnumC19250a.f61036Y ? objM8453d : C17296C.f55119a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2219z0(InterfaceC1439n interfaceC1439n) {
        this.f6802Z = (AbstractC19694j) interfaceC1439n;
    }
}
