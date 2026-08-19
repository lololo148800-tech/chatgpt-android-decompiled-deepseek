package tg;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p928oh.C18194a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sg.C19575q;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: tg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19942a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f63209Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f63210Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19945d f63211o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19575q f63212p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19942a(C19945d c19945d, C19575q c19575q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63211o0 = c19945d;
        this.f63212p0 = c19575q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19942a c19942a = new C19942a(this.f63211o0, this.f63212p0, interfaceC18770c);
        c19942a.f63210Z = obj;
        return c19942a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19942a) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63209Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f63210Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "report_flow", new C18194a(this.f63211o0, 10, this.f63212p0), 7);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f63209Y = 1;
            obj = c14535jM21254y.m16038c(this);
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
