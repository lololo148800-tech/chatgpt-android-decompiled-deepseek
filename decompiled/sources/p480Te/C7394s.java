package p480Te;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p404Qe.C6665a;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Te.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C7394s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23427Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23428Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23429o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f23430p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f23431q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7394s(String str, String str2, String str3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23429o0 = str;
        this.f23430p0 = str2;
        this.f23431q0 = str3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7394s c7394s = new C7394s(this.f23429o0, this.f23430p0, this.f23431q0, interfaceC18770c);
        c7394s.f23428Z = obj;
        return c7394s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7394s) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23427Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f23428Z;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15173c(c13693c, "conversation", new C6665a(this.f23431q0, 4), 7);
            AbstractC8056b6.m8452c(c13693c, "message_id", this.f23429o0);
            AbstractC8056b6.m8452c(c13693c, "sandbox_path", this.f23430p0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50984b, c13693c, c6752c);
            this.f23427Y = 1;
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
