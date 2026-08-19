package p266Kc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4632a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15081Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19018a f15082Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4632a(InterfaceC19018a interfaceC19018a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15082Z = interfaceC19018a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4632a(this.f15082Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4632a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15081Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f15081Y = 1;
            if (this.f15082Z.mo4158a(this) == enumC19250a) {
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
