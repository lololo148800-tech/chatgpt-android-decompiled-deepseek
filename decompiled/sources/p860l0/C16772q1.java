package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19738o;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16772q1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53821Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f53822Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f53823o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19738o f53824p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16772q1(InterfaceC1440o interfaceC1440o, C16685J0 c16685j0, C19738o c19738o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53822Z = (AbstractC19694j) interfaceC1440o;
        this.f53823o0 = c16685j0;
        this.f53824p0 = c19738o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16772q1(this.f53822Z, this.f53823o0, this.f53824p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16772q1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53821Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13800b c13800b = new C13800b(this.f53824p0.f62480c);
            this.f53821Y = 1;
            if (this.f53822Z.invoke(this.f53823o0, c13800b, this) == enumC19250a) {
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
