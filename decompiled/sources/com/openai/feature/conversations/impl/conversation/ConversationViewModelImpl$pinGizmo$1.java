package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl", m20656f = "ConversationViewModel.kt", m20657l = {1025}, m20658m = "pinGizmo-LfrXLVc")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ConversationViewModelImpl$pinGizmo$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ConversationViewModelImpl f37777Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37778Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ConversationViewModelImpl f37779o0;

    /* JADX INFO: renamed from: p0 */
    public int f37780p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$pinGizmo$1(ConversationViewModelImpl conversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37779o0 = conversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37778Z = obj;
        this.f37780p0 |= Integer.MIN_VALUE;
        return ConversationViewModelImpl.m14251n(this.f37779o0, null, this);
    }
}
