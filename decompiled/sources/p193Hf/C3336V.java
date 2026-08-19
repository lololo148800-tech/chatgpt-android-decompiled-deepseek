package p193Hf;

import mm.C17296C;
import mm.C17311n;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21098s;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p759g1.C13801c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C3336V extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC21098s f10186Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f10187Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10188o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3336V(InterfaceC21098s interfaceC21098s, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10186Y = interfaceC21098s;
        this.f10187Z = interfaceC5985X;
        this.f10188o0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3336V(this.f10186Y, this.f10187Z, this.f10188o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3336V c3336v = (C3336V) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3336v.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM9806b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        int i10 = AbstractC3356d0.f10249a;
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f10187Z.getValue();
        C13801c c13801c = C13801c.f43585e;
        InterfaceC21098s interfaceC21098s2 = this.f10186Y;
        if (interfaceC21098s2 != null) {
            if (interfaceC21098s != null) {
                try {
                    objM9806b = interfaceC21098s.mo21528y(interfaceC21098s2, false);
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
            } else {
                objM9806b = null;
            }
            C13801c c13801c2 = (C13801c) (objM9806b instanceof C17311n ? null : objM9806b);
            if (c13801c2 != null) {
                c13801c = c13801c2;
            }
        }
        this.f10188o0.setValue(c13801c);
        return C17296C.f55119a;
    }
}
