package p1062vd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vd.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C20543X extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65176Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8775T f65177Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20543X(C8775T c8775t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65177Z = c8775t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20543X(this.f65177Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20543X) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65176Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC8776U enumC8776U = EnumC8776U.f26770Z;
            this.f65176Y = 1;
            if (this.f65177Z.m9530b(enumC8776U, this) == enumC19250a) {
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
