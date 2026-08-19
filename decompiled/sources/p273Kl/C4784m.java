package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C4784m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15602Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15603Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4808y f15604o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f15605p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4784m(InterfaceC1439n interfaceC1439n, C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15604o0 = c4808y;
        this.f15605p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4784m c4784m = new C4784m(this.f15605p0, this.f15604o0, interfaceC18770c);
        c4784m.f15603Z = obj;
        return c4784m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4784m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15602Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return obj;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f15603Z;
        if (this.f15604o0.f15685h.get()) {
            return null;
        }
        this.f15602Y = 1;
        Object objInvoke = this.f15605p0.invoke(interfaceC0571F, this);
        return objInvoke == enumC19250a ? enumC19250a : objInvoke;
    }
}
