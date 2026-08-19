package p964qe;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: qe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18693f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59508Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f59509Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f59510o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f59511p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18693f(int i10, int i11, InterfaceC3759g interfaceC3759g, int i12, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59508Y = i10;
        this.f59509Z = i11;
        this.f59510o0 = interfaceC3759g;
        this.f59511p0 = i12;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18693f(this.f59508Y, this.f59509Z, this.f59510o0, this.f59511p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18693f c18693f = (C18693f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18693f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f59508Y == this.f59509Z) {
            ((InterfaceC1436k) this.f59510o0).invoke(new C18691d(this.f59511p0));
        }
        return C17296C.f55119a;
    }
}
