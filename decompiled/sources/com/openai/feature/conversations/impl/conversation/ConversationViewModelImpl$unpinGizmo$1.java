package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl", m20656f = "ConversationViewModel.kt", m20657l = {1030}, m20658m = "unpinGizmo-LfrXLVc")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ConversationViewModelImpl$unpinGizmo$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ConversationViewModelImpl f37811Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f37812Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ConversationViewModelImpl f37813o0;

    /* JADX INFO: renamed from: p0 */
    public int f37814p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$unpinGizmo$1(ConversationViewModelImpl conversationViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37813o0 = conversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37812Z = obj;
        this.f37814p0 |= Integer.MIN_VALUE;
        return ConversationViewModelImpl.m14254q(this.f37813o0, null, this);
    }
}
