package p485Tk;

import mm.C17296C;
import p025An.C0625m0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p434Rk.C6909a;
import p509Uk.C7713f;
import p571X9.AbstractC9233X;
import p754fl.C13694d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7493b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23791Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC7494c f23792Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13694d f23793o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7493b(InterfaceC7494c interfaceC7494c, C13694d c13694d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23792Z = interfaceC7494c;
        this.f23793o0 = c13694d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7493b(this.f23792Z, this.f23793o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7493b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23791Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC7494c interfaceC7494c = this.f23792Z;
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC7494c.getCoroutineContext().get(C0625m0.f1875Y);
            if (!(interfaceC0627n0 != null ? interfaceC0627n0.mo1274a() : false)) {
                throw new C6909a();
            }
            this.f23791Y = 1;
            obj = ((C7713f) interfaceC7494c).m7975a(this.f23793o0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
