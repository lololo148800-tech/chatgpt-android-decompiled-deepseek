package p729ej;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ej.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C13423n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42504Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f42505Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13424o f42506o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13423n(C13424o c13424o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42506o0 = c13424o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13423n c13423n = new C13423n(this.f42506o0, interfaceC18770c);
        c13423n.f42505Z = obj;
        return c13423n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13423n) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42504Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f42505Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f42505Z;
        long j10 = this.f42506o0.f42507b;
        this.f42505Z = interfaceC2186j;
        this.f42504Y = 1;
        if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f42505Z = null;
        this.f42504Y = 2;
        return interfaceC2186j.mo395a(c17296c, this) == enumC19250a ? enumC19250a : c17296c;
    }
}
