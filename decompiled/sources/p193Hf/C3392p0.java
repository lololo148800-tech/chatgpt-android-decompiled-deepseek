package p193Hf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21098s;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3392p0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10340Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3418y0 f10341Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC21098s f10342o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3392p0(C3418y0 c3418y0, InterfaceC21098s interfaceC21098s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10341Z = c3418y0;
        this.f10342o0 = interfaceC21098s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3392p0(this.f10341Z, this.f10342o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3392p0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10340Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3418y0 c3418y0 = this.f10341Z;
            C13756d c13756d = c3418y0.f10412e;
            InterfaceC21098s interfaceC21098s = this.f10342o0;
            Float f10 = new Float(interfaceC21098s != null ? (int) (interfaceC21098s.mo21524k() & 4294967295L) : 0.0f);
            this.f10340Y = 1;
            if (C13756d.m15222c(c13756d, f10, c3418y0.f10414g, null, this, 12) == enumC19250a) {
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
