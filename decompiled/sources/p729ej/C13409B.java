package p729ej;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ej.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C13409B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42477Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13427r f42478Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC13418i f42479o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f42480p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13409B(InterfaceC13427r interfaceC13427r, InterfaceC13418i interfaceC13418i, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42478Z = interfaceC13427r;
        this.f42479o0 = interfaceC13418i;
        this.f42480p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13409B(this.f42478Z, this.f42479o0, this.f42480p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13409B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42477Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC13427r interfaceC13427r = this.f42478Z;
            InterfaceC2184i interfaceC2184iRun = interfaceC13427r.run();
            if (interfaceC2184iRun == null) {
                throw new NullPointerException("Worker " + interfaceC13427r + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
            }
            C8847i c8847i = new C8847i(interfaceC13427r, 21, this.f42480p0);
            this.f42477Y = 1;
            Object objMo3141d = interfaceC2184iRun.mo3141d(new C13435z(this.f42479o0, 0, c8847i), this);
            if (objMo3141d != enumC19250a) {
                objMo3141d = c17296c;
            }
            if (objMo3141d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
