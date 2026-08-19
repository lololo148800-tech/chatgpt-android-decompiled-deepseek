package p1087wj;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p787he.C14462S;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20997r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66832Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66833Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20979J f66834o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20997r(C20979J c20979j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66834o0 = c20979j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20997r c20997r = new C20997r(this.f66834o0, interfaceC18770c);
        c20997r.f66833Z = obj;
        return c20997r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20997r) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66832Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f66833Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f66833Z;
        C1970n c1970n = new C1970n(new C2217y0(this.f66834o0.f66803c), new C20996q(2, null));
        C14462S c14462s = new C14462S(interfaceC2186j, 14);
        this.f66833Z = interfaceC2186j;
        this.f66832Y = 1;
        if (c1970n.mo3141d(c14462s, this) == enumC19250a) {
            return enumC19250a;
        }
        C20992m c20992m = new C20992m(100);
        this.f66833Z = null;
        this.f66832Y = 2;
        if (interfaceC2186j.mo395a(c20992m, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
