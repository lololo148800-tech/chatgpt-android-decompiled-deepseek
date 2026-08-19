package com.openai.feature.conversations.impl.conversation;

import com.openai.chatgpt.R;
import com.openai.chatgpt.app.RootViewModelImpl;
import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.Metadata;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p098Di.C2060i;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p787he.C14474c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$archiveConversation$2", m20656f = "ConversationViewModel.kt", m20657l = {1134}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$archiveConversation$2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37714Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationViewModelImpl f37715Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$archiveConversation$2(ConversationViewModelImpl conversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37715Z = conversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new ConversationViewModelImpl$archiveConversation$2(this.f37715Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ConversationViewModelImpl$archiveConversation$2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37714Y;
        ConversationViewModelImpl conversationViewModelImpl = this.f37715Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14459O c14459o = conversationViewModelImpl.f37588m;
            this.f37714Y = 1;
            c14459o.getClass();
            obj = c14459o.m15992u(new C14474c(c14459o, null), this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            RootViewModel rootViewModel = conversationViewModelImpl.f37592q;
            C2060i c2060i = new C2060i(R.string.conversation_archived);
            RootViewModelImpl rootViewModelImpl = (RootViewModelImpl) rootViewModel;
            rootViewModelImpl.getClass();
            rootViewModelImpl.m14393h(c2060i);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            RootViewModel rootViewModel2 = conversationViewModelImpl.f37592q;
            C2059h c2059h = new C2059h((AbstractC21933K1) abstractC21955Q1);
            RootViewModelImpl rootViewModelImpl2 = (RootViewModelImpl) rootViewModel2;
            rootViewModelImpl2.getClass();
            rootViewModelImpl2.m14393h(c2059h);
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        conversationViewModelImpl.m14258u(false, null);
        return C17296C.f55119a;
    }
}
