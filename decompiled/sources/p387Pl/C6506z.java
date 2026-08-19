package p387Pl;

import mm.C17296C;
import p003A1.C0205S1;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2215x0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Pl.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6506z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21104Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC6468O f21105Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6454A f21106o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6506z(AbstractC6468O abstractC6468O, C6454A c6454a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21105Z = abstractC6468O;
        this.f21106o0 = c6454a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6506z(this.f21105Z, this.f21106o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C6506z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21104Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2215x0 c2215x0 = (C2215x0) this.f21105Z.f20983b.f34082o0;
            C0205S1 c0205s1 = new C0205S1(this.f21106o0, 5);
            this.f21104Y = 1;
            if (c2215x0.f6793Y.mo3141d(c0205s1, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
