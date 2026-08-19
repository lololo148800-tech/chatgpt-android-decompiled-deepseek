package com.openai.feature.messages.impl.messagefeedback;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2060i;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p216Id.C3694b;
import p242Je.C4330c;
import p316Mf.C5344k;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.messagefeedback.MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2", m20656f = "MessageFeedbackViewModelImpl.kt", m20657l = {107, 108}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public MessageFeedbackViewModelImpl f38963Y;

    /* JADX INFO: renamed from: Z */
    public int f38964Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38965o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ MessageFeedbackViewModelImpl f38966p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5344k f38967q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2(MessageFeedbackViewModelImpl messageFeedbackViewModelImpl, C5344k c5344k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38966p0 = messageFeedbackViewModelImpl;
        this.f38967q0 = c5344k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2 messageFeedbackViewModelImpl$handleDetailedMessageFeedback$2 = new MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2(this.f38966p0, this.f38967q0, interfaceC18770c);
        messageFeedbackViewModelImpl$handleDetailedMessageFeedback$2.f38965o0 = obj;
        return messageFeedbackViewModelImpl$handleDetailedMessageFeedback$2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        MessageFeedbackViewModelImpl messageFeedbackViewModelImpl;
        C17296C c17296c;
        AbstractC6224C abstractC6224C;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38964Z;
        C17296C c17296c2 = C17296C.f55119a;
        MessageFeedbackViewModelImpl messageFeedbackViewModelImpl2 = this.f38966p0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0571F = (InterfaceC0571F) this.f38965o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                messageFeedbackViewModelImpl = this.f38963Y;
                AbstractC9233X.m9807c(obj);
            }
            abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                messageFeedbackViewModelImpl.m14397m(C12442x1b14bb7d.f38968Y);
                messageFeedbackViewModelImpl.m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
            } else {
                if (!(abstractC6224C instanceof AbstractC6249w)) {
                    if (!(abstractC6224C instanceof C6248v)) {
                        throw new C0644w();
                    }
                    c17296c = null;
                    if (c17296c == null) {
                        messageFeedbackViewModelImpl2.m14397m(MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2$2$1.f38970Y);
                        AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Detailed feedback failed, conversationId is null", null, 6);
                    }
                    return c17296c2;
                }
                messageFeedbackViewModelImpl.m14397m(C12443x1b14bf3e.f38969Y);
                AbstractC8160o6.m8731f(messageFeedbackViewModelImpl.f38959m, "Detailed feedback failed", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
            }
            c17296c = c17296c2;
            if (c17296c == null) {
                messageFeedbackViewModelImpl2.m14397m(MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2$2$1.f38970Y);
                AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Detailed feedback failed, conversationId is null", null, 6);
            }
            return c17296c2;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC0571F = (InterfaceC0571F) this.f38965o0;
        C2207t0 c2207t0 = messageFeedbackViewModelImpl2.f38956j.f45526y;
        this.f38965o0 = interfaceC0571F;
        this.f38964Z = 1;
        obj = AbstractC2124C.m3221t(c2207t0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        String str = ((C3694b) obj).f11216a;
        if (str != null) {
            C4330c c4330c = messageFeedbackViewModelImpl2.f38955i;
            C5344k c5344k = this.f38967q0;
            String str2 = c5344k.f17563a.f23286a;
            this.f38965o0 = interfaceC0571F;
            this.f38963Y = messageFeedbackViewModelImpl2;
            this.f38964Z = 2;
            obj = c4330c.m5145a(str, str2, c5344k.f17564b, c5344k.f17565c, c5344k.f17566d, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            messageFeedbackViewModelImpl = messageFeedbackViewModelImpl2;
            abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                messageFeedbackViewModelImpl.m14397m(C12442x1b14bb7d.f38968Y);
                messageFeedbackViewModelImpl.m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
            } else if (!(abstractC6224C instanceof AbstractC6249w)) {
                messageFeedbackViewModelImpl.m14397m(C12443x1b14bf3e.f38969Y);
                AbstractC8160o6.m8731f(messageFeedbackViewModelImpl.f38959m, "Detailed feedback failed", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
            } else {
                if (!(abstractC6224C instanceof C6248v)) {
                    throw new C0644w();
                }
                c17296c = null;
            }
            c17296c = c17296c2;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            messageFeedbackViewModelImpl2.m14397m(MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2$2$1.f38970Y);
            AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Detailed feedback failed, conversationId is null", null, 6);
        }
        return c17296c2;
    }
}
