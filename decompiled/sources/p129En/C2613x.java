package p129En;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C2613x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8099Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8100Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f8101o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC2186j f8102p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2613x(InterfaceC1440o interfaceC1440o, InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8101o0 = (AbstractC19694j) interfaceC1440o;
        this.f8102p0 = interfaceC2186j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2613x c2613x = new C2613x(this.f8101o0, this.f8102p0, interfaceC18770c);
        c2613x.f8100Z = obj;
        return c2613x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2613x) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8099Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f8100Z;
            this.f8099Y = 1;
            if (this.f8101o0.invoke(interfaceC0571F, this.f8102p0, this) == enumC19250a) {
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
