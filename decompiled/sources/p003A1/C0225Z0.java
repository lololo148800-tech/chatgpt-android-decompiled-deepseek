package p003A1;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p587Y1.C9576b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A1.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0225Z0 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f852Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C0225Z0(1, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C0225Z0) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f852Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f852Y = 1;
            obj = C5997d.m6424K(getContext()).mo876v0(C9576b.f28821o0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
