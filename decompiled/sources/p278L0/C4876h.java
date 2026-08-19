package p278L0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4876h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15888Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f15889Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f15890o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f15891p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4876h(InterfaceC1439n interfaceC1439n, Object obj, InterfaceC0571F interfaceC0571F, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15889Z = (AbstractC19694j) interfaceC1439n;
        this.f15890o0 = obj;
        this.f15891p0 = interfaceC0571F;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4876h(this.f15889Z, this.f15890o0, this.f15891p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4876h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15888Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f15888Y = 1;
            if (this.f15889Z.invoke(this.f15890o0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC0575H.m1180i(this.f15891p0, new C4866c());
        return C17296C.f55119a;
    }
}
