package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$enterVoiceMode$3", m20656f = "ConversationViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LCi/j;", "it", "", "<anonymous>", "(LCi/j;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$enterVoiceMode$3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f37725Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ConversationViewModelImpl$enterVoiceMode$3 conversationViewModelImpl$enterVoiceMode$3 = new ConversationViewModelImpl$enterVoiceMode$3(2, interfaceC18770c);
        conversationViewModelImpl$enterVoiceMode$3.f37725Y = obj;
        return conversationViewModelImpl$enterVoiceMode$3;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ConversationViewModelImpl$enterVoiceMode$3) create((C1705j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((C1705j) this.f37725Y).f4878k);
    }
}
