package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p758g0.C13781p0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4057g3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12852Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f12853Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f12854o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057g3(C13756d c13756d, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12853Z = c13756d;
        this.f12854o0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4057g3(this.f12853Z, this.f12854o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4057g3) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12852Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Integer num = new Integer(this.f12854o0);
            C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(350, 0, null, 6);
            this.f12852Y = 1;
            if (C13756d.m15222c(this.f12853Z, num, c13781p0M15255t, null, this, 12) == enumC19250a) {
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
