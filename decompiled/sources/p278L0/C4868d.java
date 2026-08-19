package p278L0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4868d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15846Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11246q f15847Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f15848o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4868d(C11246q c11246q, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15847Z = c11246q;
        this.f15848o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4868d(this.f15847Z, this.f15848o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4868d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15846Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f15846Y = 1;
            if (this.f15847Z.m12630F(this.f15848o0, this) == enumC19250a) {
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
