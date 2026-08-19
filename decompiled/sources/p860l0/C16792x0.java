package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16792x0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53893Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53894Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16798z0 f53895o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f53896p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16792x0(C16798z0 c16798z0, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53895o0 = c16798z0;
        this.f53896p0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16792x0 c16792x0 = new C16792x0(this.f53895o0, this.f53896p0, interfaceC18770c);
        c16792x0.f53894Z = obj;
        return c16792x0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16792x0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53893Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f53894Z;
            InterfaceC1440o interfaceC1440o = this.f53895o0.f53912M0;
            C13800b c13800b = new C13800b(this.f53896p0);
            this.f53893Y = 1;
            if (interfaceC1440o.invoke(interfaceC0571F, c13800b, this) == enumC19250a) {
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
