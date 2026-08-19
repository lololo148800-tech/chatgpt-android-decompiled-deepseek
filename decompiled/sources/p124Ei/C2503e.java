package p124Ei;

import mm.C17296C;
import p003A1.C0205S1;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2213w0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2503e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7794Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2213w0 f7795Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2149O0 f7796o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2503e(InterfaceC2213w0 interfaceC2213w0, InterfaceC2149O0 interfaceC2149O0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7795Z = interfaceC2213w0;
        this.f7796o0 = interfaceC2149O0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2503e(this.f7795Z, this.f7796o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C2503e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7794Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0205S1 c0205s1 = new C0205S1(this.f7796o0, 3);
            this.f7794Y = 1;
            if (this.f7795Z.mo3141d(c0205s1, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
