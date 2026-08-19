package ge;

import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14091n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44325Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationViewModel f44326Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14091n0(ConversationViewModel conversationViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44326Z = conversationViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14091n0(this.f44326Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C14091n0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44325Y;
        ConversationViewModel conversationViewModel = this.f44326Z;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                throw new C0644w();
            }
            AbstractC9233X.m9807c(obj);
            conversationViewModel.m14395k(new C14104u(true));
            this.f44325Y = 1;
            AbstractC0575H.m1179h(this);
            return enumC19250a;
        } catch (Throwable th2) {
            conversationViewModel.m14395k(new C14104u(false));
            throw th2;
        }
    }
}
