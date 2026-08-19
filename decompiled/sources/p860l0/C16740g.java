package p860l0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16740g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53683Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f53684Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f53685o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f53686p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16740g(InterfaceC1439n interfaceC1439n, Object obj, InterfaceC0571F interfaceC0571F, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53684Z = (AbstractC19694j) interfaceC1439n;
        this.f53685o0 = obj;
        this.f53686p0 = interfaceC0571F;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16740g(this.f53684Z, this.f53685o0, this.f53686p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16740g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53683Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f53683Y = 1;
            if (this.f53684Z.invoke(this.f53685o0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC0575H.m1180i(this.f53686p0, new C16722a());
        return C17296C.f55119a;
    }
}
