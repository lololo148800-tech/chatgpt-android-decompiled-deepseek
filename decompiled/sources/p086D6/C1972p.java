package p086D6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1972p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5835Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5836Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1970n f5837o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1972p(C1970n c1970n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5837o0 = c1970n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1972p c1972p = new C1972p(this.f5837o0, interfaceC18770c);
        c1972p.f5836Z = obj;
        return c1972p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1972p) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5835Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1971o c1971o = new C1971o((InterfaceC2186j) this.f5836Z, 0);
            this.f5835Y = 1;
            if (this.f5837o0.mo3141d(c1971o, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
