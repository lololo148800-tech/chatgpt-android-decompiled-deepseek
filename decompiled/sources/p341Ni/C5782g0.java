package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p317Mg.C5350a;
import p528Vg.C8285d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5782g0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18822Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5350a f18823Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5782g0(C5350a c5350a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18823Z = c5350a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5782g0(this.f18823Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5782g0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18822Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f18822Y = 1;
            obj = AbstractC2124C.m3221t(this.f18823Z.f64176f, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return Boolean.valueOf(((C8285d) obj).f25830h);
    }
}
