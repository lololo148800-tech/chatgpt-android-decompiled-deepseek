package ge;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.C5994b0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14075f0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44294Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f44295Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f44296o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f44297p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5994b0 f44298q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14075f0(boolean z6, boolean z10, long j10, C5994b0 c5994b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44295Z = z6;
        this.f44296o0 = z10;
        this.f44297p0 = j10;
        this.f44298q0 = c5994b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14075f0(this.f44295Z, this.f44296o0, this.f44297p0, this.f44298q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14075f0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44294Y;
        C5994b0 c5994b0 = this.f44298q0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f44295Z && this.f44296o0) {
                c5994b0.m6410h(0.0f);
                this.f44294Y = 1;
                if (AbstractC0575H.m1185n(this.f44297p0, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        c5994b0.m6410h(1.0f);
        return C17296C.f55119a;
    }
}
