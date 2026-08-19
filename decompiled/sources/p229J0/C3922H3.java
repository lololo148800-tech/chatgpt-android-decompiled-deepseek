package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p758g0.C13781p0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.H3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3922H3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12057Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f12058Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f12059o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13781p0 f12060p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f12061q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3922H3(C13756d c13756d, boolean z6, C13781p0 c13781p0, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12058Z = c13756d;
        this.f12059o0 = z6;
        this.f12060p0 = c13781p0;
        this.f12061q0 = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3922H3(this.f12058Z, this.f12059o0, this.f12060p0, this.f12061q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3922H3) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12057Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Float f10 = new Float(this.f12059o0 ? 1.0f : 0.0f);
            this.f12057Y = 1;
            if (C13756d.m15222c(this.f12058Z, f10, this.f12060p0, null, this, 12) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f12061q0.invoke();
        return C17296C.f55119a;
    }
}
