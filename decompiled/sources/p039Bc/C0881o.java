package p039Bc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bc.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0881o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f2593Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f2594Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0881o(InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2594Z = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0881o(this.f2594Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0881o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2593Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC5985X interfaceC5985X = this.f2594Z;
            int iOrdinal = ((C8775T) interfaceC5985X.getValue()).m9529a().ordinal();
            if (iOrdinal == 1) {
                C8775T c8775t = (C8775T) interfaceC5985X.getValue();
                EnumC8776U enumC8776U = EnumC8776U.f26769Y;
                this.f2593Y = 1;
                if (c8775t.m9530b(enumC8776U, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (iOrdinal == 2) {
                C8775T c8775t2 = (C8775T) interfaceC5985X.getValue();
                EnumC8776U enumC8776U2 = EnumC8776U.f26770Z;
                this.f2593Y = 2;
                if (c8775t2.m9530b(enumC8776U2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
