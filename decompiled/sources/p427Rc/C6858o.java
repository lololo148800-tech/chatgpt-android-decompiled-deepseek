package p427Rc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rc.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6858o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f22016Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f22017Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6861r f22018o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6858o(InterfaceC1436k interfaceC1436k, C6861r c6861r, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22017Z = interfaceC1436k;
        this.f22018o0 = c6861r;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6858o(this.f22017Z, this.f22018o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6858o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f22016Y;
        C6861r c6861r = this.f22018o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC1436k interfaceC1436k = this.f22017Z;
                this.f22016Y = 1;
                obj = interfaceC1436k.invoke(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c6861r.f22028a = null;
            return obj;
        } catch (Throwable th2) {
            c6861r.f22028a = null;
            throw th2;
        }
    }
}
