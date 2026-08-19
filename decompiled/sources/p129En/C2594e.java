package p129En;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1730B;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2594e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8040Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8041Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f8042o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC2596g f8043p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594e(InterfaceC2186j interfaceC2186j, AbstractC2596g abstractC2596g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8042o0 = interfaceC2186j;
        this.f8043p0 = abstractC2596g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2594e c2594e = new C2594e(this.f8042o0, this.f8043p0, interfaceC18770c);
        c2594e.f8041Z = obj;
        return c2594e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2594e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8040Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1730B interfaceC1730BMo3257k = this.f8043p0.mo3257k((InterfaceC0571F) this.f8041Z);
            this.f8040Y = 1;
            Object objM3218q = AbstractC2124C.m3218q(this.f8042o0, interfaceC1730BMo3257k, true, this);
            if (objM3218q != enumC19250a) {
                objM3218q = c17296c;
            }
            if (objM3218q == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
