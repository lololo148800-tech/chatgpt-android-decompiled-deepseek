package p068Ce;

import mm.C17296C;
import p017Af.C0491v;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ce.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4635Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f4636Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f4637o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638f(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4637o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1638f c1638f = new C1638f(this.f4637o0, interfaceC18770c);
        c1638f.f4636Z = obj;
        return c1638f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1638f) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4635Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f4636Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "share", new C0491v(this.f4637o0, 8), 7);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50988f, c13693c, c6752c);
            this.f4635Y = 1;
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
