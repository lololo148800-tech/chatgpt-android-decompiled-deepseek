package p129En;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C2600k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8054Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2604o f8055Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f8056o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f8057p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600k(C2604o c2604o, InterfaceC2186j interfaceC2186j, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8055Z = c2604o;
        this.f8056o0 = interfaceC2186j;
        this.f8057p0 = obj;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2600k(this.f8055Z, this.f8056o0, this.f8057p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2600k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8054Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ?? r6 = this.f8055Z.f8073q0;
            this.f8054Y = 1;
            if (r6.invoke(this.f8056o0, this.f8057p0, this) == enumC19250a) {
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
