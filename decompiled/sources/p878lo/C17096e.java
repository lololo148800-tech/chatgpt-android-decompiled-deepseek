package p878lo;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p773h0.C14290j0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C17096e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54635Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f54636Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC14284g0 f54637o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f54638p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17096e(C11238i c11238i, EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54636Z = c11238i;
        this.f54637o0 = enumC14284g0;
        this.f54638p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17096e(this.f54636Z, this.f54637o0, this.f54638p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17096e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54635Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11238i c11238i = this.f54636Z;
            C14292k0 c14292k0 = (C14292k0) c11238i.f34010o0;
            C17097f c17097f = (C17097f) c11238i.f34009Z;
            C17095d c17095d = new C17095d(c11238i, this.f54638p0, null);
            this.f54635Y = 1;
            EnumC14284g0 enumC14284g0 = this.f54637o0;
            c14292k0.getClass();
            if (AbstractC0575H.m1183l(new C14290j0(enumC14284g0, c14292k0, c17095d, c17097f, null), this) == enumC19250a) {
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
