package sc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19738o;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.C16685J0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19524f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62006Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1440o f62007Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f62008o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19738o f62009p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19524f(InterfaceC1440o interfaceC1440o, C16685J0 c16685j0, C19738o c19738o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62007Z = interfaceC1440o;
        this.f62008o0 = c16685j0;
        this.f62009p0 = c19738o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19524f(this.f62007Z, this.f62008o0, this.f62009p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19524f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62006Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13800b c13800b = new C13800b(this.f62009p0.f62480c);
            this.f62006Y = 1;
            if (this.f62007Z.invoke(this.f62008o0, c13800b, this) == enumC19250a) {
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
