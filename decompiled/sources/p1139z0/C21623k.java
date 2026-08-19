package p1139z0;

import mm.C17296C;
import p003A1.C0205S1;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p046Bk.C1419y0;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2211v0;
import p1068vo.C20659i;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C21623k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68496Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2211v0 f68497Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20659i f68498o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21623k(InterfaceC2211v0 interfaceC2211v0, C20659i c20659i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68497Z = interfaceC2211v0;
        this.f68498o0 = c20659i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21623k(this.f68497Z, this.f68498o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21623k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68496Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            throw new C0644w();
        }
        AbstractC9233X.m9807c(obj);
        C21603a c21603a = C21603a.f68419o0;
        this.f68496Y = 1;
        if (C5997d.m6424K(getContext()).mo876v0(new C1419y0(1, c21603a), this) == enumC19250a) {
            return enumC19250a;
        }
        C0205S1 c0205s1 = new C0205S1(this.f68498o0, 10);
        this.f68496Y = 2;
        if (this.f68497Z.mo3141d(c0205s1, this) == enumC19250a) {
            return enumC19250a;
        }
        throw new C0644w();
    }
}
