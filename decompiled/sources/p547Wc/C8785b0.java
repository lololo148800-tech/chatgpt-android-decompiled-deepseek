package p547Wc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p1116y0.C21358g;
import p349O0.C5997d;
import p437Rn.C6949g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8785b0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26847Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21358g f26848Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f26849o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8785b0(C21358g c21358g, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26848Z = c21358g;
        this.f26849o0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8785b0(this.f26848Z, this.f26849o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8785b0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26847Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21358g c21358g = this.f26848Z;
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C6949g(c21358g, 11));
            C8783a0 c8783a0 = new C8783a0(c21358g, this.f26849o0, null);
            this.f26847Y = 1;
            if (AbstractC2124C.m3212k(c2219z0M6441a0, c8783a0, this) == enumC19250a) {
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
