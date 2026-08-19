package ge;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C5994b0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14073e0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44285Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f44286Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f44287o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f44288p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5994b0 f44289q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14073e0(boolean z6, long j10, InterfaceC5985X interfaceC5985X, C5994b0 c5994b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44286Z = z6;
        this.f44287o0 = j10;
        this.f44288p0 = interfaceC5985X;
        this.f44289q0 = c5994b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14073e0(this.f44286Z, this.f44287o0, this.f44288p0, this.f44289q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14073e0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44285Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f44286Z) {
                this.f44288p0.setValue(Boolean.TRUE);
                this.f44285Y = 1;
                if (AbstractC0575H.m1185n(this.f44287o0, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        this.f44289q0.m6410h(1.0f);
        return C17296C.f55119a;
    }
}
