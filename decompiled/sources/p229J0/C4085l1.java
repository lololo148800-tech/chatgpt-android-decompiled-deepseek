package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4085l1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13053Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4121r1 f13054Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4103o1 f13055o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4085l1(C4121r1 c4121r1, C4103o1 c4103o1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13054Z = c4121r1;
        this.f13055o0 = c4103o1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4085l1(this.f13054Z, this.f13055o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4085l1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13053Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4103o1 c4103o1 = this.f13055o0;
            this.f13053Y = 1;
            C4121r1 c4121r1 = this.f13054Z;
            c4121r1.f13295a = c4103o1.f13161a;
            c4121r1.f13296b = c4103o1.f13162b;
            c4121r1.f13297c = c4103o1.f13164d;
            c4121r1.f13298d = c4103o1.f13163c;
            Object objM4766b = c4121r1.m4766b(this);
            if (objM4766b != enumC19250a) {
                objM4766b = c17296c;
            }
            if (objM4766b == enumC19250a) {
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
