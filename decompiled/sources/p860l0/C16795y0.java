package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16795y0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53902Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53903Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16798z0 f53904o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f53905p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16795y0(C16798z0 c16798z0, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53904o0 = c16798z0;
        this.f53905p0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16795y0 c16795y0 = new C16795y0(this.f53904o0, this.f53905p0, interfaceC18770c);
        c16795y0.f53903Z = obj;
        return c16795y0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16795y0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53902Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f53903Z;
            C16798z0 c16798z0 = this.f53904o0;
            InterfaceC1440o interfaceC1440o = c16798z0.f53913N0;
            boolean z6 = c16798z0.f53914O0;
            long jM7906g = C7550o.m7906g(z6 ? -1.0f : 1.0f, this.f53905p0);
            EnumC16673F0 enumC16673F0 = c16798z0.f53910K0;
            C16783u0 c16783u0 = AbstractC16786v0.f53881a;
            Float f10 = new Float(enumC16673F0 == EnumC16673F0.f53401Y ? C7550o.m7903d(jM7906g) : C7550o.m7902c(jM7906g));
            this.f53902Y = 1;
            if (interfaceC1440o.invoke(interfaceC0571F, f10, this) == enumC19250a) {
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
