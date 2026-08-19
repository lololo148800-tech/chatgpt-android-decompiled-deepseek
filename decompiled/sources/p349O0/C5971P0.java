package p349O0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5971P0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19434Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f19435Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6010j0 f19436o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5971P0(InterfaceC2184i interfaceC2184i, C6010j0 c6010j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19435Z = interfaceC2184i;
        this.f19436o0 = c6010j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5971P0(this.f19435Z, this.f19436o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5971P0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19434Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5969O0 c5969o0 = new C5969O0(this.f19436o0, 1);
            this.f19434Y = 1;
            if (this.f19435Z.mo3141d(c5969o0, this) == enumC19250a) {
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
