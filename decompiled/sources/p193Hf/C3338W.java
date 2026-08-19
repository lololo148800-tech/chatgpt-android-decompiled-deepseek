package p193Hf;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21098s;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p759g1.C13801c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C3338W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10190Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3418y0 f10191Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10192o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f10193p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f10194q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3338W(C3418y0 c3418y0, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC5985X interfaceC5985X3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10191Z = c3418y0;
        this.f10192o0 = interfaceC5985X;
        this.f10193p0 = interfaceC5985X2;
        this.f10194q0 = interfaceC5985X3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3338W(this.f10191Z, this.f10192o0, this.f10193p0, this.f10194q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3338W) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10190Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            int i11 = AbstractC3356d0.f10249a;
            boolean z6 = ((C3420z0) this.f10192o0.getValue()).f10420e.f68134c;
            InterfaceC5985X interfaceC5985X = this.f10193p0;
            C3418y0 c3418y0 = this.f10191Z;
            if (z6) {
                C13801c c13801c = (C13801c) interfaceC5985X.getValue();
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f10194q0.getValue();
                this.f10190Y = 1;
                c3418y0.getClass();
                if (AbstractC0575H.m1183l(new C3398r0(c3418y0, c13801c, interfaceC21098s, null), this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C13801c c13801c2 = (C13801c) interfaceC5985X.getValue();
                this.f10190Y = 2;
                c3418y0.getClass();
                if (AbstractC0575H.m1183l(new C3416x0(c3418y0, c13801c2, null), this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
