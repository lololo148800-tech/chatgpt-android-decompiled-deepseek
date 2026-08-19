package p787he;

import mm.C17296C;
import p016Ae.C0439a;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1126yd.C21454Z;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C14461Q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45545Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45546Z;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14461Q c14461q = new C14461Q(2, interfaceC18770c);
        c14461q.f45546Z = obj;
        return c14461q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14461Q) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45545Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f45546Z;
            AbstractC8160o6.m8727b(AbstractC8168p6.m8749b("MessageStreamingService", null), "Conversation was requested with no messages, or all messages are unsupported", null, 6);
            C21454Z c21454z = new C21454Z(new C0439a(6));
            this.f45545Y = 1;
            if (interfaceC2186j.mo395a(c21454z, this) == enumC19250a) {
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
