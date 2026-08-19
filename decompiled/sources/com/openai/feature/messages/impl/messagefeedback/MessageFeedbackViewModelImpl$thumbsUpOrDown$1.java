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
import p1150zd.EnumC21867c;
import p1150zd.EnumC21875k;
import p1150zd.EnumC21876l;
import p216Id.C3694b;
import p242Je.C4330c;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.messagefeedback.MessageFeedbackViewModelImpl$thumbsUpOrDown$1", m20656f = "MessageFeedbackViewModelImpl.kt", m20657l = {64, 79}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageFeedbackViewModelImpl$thumbsUpOrDown$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public MessageFeedbackViewModelImpl f38971Y;

    /* JADX INFO: renamed from: Z */
    public int f38972Z;

    /* JADX INFO: renamed from: o0 */
    public int f38973o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38974p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ MessageFeedbackViewModelImpl f38975q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ EnumC21876l f38976r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ EnumC21867c f38977s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C7351f0 f38978t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFeedbackViewModelImpl$thumbsUpOrDown$1(MessageFeedbackViewModelImpl messageFeedbackViewModelImpl, EnumC21876l enumC21876l, EnumC21867c enumC21867c, C7351f0 c7351f0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38975q0 = messageFeedbackViewModelImpl;
        this.f38976r0 = enumC21876l;
        this.f38977s0 = enumC21867c;
        this.f38978t0 = c7351f0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        MessageFeedbackViewModelImpl$thumbsUpOrDown$1 messageFeedbackViewModelImpl$thumbsUpOrDown$1 = new MessageFeedbackViewModelImpl$thumbsUpOrDown$1(this.f38975q0, this.f38976r0, this.f38977s0, this.f38978t0, interfaceC18770c);
        messageFeedbackViewModelImpl$thumbsUpOrDown$1.f38974p0 = obj;
        return messageFeedbackViewModelImpl$thumbsUpOrDown$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageFeedbackViewModelImpl$thumbsUpOrDown$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        MessageFeedbackViewModelImpl messageFeedbackViewModelImpl;
        int i10;
        C17296C c17296c;
        AbstractC6224C abstractC6224C;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f38973o0;
        C17296C c17296c2 = C17296C.f55119a;
        MessageFeedbackViewModelImpl messageFeedbackViewModelImpl2 = this.f38975q0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC0571F = (InterfaceC0571F) this.f38974p0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f38972Z;
                messageFeedbackViewModelImpl = this.f38971Y;
                AbstractC9233X.m9807c(obj);
            }
            abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                if (i10 == 0) {
                    messageFeedbackViewModelImpl.m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
                }
            } else {
                if (!(abstractC6224C instanceof AbstractC6249w)) {
                    if (!(abstractC6224C instanceof C6248v)) {
                        throw new C0644w();
                    }
                    c17296c = null;
                    if (c17296c == null) {
                        AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Thumbs down failed, conversationId is null", null, 6);
                    }
                    return c17296c2;
                }
                AbstractC8160o6.m8731f(messageFeedbackViewModelImpl.f38959m, "Thumbs down failed", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
            }
            c17296c = c17296c2;
            if (c17296c == null) {
                AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Thumbs down failed, conversationId is null", null, 6);
            }
            return c17296c2;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC0571F = (InterfaceC0571F) this.f38974p0;
        C2207t0 c2207t0 = messageFeedbackViewModelImpl2.f38956j.f45526y;
        this.f38974p0 = interfaceC0571F;
        this.f38973o0 = 1;
        obj = AbstractC2124C.m3221t(c2207t0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        String str = ((C3694b) obj).f11216a;
        if (str != null) {
            boolean z6 = messageFeedbackViewModelImpl2.f38960n;
            EnumC21876l enumC21876l = this.f38976r0;
            EnumC21867c enumC21867c = this.f38977s0;
            int i12 = (z6 && enumC21876l != EnumC21876l.f69363Z && enumC21867c == EnumC21867c.f69341o0) ? 1 : 0;
            C7351f0 c7351f0 = this.f38978t0;
            if (i12 != 0) {
                messageFeedbackViewModelImpl2.m14397m(new MessageFeedbackViewModelImpl$thumbsUpOrDown$1$1$1(c7351f0));
            }
            String str2 = c7351f0.f23286a;
            this.f38974p0 = interfaceC0571F;
            this.f38971Y = messageFeedbackViewModelImpl2;
            this.f38972Z = i12;
            this.f38973o0 = 2;
            C4330c c4330c = messageFeedbackViewModelImpl2.f38955i;
            c4330c.getClass();
            EnumC21875k enumC21875k = EnumC21875k.BadTranscription;
            if (enumC21876l != EnumC21876l.f69363Z) {
                enumC21875k = null;
            }
            obj = c4330c.m5145a(str, str2, enumC21867c, null, AbstractC17681o.m19383l(enumC21875k), this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            messageFeedbackViewModelImpl = messageFeedbackViewModelImpl2;
            i10 = i12;
            abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                if (i10 == 0) {
                    messageFeedbackViewModelImpl.m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
                }
            } else if (!(abstractC6224C instanceof AbstractC6249w)) {
                AbstractC8160o6.m8731f(messageFeedbackViewModelImpl.f38959m, "Thumbs down failed", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
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
            AbstractC8160o6.m8727b(messageFeedbackViewModelImpl2.f38959m, "Thumbs down failed, conversationId is null", null, 6);
        }
        return c17296c2;
    }
}
