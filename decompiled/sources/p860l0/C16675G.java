package p860l0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p278L0.C4893t;
import p571X9.AbstractC9233X;
import p773h0.C14290j0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C16675G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53405Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16678H f53406Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC14284g0 f53407o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f53408p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16675G(C16678H c16678h, EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53406Z = c16678h;
        this.f53407o0 = enumC14284g0;
        this.f53408p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16675G(this.f53406Z, this.f53407o0, this.f53408p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16675G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53405Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16678H c16678h = this.f53406Z;
            C14292k0 c14292k0 = c16678h.f53421c;
            C4893t c4893t = c16678h.f53420b;
            this.f53405Y = 1;
            ?? r6 = this.f53408p0;
            c14292k0.getClass();
            if (AbstractC0575H.m1183l(new C14290j0(this.f53407o0, c14292k0, r6, c4893t, null), this) == enumC19250a) {
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
