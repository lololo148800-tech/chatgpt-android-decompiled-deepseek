package p229J0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3887B4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f11781Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3899D4 f11782Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3893C4 f11783o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC14284g0 f11784p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3887B4(C3899D4 c3899d4, C3893C4 c3893c4, EnumC14284g0 enumC14284g0, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f11782Z = c3899d4;
        this.f11783o0 = c3893c4;
        this.f11784p0 = enumC14284g0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C3887B4(this.f11782Z, this.f11783o0, this.f11784p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C3887B4) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11781Y;
        EnumC14284g0 enumC14284g0 = EnumC14284g0.f44823o0;
        EnumC14284g0 enumC14284g1 = this.f11784p0;
        C3899D4 c3899d4 = this.f11782Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                boolean z6 = c3899d4.f11881a;
                C3893C4 c3893c4 = this.f11783o0;
                if (z6) {
                    this.f11781Y = 1;
                    if (c3893c4.invoke(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    C3881A4 c3881a4 = new C3881A4(c3893c4, null);
                    this.f11781Y = 2;
                    if (AbstractC0575H.m1169Q(1500L, c3881a4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (enumC14284g1 != enumC14284g0) {
                c3899d4.f11883c.f43331c.setValue(Boolean.FALSE);
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            if (enumC14284g1 != enumC14284g0) {
                c3899d4.f11883c.f43331c.setValue(Boolean.FALSE);
            }
            throw th2;
        }
    }
}
