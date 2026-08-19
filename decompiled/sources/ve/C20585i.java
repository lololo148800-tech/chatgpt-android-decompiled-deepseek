package ve;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ve.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20585i extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f65319Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20592p f65320Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20585i(C20592p c20592p, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65320Z = c20592p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20585i(this.f65320Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C20585i) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65319Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20577a c20577a = this.f65320Z.f65344Z;
            this.f65319Y = 1;
            if (c20577a.m21028a(this) == enumC19250a) {
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
