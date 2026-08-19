package p708dh;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p1155zi.C21952P1;
import p1155zi.C22013h2;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C13142U extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41722Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41723Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13145X f41724o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13142U(C13145X c13145x, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41724o0 = c13145x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13142U c13142u = new C13142U(this.f41724o0, interfaceC18770c);
        c13142u.f41723Z = obj;
        return c13142u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13142U) create((C22013h2) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41722Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C22013h2 c22013h2 = (C22013h2) this.f41723Z;
            C2127D0 c2127d0 = this.f41724o0.f41737e;
            C21952P1 c21952p1 = new C21952P1(c22013h2);
            this.f41722Y = 1;
            if (c2127d0.mo395a(c21952p1, this) == enumC19250a) {
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
