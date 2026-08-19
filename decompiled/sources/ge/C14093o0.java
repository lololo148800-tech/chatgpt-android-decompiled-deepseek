package ge;

import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8234y0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14093o0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44328Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC11112u f44329Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ConversationViewModel f44330o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14093o0(InterfaceC11112u interfaceC11112u, ConversationViewModel conversationViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44329Z = interfaceC11112u;
        this.f44330o0 = conversationViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14093o0(this.f44329Z, this.f44330o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14093o0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44328Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC11104m enumC11104m = EnumC11104m.f33477p0;
            C14091n0 c14091n0 = new C14091n0(this.f44330o0, null);
            this.f44328Y = 1;
            Object objM8873a = AbstractC8234y0.m8873a(this.f44329Z.mo7809i(), enumC11104m, c14091n0, this);
            if (objM8873a != enumC19250a) {
                objM8873a = c17296c;
            }
            if (objM8873a == enumC19250a) {
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
