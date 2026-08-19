package p039Bc;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5985X;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C0883q extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f2598Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f2599Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0883q(InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f2599Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C0883q(this.f2599Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C0883q) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2598Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C8775T c8775t = (C8775T) this.f2599Z.getValue();
            EnumC8776U enumC8776U = EnumC8776U.f26770Z;
            this.f2598Y = 1;
            if (c8775t.m9530b(enumC8776U, this) == enumC19250a) {
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
